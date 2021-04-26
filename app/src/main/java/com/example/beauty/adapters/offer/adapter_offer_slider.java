package com.example.beauty.adapters.offer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beauty.R;
import com.example.beauty.models.offer.model_offer_slider;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class adapter_offer_slider extends SliderViewAdapter<adapter_offer_slider.holder> {


    List<model_offer_slider> list;
    Context context;

    public adapter_offer_slider(List<model_offer_slider> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public adapter_offer_slider.holder onCreateViewHolder(ViewGroup parent) {
        return new adapter_offer_slider.holder(LayoutInflater.from(context).inflate(R.layout.layout_offer_slider,parent,false));
    }

    @Override
    public void onBindViewHolder(adapter_offer_slider.holder viewHolder, int position) {


    }

    @Override
    public int getCount() {
        return list.size();
    }

    public class holder extends SliderViewAdapter.ViewHolder {
        com.potyvideo.library.AndExoPlayerView video;

        public holder(View itemView) {
            super(itemView);

            video=itemView.findViewById(R.id.player);
        }
    }
}
