package com.example.earthclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewFeedActivity extends AppCompatActivity {

    private Button backBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_feed);

        backBtn1 = (Button) findViewById(R.id.backBtn1);
        backBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_climate_change_screen();
            }
        });
    }

    public void openactivity_climate_change_screen(){
        Intent intent1 = new Intent(this, climateChange.class);
        startActivity(intent1);

    }
}