package com.example.pokebowl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class activity2 extends AppCompatActivity {
    public String isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        Button button = findViewById(R.id.button_verder1);


        button.setOnClickListener(v -> {
            CheckBox checkbox = (CheckBox) findViewById(R.id.check11);
            if (checkbox.isChecked()) {
                isChecked = String.valueOf(checkbox.getText());
            }
            CheckBox checkbox2 = (CheckBox) findViewById(R.id.check12);
            if (checkbox2.isChecked()) {
                isChecked = String.valueOf(checkbox2.getText());
            }
            CheckBox checkbox3 = (CheckBox) findViewById(R.id.check13);
            if (checkbox3.isChecked()) {
                isChecked = String.valueOf(checkbox3.getText());
            }
            CheckBox checkbox4 = (CheckBox) findViewById(R.id.check14);
            if (checkbox4.isChecked()) {
                isChecked = String.valueOf(checkbox4.getText());
            }
            CheckBox checkbox5 = (CheckBox) findViewById(R.id.check15);
            if (checkbox5.isChecked()) {
                isChecked = String.valueOf(checkbox5.getText());
            }
            SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
            SharedPreferences.Editor editor = pref.edit();
            editor.putString("Keuze 1", isChecked);
            editor.commit();

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