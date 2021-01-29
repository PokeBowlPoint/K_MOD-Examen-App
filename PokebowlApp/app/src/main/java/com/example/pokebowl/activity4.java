package com.example.pokebowl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4);

        Button button = findViewById(R.id.button_verder3);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, activity5.class);

            startActivity(intent);
        });

        button = findViewById(R.id.button_terug3);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, activity3.class);

            startActivity(intent);
        });
    }
}