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

public class RedEyeActivity extends AppCompatActivity {

    CardView crd_redEye01, crd_redEye02, crd_redEye03, crd_redEye04, crd_redEye05, crd_redEye06, crd_redEye07, crd_redEye08;
    CheckBox chb_redEye01, chb_redEye02, chb_redEye03, chb_redEye04, chb_redEye05, chb_redEye06, chb_redEye07, chb_redEye08;
    Button btn_redEyeReset, btn_redEyeSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_eye);

        getSupportActionBar().setTitle("Red Eye");

        crd_redEye01 = findViewById(R.id.crd_redEye01);
        crd_redEye02 = findViewById(R.id.crd_redEye02);
        crd_redEye03 = findViewById(R.id.crd_redEye03);
        crd_redEye04 = findViewById(R.id.crd_redEye04);
        crd_redEye05 = findViewById(R.id.crd_redEye05);
        crd_redEye06 = findViewById(R.id.crd_redEye06);
        crd_redEye07 = findViewById(R.id.crd_redEye07);
        crd_redEye08 = findViewById(R.id.crd_redEye08);

        chb_redEye01 = findViewById(R.id.chb_redEye01);
        chb_redEye02 = findViewById(R.id.chb_redEye02);
        chb_redEye03 = findViewById(R.id.chb_redEye03);
        chb_redEye04 = findViewById(R.id.chb_redEye04);
        chb_redEye05 = findViewById(R.id.chb_redEye05);
        chb_redEye06 = findViewById(R.id.chb_redEye06);
        chb_redEye07 = findViewById(R.id.chb_redEye07);
        chb_redEye08 = findViewById(R.id.chb_redEye08);

        btn_redEyeReset = findViewById(R.id.btn_redEyeReset);
        btn_redEyeSubmit = findViewById(R.id.btn_redEyeSubmit);

        chb_redEye02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_redEye04.setVisibility(View.INVISIBLE);
                    crd_redEye05.setVisibility(View.INVISIBLE);
                    crd_redEye06.setVisibility(View.INVISIBLE);
                    crd_redEye07.setVisibility(View.INVISIBLE);
                    crd_redEye08.setVisibility(View.INVISIBLE);

                }
            }
        });

        chb_redEye03.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_redEye04.setVisibility(View.INVISIBLE);
                    crd_redEye05.setVisibility(View.INVISIBLE);
                    crd_redEye06.setVisibility(View.INVISIBLE);
                    crd_redEye07.setVisibility(View.INVISIBLE);
                    crd_redEye08.setVisibility(View.INVISIBLE);

                }
            }
        });

        chb_redEye04.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_redEye02.setVisibility(View.INVISIBLE);
                    crd_redEye03.setVisibility(View.INVISIBLE);


                }
            }
        });

        chb_redEye05.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_redEye02.setVisibility(View.INVISIBLE);
                    crd_redEye03.setVisibility(View.INVISIBLE);

                }
            }
        });

        chb_redEye06.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_redEye02.setVisibility(View.INVISIBLE);
                    crd_redEye03.setVisibility(View.INVISIBLE);
                }
            }
        });

        chb_redEye07.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_redEye02.setVisibility(View.INVISIBLE);
                    crd_redEye03.setVisibility(View.INVISIBLE);

                }
            }
        });

        chb_redEye08.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crd_redEye02.setVisibility(View.INVISIBLE);
                    crd_redEye03.setVisibility(View.INVISIBLE);

                }
            }
        });

        btn_redEyeReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                crd_redEye02.setVisibility(View.VISIBLE);
                crd_redEye03.setVisibility(View.VISIBLE);
                crd_redEye04.setVisibility(View.VISIBLE);
                crd_redEye05.setVisibility(View.VISIBLE);
                crd_redEye06.setVisibility(View.VISIBLE);
                crd_redEye07.setVisibility(View.VISIBLE);
                crd_redEye08.setVisibility(View.VISIBLE);

                chb_redEye01.setChecked(false);
                chb_redEye02.setChecked(false);
                chb_redEye03.setChecked(false);
                chb_redEye04.setChecked(false);
                chb_redEye05.setChecked(false);
                chb_redEye06.setChecked(false);
                chb_redEye07.setChecked(false);
                chb_redEye08.setChecked(false);


            }
        });

        btn_redEyeSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (chb_redEye01.isChecked() && !chb_redEye04.isChecked() && !chb_redEye05.isChecked() && !chb_redEye06.isChecked() && !chb_redEye07.isChecked() && !chb_redEye08.isChecked()
                        && !chb_redEye02.isChecked() && !chb_redEye03.isChecked())
                {
                    Toast.makeText(RedEyeActivity.this, "Selection not valid!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(RedEyeActivity.this, "Please select another symptom!", Toast.LENGTH_SHORT).show();
                }


                else if (chb_redEye01.isChecked() && chb_redEye02.isChecked() || chb_redEye02.isChecked() || chb_redEye03.isChecked())
                {
                    String bilanganPercent = "Cataract100";

                    Intent cat100 = new Intent(RedEyeActivity.this, ResultActivity.class);
                    cat100.putExtra("50", bilanganPercent);
                    startActivity(cat100);
                    finish();
                }

                else if (chb_redEye01.isChecked() || chb_redEye04.isChecked() || chb_redEye05.isChecked() || chb_redEye06.isChecked() || chb_redEye07.isChecked() || chb_redEye08.isChecked())
                {
                    String bilanganPercent = "Glaucoma100";

                    Intent glo100 = new Intent(RedEyeActivity.this, ResultActivity.class);
                    glo100.putExtra("50", bilanganPercent);
                    startActivity(glo100);
                    finish();
                }


            }
        });

    }
}