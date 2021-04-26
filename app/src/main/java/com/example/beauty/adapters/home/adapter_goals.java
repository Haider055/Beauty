package com.example.beauty.adapters.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.beauty.R;
import com.example.beauty.models.home.model_goals;

import java.util.List;

public class adapter_goals extends RecyclerView.Adapter<adapter_goals.holder> {

    List<model_goals> list;
    Context context;

    public adapter_goals(List<model_goals> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter_goals.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_goals.holder(LayoutInflater.from(context).inflate(R.layout.layout_recycler_goals,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_goals.holder holder, int position) {
        Glide.with(context).load(list.get(position).getImage()).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(holder.imageView);

    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{

        ImageView imageView;
        Button view;
        public holder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);
            view=itemView.findViewById(R.id.view);

        }
    }
}
