package com.example.beauty.adapters.offer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.beauty.R;
import com.example.beauty.models.offer.model_offer_story;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class adapter_offer_story extends RecyclerView.Adapter<adapter_offer_story.holder> {

    List<model_offer_story> list;
    Context context;

    public adapter_offer_story(List<model_offer_story> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public adapter_offer_story.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_offer_story.holder(LayoutInflater.from(context).inflate(R.layout.layout_recycler_offer_story,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_offer_story.holder holder, int position) {

        Glide.with(context).load(list.get(position).getImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{

        CircleImageView imageView;

        public holder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);

        }
    }
}
