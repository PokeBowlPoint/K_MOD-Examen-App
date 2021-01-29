package com.example.pokebowl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

public class winkelwagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winkelwagen);
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        String stored = pref.getString("Keuze 1", null);

        Button button = findViewById(R.id.button_bestelling_afronden);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, MainActivity.class);

            startActivity(intent);
        });
    }
}