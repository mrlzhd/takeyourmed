package com.example.takeyourmed.ui.eyedisease.Symptom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.takeyourmed.R;

public class ExcessiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excessive);

        getSupportActionBar().setTitle("Excessive Tearing");
    }
}