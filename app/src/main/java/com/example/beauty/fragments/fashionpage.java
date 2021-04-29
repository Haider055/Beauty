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
import com.example.beauty.adapters.fashion.adapter_fashion_buildlook;
import com.example.beauty.adapters.fashion.adapter_fashion_buildlook2;
import com.example.beauty.adapters.fashion.adapter_fashion_post;
import com.example.beauty.adapters.fashion.adapter_fashion_slider;
import com.example.beauty.adapters.fashion.adapter_fashion_topbrand;
import com.example.beauty.adapters.fashion.adapter_fashion_videos;
import com.example.beauty.models.fashion.model_fashion_buildlook;
import com.example.beauty.models.fashion.model_fashion_buildlook2;
import com.example.beauty.models.fashion.model_fashion_post;
import com.example.beauty.models.fashion.model_fashion_slider;
import com.example.beauty.models.fashion.model_fashion_topbrand;
import com.example.beauty.models.fashion.model_fashion_video;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class fashionpage extends Fragment {

    com.smarteist.autoimageslider.SliderView sliderView;
    adapter_fashion_slider adapter_slider;
    List<model_fashion_slider> listslider;

    RecyclerView recyclertopbrand;
    adapter_fashion_topbrand adapter_fashion_topbrand;
    List<model_fashion_topbrand> listtopbrands;

    RecyclerView recyclervideo;
    adapter_fashion_videos adapter_videos;
    List<model_fashion_video> listvideos;

    RecyclerView recyclerpostproducts;
    adapter_fashion_post adapter_fashion_post;
    List<model_fashion_post> listfashionPost;

    RecyclerView recyclerbuildlook;
    adapter_fashion_buildlook adapter_fashion_buildlook;
    List<model_fashion_buildlook> buildlookList; ;

    RecyclerView recyclerbuildlook2;
    com.example.beauty.adapters.fashion.adapter_fashion_buildlook2 adapter_fashion_buildlook2;
    List<model_fashion_buildlook2> buildlookList2; ;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_fashionpage, container, false);


        //video slider

        sliderView=view.findViewById(R.id.videoSlider);

        listslider=new ArrayList<>();

        listslider.add(new model_fashion_slider("https://picsum.photos/seed/picsum/200/300"));
        listslider.add(new model_fashion_slider("https://picsum.photos/seed/picsum/200/300"));
        listslider.add(new model_fashion_slider("https://picsum.photos/seed/picsum/200/300"));
        listslider.add(new model_fashion_slider("https://picsum.photos/seed/picsum/200/300"));
        listslider.add(new model_fashion_slider("https://picsum.photos/seed/picsum/200/300"));

        adapter_slider=new adapter_fashion_slider(listslider,getContext());
        sliderView.setSliderAdapter(adapter_slider);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);//set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();
//videos


        recyclervideo=view.findViewById(R.id.videorecycler);
        recyclervideo.hasFixedSize();

        listvideos=new ArrayList<>();

        listvideos.add(new model_fashion_video("https://picsum.photos/seed/picsum/200/300","hello"));
        listvideos.add(new model_fashion_video("https://picsum.photos/seed/picsum/200/300","hello"));
        listvideos.add(new model_fashion_video("https://picsum.photos/seed/picsum/200/300","hello"));
        listvideos.add(new model_fashion_video("https://picsum.photos/seed/picsum/200/300","hello"));
        listvideos.add(new model_fashion_video("https://picsum.photos/seed/picsum/200/300","hello"));


        recyclervideo.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        adapter_videos=new adapter_fashion_videos(listvideos,getContext());
        recyclervideo.setAdapter(adapter_videos);
// topbrands

        recyclertopbrand=view.findViewById(R.id.recyclertopbrand);
        recyclertopbrand.hasFixedSize();

        listtopbrands=new ArrayList<>();

        listtopbrands.add(new model_fashion_topbrand("https://picsum.photos/seed/picsum/200/300","abc"));
        listtopbrands.add(new model_fashion_topbrand("https://picsum.photos/seed/picsum/200/300","abc"));
        listtopbrands.add(new model_fashion_topbrand("https://picsum.photos/seed/picsum/200/300","abc"));
        listtopbrands.add(new model_fashion_topbrand("https://picsum.photos/seed/picsum/200/300","abc"));
        listtopbrands.add(new model_fashion_topbrand("https://picsum.photos/seed/picsum/200/300","abc"));
        listtopbrands.add(new model_fashion_topbrand("https://picsum.photos/seed/picsum/200/300","abc"));
        listtopbrands.add(new model_fashion_topbrand("https://picsum.photos/seed/picsum/200/300","abc"));
        listtopbrands.add(new model_fashion_topbrand("https://picsum.photos/seed/picsum/200/300","abc"));

        recyclertopbrand.setLayoutManager(new GridLayoutManager(getContext(),4));
        adapter_fashion_topbrand=new adapter_fashion_topbrand(listtopbrands,getContext());
        recyclertopbrand.setAdapter(adapter_fashion_topbrand);
//buildlook

        recyclerbuildlook=view.findViewById(R.id.buildlookrecycler);
        recyclerbuildlook.hasFixedSize();

        buildlookList=new ArrayList<>();

        buildlookList.add(new model_fashion_buildlook("https://picsum.photos/seed/picsum/200/300","kurta"));
        buildlookList.add(new model_fashion_buildlook("https://picsum.photos/seed/picsum/200/300","kurta"));
        buildlookList.add(new model_fashion_buildlook("https://picsum.photos/seed/picsum/200/300","kurta"));
        buildlookList.add(new model_fashion_buildlook("https://picsum.photos/seed/picsum/200/300","kurta"));

        recyclerbuildlook.setLayoutManager(new GridLayoutManager(getContext(),2));
        adapter_fashion_buildlook=new adapter_fashion_buildlook(buildlookList,getContext());
        recyclerbuildlook.setAdapter(adapter_fashion_buildlook);

//buildlook2

//        recyclerbuildlook2=view.findViewById(R.id.buildlookrecycler2);
//        recyclerbuildlook2.hasFixedSize();
//
//        buildlookList2=new ArrayList<>();
//
//        buildlookList2.add(new model_fashion_buildlook2("https://picsum.photos/seed/picsum/200/300","kurta"));
//        buildlookList2.add(new model_fashion_buildlook2("https://picsum.photos/seed/picsum/200/300","kurta"));
//        buildlookList2.add(new model_fashion_buildlook2("https://picsum.photos/seed/picsum/200/300","kurta"));
//        buildlookList2.add(new model_fashion_buildlook2("https://picsum.photos/seed/picsum/200/300","kurta"));
//
//        recyclerbuildlook2.setLayoutManager(new LinearLayoutManager(getContext()));
//        adapter_fashion_buildlook2=new adapter_fashion_buildlook2(buildlookList2,getContext());
//        recyclerbuildlook2.setAdapter(adapter_fashion_buildlook2);


// postproducts


        recyclerpostproducts=view.findViewById(R.id.postproductsrecycler);
        recyclerpostproducts.hasFixedSize();

        listfashionPost=new ArrayList<>();

        listfashionPost.add(new model_fashion_post("https://picsum.photos/seed/picsum/200/300"));
        listfashionPost.add(new model_fashion_post("https://picsum.photos/seed/picsum/200/300"));
        listfashionPost.add(new model_fashion_post("https://picsum.photos/seed/picsum/200/300"));
        listfashionPost.add(new model_fashion_post("https://picsum.photos/seed/picsum/200/300"));
        listfashionPost.add(new model_fashion_post("https://picsum.photos/seed/picsum/200/300"));
        listfashionPost.add(new model_fashion_post("https://picsum.photos/seed/picsum/200/300"));
        listfashionPost.add(new model_fashion_post("https://picsum.photos/seed/picsum/200/300"));
        listfashionPost.add(new model_fashion_post("https://picsum.photos/seed/picsum/200/300"));
        listfashionPost.add(new model_fashion_post("https://picsum.photos/seed/picsum/200/300"));
        listfashionPost.add(new model_fashion_post("https://picsum.photos/seed/picsum/200/300"));


        recyclerpostproducts.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        adapter_fashion_post=new adapter_fashion_post(listfashionPost,getContext());
        recyclerpostproducts.setAdapter(adapter_fashion_post);

        return view;
    }
}