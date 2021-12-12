package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HouseDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_detail);
        Intent intent = getIntent();

        ImageView detail_thumb = findViewById(R.id.detail_thumb);
        TextView house_name = findViewById(R.id.detail_name);
        TextView house_price = findViewById(R.id.detail_price);
        TextView house_company = findViewById(R.id.detail_company);
        TextView house_desc = findViewById(R.id.detail_desc);
        ImageView detail_pic1 = findViewById(R.id.detail_pic1);
        ImageView detail_pic2 = findViewById(R.id.detail_pic2);
        ImageView detail_pic3 = findViewById(R.id.detail_pic3);
        ImageView detail_pic4 = findViewById(R.id.detail_pic4);

        String name = intent.getExtras().get("house_name").toString();
        String price = intent.getExtras().get("house_price").toString();
        String desc = intent.getExtras().get("house_desc").toString();
        String URL = intent.getExtras().get("house_URL").toString();
        String company = intent.getExtras().getString("company_name");
        int num = intent.getExtras().getInt("num");

        String img_temp = company + num;
        int img_id = getImageId(this, img_temp + "_1_thumbnail");
        detail_thumb.setImageResource(img_id);
        detail_pic1.setImageResource(img_id);
        img_id = getImageId(this, img_temp + "_2");
        detail_pic2.setImageResource(img_id);
        img_id = getImageId(this, img_temp + "_3");
        detail_pic3.setImageResource(img_id);
        img_id = getImageId(this, img_temp + "_4");
        detail_pic4.setImageResource(img_id);

        house_name.setText(name);
        house_price.setText(price);
        house_desc.setText(desc);

        if(company.contains("gain"))            house_company.setText("가인하우징\n" + URL);
        else if(company.contains("choi"))       house_company.setText("최부용갤러리하우스\n" + URL);
        else if(company.contains("dream"))      house_company.setText("꿈애홈플랜\n" + URL);

        house_company.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
            }
        });

    }

    public static int getImageId(Context context, String imageName) {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());
    }
}
