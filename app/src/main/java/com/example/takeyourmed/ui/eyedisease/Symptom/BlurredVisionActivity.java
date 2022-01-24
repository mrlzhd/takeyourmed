package com.example.takeyourmed.ui.eyedisease.Symptom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.takeyourmed.R;
import com.example.takeyourmed.ui.eyedisease.ResultActivity;

public class BlurredVisionActivity extends AppCompatActivity {

    CardView crd_blur01, crd_blur02, crd_blur03, crd_blur04;
    CheckBox chb_blur01, chb_blur02, chb_blur03, chb_blur04;
    Button btn_blurReset, btn_blurSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blurred_vision);

        crd_blur01 = findViewById(R.id.crd_blur01);
        crd_blur02 = findViewById(R.id.crd_blur02);
        crd_blur03 = findViewById(R.id.crd_blur03);
        crd_blur04 = findViewById(R.id.crd_blur04);

        chb_blur01 = findViewById(R.id.chb_blur01);
        chb_blur02 = findViewById(R.id.chb_blur02);
        chb_blur03 = findViewById(R.id.chb_blur03);
        chb_blur04 = findViewById(R.id.chb_blur04);

        btn_blurReset = findViewById(R.id.btn_blurReset);
        btn_blurSubmit = findViewById(R.id.btn_blurSubmit);

        chb_blur02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crd_blur04.setVisibility(View.INVISIBLE);

            }
        });

        chb_blur04.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crd_blur02.setVisibility(View.INVISIBLE);
                crd_blur03.setVisibility(View.INVISIBLE);

            }
        });

        btn_blurReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                crd_blur02.setVisibility(View.VISIBLE);
                crd_blur03.setVisibility(View.VISIBLE);
                crd_blur04.setVisibility(View.VISIBLE);

            }
        });

        btn_blurSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (chb_blur01.isChecked() && !chb_blur02.isChecked() && !chb_blur03.isChecked() && !chb_blur04.isChecked())
                {
                    Toast.makeText(BlurredVisionActivity.this, "Selection not valid!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(BlurredVisionActivity.this, "Please select another symptom!", Toast.LENGTH_SHORT).show();
                }

                else if (chb_blur01.isChecked() && chb_blur02.isChecked() || chb_blur02.isChecked() || chb_blur03.isChecked())
                {
                    String bilanganPercent = "Glaucoma100";

                    Intent gloBlur = new Intent(BlurredVisionActivity.this, ResultActivity.class);
                    gloBlur.putExtra("50", bilanganPercent);
                    startActivity(gloBlur);
                    finish();
                }

                else if (chb_blur01.isChecked() || chb_blur04.isChecked())
                {
                    String bilanganPercent = "Diabetic100";

                    Intent glo100 = new Intent(BlurredVisionActivity.this, ResultActivity.class);
                    glo100.putExtra("50", bilanganPercent);
                    startActivity(glo100);
                    finish();
                }


            }
        });

    }
}