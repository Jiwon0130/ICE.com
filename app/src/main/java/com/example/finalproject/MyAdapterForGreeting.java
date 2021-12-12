package com.example.finalproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.maps.GoogleMap;

import java.util.ArrayList;

public class MyAdapterForGreeting extends RecyclerView.Adapter<MyAdapterForGreeting.MyViewHolder> {

        public class MyViewHolder extends RecyclerView.ViewHolder {

            TextView greet_content, greet_content_phone, greet_content_email, greet_content_address;

            MyViewHolder(View view) {
                super(view);
                greet_content = view.findViewById(R.id.greet_content);
                greet_content_phone = view.findViewById(R.id.greet_content_phone);
                greet_content_email = view.findViewById(R.id.greet_content_email);
                greet_content_address = view.findViewById(R.id.greet_content_address);
            }
        }

        private ArrayList<ICEInfo> myInfo;
        MyAdapterForGreeting(ArrayList<ICEInfo> greeting) {
            this.myInfo = greeting;
        }

        @Override
        public MyAdapterForGreeting.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.welcome, parent, false);

            return new MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(MyAdapterForGreeting.MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
            MyViewHolder myViewHolder = (MyViewHolder)holder;

            myViewHolder.greet_content.setText(myInfo.get(position).getDesc());
            myViewHolder.greet_content_phone.setText(myInfo.get(position).getPhone());
            myViewHolder.greet_content_email.setText(myInfo.get(position).getEmail());
            myViewHolder.greet_content_address.setText(myInfo.get(position).getAddress());

            myViewHolder.greet_content_phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01090317381"));

                    v.getContext().startActivity(intent);
                }
            });
            myViewHolder.greet_content_email.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String[] addr = { "hayley.jiwon.choi@gmail.com" };
                    Intent intent = new Intent(Intent.ACTION_SEND);

                    intent.setData(Uri.parse("mailto:"));
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_EMAIL, addr);

                    v.getContext().startActivity(intent);
                }
            });
            myViewHolder.greet_content_address.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("http://maps.google.com/maps?q=37.558096+,126.9960291");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    v.getContext().startActivity(intent);
                }
            });
        }

    @Override
    public int getItemCount() {
        return 1;
    }

}
