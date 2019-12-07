package com.example.quizbanglaia1.HocLyThuyet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.quizbanglaia1.BienBao.FlagBB;
import com.example.quizbanglaia1.R;

import java.util.ArrayList;
import java.util.List;

public class FlagAdapter extends ArrayAdapter {
    Context context;
    ArrayList<FlagKN> arrayList;
    int layout;


    public FlagAdapter(@NonNull Context context, int resource, @NonNull ArrayList<FlagKN> objects) {
        super(context, resource, objects);
        this.context = context;
        this.arrayList = objects;
        this.layout = resource;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        FlagKN lst = arrayList.get(position);
        if(convertView==null)
        {
            convertView = LayoutInflater.from(context).inflate(layout,null);
        }
//        ImageView imageView = convertView.findViewById(R.id.imagebb);
//        imageView.setImageResource(lst.getId());
        TextView txt = convertView.findViewById(R.id.cauhoi);
//        ImageView imgv = convertView.findViewById(R.id.img_hinh);
        TextView txt1 = convertView.findViewById(R.id.tl1);
        TextView txt2 = convertView.findViewById(R.id.tl2);
        txt.setText(lst.getCauHoi());
//        imgv.setImageResource(lst.getId());
        txt1.setText(lst.getTraLoi1());
        txt2.setText(lst.getTraLoi2());
        return convertView;
    }
}
