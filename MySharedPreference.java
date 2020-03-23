package com.example.laborator6;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreference {
    SharedPreferences settings;
    SharedPreferences.Editor editor;

    public MySharedPreference (Context context) {
       settings = context.getSharedPreferences("MyPref",0);
       editor = settings.edit();

        //TODO
    }

    public void save(String text){
        editor.putString("mystr",text);
        editor.commit();

        //TODO
    }

    public String getValue(){
        return settings.getString("mystr","-");

        //TODO
    }

    public void clearSharedPreferences(){
        editor.clear();
        editor.commit();

        //TODO
    }
}