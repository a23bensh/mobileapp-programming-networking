package com.example.networking;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;

public class Mountain {

    private String name;
    private String location;
    private int height;

    public Mountain()
    {
        name="Saknar namn";
        location="Saknar plats";
        height=-1;
    }

    public Mountain(String n, String l, int h)
    {
        name=n;
        location=l;
        height=h;
    }

    public String info(){
        String tmp= new String();
        tmp+=name+" är i "+location+" och är "+height+"m hög";
        return tmp;
    }

    public void setName(String n)
    {
        name=n;
    }

    public String getName()
    {
        return name;
    }

    @Override
    @NonNull
    public String toString() {
        return name;
    }
}