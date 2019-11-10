package com.example.quizbanglaia1.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quizbanglaia1.R;

import java.util.List;

public class HomeAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Home> homeList;

    public HomeAdapter(Context context, int layout, List<Home> homeList) {
        this.context = context;
        this.layout = layout;
        this.homeList = homeList;
    }

    @Override
    public int getCount() {
        return homeList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView tvMoto;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if(view == null)
        {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.imgHinh = view.findViewById(R.id.home_item_hinh);
            holder.tvMoto =  view.findViewById(R.id.home_item_tenhinh);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }

        Home home = homeList.get(i);
        holder.imgHinh.setImageResource(home.getPic());
        holder.tvMoto.setText(home.getName());

        return view;
    }
}
