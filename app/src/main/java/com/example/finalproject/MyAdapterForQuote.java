package com.example.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapterForQuote extends RecyclerView.Adapter<MyAdapterForQuote.MyViewHolder> {

    public class MyViewHolder extends RecyclerView.ViewHolder {

        EditText name, phone, enq;
        Button send;

        MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.enquery_name);
            phone = view.findViewById(R.id.enquery_phone);
            enq = view.findViewById(R.id.enquery_detail);
            send = view.findViewById(R.id.button_enquery);
        }
    }


    @Override
    public MyAdapterForQuote.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.enquery, parent, false);

        return new MyViewHolder(v);
    }

    private ArrayList<EnqueryForm> enquery;
    MyAdapterForQuote(ArrayList<EnqueryForm> enq) {
        this.enquery = enq;
    }

    @Override
    public void onBindViewHolder(MyAdapterForQuote.MyViewHolder holder, final int position) {
        MyViewHolder myViewHolder = (MyViewHolder)holder;

        myViewHolder.name.setText(enquery.get(position).getName());
        myViewHolder.phone.setText(enquery.get(position).getEmail());
        myViewHolder.enq.setText(enquery.get(position).getDetail());
        myViewHolder.send.setText(enquery.get(position).getButtonText());


        myViewHolder.send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] addr = { "hayley.jiwon.choi@gmail.com" };
                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.setData(Uri.parse("mailto:"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, addr);
                intent.putExtra(Intent.EXTRA_SUBJECT, String.format("%s님의 견적 요청(%s)", myViewHolder.name.getText().toString(), myViewHolder.phone.getText().toString()));
                intent.putExtra(Intent.EXTRA_TEXT, myViewHolder.enq.getText().toString());

                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 1;
    }

}
