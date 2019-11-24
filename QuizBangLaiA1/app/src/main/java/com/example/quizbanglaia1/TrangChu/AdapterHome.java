package com.example.quizbanglaia1.TrangChu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizbanglaia1.MainActivity;
import com.example.quizbanglaia1.R;

import java.util.List;

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.ViewHolder> {

    private List<classHome> classHomeList;
    Context context;

    public AdapterHome(List<classHome> classHomeList, Context context) {
        this.classHomeList = classHomeList;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterHome.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_trangchu, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHome.ViewHolder holder, final int position) {


        holder.imgHinh.setImageResource(classHomeList.get(position).getHinh());
        holder.txtTenHinh.setText(classHomeList.get(position).getMoTa());
        /*Sự kiện click vào item*/
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(classHomeList.get(position).getMoTa() == "Thi sát hạch") {
                    Toast.makeText(context, "click ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        //return 0;
        return classHomeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgHinh;
        TextView txtTenHinh;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgHinh = (ImageView) itemView.findViewById(R.id.trangchu_item_hinh);
            txtTenHinh = (TextView) itemView.findViewById(R.id.trangchu_item_tenhinh);
        }
    }
}
