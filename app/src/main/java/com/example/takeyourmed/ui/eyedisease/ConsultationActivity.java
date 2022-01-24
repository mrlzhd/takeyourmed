package com.example.takeyourmed.ui.eyedisease;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.takeyourmed.R;
import com.example.takeyourmed.ui.eyedisease.Symptom.BlurredVisionActivity;
import com.example.takeyourmed.ui.eyedisease.Symptom.DoubleVisionActivity;
import com.example.takeyourmed.ui.eyedisease.Symptom.EyePainActivity;
import com.example.takeyourmed.ui.eyedisease.Symptom.RedEyeActivity;
import com.example.takeyourmed.ui.eyedisease.Symptom.VisionLossActivity;

public class ConsultationActivity extends AppCompatActivity {

    CardView crd_cons01, crd_cons02, crd_cons03, crd_cons04, crd_cons05, crd_cons06, crd_cons07, crd_cons08, crd_cons09;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultation);

        crd_cons01 = findViewById(R.id.crd_cons01);
        crd_cons02 = findViewById(R.id.crd_cons02);
        crd_cons03 = findViewById(R.id.crd_cons03);
        crd_cons04 = findViewById(R.id.crd_cons04);
        crd_cons05 = findViewById(R.id.crd_cons05);
        crd_cons06 = findViewById(R.id.crd_cons06);
        crd_cons07 = findViewById(R.id.crd_cons07);
        crd_cons08 = findViewById(R.id.crd_cons08);
        crd_cons09 = findViewById(R.id.crd_cons09);


        crd_cons01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoDouble = new Intent(ConsultationActivity.this, DoubleVisionActivity.class);
                startActivity(gotoDouble);
            }
        });

        crd_cons02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoRedeye = new Intent(ConsultationActivity.this, EyePainActivity.class);
                startActivity(gotoRedeye);
            }
        });

        crd_cons03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoEyePain = new Intent(ConsultationActivity.this, RedEyeActivity.class);
                startActivity(gotoEyePain);
            }
        });

        crd_cons04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoBlur = new Intent(ConsultationActivity.this, BlurredVisionActivity.class);
                startActivity(gotoBlur);
            }
        });

        crd_cons05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoVision = new Intent(ConsultationActivity.this, VisionLossActivity.class);
                startActivity(gotoVision);
            }
        });


    }
}