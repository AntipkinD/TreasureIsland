package com.example.treasureisland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class DrLivseyActivity extends AppCompatActivity {

    ImageButton it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dr_livsey);
        it = (ImageButton) findViewById(R.id.it);
        it.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                startActivity(new Intent(DrLivseyActivity.this, ItActivity.class));
                return false;
            }
        });
    }
}