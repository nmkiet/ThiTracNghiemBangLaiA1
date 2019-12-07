package com.example.quizbanglaia1.MeoThi;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.quizbanglaia1.MainActivity;
import com.example.quizbanglaia1.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MeoThiActivity extends AppCompatActivity {

    VideoView videoView;
    ListView lst;
    ArrayList<String> videolist;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meo_thi);

        videolist = new ArrayList<String>();
        videoView =findViewById(R.id.video);
        lst = findViewById(R.id.lv_meothi);
        videolist.add("1.Điều đầu tiên và cơ bản nhất là bạn phải biết đi xe máy.");
        videolist.add("2. Tập trước vòng số 8 ở nhà.");
        videolist.add("3. Hôm thi lên sân thật sớm.");
        videolist.add("4. Cách đi để không bị chạm vạch. (Click vào để xem video)");
//
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,videolist);
        lst.setAdapter(adapter);
       lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               switch (i) {
                   case 3:
                       videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+ "//" + R.raw.video ));
                       break;
               }
               videoView.requestFocus();
               videoView.start();
           }
       });




        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.Toolbar_meothi);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayShowHomeEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_back);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }

}
