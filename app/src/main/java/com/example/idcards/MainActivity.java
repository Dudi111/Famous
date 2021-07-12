package com.example.idcards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycle;
    private ArrayList<FamousModel> modellist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ini();
        buildlist();
        Recycleview();
    }
    private void ini(){
        recycle=findViewById(R.id.Recycler);
    }
    private void buildlist(){
        FamousModel model=new FamousModel("Microsoft","Profession:Business",70,R.drawable.gates);
        modellist.add(model);
        FamousModel model1=new FamousModel("Masai School","Profession:Business",31,R.drawable.prateek_sukla1);
        modellist.add(model1);
        FamousModel model2=new FamousModel("Amazon","Profession:Business",70,R.drawable.jeff_bezos1);
        modellist.add(model2);
        FamousModel model3=new FamousModel("Abraham","Profession:Politics",111,R.drawable.abraham);
        modellist.add(model3);
        FamousModel model4=new FamousModel("Nawazuddin","Profession:Acting",40,R.drawable.siddique);
        modellist.add(model4);
        FamousModel model5=new FamousModel("Missile Man","Profession:Scientist",100,R.drawable.kalam);
        modellist.add(model5);
        FamousModel model6=new FamousModel("Microsoft","Profession:Business",70,R.drawable.gates);
        modellist.add(model6);
        FamousModel model7=new FamousModel("Masai School","Profession:Business",31,R.drawable.prateek_sukla1);
        modellist.add(model7);
        FamousModel model8=new FamousModel("Amazon","Profession:Business",70,R.drawable.jeff_bezos1);
        modellist.add(model8);
        FamousModel model9=new FamousModel("Abraham","Profession:Politics",111,R.drawable.abraham);
        modellist.add(model9);
        FamousModel model10=new FamousModel("Nawazuddin","Profession:Acting",40,R.drawable.siddique);
        modellist.add(model10);
        FamousModel model11=new FamousModel("Missile Man","Profession:Scientist",100,R.drawable.kalam);
        modellist.add(model11);
    }
    private void Recycleview(){
        FamousAdapter famousAdapter=new FamousAdapter(modellist);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recycle.setLayoutManager(linearLayoutManager);
        recycle.setAdapter(famousAdapter);
    }
}