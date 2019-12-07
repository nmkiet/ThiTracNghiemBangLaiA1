package com.example.quizbanglaia1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.example.quizbanglaia1.BienBao.MainBienBao;

import com.example.quizbanglaia1.HocLyThuyet.MainHocLT;
import com.example.quizbanglaia1.HocLyThuyet.MainHocLThuyet;
import com.example.quizbanglaia1.Home.homeFragment;
import com.example.quizbanglaia1.MeoThi.MeoThiActivity;
import com.example.quizbanglaia1.ThiSatHach.ThiSatHachFragment;
import com.example.quizbanglaia1.ThiSatHach.ThishActivity;
import com.example.quizbanglaia1.TraCuu.MainTraCuu;
import com.example.quizbanglaia1.TrangChu.HomeFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    GridView gridView;
    Button btnhlt,btntsh,btnmt,btnbb,btntc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        btn = findViewById(R.id.btn_bb);
//        btn = findViewById(R.id.btn_cs);
//        btn = findViewById(R.id.btn_hlt);
//        btn = findViewById(R.id.btn_mt);
        btntsh = findViewById(R.id.btn_tsh);
        btntsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThishActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnmt = findViewById(R.id.btn_mt);
        btnmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MeoThiActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnbb = findViewById(R.id.btn_bb);
        btnbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainBienBao.class);
                startActivity(intent);
                finish();
            }
        });
        btntc = findViewById(R.id.btn_tracuu);
        btntc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainTraCuu.class);
                startActivity(intent);
                finish();
            }
        });
        btnhlt = findViewById(R.id.btn_hlt);
        btnhlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainHocLThuyet.class);
                startActivity(intent);
                finish();
            }
        });



        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_open);

        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }
    // *******************sự kiện click item navigation ************
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch (id) {
            case R.id.nav_thi:
                Intent t = new Intent(MainActivity.this,ThishActivity.class);
                startActivity(t);
                break;
            case R.id.nav_bienbao:
                Intent bb = new Intent(MainActivity.this,MainBienBao.class);
                startActivity(bb);
                break;
            case R.id.nav_meo:
                Intent m = new Intent(MainActivity.this,MeoThiActivity.class);
                startActivity(m);
                break;
            case R.id.nav_tracuu:
                Intent tc = new Intent(MainActivity.this,MainTraCuu.class);
                startActivity(tc);
                break;
//            case R.id.nav_causai:
//                Intent cs = new Intent(MainActivity.this,MainC.class);
//                startActivity(t);
//                break;

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
