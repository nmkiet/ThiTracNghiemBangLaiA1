package com.example.quizbanglaia1.TrangChu;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.quizbanglaia1.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private AdapterHome adapterHome;
    private ArrayList<classHome> arrayList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trangchu, container, false);



        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_trangchu);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManager);


        arrayList.add(new classHome(R.drawable.hoctap5, "Học lý thuyết"));
        arrayList.add(new classHome(R.drawable.thisathach, "Thi sát hạch"));
        arrayList.add(new classHome(R.drawable.bienbao, "Biển báo"));
        arrayList.add(new classHome(R.drawable.meo, "Mẹo khi thi"));
        arrayList.add(new classHome(R.drawable.tracuu2, "Tra cứu luật"));
        arrayList.add(new classHome(R.drawable.cauhoi, "Câu hỏi dễ sai"));

        adapterHome = new AdapterHome(arrayList, getActivity());
        recyclerView.setAdapter(adapterHome);


        return  view;
    }

}
