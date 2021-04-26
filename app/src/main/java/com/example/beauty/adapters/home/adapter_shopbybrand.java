package com.example.beauty.adapters.home;

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
import com.example.beauty.models.home.model_shopbybrand;

import java.util.List;

public class adapter_shopbybrand extends RecyclerView.Adapter<adapter_shopbybrand.holder> {

    List<model_shopbybrand> list;
    Context context;

    public adapter_shopbybrand(List<model_shopbybrand> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public adapter_shopbybrand.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_shopbybrand.holder(LayoutInflater.from(context).inflate(R.layout.layout_recycler_shopbybrand,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_shopbybrand.holder holder, int position) {

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
