package com.example.quizbanglaia1.BienBao;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.quizbanglaia1.R;

import java.util.ArrayList;


public class BienBaoChiDan extends Fragment {
    private View nRootView;
    ListView list;
    ArrayList<FlagBB> arrayList;
    FlagAdapterBB adapter;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        nRootView = inflater.inflate(R.layout.fragment_bien_bao_chi_dan,null);

        list = nRootView.findViewById(R.id.lst_bbcd);
        arrayList = FlagBB.initFlagBBCD();
        adapter = new FlagAdapterBB(nRootView.getContext(),R.layout.layout_bb,arrayList);
        list.setAdapter(adapter);
        return  nRootView;

    }
}
