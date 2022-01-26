package com.example.takeyourmed.ui.eyedisease;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.takeyourmed.R;

public class EyeDiseaseActivity extends AppCompatActivity {


    private CardView crdGotoInfo;
    private CardView crdGotoConsultation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_disease);

        getSupportActionBar().setTitle("Eye Disease");


        crdGotoInfo = findViewById(R.id.crd_gotoInfo);
        crdGotoConsultation = findViewById(R.id.crd_gotoConsultation);


        crdGotoInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoInfo = new Intent(EyeDiseaseActivity.this, InformationActivity.class);
                startActivity(gotoInfo);
            }
        });

        crdGotoConsultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoCons = new Intent(EyeDiseaseActivity.this, ConsultationActivity.class);
                startActivity(gotoCons);
            }
        });


    }
}