package com.example.treasureisland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PyuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_pyu);
    }
}