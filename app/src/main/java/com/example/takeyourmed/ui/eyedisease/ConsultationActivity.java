package com.example.takeyourmed.ui.eyedisease;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.takeyourmed.R;
import com.example.takeyourmed.ui.eyedisease.Symptom.DoubleVisionActivity;

public class ConsultationActivity extends AppCompatActivity {

    CardView crd_cons01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultation);

        crd_cons01 = findViewById(R.id.crd_cons01);

        crd_cons01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoDouble = new Intent(ConsultationActivity.this, DoubleVisionActivity.class);
                startActivity(gotoDouble);
            }
        });
    }
}