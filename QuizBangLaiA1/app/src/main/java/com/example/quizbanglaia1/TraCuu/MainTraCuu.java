package com.example.quizbanglaia1.TraCuu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quizbanglaia1.MainActivity;
import com.example.quizbanglaia1.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainTraCuu extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem nguoidibo;
    TabItem xedap;
    TabItem xemoto;
    TabItem xeoto;
    MyAdapterTC myAdapterTC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tra_cuu2);

        viewPager = findViewById(R.id.vp_TC);
        nguoidibo = findViewById(R.id.itemngdibo);
        xedap = findViewById(R.id.itemxedap);
        xemoto = findViewById(R.id.itemxemoto);
        xeoto = findViewById(R.id.itemxeoto);
        tabLayout = findViewById(R.id.tabs_TC);

        myAdapterTC = new MyAdapterTC(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(myAdapterTC);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar_tc);
        setSupportActionBar(toolbar);



        //************************************************************
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
