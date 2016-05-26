package com.example.cse11.thirsty;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by 11 on 2016-05-21.
 */
public class ShowMapActivity extends AppCompatActivity{
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showmap);
        imageView = (ImageView)findViewById(R.id.image);
        imageView.setImageResource(R.drawable.map);
    }

}
