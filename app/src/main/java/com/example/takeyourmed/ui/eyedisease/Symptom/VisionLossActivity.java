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

public class VisionLossActivity extends AppCompatActivity {

    CardView crd_vl01, crd_vl02, crd_vl03, crd_vl04;
    CheckBox chb_vl01, chb_vl02, chb_vl03, chb_vl04;
    Button btn_vlReset, btn_vlSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_loss);

        getSupportActionBar().setTitle("Vision Loss");

        crd_vl01 = findViewById(R.id.crd_vl01);
        crd_vl02 = findViewById(R.id.crd_vl02);
        crd_vl03 = findViewById(R.id.crd_vl03);
        crd_vl04 = findViewById(R.id.crd_vl04);

        chb_vl01 = findViewById(R.id.chb_vl01);
        chb_vl02 = findViewById(R.id.chb_vl02);
        chb_vl03 = findViewById(R.id.chb_vl03);
        chb_vl04 = findViewById(R.id.chb_vl04);

        btn_vlReset = findViewById(R.id.btn_vlReset);
        btn_vlSubmit = findViewById(R.id.btn_vlSubmit);

        chb_vl02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crd_vl04.setVisibility(View.INVISIBLE);

            }
        });

        chb_vl04.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crd_vl02.setVisibility(View.INVISIBLE);
                crd_vl03.setVisibility(View.INVISIBLE);

            }
        });

        btn_vlReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                crd_vl02.setVisibility(View.VISIBLE);
                crd_vl03.setVisibility(View.VISIBLE);
                crd_vl04.setVisibility(View.VISIBLE);

                chb_vl01.setChecked(false);
                chb_vl02.setChecked(false);
                chb_vl03.setChecked(false);
                chb_vl04.setChecked(false);

            }
        });

        btn_vlSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (chb_vl01.isChecked() && !chb_vl02.isChecked() && !chb_vl03.isChecked() && !chb_vl03.isChecked())
                {
                    Toast.makeText(VisionLossActivity.this, "Selection not valid!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(VisionLossActivity.this, "Please select another symptom!", Toast.LENGTH_SHORT).show();
                }

                else if (chb_vl01.isChecked() && chb_vl02.isChecked() || chb_vl02.isChecked() || chb_vl03.isChecked())
                {
                    String bilanganPercent = "Glaucoma100";

                    Intent gloBlur = new Intent(VisionLossActivity.this, ResultActivity.class);
                    gloBlur.putExtra("50", bilanganPercent);
                    startActivity(gloBlur);
                    finish();
                }

                else if (chb_vl01.isChecked() || chb_vl04.isChecked())
                {
                    String bilanganPercent = "Diabetic100";

                    Intent glo100 = new Intent(VisionLossActivity.this, ResultActivity.class);
                    glo100.putExtra("50", bilanganPercent);
                    startActivity(glo100);
                    finish();
                }


            }
        });
    }
}