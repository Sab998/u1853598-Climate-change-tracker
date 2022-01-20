package com.example.earthclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class climateChange extends AppCompatActivity {

    private Button backBtn;
    private Button moreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climate_change);

        backBtn = (Button) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_weather_information();
            }
        });

        moreBtn = (Button) findViewById(R.id.moreBtn);
        moreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_news_feed();
            }
        });

    }
    public void openactivity_weather_information(){
        Intent intent1 = new Intent(this, weatherInformation.class);
        startActivity(intent1);

    }
    public void openactivity_news_feed(){
        Intent intent1 = new Intent(this, NewFeedActivity.class);
        startActivity(intent1);

    }


}