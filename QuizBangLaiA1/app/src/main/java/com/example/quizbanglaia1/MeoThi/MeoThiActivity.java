package com.example.quizbanglaia1.MeoThi;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.quizbanglaia1.MainActivity;
import com.example.quizbanglaia1.R;
import com.google.android.material.tabs.TabLayout;

public class MeoThiActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    VideoView videoView;
    Button btn;
    MediaController mda;
    String videopath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meo_thi);

        viewPager = findViewById(R.id.vp_MT);
        viewPager.setAdapter(new MyAdapterMT(getSupportFragmentManager()));
        tabLayout = findViewById(R.id.tabs_MT);
        tabLayout.setupWithViewPager(viewPager);

//        videopath ="android.resource://com.example.quizbanglaia1"+R.raw.video;
//        Uri uri = Uri.parse(videopath);
//        videoView.setVideoURI(uri);
//        videoView.setMediaController(mda);
//        mda.setAnchorView(videoView);
//        videoView.start();

        videoView =(VideoView) findViewById(R.id.video);
        mda = new MediaController(this);
        btn =(Button) findViewById(R.id.btn_video);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videopath ="android.resource://com.example.quizbanglaia1"+R.raw.video;
                Uri uri = Uri.parse(videopath);
                videoView.setVideoURI(uri);
                videoView.setMediaController(mda);
                mda.setAnchorView(videoView);
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
