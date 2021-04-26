package com.example.beauty.adapters.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.beauty.R;
import com.example.beauty.models.home.model_slider;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class adapter_slider extends SliderViewAdapter<adapter_slider.holder> {

    List<model_slider> list;
    Context context;

    public adapter_slider(List<model_slider> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @Override
    public holder onCreateViewHolder(ViewGroup parent) {
        return new adapter_slider.holder(LayoutInflater.from(context).inflate(R.layout.slider_recycler_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_slider.holder holder, int position) {
        Glide.with(context).load(list.get(position).getImage()).diskCacheStrategy(DiskCacheStrategy.AUTOMATIC).into(holder.imageView);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    public class holder extends SliderViewAdapter.ViewHolder{

        ImageView imageView;

        public holder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);

        }
    }
}
