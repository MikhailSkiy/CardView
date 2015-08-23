package com.example.mikhail.cardviewexample.model;

import android.content.Context;

/**
 * Created by Mikhail on 23.08.2015.
 */
public class Country {

    public String name;
    public String description;
    public String imageName;


    public int getImageResourceId(Context context)
    {
        try {
            return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
