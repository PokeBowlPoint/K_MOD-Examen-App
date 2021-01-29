package com.example.pokebowl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class activity3 extends AppCompatActivity {
    public String isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);

        Button button = findViewById(R.id.button_verder2);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, activity4.class);

            startActivity(intent);
        });
        button.setOnClickListener(v -> {
            CheckBox checkbox21 = (CheckBox) findViewById(R.id.check21);
            if (checkbox21.isChecked()) {
                isChecked = String.valueOf(checkbox21.getText());
            }
            CheckBox checkbox22 = (CheckBox) findViewById(R.id.check22);
            if (checkbox22.isChecked()) {
                isChecked = String.valueOf(checkbox22.getText());
            }
            CheckBox checkbox23 = (CheckBox) findViewById(R.id.check23);
            if (checkbox23.isChecked()) {
                isChecked = String.valueOf(checkbox23.getText());
            }
            SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
            SharedPreferences.Editor editor = pref.edit();
            editor.putString("Keuze 2", isChecked);
            editor.commit();

            Intent intent = new Intent(this, activity3.class);


            startActivity(intent);
        });

        button = findViewById(R.id.button_terug2);
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        String stored = pref.getString("Keuze 1", null);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, activity2.class);

            startActivity(intent);
        });
    }
}