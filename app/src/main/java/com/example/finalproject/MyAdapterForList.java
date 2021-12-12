package com.example.finalproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class MyAdapterForList extends RecyclerView.Adapter<MyAdapterForList.MyViewHolder> {

    private RecyclerView myRecyclerView;
    private RecyclerView.LayoutManager myLayoutManager;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView thumbnail;
        TextView house_name;

        MyViewHolder(View view) {
            super(view);
            thumbnail = view.findViewById(R.id.thumbnail_pic);
            house_name = view.findViewById(R.id.thumbnail_name);
        }
    }

    private ArrayList<House> houseList;
    MyAdapterForList(ArrayList<House> houses) {
        this.houseList = houses;
    }

    @Override
    public MyAdapterForList.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyAdapterForList.MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        MyViewHolder myViewHolder = (MyViewHolder)holder;

        myViewHolder.thumbnail.setImageResource(houseList.get(position).getImageId());
        myViewHolder.house_name.setText(houseList.get(position).getHouseName());

        myViewHolder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showHouseDetail(v, houseList.get(position), position);
            }
        });
        myViewHolder.house_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showHouseDetail(v, houseList.get(position), position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 11;
    }

    public void showHouseDetail(View v, House house, int num) {
        String co_name;
        if(num <= 3)        co_name = "gain" + num;
        else if(num <= 7)   co_name = "choi" + num;
        else                co_name = "dream" + num;

        Intent intent = new Intent(v.getContext(), HouseDetail.class);
        intent.putExtra("house_name", house.getHouseName());
        intent.putExtra("house_price", house.getPrice());
        intent.putExtra("house_desc", house.getDesc());
        intent.putExtra("house_URL", house.getURL());
        intent.putExtra("num", num);
        intent.putExtra("company_name", co_name);
        v.getContext().startActivity(intent);
    }

}
