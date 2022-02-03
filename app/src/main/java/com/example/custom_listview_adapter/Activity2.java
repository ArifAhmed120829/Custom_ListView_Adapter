package com.example.custom_listview_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ListView listView3 = findViewById(R.id.listView2);
        // Data Souce - Arrays [Title, subtitle, images]
        String[] mainTitle = {
                "Teacher",
                "Student",
                "Versity_Bus-Driver"
        };
        String[] subTitle = {
                "730_MEMBERS",
                "17000",
                "50+"
        };
        int[] imagesArray = {
                R.drawable.teacher,
                R.drawable.student,
                R.drawable.driver

        };
        MyListAdapter adapter = new MyListAdapter(this,mainTitle,subTitle,imagesArray);
        listView3.setAdapter(adapter);
    }
}