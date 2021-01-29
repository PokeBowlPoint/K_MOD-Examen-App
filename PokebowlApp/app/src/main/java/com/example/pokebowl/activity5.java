package com.example.pokebowl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class activity5 extends AppCompatActivity {
    public String isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5);

        Button button = findViewById(R.id.button_bestellen1);
        CheckBox checkbox41 = (CheckBox) findViewById(R.id.check41);
        if (checkbox41.isChecked()) {
            isChecked = String.valueOf(checkbox41.getText());
        }
        CheckBox checkbox42 = (CheckBox) findViewById(R.id.check42);
        if (checkbox42.isChecked()) {
            isChecked = String.valueOf(checkbox42.getText());
        }
        CheckBox checkbox43 = (CheckBox) findViewById(R.id.check43);
        if (checkbox43.isChecked()) {
            isChecked = String.valueOf(checkbox43.getText());
        }
        CheckBox checkbox44 = (CheckBox) findViewById(R.id.check44);
        if (checkbox44.isChecked()) {
            isChecked = String.valueOf(checkbox44.getText());
        }
        CheckBox checkbox45 = (CheckBox) findViewById(R.id.check45);
        if (checkbox45.isChecked()) {
            isChecked = String.valueOf(checkbox45.getText());
        }
        CheckBox checkbox46 = (CheckBox) findViewById(R.id.check46);
        if (checkbox46.isChecked()) {
            isChecked = String.valueOf(checkbox46.getText());
        }
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("Keuze 4", isChecked);
        editor.commit();

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