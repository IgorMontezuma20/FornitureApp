package com.example.furnitureapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewholder>{

    private ArrayList<DataModel> dataSet;
    private Context mContexat;


    public CustomAdapter(ArrayList<DataModel> dataSet, Context mContexat) {
        this.dataSet = dataSet;
        this.mContexat = mContexat;
    }

    @NonNull
    @Override
    public CustomAdapter.MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    //Criando a classe ViewHolder
    public static class MyViewholder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewName;
        TextView textViewVersion;
        TextView imageViewIcon;
        //ItemClickListener itemClickListener;

        public MyViewholder(View view) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.image);
            //itemView.setOnclickListener((View.OnClickListener) this);
        }

        @Override
        public void onClick(View view) {



        }
    }

}
