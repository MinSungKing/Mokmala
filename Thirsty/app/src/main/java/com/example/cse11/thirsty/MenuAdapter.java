package com.example.cse11.thirsty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by 11 on 2016-05-21.
 */
public class MenuAdapter extends BaseAdapter implements Serializable {
    Context _con;
    LayoutInflater _inflater;
    ArrayList<Drink> _drinkList;
    int _layout;

    public MenuAdapter(Context aContext, int aLayout, ArrayList<Drink> drinks){
        this._con = aContext;
        this._inflater = (LayoutInflater) aContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this._drinkList = drinks;
        this._layout = aLayout;
    }

    @Override
    public int getCount(){
        return _drinkList.size();
    }

    @Override
    public Object getItem(int position){
        return _drinkList.get(position).getName();
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(final int position, View convertView,ViewGroup parent){
        if(convertView == null){
            convertView = this._inflater.inflate(_layout,parent,false);
        }

        ImageView img = (ImageView) convertView.findViewById(R.id.img);
        img.setImageResource(_drinkList.get(position).getDrawble());

        TextView drinkNameView = (TextView) convertView.findViewById(R.id.drinkname);
        drinkNameView.setText(_drinkList.get(position).getName());

        TextView priceView = (TextView) convertView.findViewById(R.id.price);
        priceView.setText(_drinkList.get(position).getPrice()+"");

        return convertView;
    }
}
