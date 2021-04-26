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
import com.example.beauty.adapters.home.adapter_trendingnow;
import com.example.beauty.adapters.home.adapter_videos;
import com.example.beauty.adapters.home.adapter_blogs;
import com.example.beauty.adapters.home.adapter_goals;
import com.example.beauty.adapters.home.adapter_shopbybrand;
import com.example.beauty.adapters.home.adapter_slider;
import com.example.beauty.adapters.home.adapter_story_recycler;
import com.example.beauty.adapters.home.adapter_tipsbycategory;
import com.example.beauty.models.home.model_blogs;
import com.example.beauty.models.home.model_goals;
import com.example.beauty.models.home.model_shopbybrand;
import com.example.beauty.models.home.model_slider;
import com.example.beauty.models.home.model_story_recycler;
import com.example.beauty.models.home.model_tipsbycategory;
import com.example.beauty.models.home.model_trendingnow;
import com.example.beauty.models.home.model_videos;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class homepage extends Fragment {

    RecyclerView recyclerView;
    adapter_story_recycler adapter_story_recycler;
    List<model_story_recycler> liststory;

    RecyclerView recyclergoals;
    adapter_goals adapter_goals;
    List<model_goals> listgoals;


    RecyclerView recyclershopbybrand;
    adapter_shopbybrand adapter_shopbybrand;
    List<model_shopbybrand> listshopbybrand;

    RecyclerView recyclertrendingnow;
    adapter_trendingnow adapter_trendingnow;
    List<model_trendingnow> listtrending;

    RecyclerView recyclervideo;
    adapter_videos adapter_videos;
    List<model_videos> listvideos;

    RecyclerView recyclerblogs;
    adapter_blogs adapter_blogs;
    List<model_blogs> listblogs;


    RecyclerView recyclertipsbycat;
    adapter_tipsbycategory adapter_tipsbycategory;
    List<model_tipsbycategory> listtips;

    com.smarteist.autoimageslider.SliderView sliderView;
    adapter_slider adapter_slider;
    List<model_slider> listslider;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_homepage, container, false);

        //stories
        recyclerView=view.findViewById(R.id.story_recycler);
        recyclerView.hasFixedSize();
        recyclerView.scrollToPosition(0);

        liststory=new ArrayList<>();

        liststory.add(new model_story_recycler("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_story_recycler("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_story_recycler("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_story_recycler("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_story_recycler("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_story_recycler("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_story_recycler("https://picsum.photos/seed/picsum/200/300"));
        liststory.add(new model_story_recycler("https://picsum.photos/seed/picsum/200/300"));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        adapter_story_recycler=new adapter_story_recycler(liststory,getContext());
        recyclerView.setAdapter(adapter_story_recycler);

        //slider
        sliderView=view.findViewById(R.id.imageSlider);

        listslider=new ArrayList<>();

        listslider.add(new model_slider("https://picsum.photos/seed/picsum/200/300"));
        listslider.add(new model_slider("https://picsum.photos/seed/picsum/200/300"));
        listslider.add(new model_slider("https://picsum.photos/seed/picsum/200/300"));
        listslider.add(new model_slider("https://picsum.photos/seed/picsum/200/300"));
        listslider.add(new model_slider("https://picsum.photos/seed/picsum/200/300"));

        adapter_slider=new adapter_slider(listslider,getContext());
        sliderView.setSliderAdapter(adapter_slider);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);//set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();

        //tipsbycategory

        recyclertipsbycat=view.findViewById(R.id.tips_bycategory_recycler);
        recyclertipsbycat.hasFixedSize();

        listtips=new ArrayList<>();

        listtips.add(new model_tipsbycategory("https://picsum.photos/seed/picsum/200/300","Example"));
        listtips.add(new model_tipsbycategory("https://picsum.photos/seed/picsum/200/300","Example"));
        listtips.add(new model_tipsbycategory("https://picsum.photos/seed/picsum/200/300","Example"));
        listtips.add(new model_tipsbycategory("https://picsum.photos/seed/picsum/200/300","Example"));
        listtips.add(new model_tipsbycategory("https://picsum.photos/seed/picsum/200/300","Example"));
        listtips.add(new model_tipsbycategory("https://picsum.photos/seed/picsum/200/300","Example"));

        recyclertipsbycat.setLayoutManager(new GridLayoutManager(getContext(),2));
        adapter_tipsbycategory=new adapter_tipsbycategory(listtips,getContext());
        recyclertipsbycat.setAdapter(adapter_tipsbycategory);

        //goals

        recyclergoals=view.findViewById(R.id.goals_recycler);
        recyclergoals.hasFixedSize();

        listgoals=new ArrayList<>();

        listgoals.add(new model_goals("https://picsum.photos/seed/picsum/200/300"));
        listgoals.add(new model_goals("https://picsum.photos/seed/picsum/200/300"));
        listgoals.add(new model_goals("https://picsum.photos/seed/picsum/200/300"));
        listgoals.add(new model_goals("https://picsum.photos/seed/picsum/200/300"));
        listgoals.add(new model_goals("https://picsum.photos/seed/picsum/200/300"));

        recyclergoals.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        adapter_goals=new adapter_goals(listgoals,getContext());
        recyclergoals.setAdapter(adapter_goals);

//shopbybrand
        recyclershopbybrand=view.findViewById(R.id.shopbybrand_recycler);
        recyclershopbybrand.hasFixedSize();

        listshopbybrand=new ArrayList<>();

        listshopbybrand.add(new model_shopbybrand("https://picsum.photos/seed/picsum/200/300","",""));
        listshopbybrand.add(new model_shopbybrand("https://picsum.photos/seed/picsum/200/300","",""));
        listshopbybrand.add(new model_shopbybrand("https://picsum.photos/seed/picsum/200/300","",""));
        listshopbybrand.add(new model_shopbybrand("https://picsum.photos/seed/picsum/200/300","",""));
        listshopbybrand.add(new model_shopbybrand("https://picsum.photos/seed/picsum/200/300","",""));
        listshopbybrand.add(new model_shopbybrand("https://picsum.photos/seed/picsum/200/300","",""));
        listshopbybrand.add(new model_shopbybrand("https://picsum.photos/seed/picsum/200/300","",""));

        recyclershopbybrand.setLayoutManager(new GridLayoutManager(getContext(),2));
        adapter_shopbybrand=new adapter_shopbybrand(listshopbybrand,getContext());
        recyclershopbybrand.setAdapter(adapter_shopbybrand);
// blogs

        recyclerblogs=view.findViewById(R.id.blogsrecycler);
        recyclerblogs.hasFixedSize();

        listblogs=new ArrayList<>();

        listblogs.add(new model_blogs("https://picsum.photos/seed/picsum/200/300","8 causes","description","1 april 2021","dermatologists answer","DR ALI"));
        listblogs.add(new model_blogs("https://picsum.photos/seed/picsum/200/300","8 causes","description","1 april 2021","dermatologists answer","DR ALI"));
        listblogs.add(new model_blogs("https://picsum.photos/seed/picsum/200/300","8 causes","description","1 april 2021","dermatologists answer","DR ALI"));
        listblogs.add(new model_blogs("https://picsum.photos/seed/picsum/200/300","8 causes","description","1 april 2021","dermatologists answer","DR ALI"));
        listblogs.add(new model_blogs("https://picsum.photos/seed/picsum/200/300","8 causes","description","1 april 2021","dermatologists answer","DR ALI"));
        listblogs.add(new model_blogs("https://picsum.photos/seed/picsum/200/300","8 causes","description","1 april 2021","dermatologists answer","DR ALI"));

        recyclerblogs.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        adapter_blogs=new adapter_blogs(listblogs,getContext());
        recyclerblogs.setAdapter(adapter_blogs);
//videos

        recyclervideo=view.findViewById(R.id.videosrecycler);
        recyclervideo.hasFixedSize();

        listvideos=new ArrayList<>();

        listvideos.add(new model_videos("https://picsum.photos/seed/picsum/200/300"));
        listvideos.add(new model_videos("https://picsum.photos/seed/picsum/200/300"));
        listvideos.add(new model_videos("https://picsum.photos/seed/picsum/200/300"));
        listvideos.add(new model_videos("https://picsum.photos/seed/picsum/200/300"));
        listvideos.add(new model_videos("https://picsum.photos/seed/picsum/200/300"));

        recyclervideo.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        adapter_videos=new adapter_videos(listvideos,getContext());
        recyclervideo.setAdapter(adapter_videos);
//trendingnow

        recyclertrendingnow=view.findViewById(R.id.recyclertrendingnow);
        recyclertrendingnow.hasFixedSize();

        listtrending=new ArrayList<>();

        listtrending.add(new model_trendingnow("https://picsum.photos/seed/picsum/200/300","Title","from 200"));
        listtrending.add(new model_trendingnow("https://picsum.photos/seed/picsum/200/300","Title","from 200"));
        listtrending.add(new model_trendingnow("https://picsum.photos/seed/picsum/200/300","Title","from 200"));
        listtrending.add(new model_trendingnow("https://picsum.photos/seed/picsum/200/300","Title","from 200"));
        listtrending.add(new model_trendingnow("https://picsum.photos/seed/picsum/200/300","Title","from 200"));
        listtrending.add(new model_trendingnow("https://picsum.photos/seed/picsum/200/300","Title","from 200"));

        recyclertrendingnow.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        adapter_trendingnow=new adapter_trendingnow(listtrending,getContext());
        recyclertrendingnow.setAdapter(adapter_trendingnow);


        return view;
    }
}