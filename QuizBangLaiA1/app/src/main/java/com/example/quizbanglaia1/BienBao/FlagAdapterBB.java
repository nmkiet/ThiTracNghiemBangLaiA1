package com.example.quizbanglaia1.BienBao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.quizbanglaia1.R;

import java.util.ArrayList;

public class FlagAdapterBB extends ArrayAdapter {
    Context context;
    ArrayList<FlagBB> arrayList;
    int layout;

    public FlagAdapterBB(@NonNull Context context, int resource, @NonNull ArrayList<FlagBB> objects) {
        super(context, resource, objects);
        this.context = context;
        this.arrayList = objects;
        this.layout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        FlagBB lst = arrayList.get(position);
        if(convertView==null)
        {
            convertView = LayoutInflater.from(context).inflate(layout,null);
        }
        ImageView imageView = convertView.findViewById(R.id.imagebb);
        imageView.setImageResource(lst.getId());
        TextView txt = convertView.findViewById(R.id.tenbb);
        TextView txt1 = convertView.findViewById(R.id.ct_bb);
        txt.setText(lst.getName());
        txt1.setText(lst.getChitiet());
        return convertView;
    }
}
