package com.example.pokebowl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);

        Button button = findViewById(R.id.button_verder2);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, activity4.class);

            startActivity(intent);
        });

        button = findViewById(R.id.button_terug2);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, activity2.class);

            startActivity(intent);
        });
    }
}