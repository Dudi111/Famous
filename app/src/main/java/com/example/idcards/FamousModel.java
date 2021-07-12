package com.example.idcards;

import android.widget.TextView;

public class FamousModel {
   private String company;
   private String name;
   private int Age;
   private int Image;

    public FamousModel(String company, String name, int age, int image) {
        this.company = company;
        this.name = name;
        Age = age;
        Image = image;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public int getImage() {
        return Image;
    }
}
