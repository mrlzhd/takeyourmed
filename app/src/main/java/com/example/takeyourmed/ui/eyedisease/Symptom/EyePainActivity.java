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

public class EyePainActivity extends AppCompatActivity {

    CardView crd_eyePain01, crd_eyePain02, crd_eyePain03, crd_eyePain04, crd_eyePain05, crd_eyePain06 , crd_eyePain07 , crd_eyePain08;
    CheckBox chb_eyePain01, chb_eyePain02, chb_eyePain03, chb_eyePain04, chb_eyePain05, chb_eyePain06, chb_eyePain07, chb_eyePain08;
    Button btn_eyePainReset, btn_eyePainSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_pain);

        crd_eyePain01 = findViewById(R.id.crd_eyePain01);
        crd_eyePain02 = findViewById(R.id.crd_eyePain02);
        crd_eyePain03 = findViewById(R.id.crd_eyePain03);
        crd_eyePain04 = findViewById(R.id.crd_eyePain04);
        crd_eyePain05 = findViewById(R.id.crd_eyePain05);
        crd_eyePain06 = findViewById(R.id.crd_eyePain06);
        crd_eyePain07 = findViewById(R.id.crd_eyePain07);
        crd_eyePain08 = findViewById(R.id.crd_eyePain08);


        chb_eyePain01 = findViewById(R.id.chb_eyePain01);
        chb_eyePain02 = findViewById(R.id.chb_eyePain02);
        chb_eyePain03 = findViewById(R.id.chb_eyePain03);
        chb_eyePain04 = findViewById(R.id.chb_eyePain04);
        chb_eyePain05 = findViewById(R.id.chb_eyePain05);
        chb_eyePain06 = findViewById(R.id.chb_eyePain06);
        chb_eyePain07 = findViewById(R.id.chb_eyePain07);
        chb_eyePain08 = findViewById(R.id.chb_eyePain08);

        btn_eyePainReset = findViewById(R.id.btn_eyePainReset);
        btn_eyePainSubmit = findViewById(R.id.btn_eyePainSubmit);

        chb_eyePain02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_eyePain04.setVisibility(View.INVISIBLE);
                    crd_eyePain05.setVisibility(View.INVISIBLE);
                    crd_eyePain06.setVisibility(View.INVISIBLE);
                    crd_eyePain07.setVisibility(View.INVISIBLE);
                    crd_eyePain08.setVisibility(View.INVISIBLE);

                }
            }
        });

        chb_eyePain03.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_eyePain04.setVisibility(View.INVISIBLE);
                    crd_eyePain05.setVisibility(View.INVISIBLE);
                    crd_eyePain06.setVisibility(View.INVISIBLE);
                    crd_eyePain07.setVisibility(View.INVISIBLE);
                    crd_eyePain08.setVisibility(View.INVISIBLE);

                }
            }
        });

        chb_eyePain04.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_eyePain02.setVisibility(View.INVISIBLE);
                    crd_eyePain03.setVisibility(View.INVISIBLE);

                }
            }
        });

        chb_eyePain05.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_eyePain02.setVisibility(View.INVISIBLE);
                    crd_eyePain03.setVisibility(View.INVISIBLE);

                }
            }
        });

        chb_eyePain06.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_eyePain02.setVisibility(View.INVISIBLE);
                    crd_eyePain03.setVisibility(View.INVISIBLE);

                }
            }
        });

        chb_eyePain07.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_eyePain02.setVisibility(View.INVISIBLE);
                    crd_eyePain03.setVisibility(View.INVISIBLE);

                }
            }
        });

        chb_eyePain08.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_eyePain02.setVisibility(View.INVISIBLE);
                    crd_eyePain03.setVisibility(View.INVISIBLE);

                }
            }
        });

        btn_eyePainReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                crd_eyePain02.setVisibility(View.VISIBLE);
                crd_eyePain03.setVisibility(View.VISIBLE);
                crd_eyePain04.setVisibility(View.VISIBLE);
                crd_eyePain05.setVisibility(View.VISIBLE);
                crd_eyePain06.setVisibility(View.VISIBLE);
                crd_eyePain07.setVisibility(View.VISIBLE);
                crd_eyePain08.setVisibility(View.VISIBLE);

                chb_eyePain01.setChecked(false);
                chb_eyePain02.setChecked(false);
                chb_eyePain03.setChecked(false);
                chb_eyePain04.setChecked(false);
                chb_eyePain05.setChecked(false);
                chb_eyePain06.setChecked(false);
                chb_eyePain07.setChecked(false);
                chb_eyePain08.setChecked(false);


            }
        });

        btn_eyePainSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (chb_eyePain01.isChecked() && !chb_eyePain04.isChecked() && !chb_eyePain05.isChecked() && !chb_eyePain06.isChecked() && !chb_eyePain07.isChecked() && !chb_eyePain08.isChecked()
                        && !chb_eyePain02.isChecked() && !chb_eyePain03.isChecked())
                {
                    Toast.makeText(EyePainActivity.this, "Selection not valid!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(EyePainActivity.this, "Please select another symptom!", Toast.LENGTH_SHORT).show();
                }


                else if (chb_eyePain01.isChecked() && chb_eyePain02.isChecked() || chb_eyePain02.isChecked() || chb_eyePain03.isChecked())
                {
                    String bilanganPercent = "Cataract100";

                    Intent cat100 = new Intent(EyePainActivity.this, ResultActivity.class);
                    cat100.putExtra("50", bilanganPercent);
                    startActivity(cat100);
                    finish();
                }

                else if (chb_eyePain01.isChecked() || chb_eyePain04.isChecked() || chb_eyePain05.isChecked() || chb_eyePain06.isChecked() || chb_eyePain07.isChecked() || chb_eyePain08.isChecked())
                {
                    String bilanganPercent = "Glaucoma100";

                    Intent glo100 = new Intent(EyePainActivity.this, ResultActivity.class);
                    glo100.putExtra("50", bilanganPercent);
                    startActivity(glo100);
                    finish();
                }


            }
        });






    }
}