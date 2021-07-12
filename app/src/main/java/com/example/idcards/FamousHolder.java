package com.example.idcards;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FamousHolder extends RecyclerView.ViewHolder {
     private TextView tvname;
     private TextView tvage;
     private TextView tvprof;
     private ImageView ivimage;

    public FamousHolder(@NonNull  View itemView) {
        super(itemView);
        init(itemView);
    }
    private void init(View itemView){
        tvname=itemView.findViewById(R.id.tvproff);
        tvage=itemView.findViewById(R.id.tvage);
        tvprof=itemView.findViewById(R.id.tvwork);
        ivimage=itemView.findViewById(R.id.ivImage);
    }
    public void setdata(FamousModel model){
        tvname.setText(model.getCompany());
        tvage.setText(model.getAge()+"");
        tvprof.setText(model.getName());
        ivimage.setImageResource(model.getImage());
    }
}
