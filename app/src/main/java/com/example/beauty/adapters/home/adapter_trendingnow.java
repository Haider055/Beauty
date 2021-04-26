package com.example.beauty.adapters.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beauty.R;
import com.example.beauty.models.home.model_trendingnow;

import java.util.List;

public class adapter_trendingnow extends RecyclerView.Adapter<adapter_trendingnow.holder> {

    List<model_trendingnow> list;
    Context context;

    public adapter_trendingnow(List<model_trendingnow> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter_trendingnow.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_trendingnow.holder(LayoutInflater.from(context).inflate(R.layout.layout_recycler_trendingnow,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_trendingnow.holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView name,price;

        public holder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);
            name=itemView.findViewById(R.id.title);
            price=itemView.findViewById(R.id.price);


        }
    }
}
