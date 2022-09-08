package com.example.furnitureapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static RecyclerView.Adapter adapter;
    private  RecyclerView.LayoutManager layoutManager;
    private  static RecyclerView recyclerView;
    private static ArrayList<DataModel> data;
    private Context mcontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitiateMainCards();

    }

    private void InitiateMainCards() {
        //Método para os CardViews
        recyclerView = findViewById(R.id.recyclerViewChapters);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,
                false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //Pegando as informações da MyData
        data = new ArrayList<DataModel>();
        for (int i = 0; i < MyData.nameArray.length; i++){
            data.add(new DataModel(
                    MyData.nameArray[i],
                    MyData.versionArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]
            ));
        }
        //Setando o Adapter
        adapter = new CustomAdapter(data, this);
        recyclerView.setAdapter(adapter);
    }
}