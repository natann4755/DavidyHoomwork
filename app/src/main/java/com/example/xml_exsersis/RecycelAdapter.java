package com.example.xml_exsersis;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class RecycelAdapter extends RecyclerView.Adapter <RecycelAdapter.Holder> {

    private List<person> personList;
    private LayoutInflater inflater;


    public RecycelAdapter(Context context, List<person> personList) {
        inflater =  (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.personList = personList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.veiw11,parent,false);
        return new Holder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.set(personList.get(position));

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

       private TextView textView;
       private ImageView imageView;
       private person myperson;
       private Bitmap bmp = null;
       private ProgressBar progressBar;


        public Holder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textVeiiw);
            imageView = itemView.findViewById(R.id.Imegg);
            progressBar = itemView.findViewById(R.id.ProgressBar2222);

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    progressBar.setVisibility(View.VISIBLE);
                    Thread2();
                }
            });
        }

        private void Thread2() {
            Thread t =new Thread(new Runnable() {
                @Override
                public void run() {
                    URL url = null;
                    try {
                        url = new URL(myperson.getImeg());
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }

                    try {
                        bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageBitmap(bmp);
                            progressBar.setVisibility(View.GONE);
                        }
                    });

                }
            });
            t.start();
        }

        public void set (person p){
            myperson=p;
            textView.setText(p.getName());
        }
    }
}
