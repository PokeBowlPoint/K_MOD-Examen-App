package com.example.pokebowl;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        Button button = findViewById(R.id.button_verder1);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, activity3.class);

            startActivity(intent);
        });

        button = findViewById(R.id.button_terug1);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, MainActivity.class);

            startActivity(intent);
        });
    }
}