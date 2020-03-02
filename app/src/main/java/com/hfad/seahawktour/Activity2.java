package com.hfad.seahawktour;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressWarnings("ALL")
public class Activity2 extends AppCompatActivity {
    public static final String EXTRA_BUILDID = "buildId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_2);

        //Get the drink from the intent
        int buildId = (Integer)getIntent().getExtras().get(EXTRA_BUILDID);
        Building build = Building.build[buildId];

        //Populate the drink name
        TextView name = findViewById(R.id.name);
        name.setText(build.getName());

        //Populate the drink description
        TextView description = findViewById(R.id.description);
        description.setText(build.getDescription());

        //Populate the drink image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(build.getImageResourceId());

        //
        Toolbar myChildToolbar =
                (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myChildToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        assert ab != null;
        ab.setDisplayHomeAsUpEnabled(true);




    }




    }



