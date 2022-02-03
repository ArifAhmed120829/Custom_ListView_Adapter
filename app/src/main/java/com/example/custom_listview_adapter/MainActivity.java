package com.example.custom_listview_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Activity2.class);
                startActivity(i);
            }
        });
        //1- ListView Initialization
        ListView listView2 = findViewById(R.id.listView);
        //2- Data Source-Array
        String[] versity = {
                "Teacher",
                "Student",
                "Teaching assistant",
                "Versity_Bus_Driver"
        };
        // Adapter - ArrayAdapter
        ArrayAdapter adapter = new ArrayAdapter(
                this,
                R.layout.myitem,
                R.id.itemText,
                versity
        );
        listView2.setAdapter(adapter);
    }
}