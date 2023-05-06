package com.example.treasureisland;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class DrLivseyActivity extends AppCompatActivity {

    ImageButton drLivse;
    TextView txt, txt1;
    ConstraintLayout back;
    boolean clicked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dr_livsey);
        drLivse = (ImageButton) findViewById(R.id.it);
        txt = (TextView) findViewById(R.id.txt);
        txt1 = (TextView) findViewById(R.id.txt1);
        back = (ConstraintLayout) findViewById(R.id.back);
        drLivse.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(clicked == false){
                    drLivse.setBackground(getDrawable(R.drawable.it));
                    txt1.setText("ОНО");
                    txt1.setTextColor(getColor(R.color.mhh));
                    txt.setText("ИНФОРМАЦИЯ ОТСУТСТВУЕТ.\nОНО ХОЧЕТ ЕСТЬ.");
                    txt.setTextColor(getColor(R.color.mhh));
                    back.setBackgroundColor(getColor(R.color.hmm));
                    return clicked = true;
                }
                return false;
            }
        });
    }
}