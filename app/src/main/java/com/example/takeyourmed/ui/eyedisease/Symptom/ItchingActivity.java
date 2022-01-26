package com.example.takeyourmed.ui.eyedisease.Symptom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.takeyourmed.R;
import com.example.takeyourmed.ui.eyedisease.ResultActivity;

public class ItchingActivity extends AppCompatActivity {

    private CheckBox chbItch01;
    private CardView crdItch01;
    private CheckBox chbItch02;
    private CardView crdItch02;
    private CheckBox chbItch03;
    private CardView crdItch03;
    private CheckBox chbItch04;
    private CardView crdItch04;
    private CheckBox chbItch05;
    private CardView crdItch05;
    private CheckBox chbItch06;
    private CardView crdItch06;
    private CheckBox chbItch07;
    private CardView crdItch07;
    private CheckBox chbItch08;
    private CardView crdItch08;
    private CheckBox chbItch09;
    private CardView crdItch09;
    private CheckBox chbItch10;
    private CardView crdItch10;
    private CheckBox chbItch11;
    private CardView crdItch11;
    private Button btnItchReset;
    private Button btnItchSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itching);

        getSupportActionBar().setTitle("Itching");
        chbItch01 = findViewById(R.id.chb_itch01);
        crdItch01 = findViewById(R.id.crd_itch01);
        chbItch02 = findViewById(R.id.chb_itch02);
        crdItch02 = findViewById(R.id.crd_itch02);
        chbItch03 = findViewById(R.id.chb_itch03);
        crdItch03 = findViewById(R.id.crd_itch03);
        chbItch04 = findViewById(R.id.chb_itch04);
        crdItch04 = findViewById(R.id.crd_itch04);
        chbItch05 = findViewById(R.id.chb_itch05);
        crdItch05 = findViewById(R.id.crd_itch05);
        chbItch06 = findViewById(R.id.chb_itch06);
        crdItch06 = findViewById(R.id.crd_itch06);
        chbItch07 = findViewById(R.id.chb_itch07);
        crdItch07 = findViewById(R.id.crd_itch07);
        chbItch08 = findViewById(R.id.chb_itch08);
        crdItch08 = findViewById(R.id.crd_itch08);
        chbItch09 = findViewById(R.id.chb_itch09);
        crdItch09 = findViewById(R.id.crd_itch09);
        chbItch10 = findViewById(R.id.chb_itch10);
        crdItch10 = findViewById(R.id.crd_itch10);
        chbItch11 = findViewById(R.id.chb_itch11);
        crdItch11 = findViewById(R.id.crd_itch11);
        btnItchReset = findViewById(R.id.btn_itchReset);
        btnItchSubmit = findViewById(R.id.btn_itchSubmit);

        chbItch01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdItch04.setVisibility(View.INVISIBLE);
                crdItch05.setVisibility(View.INVISIBLE);
                crdItch06.setVisibility(View.INVISIBLE);

            }
        });

        chbItch02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdItch04.setVisibility(View.INVISIBLE);
                crdItch05.setVisibility(View.INVISIBLE);
                crdItch06.setVisibility(View.INVISIBLE);
                crdItch07.setVisibility(View.INVISIBLE);
                crdItch08.setVisibility(View.INVISIBLE);
                crdItch09.setVisibility(View.INVISIBLE);
                crdItch10.setVisibility(View.INVISIBLE);
                crdItch11.setVisibility(View.INVISIBLE);


            }
        });

        chbItch03.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdItch04.setVisibility(View.INVISIBLE);
                crdItch05.setVisibility(View.INVISIBLE);
                crdItch06.setVisibility(View.INVISIBLE);
                crdItch07.setVisibility(View.INVISIBLE);
                crdItch08.setVisibility(View.INVISIBLE);
                crdItch09.setVisibility(View.INVISIBLE);
                crdItch10.setVisibility(View.INVISIBLE);
                crdItch11.setVisibility(View.INVISIBLE);

            }
        });

        chbItch04.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdItch01.setVisibility(View.INVISIBLE);
                crdItch02.setVisibility(View.INVISIBLE);
                crdItch03.setVisibility(View.INVISIBLE);
                crdItch07.setVisibility(View.INVISIBLE);
                crdItch08.setVisibility(View.INVISIBLE);
                crdItch09.setVisibility(View.INVISIBLE);
                crdItch10.setVisibility(View.INVISIBLE);
                crdItch11.setVisibility(View.INVISIBLE);

            }
        });

        chbItch05.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdItch01.setVisibility(View.INVISIBLE);
                crdItch02.setVisibility(View.INVISIBLE);
                crdItch03.setVisibility(View.INVISIBLE);
                crdItch07.setVisibility(View.INVISIBLE);
                crdItch08.setVisibility(View.INVISIBLE);
                crdItch09.setVisibility(View.INVISIBLE);
                crdItch10.setVisibility(View.INVISIBLE);
                crdItch11.setVisibility(View.INVISIBLE);

            }
        });

        chbItch06.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdItch01.setVisibility(View.INVISIBLE);
                crdItch02.setVisibility(View.INVISIBLE);
                crdItch03.setVisibility(View.INVISIBLE);
                crdItch07.setVisibility(View.INVISIBLE);
                crdItch08.setVisibility(View.INVISIBLE);
                crdItch09.setVisibility(View.INVISIBLE);
                crdItch10.setVisibility(View.INVISIBLE);
                crdItch11.setVisibility(View.INVISIBLE);

            }
        });

        chbItch07.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdItch02.setVisibility(View.INVISIBLE);
                crdItch03.setVisibility(View.INVISIBLE);
                crdItch04.setVisibility(View.INVISIBLE);
                crdItch05.setVisibility(View.INVISIBLE);
                crdItch06.setVisibility(View.INVISIBLE);
                crdItch08.setVisibility(View.INVISIBLE);
                crdItch09.setVisibility(View.INVISIBLE);
                crdItch10.setVisibility(View.INVISIBLE);
                crdItch11.setVisibility(View.INVISIBLE);

            }
        });

        chbItch08.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdItch02.setVisibility(View.INVISIBLE);
                crdItch03.setVisibility(View.INVISIBLE);
                crdItch04.setVisibility(View.INVISIBLE);
                crdItch05.setVisibility(View.INVISIBLE);
                crdItch06.setVisibility(View.INVISIBLE);
                crdItch07.setVisibility(View.INVISIBLE);

            }
        });

        chbItch09.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdItch02.setVisibility(View.INVISIBLE);
                crdItch03.setVisibility(View.INVISIBLE);
                crdItch04.setVisibility(View.INVISIBLE);
                crdItch05.setVisibility(View.INVISIBLE);
                crdItch06.setVisibility(View.INVISIBLE);
                crdItch07.setVisibility(View.INVISIBLE);

            }
        });

        chbItch10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdItch02.setVisibility(View.INVISIBLE);
                crdItch03.setVisibility(View.INVISIBLE);
                crdItch04.setVisibility(View.INVISIBLE);
                crdItch05.setVisibility(View.INVISIBLE);
                crdItch06.setVisibility(View.INVISIBLE);
                crdItch07.setVisibility(View.INVISIBLE);

            }
        });

        chbItch11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdItch02.setVisibility(View.INVISIBLE);
                crdItch03.setVisibility(View.INVISIBLE);
                crdItch04.setVisibility(View.INVISIBLE);
                crdItch05.setVisibility(View.INVISIBLE);
                crdItch06.setVisibility(View.INVISIBLE);
                crdItch07.setVisibility(View.INVISIBLE);

            }
        });

        btnItchReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chbItch01.setChecked(false);
                chbItch02.setChecked(false);
                chbItch03.setChecked(false);
                chbItch04.setChecked(false);
                chbItch05.setChecked(false);
                chbItch06.setChecked(false);
                chbItch07.setChecked(false);
                chbItch08.setChecked(false);
                chbItch09.setChecked(false);
                chbItch10.setChecked(false);
                chbItch11.setChecked(false);

                crdItch01.setVisibility(View.VISIBLE);
                crdItch02.setVisibility(View.VISIBLE);
                crdItch03.setVisibility(View.VISIBLE);
                crdItch04.setVisibility(View.VISIBLE);
                crdItch05.setVisibility(View.VISIBLE);
                crdItch06.setVisibility(View.VISIBLE);
                crdItch07.setVisibility(View.VISIBLE);
                crdItch08.setVisibility(View.VISIBLE);
                crdItch09.setVisibility(View.VISIBLE);
                crdItch10.setVisibility(View.VISIBLE);
                crdItch11.setVisibility(View.VISIBLE);



            }
        });

        btnItchSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (chbItch01.isChecked() && !chbItch02.isChecked() && !chbItch03.isChecked() && !chbItch04.isChecked() && !chbItch05.isChecked() && !chbItch06.isChecked()
                        && !chbItch07.isChecked() && !chbItch08.isChecked() && !chbItch09.isChecked() && !chbItch10.isChecked() && !chbItch11.isChecked())
                {
                    Toast.makeText(ItchingActivity.this, "Selection not valid!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(ItchingActivity.this, "Please select another symptom!", Toast.LENGTH_SHORT).show();
                }

                else if (chbItch01.isChecked() && chbItch02.isChecked() || chbItch02.isChecked() || chbItch03.isChecked())
                {
                    String bilanganPercent = "EyeStrain100";

                    Intent cat100 = new Intent(ItchingActivity.this, ResultActivity.class);
                    cat100.putExtra("50", bilanganPercent);
                    startActivity(cat100);
                    finish();
                }

                else if (chbItch04.isChecked() || chbItch05.isChecked() || chbItch06.isChecked())
                {
                    String bilanganPercent = "RefractiveErrors100";

                    Intent Re100 = new Intent(ItchingActivity.this, ResultActivity.class);
                    Re100.putExtra("50", bilanganPercent);
                    startActivity(Re100);
                    finish();
                }

                else if (chbItch01.isChecked() && chbItch07.isChecked() || chbItch07.isChecked())
                {
                    String bilanganPercent = "DryEye100";

                    Intent De100 = new Intent(ItchingActivity.this, ResultActivity.class);
                    De100.putExtra("50", bilanganPercent);
                    startActivity(De100);
                    finish();
                }

                else if (chbItch01.isChecked() && chbItch08.isChecked() || chbItch09.isChecked() || chbItch10.isChecked() || chbItch11.isChecked())
                {

                    String bilanganPercent = "Conjunctivitis100";

                    Intent cj100 = new Intent(ItchingActivity.this, ResultActivity.class);
                    cj100.putExtra("50", bilanganPercent);
                    startActivity(cj100);
                    finish();

                }

            }
        });



    }
}