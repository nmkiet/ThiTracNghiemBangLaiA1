package com.example.quizbanglaia1.ThiSatHach;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.quizbanglaia1.MainActivity;
import com.example.quizbanglaia1.R;

public class ThiSatHachFragment extends Fragment {

    public Button btnStart;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Thi sát hạch");
        return inflater.inflate(R.layout.fragment_thisathach, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnStart = (Button) getActivity().findViewById(R.id.btnstart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ThishActivity.class);
                startActivity(intent);
            }
        });
    }
}
