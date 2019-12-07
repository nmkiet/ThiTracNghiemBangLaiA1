package com.example.quizbanglaia1.Home;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.quizbanglaia1.R;

import java.util.ArrayList;

public class homeFragment extends Fragment {

    ArrayList<Home> homeArrayList;
    GridView gridView;
    HomeAdapter adapter;

    public homeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trangchu_gird, container, false);

        gridView = (GridView) view.findViewById(R.id.gird_trangchu);
        homeArrayList = new ArrayList<>();
        homeArrayList.add(new Home(R.drawable.hoctap5, "Học lý thuyết"));
        homeArrayList.add(new Home(R.drawable.thisathach, "Thi sát hạch"));
        homeArrayList.add(new Home(R.drawable.bienbao, "Biển báo"));
        homeArrayList.add(new Home(R.drawable.meo, "Mẹo khi thi"));
        homeArrayList.add(new Home(R.drawable.tracuu2, "Tra cứu luật"));
        homeArrayList.add(new Home(R.drawable.cauhoi, "Câu hỏi dễ sai"));

        adapter = new HomeAdapter(getActivity(), R.layout.item_trangchu_gird, homeArrayList);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


            }
        });

        return  view;
    }

}
