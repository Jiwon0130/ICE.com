package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView logo;
    TextView title;

    Button btn_welcome;
    Button btn_gallery;
    Button btn_quote;

    private RecyclerView myRecyclerView;
    private RecyclerView.LayoutManager myLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView)findViewById(R.id.logo);
        title = (TextView)findViewById(R.id.app_title);

        btn_welcome = (Button)findViewById(R.id.button_welcome);
        btn_gallery = (Button)findViewById(R.id.button_gallery);
        btn_quote = (Button)findViewById(R.id.button_quote);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWelcome();
            }
        });
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWelcome();
            }
        });
        btn_welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWelcome();
            }
        });
        btn_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showGallery();
            }
        });
        btn_quote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showQuote();
            }
        });

        showWelcome();
    }


    public void showWelcome() {
        myRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        myRecyclerView.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);

        ArrayList<ICEInfo> greeting = new ArrayList<>();
        greeting.add(new ICEInfo("???????????????.\n\n????????? ????????? ?????? ??????\nICE.com?????????.\n\n\n????????? ????????? ????????? ??????\n???????????? ????????? ??????\n????????? ????????? ????????????\n????????? ????????? ?????????????????????.\n\n\nICE.com\n????????? ??????\n\n\n\n\n????????????",
                "010-9031-7381", "hayley.jiwon.choi@gmail.com", "????????? ???"));

        MyAdapterForGreeting myAdapter = new MyAdapterForGreeting(greeting);
        myRecyclerView.setAdapter(myAdapter);
    }


    public void showGallery() {
        myRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        myRecyclerView.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);

        ArrayList<House> houseInfo = new ArrayList<>();
        houseInfo.add(new House(R.drawable.gain1_1_thumbnail, "????????????", "http://www.gainhousing.kr/",
                "?????? ??? ??????????????? ?????? ?????? ????????????.", "?????? ??? ?????? : ???????????? ?????? 2???\n?????? : ??????????????????\n"));
        houseInfo.add(new House(R.drawable.gain2_1_thumbnail, "??????", "http://www.gainhousing.kr/",
                "?????? ??? ??????????????? ?????? ?????? ????????????.", "?????? ??? ?????? : ???????????? ?????? 2???\n?????? : ???????????????"));
        houseInfo.add(new House(R.drawable.gain3_1_thumbnail, "??????", "http://www.gainhousing.kr/",
                "?????? ??? ??????????????? ?????? ?????? ????????????.", "?????? ??? ?????? : ???????????? ?????? 2???\n?????? : ???????????????"));
        houseInfo.add(new House(R.drawable.gain4_1_thumbnail, "3?????? ??????", "http://www.gainhousing.kr/",
                "?????? ??? ??????????????? ?????? ?????? ????????????.", "?????? ??? ?????? : ???????????? ?????? 2???\n?????? : ??????????????????"));
        houseInfo.add(new House(R.drawable.choi5_1_thumbnail, "?????? ?????? ???????????????", "http://www.bychouse.kr",
                "?????? ??? ??????????????? ?????? ?????? ????????????.", "?????? ??? ?????? : ???????????? ?????? 3???\n?????? : ??????????????????"));
        houseInfo.add(new House(R.drawable.choi6_1_thumbnail, "?????????", "http://www.bychouse.kr",
                "?????? ??? ??????????????? ?????? ?????? ????????????.", "???????????? ?????? 1???\n?????? : ??????????????????"));
        houseInfo.add(new House(R.drawable.choi7_1_thumbnail, "?????????", "http://www.bychouse.kr",
                "?????? ??? ??????????????? ?????? ?????? ????????????.", "?????? ??? ?????? : ???????????? ?????? 2???\n?????? : ??????????????????"));
        houseInfo.add(new House(R.drawable.choi8_1_thumbnail, "????????????", "http://www.bychouse.kr",
                "?????? ??? ??????????????? ?????? ?????? ????????????.", "?????? ??? ?????? : ???????????? ?????? 2???\n?????? : ???????????????"));
        houseInfo.add(new House(R.drawable.dream9_1_thumbnail, "????????? ??????", "https://www.dlovehouse.com/intro/info.jsp",
                "?????? ??? ??????????????? ?????? ?????? ????????????.", "?????? ??? ?????? : ???????????? ?????? 2???\n?????? : ???????????????"));
        houseInfo.add(new House(R.drawable.dream10_1_thumbnail, "????????? ???", "https://www.dlovehouse.com/intro/info.jsp",
                "?????? ??? ??????????????? ?????? ?????? ????????????.", "?????? ??? ?????? : ???????????? ?????? 2???\n?????? : ???????????????"));
        houseInfo.add(new House(R.drawable.dream11_1_thumbnail, "????????? ??????", "https://www.dlovehouse.com/intro/info.jsp",
                "?????? ??? ??????????????? ?????? ?????? ????????????.", "?????? ??? ?????? : ???????????? ?????? 2???\n?????? : ??????????????????"));

        MyAdapterForList myAdapter = new MyAdapterForList(houseInfo);
        myRecyclerView.setAdapter(myAdapter);
    }


    public void showQuote() {
        myRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        myRecyclerView.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);

        ArrayList<EnqueryForm> enquery = new ArrayList<>();
        enquery.add(new EnqueryForm("??????", "?????????",
                                    "?????? ????????? ????????? ????????? ???????????????\n?????? ????????? ????????? ????????? ???????????? ??? ????????????.", "?????? ??????"));

        MyAdapterForQuote myAdapter = new MyAdapterForQuote(enquery);
        myRecyclerView.setAdapter(myAdapter);
    }

}