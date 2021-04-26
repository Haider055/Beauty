package com.example.beauty.adapters.fashion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.beauty.R;
import com.example.beauty.models.fashion.model_fashion_video;

import java.util.List;

public class adapter_fashion_videos extends RecyclerView.Adapter<adapter_fashion_videos.holder> {

    List<model_fashion_video>list;
    Context context;

    public adapter_fashion_videos(List<model_fashion_video> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter_fashion_videos.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_fashion_videos.holder(LayoutInflater.from(context).inflate(R.layout.layout_fashion_recycler_video,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_fashion_videos.holder holder, int position) {

        Glide.with(context).load(list.get(position).getImage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{

        ImageView image;
        Button button;

        public holder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.image);
            button=itemView.findViewById(R.id.button);

        }
    }
}
