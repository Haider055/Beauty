package com.example.beauty.fragments;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beauty.R;
import com.example.beauty.adapters.fashion.adapter_fashion_slider;
import com.example.beauty.adapters.home.adapter_story_recycler;
import com.example.beauty.adapters.offer.adapter_offer_category;
import com.example.beauty.adapters.offer.adapter_offer_slider;
import com.example.beauty.adapters.offer.adapter_offer_story;
import com.example.beauty.adapters.offer.adapter_shopbybrand;
import com.example.beauty.adapters.offer.adapter_topbeauty;
import com.example.beauty.adapters.offer.adapter_topoffers;
import com.example.beauty.models.fashion.model_fashion_slider;
import com.example.beauty.models.home.model_shopbybrand;
import com.example.beauty.models.home.model_story_recycler;
import com.example.beauty.models.offer.model_offer_category;
import com.example.beauty.models.offer.model_offer_slider;
import com.example.beauty.models.offer.model_offer_story;
import com.example.beauty.models.offer.model_offershopbybrand;
import com.example.beauty.models.offer.model_topbeautycare;
import com.example.beauty.models.offer.model_topoffers;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class offers extends Fragment {


    com.smarteist.autoimageslider.SliderView sliderView;
    adapter_offer_slider adapter_offer_slider;
    List<model_offer_slider> listslider;

    RecyclerView recyclerstory;
    com.example.beauty.adapters.offer.adapter_offer_story adapter_offer_story;
    List<model_offer_story> liststory;


    RecyclerView recyclertopoffers;
    com.example.beauty.adapters.offer.adapter_topoffers adapter_topoffers;
    List<model_topoffers> listtopoffers;

    RecyclerView recyclershopbybrand;
    com.example.beauty.adapters.offer.adapter_shopbybrand adapter_shopbybrand;
    List<model_offershopbybrand> listshopbybrand;

    RecyclerView recyclertopcare;
    com.example.beauty.adapters.offer.adapter_topbeauty adapter_topbeauty;
    List<model_topbeautycare> listtopbeautycare;

    RecyclerView recyclercatgory;
    com.example.beauty.adapters.offer.adapter_offer_category adapter_offer_category;
    List<model_offer_category> listcategory;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_offers, container, false);


        //stories
        recyclerstory=view.findViewById(R.id.story_recycler);
        recyclerstory.hasFixedSize();

        liststory=new ArrayList<>();

        liststory.add(new model_offer_story("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_offer_story("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_offer_story("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_offer_story("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_offer_story("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_offer_story("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_offer_story("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_offer_story("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_offer_story("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_offer_story("https://picsum.photos/seed/picsum/200/300"));

        recyclerstory.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        adapter_offer_story=new adapter_offer_story(liststory,getContext());
        recyclerstory.setAdapter(adapter_offer_story);




        //video slider

        sliderView=view.findViewById(R.id.videoSlider);

        listslider=new ArrayList<>();

        listslider.add(new model_offer_slider("",""));
        listslider.add(new model_offer_slider("",""));
        listslider.add(new model_offer_slider("",""));
        listslider.add(new model_offer_slider("",""));
        listslider.add(new model_offer_slider("",""));

        adapter_offer_slider=new adapter_offer_slider(listslider,getContext());
        sliderView.setSliderAdapter(adapter_offer_slider);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);//set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();
// category
        recyclercatgory=view.findViewById(R.id.recyclercategory);
        recyclercatgory.hasFixedSize();

        listcategory=new ArrayList<>();

        listcategory.add(new model_offer_category("https://picsum.photos/seed/picsum/200/300","",""));
        listcategory.add(new model_offer_category("https://picsum.photos/seed/picsum/200/300","",""));
        listcategory.add(new model_offer_category("https://picsum.photos/seed/picsum/200/300","",""));
        listcategory.add(new model_offer_category("https://picsum.photos/seed/picsum/200/300","",""));
        listcategory.add(new model_offer_category("https://picsum.photos/seed/picsum/200/300","",""));

        recyclercatgory.setLayoutManager(new GridLayoutManager(getContext(),2));
        adapter_offer_category=new adapter_offer_category(listcategory,getContext());
        recyclercatgory.setAdapter(adapter_offer_category);
// top offers

        recyclertopoffers=view.findViewById(R.id.recyclertopoffers);
        recyclertopoffers.hasFixedSize();

        listtopoffers=new ArrayList<>();

        listtopoffers.add(new model_topoffers("https://picsum.photos/seed/picsum/200/300"));
        listtopoffers.add(new model_topoffers("https://picsum.photos/seed/picsum/200/300"));
        listtopoffers.add(new model_topoffers("https://picsum.photos/seed/picsum/200/300"));
        listtopoffers.add(new model_topoffers("https://picsum.photos/seed/picsum/200/300"));

        recyclertopoffers.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        adapter_topoffers=new adapter_topoffers(listtopoffers,getContext());
        recyclertopoffers.setAdapter(adapter_topoffers);
// top beautycare

        recyclertopcare=view.findViewById(R.id.recyclertopcare);
        recyclertopcare.hasFixedSize();

        listtopbeautycare=new ArrayList<>();

        listtopbeautycare.add(new model_topbeautycare("https://picsum.photos/seed/picsum/200/300","Hi"));
        listtopbeautycare.add(new model_topbeautycare("https://picsum.photos/seed/picsum/200/300","Hi"));
        listtopbeautycare.add(new model_topbeautycare("https://picsum.photos/seed/picsum/200/300","Hi"));
        listtopbeautycare.add(new model_topbeautycare("https://picsum.photos/seed/picsum/200/300","Hi"));
        listtopbeautycare.add(new model_topbeautycare("https://picsum.photos/seed/picsum/200/300","Hi"));
        listtopbeautycare.add(new model_topbeautycare("https://picsum.photos/seed/picsum/200/300","Hi"));

        recyclertopcare.setLayoutManager(new GridLayoutManager(getContext(),3));
        adapter_topbeauty=new adapter_topbeauty(listtopbeautycare,getContext());
        recyclertopcare.setAdapter(adapter_topbeauty);
//shopbybrand

        recyclershopbybrand=view.findViewById(R.id.recyclershopbybrand);
        recyclershopbybrand.hasFixedSize();

        listshopbybrand=new ArrayList<>();

        listshopbybrand.add(new model_offershopbybrand("https://picsum.photos/seed/picsum/200/300","hello"));
        listshopbybrand.add(new model_offershopbybrand("https://picsum.photos/seed/picsum/200/300","hello"));
        listshopbybrand.add(new model_offershopbybrand("https://picsum.photos/seed/picsum/200/300","hello"));
        listshopbybrand.add(new model_offershopbybrand("https://picsum.photos/seed/picsum/200/300","hello"));
        listshopbybrand.add(new model_offershopbybrand("https://picsum.photos/seed/picsum/200/300","hello"));
        listshopbybrand.add(new model_offershopbybrand("https://picsum.photos/seed/picsum/200/300","hello"));
        listshopbybrand.add(new model_offershopbybrand("https://picsum.photos/seed/picsum/200/300","hello"));
        listshopbybrand.add(new model_offershopbybrand("https://picsum.photos/seed/picsum/200/300","hello"));

        recyclershopbybrand.setLayoutManager(new GridLayoutManager(getContext(),4));
        adapter_shopbybrand=new adapter_shopbybrand(listshopbybrand,getContext());
        recyclershopbybrand.setAdapter(adapter_shopbybrand);


        return view;
    }
}