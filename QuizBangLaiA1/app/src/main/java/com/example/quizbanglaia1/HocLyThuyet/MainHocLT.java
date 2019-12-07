package com.example.quizbanglaia1.HocLyThuyet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.quizbanglaia1.BienBao.MyAdapter;
import com.example.quizbanglaia1.MainActivity;
import com.example.quizbanglaia1.R;
import com.google.android.material.tabs.TabLayout;

public class MainHocLT extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hoclt);


        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new MyAdapterHLT(getSupportFragmentManager()));
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar_bb);
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
