package com.example.recyclerviewpractice;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterForRecyclerView extends RecyclerView.Adapter<AdapterForRecyclerView.Vholder> {
ArrayList<Data> data;
    public AdapterForRecyclerView(ArrayList<Data> data){
    this.data=data;
}
    @Override
    public Vholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example,parent,false);
        Vholder vh=new Vholder(v);
       return vh;
    }

    @Override
    public void onBindViewHolder(Vholder holder, int position) {
       Data currentData=data.get(position);
       Log.i("lalit",currentData.toString());
       holder.imageView.setImageResource(currentData.getImageId());
       holder.name.setText(currentData.getName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class Vholder extends RecyclerView.ViewHolder{
      TextView name;
      ImageView imageView;

        public Vholder (View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            imageView= itemView.findViewById(R.id.image);
        }
    }
}
