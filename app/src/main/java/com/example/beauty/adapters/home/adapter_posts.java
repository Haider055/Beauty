package com.example.beauty.adapters.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.beauty.R;
import com.example.beauty.models.home.model_post;

import java.util.List;

public class adapter_posts extends RecyclerView.Adapter<adapter_posts.holder> {

    List<model_post> list;
    Context context;

    public adapter_posts(List<model_post> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter_posts.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_posts.holder(LayoutInflater.from(context).inflate(R.layout.layout_recycler_home_post,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_posts.holder holder, int position) {

        Glide.with(context).load(list.get(position).getImage()).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{

        ImageView image;

        public holder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.image);

        }
    }
}
