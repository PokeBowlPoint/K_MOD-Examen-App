package com.example.pokebowl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5);

        Button button = findViewById(R.id.button_bestellen1);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, winkelwagen.class);

            startActivity(intent);
        });

        button = findViewById(R.id.button_terug4);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, activity4.class);

            startActivity(intent);
        });
    }
}