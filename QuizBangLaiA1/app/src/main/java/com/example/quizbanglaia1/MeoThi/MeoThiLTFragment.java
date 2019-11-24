package com.example.quizbanglaia1.MeoThi;

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


public class MeoThiLTFragment extends Fragment {
    private  View nRootView;
    ListView list;
    ArrayList<FlagMeoThi> arrayList;
    FlagAdapterMeoThi adapter;
    //Database database;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        nRootView=inflater.inflate(R.layout.fragment_meo_thi_lt,null);

        list = nRootView.findViewById(R.id.lst_meothiLT);
        arrayList = new ArrayList<>();
        arrayList= FlagMeoThi.initFlagLT();
        adapter = new FlagAdapterMeoThi(nRootView.getContext(),R.layout.layout_meothi,arrayList);
        list.setAdapter(adapter);

        return  nRootView;


    }
}
