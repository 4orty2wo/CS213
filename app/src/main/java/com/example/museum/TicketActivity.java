package com.example.museum;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TicketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        // create a back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // toast
        Toast.makeText(getApplicationContext(), "Maximum of 5 tickets for each!" , Toast.LENGTH_LONG).show();
    }
}