package com.example.cse11.thirsty;

import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by 11 on 2016-05-21.
 */
public class Building implements Serializable {
    private Drink[] drinks;
    public String name;
    private LatLng latLng;
    private int map;


    public Building(String name, LatLng latLng) {
        this.name = name;
        this.latLng = latLng;
    }

    public Building(Drink[] drinks, String name,  LatLng latLng) {
        this.drinks = drinks;
        this.name = name;
        this.map = map;
        this.latLng = latLng;
    }

    public Building(Drink[] drinks, String name, LatLng latLng, int map) {
        this.drinks = drinks;
        this.name = name;
        this.latLng = latLng;
        this.map = map;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public String getName() {
        return name;
    }

    public int getMap() {
        return map;
    }
}
