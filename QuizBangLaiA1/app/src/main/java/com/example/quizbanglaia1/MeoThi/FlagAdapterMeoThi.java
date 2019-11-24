package com.example.quizbanglaia1.MeoThi;

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

public class FlagAdapterMeoThi extends ArrayAdapter<FlagMeoThi> {
    public FlagAdapterMeoThi(@NonNull Context context, int resource, @NonNull ArrayList<FlagMeoThi> objects) {
        super(context, 0, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        FlagMeoThi flagMeoThi =getItem(position);
        if(convertView==null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_meothi,parent,false);
        }
        TextView txt = convertView.findViewById(R.id.sttmeo);
        TextView txt1 = convertView.findViewById(R.id.chitietmeo);
        txt.setText(flagMeoThi.stt);
        txt1.setText(flagMeoThi.ctmeo);
        return convertView;
    }
}
