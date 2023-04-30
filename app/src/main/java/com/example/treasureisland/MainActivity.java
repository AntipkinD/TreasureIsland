package com.example.treasureisland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listview);


        List<String> list = new ArrayList<>();
        list.add("Билли Бонс");
        list.add("Черный Пес");
        list.add("Доктор Ливси");
        list.add("Слепой Пью");
        list.add("Джимми Гокинс");
        list.add("Сквайр Трелони");
        list.add("Джон Сильвер");
        list.add("Капитан Смолетт");
        list.add("Бен Ганн");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0) {
                    startActivity(new Intent(MainActivity.this, BillyActivity.class));
                }else if (i==1){
                    startActivity(new Intent(MainActivity.this,PesActivity.class));
                }else if(i==2){
                    startActivity(new Intent(MainActivity.this, DrLivseyActivity.class));
                }else if(i==3){
                    startActivity(new Intent(MainActivity.this,PyuActivity.class));
                }else if(i==4){
                    startActivity(new Intent(MainActivity.this, JimActivity.class));
                }else if(i==5){
                    startActivity(new Intent(MainActivity.this,TreloniActivity.class));
                }else if(i==6){
                    startActivity(new Intent(MainActivity.this,SilverActivity.class));
                }else if(i==7){
                    startActivity(new Intent(MainActivity.this,SmolettActivity.class));
                }else if(i==8){
                    startActivity(new Intent(MainActivity.this, BenGannActivity.class));
                }

            }
        });


    }
}