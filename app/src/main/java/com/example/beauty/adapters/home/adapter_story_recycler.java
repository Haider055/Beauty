package com.example.beauty.adapters.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.beauty.R;
import com.example.beauty.models.home.model_story_recycler;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class adapter_story_recycler extends RecyclerView.Adapter<adapter_story_recycler.holder> {

    List<model_story_recycler> list;
    Context context;

    public adapter_story_recycler(List<model_story_recycler> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter_story_recycler.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_story_recycler.holder(LayoutInflater.from(context).inflate(R.layout.story_recycler_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_story_recycler.holder holder, int position) {

        Glide.with(context).load(list.get(position).getImage()).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(holder.circleImageView);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{

        CircleImageView circleImageView;

        public holder(@NonNull View itemView) {
            super(itemView);

            circleImageView=itemView.findViewById(R.id.image);

        }

    }
}
