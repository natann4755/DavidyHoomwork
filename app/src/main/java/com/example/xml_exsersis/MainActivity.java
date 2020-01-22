package com.example.xml_exsersis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        ProgressBarGon();
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

        return personList;

      }
}
