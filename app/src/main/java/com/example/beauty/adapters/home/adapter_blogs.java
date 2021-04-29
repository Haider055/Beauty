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
import com.example.beauty.R;
import com.example.beauty.models.home.model_blogs;

import java.util.List;

public class adapter_blogs extends RecyclerView.Adapter<adapter_blogs.holder> {

    List<model_blogs> list;
    Context context;

    public adapter_blogs(List<model_blogs> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter_blogs.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_blogs.holder(LayoutInflater.from(context).inflate(R.layout.layout_recycler_blogs,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_blogs.holder holder, int position) {

        Glide.with(context).load(list.get(position).getImage()).into(holder.imageView);
        holder.title.setText("8 causes");
        holder.desc.setText("description ");
        holder.date.setText("1 april 2021");
        holder.answer.setText("dermatologists answers");
        holder.drname.setText("dr ali");

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title,desc,date,answer,drname;

        public holder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);
            title=itemView.findViewById(R.id.title);
            desc=itemView.findViewById(R.id.desc);
            date=itemView.findViewById(R.id.date);
            answer=itemView.findViewById(R.id.answer);
            drname=itemView.findViewById(R.id.drname);
        }
    }
}
