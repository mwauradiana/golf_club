package com.example.golf_club;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hadharani extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            TextView tv = (TextView)findViewById(R.id.textView2);
            tv.setText("Welcome to Hadharani");
        }
    }
