package com.example.recyclerviewdummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        details = (TextView) findViewById(R.id.details);

        Intent intent = getIntent();

        String Details = intent.getStringExtra("Detailed");
        details.setText(Details);
    }
}