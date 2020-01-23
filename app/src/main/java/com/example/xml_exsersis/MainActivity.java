package com.example.xml_exsersis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    ProgressBar mProgressBar;

    RecyclerView myRecyclerView;

    RecyclerView.LayoutManager myLayoutManager;

    RecycelAdapter myrecycelAdapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        ProgressBarGon();
        Recycel();
    }

    private void Recycel() {
        myRecyclerView = findViewById(R.id.my_recycler_view);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);
        myrecycelAdapter = new RecycelAdapter(this, persons());
        myRecyclerView.setAdapter(myrecycelAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mProgressBar = findViewById(R.id.ProgressBar);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                mProgressBar.setVisibility(View.GONE);
            }
        }, 5000);
    }

    private void ProgressBarGon() {
        mProgressBar = findViewById(R.id.ProgressBar);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                mProgressBar.setVisibility(View.GONE);
            }
        }, 10000);
//        mProgressBar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mProgressBar.setVisibility(View.GONE);
//            }
//        });
    }

      public List<person> persons (){
        List <person> personList=new ArrayList<person>();
          personList.add(new person("a",R.drawable.a));
          personList.add(new person("b",R.drawable.a));
          personList.add(new person("c",R.drawable.a));
          personList.add(new person("d",R.drawable.a));
          personList.add(new person("e",R.drawable.a));
          personList.add(new person("f",R.drawable.a));

        return personList;

      }
}
