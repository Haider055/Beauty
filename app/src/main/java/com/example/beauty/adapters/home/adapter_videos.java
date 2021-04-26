package com.example.beauty.adapters.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.beauty.R;
import com.example.beauty.models.home.model_videos;

import java.util.List;

public class adapter_videos extends RecyclerView.Adapter<adapter_videos.holder> {

    List<model_videos> list;
    Context context;

    public adapter_videos(List<model_videos> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter_videos.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_videos.holder(LayoutInflater.from(context).inflate(R.layout.layout_recycler_video,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_videos.holder holder, int position) {

        Glide.with(context).load(list.get(position).getImage()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public holder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);

        }
    }
}
