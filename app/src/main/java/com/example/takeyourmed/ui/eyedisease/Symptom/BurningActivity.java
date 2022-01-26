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

public class BurningActivity extends AppCompatActivity {
    private CheckBox chbBurn01;
    private CardView crdBurn01;
    private CheckBox chbBurn02;
    private CardView crdBurn02;
    private CheckBox chbBurn03;
    private CardView crdBurn03;
    private CheckBox chbBurn04;
    private CardView crdBurn04;
    private CheckBox chbBurn05;
    private CardView crdBurn05;
    private CheckBox chbBurn06;
    private CardView crdBurn06;
    private CheckBox chbBurn07;
    private CardView crdBurn07;
    private CheckBox chbBurn08;
    private CardView crdBurn08;
    private Button btnBurnReset;
    private Button btnBurnSubmit;

//    CardView crd_burn01, crd_burn02, crd_burn03, crd_burn04, crd_burn05, crd_burn06, crd_burn07, crd_burn08;
//    CheckBox chb_burn01, chb_burn02, chb_burn03, chb_burn04, chb_burn05, chb_burn06, chb_burn07, chb_burn08;
//    Button btn_burnReset, btn_burnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burning);

        getSupportActionBar().setTitle("Burning");

        chbBurn01 = findViewById(R.id.chb_burn01);
        crdBurn01 = findViewById(R.id.crd_burn01);
        chbBurn02 = findViewById(R.id.chb_burn02);
        crdBurn02 = findViewById(R.id.crd_burn02);
        chbBurn03 = findViewById(R.id.chb_burn03);
        crdBurn03 = findViewById(R.id.crd_burn03);
        chbBurn04 = findViewById(R.id.chb_burn04);
        crdBurn04 = findViewById(R.id.crd_burn04);
        chbBurn05 = findViewById(R.id.chb_burn05);
        crdBurn05 = findViewById(R.id.crd_burn05);
        chbBurn06 = findViewById(R.id.chb_burn06);
        crdBurn06 = findViewById(R.id.crd_burn06);
        chbBurn07 = findViewById(R.id.chb_burn07);
        crdBurn07 = findViewById(R.id.crd_burn07);
        chbBurn08 = findViewById(R.id.chb_burn08);
        crdBurn08 = findViewById(R.id.crd_burn08);
        btnBurnReset = findViewById(R.id.btn_burnReset);
        btnBurnSubmit = findViewById(R.id.btn_burnSubmit);

        chbBurn02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (compoundButton.isChecked())
                {
                    crdBurn04.setVisibility(View.INVISIBLE);
                    crdBurn05.setVisibility(View.INVISIBLE);
                    crdBurn06.setVisibility(View.INVISIBLE);
                    crdBurn07.setVisibility(View.INVISIBLE);
                    crdBurn08.setVisibility(View.INVISIBLE);
                }

            }
        });

        chbBurn03.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdBurn04.setVisibility(View.INVISIBLE);
                crdBurn05.setVisibility(View.INVISIBLE);
                crdBurn06.setVisibility(View.INVISIBLE);
                crdBurn07.setVisibility(View.INVISIBLE);
                crdBurn08.setVisibility(View.INVISIBLE);

            }
        });


        chbBurn04.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdBurn02.setVisibility(View.INVISIBLE);
                crdBurn03.setVisibility(View.INVISIBLE);
                crdBurn05.setVisibility(View.INVISIBLE);
                crdBurn06.setVisibility(View.INVISIBLE);
                crdBurn07.setVisibility(View.INVISIBLE);
                crdBurn08.setVisibility(View.INVISIBLE);

            }
        });

        chbBurn05.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdBurn02.setVisibility(View.INVISIBLE);
                crdBurn03.setVisibility(View.INVISIBLE);
                crdBurn04.setVisibility(View.INVISIBLE);

            }
        });

        chbBurn06.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                crdBurn02.setVisibility(View.INVISIBLE);
                crdBurn03.setVisibility(View.INVISIBLE);
                crdBurn04.setVisibility(View.INVISIBLE);

            }
        });

        chbBurn07.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                crdBurn02.setVisibility(View.INVISIBLE);
                crdBurn03.setVisibility(View.INVISIBLE);
                crdBurn04.setVisibility(View.INVISIBLE);
            }
        });

        chbBurn08.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                crdBurn02.setVisibility(View.INVISIBLE);
                crdBurn03.setVisibility(View.INVISIBLE);
                crdBurn04.setVisibility(View.INVISIBLE);
            }
        });

        btnBurnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chbBurn01.setChecked(false);
                chbBurn02.setChecked(false);
                chbBurn03.setChecked(false);
                chbBurn04.setChecked(false);
                chbBurn05.setChecked(false);
                chbBurn06.setChecked(false);
                chbBurn07.setChecked(false);
                chbBurn08.setChecked(false);

                crdBurn02.setVisibility(View.VISIBLE);
                crdBurn03.setVisibility(View.VISIBLE);
                crdBurn04.setVisibility(View.VISIBLE);
                crdBurn05.setVisibility(View.VISIBLE);
                crdBurn06.setVisibility(View.VISIBLE);
                crdBurn07.setVisibility(View.VISIBLE);
                crdBurn08.setVisibility(View.VISIBLE);



            }
        });

        btnBurnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (chbBurn01.isChecked() && !chbBurn04.isChecked() && !chbBurn05.isChecked() && !chbBurn06.isChecked() && !chbBurn07.isChecked() && !chbBurn08.isChecked()
                        && !chbBurn02.isChecked() && !chbBurn03.isChecked())
                {
                    Toast.makeText(BurningActivity.this, "Selection not valid!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(BurningActivity.this, "Please select another symptom!", Toast.LENGTH_SHORT).show();
                }

                else if (chbBurn01.isChecked() && chbBurn02.isChecked() || chbBurn02.isChecked() || chbBurn03.isChecked())
                {
                    String bilanganPercent = "EyeStrain100";

                    Intent cat100 = new Intent(BurningActivity.this, ResultActivity.class);
                    cat100.putExtra("50", bilanganPercent);
                    startActivity(cat100);
                    finish();
                }

                else if (chbBurn01.isChecked() && chbBurn04.isChecked() || chbBurn04.isChecked())
                {
                    String bilanganPercent = "DryEye100";

                    Intent dry100 = new Intent(BurningActivity.this, ResultActivity.class);
                    dry100.putExtra("50", bilanganPercent);
                    startActivity(dry100);
                    finish();
                }

                else if (chbBurn01.isChecked() && chbBurn05.isChecked() || chbBurn05.isChecked() || chbBurn06.isChecked() || chbBurn07.isChecked() || chbBurn08.isChecked())
                {

                    String bilanganPercent = "Conjunctivitis100";

                    Intent dry100 = new Intent(BurningActivity.this, ResultActivity.class);
                    dry100.putExtra("50", bilanganPercent);
                    startActivity(dry100);
                    finish();

                }

            }
        });



    }
}