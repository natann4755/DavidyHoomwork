package com.example.xml_exsersis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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

        public Holder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textVeiiw);
            imageView = itemView.findViewById(R.id.Imegg);
        }

        public void set (person p){
            imageView.setImageResource(p.getImeg());
        }
    }
}
