package com.example.takeyourmed.ui.eyedisease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.takeyourmed.R;

public class CataractActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cataract);

        getSupportActionBar().setTitle("Cataract");
    }
}