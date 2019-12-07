package com.example.quizbanglaia1.HocLyThuyet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.quizbanglaia1.BienBao.BienBaoCam;
import com.example.quizbanglaia1.BienBao.BienBaoChiDan;
import com.example.quizbanglaia1.BienBao.BienBaoNguyHiem;
import com.example.quizbanglaia1.BienBao.MyAdapter;

public class MyAdapterHLT extends FragmentStatePagerAdapter {
    String lisTab[] = {"Khái niệm quy tắc","Hệ thống biển báo", "Các thế sa hình","Văn hóa đạo đức người lái xe"};
    private KhaiNiem khaiNiem;
    private HeThongBienBao heThongBienBao;
    private SaHinh saHinh;
    private VanHoa vanHoa;

    public MyAdapterHLT(FragmentManager fm) {
        super(fm);
        khaiNiem = new KhaiNiem();
        heThongBienBao = new HeThongBienBao();
        saHinh = new SaHinh();
        vanHoa = new VanHoa();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return khaiNiem;
        }
        else if (position==1){
            return heThongBienBao;
        }
        else if (position==2){
            return saHinh;
        }
        else if (position==3){
            return vanHoa;
        }

        return null;
    }

    @Override
    public int getCount() {
        return lisTab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lisTab[position];
    }
}
