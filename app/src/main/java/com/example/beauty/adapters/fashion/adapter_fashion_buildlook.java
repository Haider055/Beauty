package com.example.beauty.adapters.fashion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beauty.R;
import com.example.beauty.models.fashion.model_fashion_buildlook;

import java.util.List;

public class adapter_fashion_buildlook extends RecyclerView.Adapter<adapter_fashion_buildlook.holder> {

    List<model_fashion_buildlook> list;
    Context context;

    public adapter_fashion_buildlook(List<model_fashion_buildlook> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter_fashion_buildlook.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new adapter_fashion_buildlook.holder(LayoutInflater.from(context).inflate(R.layout.layout_recycler_fashion_buildlook,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_fashion_buildlook.holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView title;

        public holder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);
            title=itemView.findViewById(R.id.title);


        }
    }
}
