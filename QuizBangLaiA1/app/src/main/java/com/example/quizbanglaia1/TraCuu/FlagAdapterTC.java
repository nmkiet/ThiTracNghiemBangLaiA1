package com.example.quizbanglaia1.TraCuu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.quizbanglaia1.R;

import java.util.ArrayList;

public class FlagAdapterTC extends ArrayAdapter {
    Context context;
    ArrayList<FlagTC> arrayList;
    int layout;

    public FlagAdapterTC(@NonNull Context context, int resource, @NonNull ArrayList<FlagTC> objects) {
        super(context, resource, objects);
        this.context = context;
        this.arrayList = objects;
        this.layout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        FlagTC lst = arrayList.get(position);
        if(convertView==null)
        {
            convertView = LayoutInflater.from(context).inflate(layout,null);
        }
        TextView txt = convertView.findViewById(R.id.tenluat);
        TextView txt1 = convertView.findViewById(R.id.ct_luat);
        txt.setText(lst.getName());
        txt1.setText(lst.getChitiet());
        return convertView;
    }
}
