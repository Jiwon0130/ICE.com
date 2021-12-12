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
        greeting.add(new ICEInfo("안녕하세요.\n\n완벽한 휴식을 위한 선택\nICE.com입니다.\n\n\n최고의 협력사 연계를 통해\n고객님의 니즈에 맞춘\n섬세한 설계와 시공으로\n행복한 매일을 만들어드립니다.\n\n\nICE.com\n최지원 드림\n\n\n\n\n고객센터",
                "010-9031-7381", "hayley.jiwon.choi@gmail.com", "오시는 길"));

        MyAdapterForGreeting myAdapter = new MyAdapterForGreeting(greeting);
        myRecyclerView.setAdapter(myAdapter);
    }


    public void showGallery() {
        myRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        myRecyclerView.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);

        ArrayList<House> houseInfo = new ArrayList<>();
        houseInfo.add(new House(R.drawable.gain1_1_thumbnail, "아침공기", "http://www.gainhousing.kr/",
                "자재 별 상이하므로 별도 문의 바랍니다.", "용도 및 규모 : 단독주택 지상 2층\n구조 : 철근콘크리트\n"));
        houseInfo.add(new House(R.drawable.gain2_1_thumbnail, "황혼", "http://www.gainhousing.kr/",
                "자재 별 상이하므로 별도 문의 바랍니다.", "용도 및 규모 : 단독주택 지상 2층\n구조 : 경량목구조"));
        houseInfo.add(new House(R.drawable.gain3_1_thumbnail, "주말", "http://www.gainhousing.kr/",
                "자재 별 상이하므로 별도 문의 바랍니다.", "용도 및 규모 : 단독주택 지상 2층\n구조 : 경량목구조"));
        houseInfo.add(new House(R.drawable.gain4_1_thumbnail, "3대의 행복", "http://www.gainhousing.kr/",
                "자재 별 상이하므로 별도 문의 바랍니다.", "용도 및 규모 : 단독주택 지상 2층\n구조 : 철근콘크리트"));
        houseInfo.add(new House(R.drawable.choi5_1_thumbnail, "타임 오브 스트레이텀", "http://www.bychouse.kr",
                "자재 별 상이하므로 별도 문의 바랍니다.", "용도 및 규모 : 단독주택 지상 3층\n구조 : 철근콘크리트"));
        houseInfo.add(new House(R.drawable.choi6_1_thumbnail, "석우재", "http://www.bychouse.kr",
                "자재 별 상이하므로 별도 문의 바랍니다.", "단독주택 지상 1층\n구조 : 철근콘크리트"));
        houseInfo.add(new House(R.drawable.choi7_1_thumbnail, "지오스", "http://www.bychouse.kr",
                "자재 별 상이하므로 별도 문의 바랍니다.", "용도 및 규모 : 단독주택 지상 2층\n구조 : 철근콘크리트"));
        houseInfo.add(new House(R.drawable.choi8_1_thumbnail, "바리우스", "http://www.bychouse.kr",
                "자재 별 상이하므로 별도 문의 바랍니다.", "용도 및 규모 : 단독주택 지상 2층\n구조 : 스틸하우스"));
        houseInfo.add(new House(R.drawable.dream9_1_thumbnail, "보통의 주말", "https://www.dlovehouse.com/intro/info.jsp",
                "자재 별 상이하므로 별도 문의 바랍니다.", "용도 및 규모 : 단독주택 지상 2층\n구조 : 경량목구조"));
        houseInfo.add(new House(R.drawable.dream10_1_thumbnail, "지어진 꿈", "https://www.dlovehouse.com/intro/info.jsp",
                "자재 별 상이하므로 별도 문의 바랍니다.", "용도 및 규모 : 단독주택 지상 2층\n구조 : 스틸하우스"));
        houseInfo.add(new House(R.drawable.dream11_1_thumbnail, "오후의 찻잎", "https://www.dlovehouse.com/intro/info.jsp",
                "자재 별 상이하므로 별도 문의 바랍니다.", "용도 및 규모 : 단독주택 지상 2층\n구조 : 철근콘크리트"));

        MyAdapterForList myAdapter = new MyAdapterForList(houseInfo);
        myRecyclerView.setAdapter(myAdapter);
    }


    public void showQuote() {
        myRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        myRecyclerView.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);

        ArrayList<EnqueryForm> enquery = new ArrayList<>();
        enquery.add(new EnqueryForm("성함", "연락처",
                                    "문의 내용을 최대한 자세히 적어주시면\n더욱 정확한 전문가 견적을 받아보실 수 있습니다.", "견적 요청"));

        MyAdapterForQuote myAdapter = new MyAdapterForQuote(enquery);
        myRecyclerView.setAdapter(myAdapter);
    }

}