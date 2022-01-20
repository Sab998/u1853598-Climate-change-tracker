package com.example.earthclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button skipBtn;
    private Button logBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skipBtn = (Button) findViewById(R.id.skipBtn);
        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_weather_information();
            }
        });
        logBtn = (Button) findViewById(R.id.logBtn);
        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_login_activity();
            }
        });
    }
    public void openactivity_weather_information(){
        Intent intent1 = new Intent(this, weatherInformation.class);
        startActivity(intent1);

    }
    public void openactivity_login_activity(){
        Intent intent1 = new Intent(this, LoginActivity.class);
        startActivity(intent1);

    }
}