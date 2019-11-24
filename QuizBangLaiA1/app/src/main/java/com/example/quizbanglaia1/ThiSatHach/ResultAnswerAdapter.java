package com.example.quizbanglaia1.ThiSatHach;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.quizbanglaia1.Model.Question;
import com.example.quizbanglaia1.R;

import java.util.ArrayList;
import java.util.List;

public class ResultAnswerAdapter extends BaseAdapter {

    //private Context context;
    //private int layout;
    ArrayList lsData;
    LayoutInflater inflater;

    public ResultAnswerAdapter(ArrayList lsData, Context context) {
        this.lsData = lsData;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

//    public ResultAnswerAdapter(Context context, int layout, List<Question> lsData) {
//        this.context = context;
//        this.layout = layout;
//        this.lsData = lsData;
//    }

    @Override
    public int getCount() {
        return lsData.size();
    }

    @Override
    public Object getItem(int i) {
        return lsData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public static class ViewHolder{
        TextView tvAnswerQuestion;
        TextView tvResultQuestion;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Question data = (Question) getItem(i);
        ViewHolder holder;

        if(view == null)
        {
            holder = new ViewHolder();
            //LayoutInflater  inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_result_thisathach,null);
            holder.tvAnswerQuestion = (TextView) view.findViewById(R.id.tvAnswerQuestion);
            holder.tvResultQuestion = (TextView) view.findViewById(R.id.tvResultQuestion);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        //Question qs = lsData.get(i);
        int position = i + 1;
        holder.tvAnswerQuestion.setText("Câu "+position+": ");
        holder.tvResultQuestion.setText(data.getTraLoi());
        //holder.tvResultQuestion.setText("A");

        return view;
    }
}
