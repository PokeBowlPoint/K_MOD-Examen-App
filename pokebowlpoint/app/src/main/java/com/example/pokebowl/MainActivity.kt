package com.example.pokebowl

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1.setOnClickListener {
            val intent = Intent(this, activity2::class.java)
            // start your next activity
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, winkelwagen::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}

