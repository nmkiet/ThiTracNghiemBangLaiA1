package com.example.quizbanglaia1.BienBao;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {
    String listTabs[] = {"Biển Báo Cấm","Biển Báo Chỉ Dẫn","Biển Báo Nguy Hiểm"};
    private BienBaoCam bienBaoCam;
    private BienBaoChiDan bienBaoChiDan;
    private BienBaoNguyHiem bienBaoNguyHiem;
    public MyAdapter(FragmentManager fm) {
        super(fm);
        bienBaoCam = new BienBaoCam();
        bienBaoChiDan = new BienBaoChiDan();
        bienBaoNguyHiem = new BienBaoNguyHiem();
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return bienBaoCam;
        }
        else if (position==1){
            return bienBaoChiDan;
        }
        else  if (position==2){
            return  bienBaoNguyHiem;
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
