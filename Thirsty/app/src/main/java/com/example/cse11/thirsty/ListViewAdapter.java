package com.example.cse11.thirsty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by 11 on 2016-05-21.
 */
class ListViewAdapter<String> extends BaseAdapter {
    Context _con;
    LayoutInflater _inflater;
    ArrayList<Building> _buildingNames;
    int _layout;

    public ListViewAdapter(Context aContext, int aLayout, ArrayList<Building> buildingNames){
        this._con = aContext;
        this._inflater = (LayoutInflater) aContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this._buildingNames = buildingNames;
        this._layout = aLayout;
    }

    @Override
    public int getCount(){
        return _buildingNames.size();
    }

    public Building getBuilding(int positioin){
        return _buildingNames.get(positioin);
    }

    @Override
    public Object getItem(int position){
        return _buildingNames.get(position).getName();
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

        TextView busStopNameView = (TextView) convertView.findViewById(R.id.buildingName);
        busStopNameView.setText(_buildingNames.get(position).getName());

        return convertView;
    }


}

