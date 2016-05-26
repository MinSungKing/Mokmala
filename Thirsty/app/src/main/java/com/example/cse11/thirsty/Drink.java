package com.example.cse11.thirsty;

import java.io.Serializable;

/**
 * Created by 11 on 2016-05-21.
 */
public class Drink implements Serializable {
    private String name;
    private int price;
    private int drawble;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Drink(String name, int price, int drawble) {
        this.name = name;
        this.price = price;
        this.drawble = drawble;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDrawble() {
        return drawble;
    }


    public void setDrawble(int drawble) {
        this.drawble = drawble;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
