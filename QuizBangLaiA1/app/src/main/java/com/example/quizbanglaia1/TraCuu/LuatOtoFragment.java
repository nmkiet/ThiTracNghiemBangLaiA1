package com.example.quizbanglaia1.TraCuu;

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


public class LuatOtoFragment extends Fragment {
    private  View nRootView;
    ListView list;
    ArrayList<FlagTC> arrayList;
    FlagAdapterTC adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        nRootView=inflater.inflate(R.layout.fragment_luat_oto,null);

        list = nRootView.findViewById(R.id.lst_oto);
        arrayList = FlagTC.initFlagOT();
        adapter = new FlagAdapterTC(nRootView.getContext(),R.layout.layout_tracuu,arrayList);
        list.setAdapter(adapter);
        return  nRootView;
    }
}
