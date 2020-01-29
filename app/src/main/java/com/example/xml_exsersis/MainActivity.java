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
          personList.add(new person("bibi","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Benyamin_Netanyahu%2C_FOJ_2019_%2848238884272%29_%28cropped%29.jpg/220px-Benyamin_Netanyahu%2C_FOJ_2019_%2848238884272%29_%28cropped%29.jpg"));
          personList.add(new person("abu mazen","https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Mahmoud_Abbas_May_2017.jpg/250px-Mahmoud_Abbas_May_2017.jpg"));
          personList.add(new person("tramp","https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Donald_Trump_official_portrait.jpg/220px-Donald_Trump_official_portrait.jpg"));
          personList.add(new person("clinton","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Bill_Clinton.jpg/250px-Bill_Clinton.jpg"));
          personList.add(new person("bush","https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/George_H._W._Bush%2C_President_of_the_United_States%2C_1989_official_portrait_%28cropped%29.jpg/270px-George_H._W._Bush%2C_President_of_the_United_States%2C_1989_official_portrait_%28cropped%29.jpg"));
          personList.add(new person("gantz","https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Benny_Gantz_2019.jpg/250px-Benny_Gantz_2019.jpg"));

        return personList;

      }
}
