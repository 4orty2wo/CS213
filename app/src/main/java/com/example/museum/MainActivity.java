package com.example.museum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void museumClicked(View v) {
        // what activity intends to do
        Intent i = new Intent(this,TicketActivity.class);
        startActivity(i);
    }
}