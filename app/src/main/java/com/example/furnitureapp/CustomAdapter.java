package com.example.furnitureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewholder>{

    private ArrayList<DataModel> dataSet;
    private Context mContext;


    public CustomAdapter(ArrayList<DataModel> dataSet, Context mContexat) {
        this.dataSet = dataSet;
        this.mContext = mContexat;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cardview, parent, false);

        MyViewholder myViewHolder = new MyViewholder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(final MyViewholder holder, final int position) {

        TextView tvName = holder.textViewName;
        TextView tvVersion = holder.textViewVersion;
        ImageView imageView = holder.imageView;

        tvName.setText(dataSet.get(position).getName());
        tvVersion.setText(dataSet.get(position).getVersion());


        Glide.with(mContext)
                .load(dataSet.get(position).getImage())
                .apply(RequestOptions.bitmapTransform
                        (new RoundedCorners(20)))
                .into(imageView);

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    //Criando a classe ViewHolder
    public static class MyViewholder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageView;
        //ItemClickListener itemClickListener;

        public MyViewholder(View view) {
            super(view);
            this.textViewName = itemView.findViewById(R.id.tvName);
            this.textViewVersion = itemView.findViewById(R.id.tvVersion);
            this.imageView = itemView.findViewById(R.id.imageView);
            //itemView.setOnclickListener((View.OnClickListener) this);
        }

        @Override
        public void onClick(View view) {

        }
    }



}
