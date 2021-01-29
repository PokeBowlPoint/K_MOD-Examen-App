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
            CheckBox checkbox11 = (CheckBox) findViewById(R.id.check11);
            if (checkbox11.isChecked()) {
                isChecked = String.valueOf(checkbox11.getText());
            }
            CheckBox checkbox12 = (CheckBox) findViewById(R.id.check12);
            if (checkbox12.isChecked()) {
                isChecked = String.valueOf(checkbox12.getText());
            }
            CheckBox checkbox13 = (CheckBox) findViewById(R.id.check13);
            if (checkbox13.isChecked()) {
                isChecked = String.valueOf(checkbox13.getText());
            }
            CheckBox checkbox14 = (CheckBox) findViewById(R.id.check14);
            if (checkbox14.isChecked()) {
                isChecked = String.valueOf(checkbox14.getText());
            }
            CheckBox checkbox15 = (CheckBox) findViewById(R.id.check15);
            if (checkbox15.isChecked()) {
                isChecked = String.valueOf(checkbox15.getText());
            }
            SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
            SharedPreferences.Editor editor = pref.edit();
            editor.putString("Keuze 2", isChecked);
            editor.commit();

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