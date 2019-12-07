package com.example.quizbanglaia1.ThiSatHach;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizbanglaia1.Common.Common;
import com.example.quizbanglaia1.Common.SpaceDecoration;
import com.example.quizbanglaia1.R;

public class kt extends AppCompatActivity {
    AnswerSheetHelperAdapter adapter;
    RecyclerView recyclerView_kt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kt);

        adapter = new AnswerSheetHelperAdapter(this, Common.answerSheetList);
        recyclerView_kt = (RecyclerView) findViewById(R.id.recycler_kt);
        recyclerView_kt.setHasFixedSize(true);
        recyclerView_kt.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView_kt.addItemDecoration(new SpaceDecoration(4));
        recyclerView_kt.setAdapter(adapter);
    }
}
