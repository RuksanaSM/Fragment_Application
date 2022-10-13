package com.example.fragmentdatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //it will add first fragment by deafalut
        getSupportFragmentManager().beginTransaction().add(R.id.container_frame,new OneFragment()).commit();
    }
}