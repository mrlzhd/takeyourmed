package com.example.takeyourmed.ui.eyedisease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.takeyourmed.R;

public class EyeDiseaseActivity extends AppCompatActivity {

    private Button btn_gotoConsultation, btn_gotoInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_disease);


        btn_gotoConsultation = findViewById(R.id.btn_gotoConsultation);
        btn_gotoInformation = findViewById(R.id.btn_gotoInformation);


        btn_gotoInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoInfo = new Intent(EyeDiseaseActivity.this, InformationActivity.class);
                startActivity(gotoInfo);
            }
        });
    }
}