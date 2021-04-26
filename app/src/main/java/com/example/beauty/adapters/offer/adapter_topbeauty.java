package com.example.beauty.adapters.offer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.beauty.R;
import com.example.beauty.models.offer.model_topbeautycare;
import com.example.beauty.models.offer.model_topoffers;

import java.util.List;

public class adapter_topbeauty extends RecyclerView.Adapter<adapter_topbeauty.holder> {

    List<model_topbeautycare> list;
    Context context;

    public adapter_topbeauty(List<model_topbeautycare> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter_topbeauty.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_topbeauty.holder(LayoutInflater.from(context).inflate(R.layout.layour_recycler_offer_topbeauty,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

        Glide.with(context).load(list.get(position).getImage()).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(holder.imageView);

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

            imageView=itemView.findViewById(R.id.image);
            title=itemView.findViewById(R.id.title);

        }
    }
}
