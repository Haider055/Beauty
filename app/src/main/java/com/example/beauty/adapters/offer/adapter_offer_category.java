package com.example.beauty.adapters.offer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.beauty.R;
import com.example.beauty.models.offer.model_offer_category;

import java.util.List;

public class adapter_offer_category extends RecyclerView.Adapter<adapter_offer_category.holder> {

    List<model_offer_category> list;
    Context context;

    public adapter_offer_category(List<model_offer_category> list, Context context) {
        this.list = list;
        this.context = context;
    }




    @NonNull
    @Override
    public adapter_offer_category.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_offer_category.holder(LayoutInflater.from(context).inflate(R.layout.layout_recycler_offer_category,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_offer_category.holder holder, int position) {

        Glide.with(context).load(list.get(position).getImage()).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(holder.imageView);
        holder.off.setText("10 % Off");
        holder.description.setText("Off on face mask upto 400 on order of 1000");

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView off,description;
        public holder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);
            off=itemView.findViewById(R.id.off);
            description=itemView.findViewById(R.id.description);
        }
    }
}
