package com.example.quizbanglaia1.ThiSatHach;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.example.quizbanglaia1.Common.Common;
import com.example.quizbanglaia1.DBHelper;
import com.example.quizbanglaia1.MainActivity;
import com.example.quizbanglaia1.Model.Question;
import com.example.quizbanglaia1.R;
import com.example.quizbanglaia1.ResultActivity;
import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ThishActivity extends AppCompatActivity {
    
    int time_play = Common.TOTAL_TIME;
    boolean isAnswerModeView = false;
    TextView txtTimer;

    ViewPager viewPager;
    TabLayout tabLayout;

    GridView gridView;
    ArrayList<Question> arr_Ques;
    ResultAnswerAdapter adapter;

    @Override
    protected void onDestroy() {
        if (Common.countDownTimer != null)
            Common.countDownTimer.cancel();
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thish);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        takeQuestion();


        txtTimer = (TextView) findViewById(R.id.txt_timer);
        txtTimer.setVisibility(View.VISIBLE);
        countTimer();

        viewPager = (ViewPager) findViewById(R.id.viewpaper);
        tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);

        genFragmentList();

        QuestionFragmentAdapter questionFragmentAdapter = new QuestionFragmentAdapter(getSupportFragmentManager(),
                this,
                Common.fragmentsList);

        viewPager.setAdapter(questionFragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);

        //sk
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            int SCROLLING_RIGHT = 0;
            int SCROLLING_LEFT = 1;
            int SCROLLING_UNDETERMINED = 2;
            int currentScrollDirection = 2;

            public void setScrollingDirection(float positionOffset) {
                if ((1 - positionOffset) >= 0.5)
                    this.currentScrollDirection = SCROLLING_RIGHT;
                else if ((1 - positionOffset) <= 0.5)
                    this.currentScrollDirection = SCROLLING_LEFT;
            }

            private boolean isScrollDirectionUndetermined() {
                return currentScrollDirection == SCROLLING_UNDETERMINED;
            }

            private boolean isScrollingRight() {
                return currentScrollDirection == SCROLLING_RIGHT;
            }

            private boolean isScrollingLeft() {
                return currentScrollDirection == SCROLLING_LEFT;
            }
            //---------------------------.^.----------------------------

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (isScrollDirectionUndetermined())
                    setScrollingDirection(positionOffset);
            }

            @Override
            public void onPageSelected(int position) {
                QuestionFragment questionFragment;
                int i = 0;
                if (position > 0) {
                    if (isScrollingRight()) {
                        questionFragment = Common.fragmentsList.get(position - 1);
                        i = position - 1;
                    } else if (isScrollingLeft()) {
                        questionFragment = Common.fragmentsList.get(position + 1);
                        i = position + 1;
                    } else {
                        questionFragment = Common.fragmentsList.get(i);
                    }
                } else {
                    questionFragment = Common.fragmentsList.get(0);
                    i = 0;
                }
                //sheet right answer
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                if (state == ViewPager.SCROLL_STATE_IDLE)
                    this.currentScrollDirection = SCROLLING_UNDETERMINED;
            }

        });

        //-----------------------------------------------------------------------


    }

    private void takeQuestion() {
        Common.questionList = DBHelper.getInstance(this).getQuestion();
    }

    private void genFragmentList() {
        for (int i = 0; i < Common.questionList.size(); i++) {
            Bundle bundle = new Bundle();
            bundle.putInt("index", i);
            QuestionFragment fragment = new QuestionFragment();
            fragment.setArguments(bundle);

            Common.fragmentsList.add(fragment);
        }
    }


    private void countTimer() {
        if (Common.countDownTimer == null) {
            Common.countDownTimer = new CountDownTimer(Common.TOTAL_TIME, 1000) {
                @Override
                public void onTick(long l) {
                    txtTimer.setText(String.format("%02d:%02d",
                            TimeUnit.MILLISECONDS.toMinutes(l),
                            TimeUnit.MILLISECONDS.toSeconds(l) -
                                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l))));
                    time_play -= 1000;
                }

                @Override
                public void onFinish() {
                    //ket thuc game
                }
            }.start();
        } else {
            Common.countDownTimer.cancel();
            Common.countDownTimer = new CountDownTimer(Common.TOTAL_TIME, 1000) {
                @Override
                public void onTick(long l) {
                    txtTimer.setText(String.format("%02d:%02d",
                            TimeUnit.MILLISECONDS.toMinutes(l),
                            TimeUnit.MILLISECONDS.toSeconds(l) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l))));
                    time_play -= 1000;
                }

                @Override
                public void onFinish() {
                    //ket thuc game
                }
            }.start();
        }
    }

    public void checkAnswer(){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_result_grid);
        dialog.setTitle("Danh sách câu trả lời");


        ResultAnswerAdapter adapter = new ResultAnswerAdapter(arr_Ques,this);
        GridView gridView = (GridView) dialog.findViewById(R.id.gird_AnswerResult);
        //gridView = (GridView) dialog.findViewById(R.id.gird_AnswerResult);
        //arrayListQuestion = new ArrayList<>();
        //adapter = new ResultAnswerAdapter(this, R.layout.item_result_thisathach, arr_Ques);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //
                dialog.dismiss();
            }
        });

        Button buttonDong;
        buttonDong = (Button) dialog.findViewById(R.id.btnDong);
        buttonDong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    //menu left==============================================
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.question, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        //click ket thuc
        if(id == R.id.menu_ketthuc) {
            if (!isAnswerModeView) {
                new MaterialStyledDialog.Builder(this)
                        .setTitle("Finish ?")
                        .setIcon(R.drawable.ic_mood_black_24dp)
                        .setDescription("chắc chưa?")
                        .setNegativeText("No")
                        .onNegative(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                dialog.dismiss();
                            }
                        })
                        .setPositiveText("Yes")
                        .onPositive(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                dialog.dismiss();
                                finishGame();

                            }
                        }).show();
            }
            return true;
        }

        //click kiem tra
        if(id == R.id.menu_kiemtra) {
            Toast.makeText(this, "click kiem tra", Toast.LENGTH_SHORT).show();

            //checkAnswer();

        }

        return super.onOptionsItemSelected(item);
    }


    private void finishGame() {
        int position = viewPager.getCurrentItem();
    }
}
