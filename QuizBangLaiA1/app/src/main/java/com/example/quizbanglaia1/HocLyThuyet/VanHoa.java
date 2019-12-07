package com.example.quizbanglaia1.HocLyThuyet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.quizbanglaia1.R;

import java.util.ArrayList;

public class VanHoa extends Fragment {
    private View nRootView;
    ListView list;
    ArrayList<FlagKN> arrayList;
    FlagAdapter adapter;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        nRootView = inflater.inflate(R.layout.fragment_vanhoa,null);

        list = nRootView.findViewById(R.id.list_VanHoa);
        arrayList = FlagKN.initVanHoa();
        adapter = new FlagAdapter(nRootView.getContext(),R.layout.layout_vanhoa,arrayList);
        list.setAdapter(adapter);
        return  nRootView;

    }
}
