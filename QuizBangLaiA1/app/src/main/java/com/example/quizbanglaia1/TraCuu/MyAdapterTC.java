package com.example.quizbanglaia1.TraCuu;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyAdapterTC extends FragmentPagerAdapter {
    int tabcount;

    public MyAdapterTC(FragmentManager fm, int tabcount) {
        super(fm);
        this.tabcount = tabcount;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LuatXeMayFragment();
        } else if (position == 1) {
            return new LuatMoToFragment();
        } else if (position == 2) {
            return new LuatNguoiDiBoFragment();
        } else if (position == 3) {
            return new LuatOtoFragment();
        }
         else if (position == 4) {
            return new LuatNguoiDiBoFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabcount;
    }

}
