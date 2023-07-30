package com.example.chooseacity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WeatherInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_information);

        TextView cityNameDisplayTV = findViewById(R.id.cityNameDisplay);

        String cityName = getIntent().getStringExtra("CityName");
        String countryName = getIntent().getStringExtra("CityCountry");

        cityNameDisplayTV.setText(cityName + ", " + countryName);
    }
}