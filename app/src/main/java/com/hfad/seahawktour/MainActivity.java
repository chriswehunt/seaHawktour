package com.hfad.seahawktour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);


        ArrayAdapter<Building> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Building.build);


        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listView,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the drink the user clicks on to DrinkActivity
                        Intent intent = new Intent(MainActivity.this,
                                Activity2.class);
                        intent.putExtra(Activity2.EXTRA_BUILDID, (int) id);
                        startActivity(intent);

                    }
                };

        //Assign the listener to the list view
        ListView listView = findViewById(R.id.list_buildings);
        listView.setOnItemClickListener(itemClickListener);
        listView.setAdapter(listAdapter);

    }
    }

