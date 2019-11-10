package com.example.quizbanglaia1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import com.example.quizbanglaia1.HocLyThuyet.HocLyThuyetFragment;
import com.example.quizbanglaia1.Home.homeFragment;
import com.example.quizbanglaia1.ThiSatHach.ThiSatHachFragment;
import com.example.quizbanglaia1.TrangChu.HomeFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_open);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //Trang chủ
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new homeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_trangchu);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nav_trangchu:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new homeFragment()).commit();
                break;

            case R.id.nav_thisathach:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ThiSatHachFragment()).commit();
                break;

            case R.id.nav_hoclythuyet:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HocLyThuyetFragment()).commit();
                break;

            case R.id.nav_bienbao:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HocLyThuyetFragment()).commit();
                break;

            case R.id.nav_meothi:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HocLyThuyetFragment()).commit();
                break;

            case R.id.nav_tracuu:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HocLyThuyetFragment()).commit();
                break;

            case R.id.nav_cauhoi:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HocLyThuyetFragment()).commit();
                break;

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
