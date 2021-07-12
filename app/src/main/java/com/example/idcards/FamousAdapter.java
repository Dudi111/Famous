package com.example.idcards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FamousAdapter extends RecyclerView.Adapter<FamousHolder> {
    private ArrayList<FamousModel> modellist;


    public FamousAdapter(ArrayList<FamousModel> modellist) {
        this.modellist = modellist;
    }

    @NonNull
    @Override
    public FamousHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new FamousHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FamousHolder holder, int position) {
        FamousModel famousModel=modellist.get(position);
        holder.setdata(famousModel);
    }

    @Override
    public int getItemCount() {
        return modellist.size();
    }
}
