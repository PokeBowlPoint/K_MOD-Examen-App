package com.example.pokebowl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class activity4 extends AppCompatActivity {
    public String isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4);

        Button button = findViewById(R.id.button_verder3);

        button.setOnClickListener(v -> {
            CheckBox checkbox31 = (CheckBox) findViewById(R.id.check41);
            if (checkbox31.isChecked()) {
                isChecked = String.valueOf(checkbox31.getText());
            }
            CheckBox checkbox32 = (CheckBox) findViewById(R.id.check42);
            if (checkbox32.isChecked()) {
                isChecked = String.valueOf(checkbox32.getText());
            }
            CheckBox checkbox33 = (CheckBox) findViewById(R.id.check43);
            if (checkbox33.isChecked()) {
                isChecked = String.valueOf(checkbox33.getText());
            }
            SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
            SharedPreferences.Editor editor = pref.edit();
            editor.putString("Keuze 3", isChecked);
            editor.commit();

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