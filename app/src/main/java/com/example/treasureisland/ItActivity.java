package com.example.treasureisland;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageButton;

public class ItActivity extends AppCompatActivity {
    ImageButton it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(-65536));
        getSupportActionBar().hide();
        setContentView(R.layout.activity_it);
    }
}