package com.example.beauty.adapters.fashion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.beauty.R;
import com.example.beauty.models.fashion.model_fashion_buildlook2;

import java.util.List;

public class adapter_fashion_buildlook2 extends RecyclerView.Adapter<adapter_fashion_buildlook2.holder> {

    List<model_fashion_buildlook2> list;
    Context context;

    public adapter_fashion_buildlook2(List<model_fashion_buildlook2> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter_fashion_buildlook2.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_fashion_buildlook2.holder(LayoutInflater.from(context).inflate(R.layout.layout_recycler_fashion_buildlook2,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_fashion_buildlook2.holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{


        ImageView imageView;
        TextView title;

        public holder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
        }
        }
}
