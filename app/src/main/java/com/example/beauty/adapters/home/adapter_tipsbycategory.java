package com.example.beauty.adapters.home;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.beauty.R;
import com.example.beauty.models.home.model_tipsbycategory;

import java.util.List;

public class adapter_tipsbycategory extends RecyclerView.Adapter<adapter_tipsbycategory.holder> {

    List<model_tipsbycategory> list;
    Context context;

    public adapter_tipsbycategory(List<model_tipsbycategory> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter_tipsbycategory.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_tipsbycategory.holder(LayoutInflater.from(context).inflate(R.layout.layout_recycler_tipsbycategory,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_tipsbycategory.holder holder, int position) {

        if (position%4==0){
            holder.cardView.setCardBackgroundColor(Color.parseColor("#c27fff"));
        }
        else if (position%4==1){
            holder.cardView.setCardBackgroundColor(Color.parseColor("#48d2d2"));
        }
        else if (position%4==2){
            holder.cardView.setCardBackgroundColor(Color.parseColor("#fc977b"));
        }
        else {
            holder.cardView.setCardBackgroundColor(Color.parseColor("#fabc05"));
        }

        Glide.with(context).load(list.get(position).getImage()).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(holder.image);
        holder.textView.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView textView;
        CardView cardView;

        public holder(@NonNull View itemView) {
            super(itemView);

            cardView=itemView.findViewById(R.id.card);

            image=itemView.findViewById(R.id.image);
            textView=itemView.findViewById(R.id.name);
        }
    }
}
