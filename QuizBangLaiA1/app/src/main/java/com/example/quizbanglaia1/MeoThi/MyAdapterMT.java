package com.example.quizbanglaia1.MeoThi;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyAdapterMT extends FragmentStatePagerAdapter {
    String listTabs[] = {"Mẹo Thi Lý Thuyết","Mẹo Thi Thực Hành"};
    private MeoThiLTFragment meoThiLT;
    private MeoThiTTFragment meoThiTT;
    public MyAdapterMT(FragmentManager fm) {
        super(fm);
        meoThiLT = new MeoThiLTFragment();
        meoThiTT = new MeoThiTTFragment();
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return meoThiLT;
        }
        else if (position==1){
            return meoThiTT;
        }
        return null;
    }

    @Override
    public int getCount() {
        return listTabs.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTabs[position];
    }
}
