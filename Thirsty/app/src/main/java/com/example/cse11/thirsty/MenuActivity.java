package com.example.cse11.thirsty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 11 on 2016-05-21.
 */
public class MenuActivity extends AppCompatActivity {

    ListView menuListView;

    ArrayList<Drink> productArrayList = new ArrayList<Drink>();
    MenuAdapter menuAdapter;
    Button showMapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        showMapButton = (Button) findViewById(R.id.showmap);

        Intent intent = getIntent();
        productArrayList = (ArrayList<Drink>) getIntent().getSerializableExtra("drinks");

        menuListView = (ListView) findViewById(R.id.menuListVIew);

        menuAdapter = new MenuAdapter(this, R.layout.menu, productArrayList);

        menuListView.setAdapter(menuAdapter);

        showMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ShowMapActivity.class);
                startActivity(intent);

            }
        });

    }


}
