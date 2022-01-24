package com.example.takeyourmed.ui.eyedisease.Symptom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.takeyourmed.R;
import com.example.takeyourmed.ui.eyedisease.ResultActivity;

public class DoubleVisionActivity extends AppCompatActivity {

    TextView  tv_double01, tv_double02, tv_double03, tv_double04, tv_double05;
    CheckBox chb_double01, chb_double02, chb_double03, chb_double04, chb_double05;
    CardView crd_double01, crd_double02, crd_double03, crd_double04, crd_double05;
    Button btn_doubleReset, btn_doubleSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_vision);

        tv_double01 = findViewById(R.id.tv_double01);
        tv_double02 = findViewById(R.id.tv_double02);
        tv_double03 = findViewById(R.id.tv_double03);
        tv_double04 = findViewById(R.id.tv_double04);
        tv_double05 = findViewById(R.id.tv_double05);

        chb_double01 = findViewById(R.id.chb_double01);
        chb_double02 = findViewById(R.id.chb_double02);
        chb_double03 = findViewById(R.id.chb_double03);
        chb_double04 = findViewById(R.id.chb_double04);
        chb_double05 = findViewById(R.id.chb_double05);

        crd_double01 = findViewById(R.id.crd_double01);
        crd_double02 = findViewById(R.id.crd_double02);
        crd_double03 = findViewById(R.id.crd_double03);
        crd_double04 = findViewById(R.id.crd_double04);
        crd_double05 = findViewById(R.id.crd_double05);

        btn_doubleReset = findViewById(R.id.btn_doubleReset);
        btn_doubleSubmit = findViewById(R.id.btn_doubleSubmit);


//        if (chb_double01.isChecked() || chb_double02.isChecked() || chb_double03.isChecked())
//        {
//
//            tv_double04.setVisibility(View.INVISIBLE);
//            tv_double05.setVisibility(View.INVISIBLE);
//
//            chb_double04.setVisibility(View.INVISIBLE);
//            chb_double05.setVisibility(View.INVISIBLE);
//
//            crd_double04.setVisibility(View.INVISIBLE);
//            crd_double05.setVisibility(View.INVISIBLE);
//
//        }

       chb_double01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

               if (compoundButton.isChecked())
               {
                   tv_double04.setVisibility(View.INVISIBLE);
                   tv_double05.setVisibility(View.INVISIBLE);

                   chb_double04.setVisibility(View.INVISIBLE);
                   chb_double05.setVisibility(View.INVISIBLE);

                   crd_double04.setVisibility(View.INVISIBLE);
                   crd_double05.setVisibility(View.INVISIBLE);
               }

           }
       });

       chb_double02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

               if (compoundButton.isChecked())
               {
                   tv_double04.setVisibility(View.INVISIBLE);
                   tv_double05.setVisibility(View.INVISIBLE);

                   chb_double04.setVisibility(View.INVISIBLE);
                   chb_double05.setVisibility(View.INVISIBLE);

                   crd_double04.setVisibility(View.INVISIBLE);
                   crd_double05.setVisibility(View.INVISIBLE);
               }

           }
       });

       chb_double03.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
               if (compoundButton.isChecked())
               {
                   tv_double04.setVisibility(View.INVISIBLE);
                   tv_double05.setVisibility(View.INVISIBLE);

                   chb_double04.setVisibility(View.INVISIBLE);
                   chb_double05.setVisibility(View.INVISIBLE);

                   crd_double04.setVisibility(View.INVISIBLE);
                   crd_double05.setVisibility(View.INVISIBLE);
               }
           }
       });

        chb_double04.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked())
                {
                    tv_double01.setVisibility(View.INVISIBLE);
                    tv_double02.setVisibility(View.INVISIBLE);
                    tv_double03.setVisibility(View.INVISIBLE);

                    chb_double01.setVisibility(View.INVISIBLE);
                    chb_double02.setVisibility(View.INVISIBLE);
                    chb_double03.setVisibility(View.INVISIBLE);

                    crd_double01.setVisibility(View.INVISIBLE);
                    crd_double02.setVisibility(View.INVISIBLE);
                    crd_double03.setVisibility(View.INVISIBLE);

                }
            }
        });

        chb_double05.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked())
                {
                    tv_double01.setVisibility(View.INVISIBLE);
                    tv_double02.setVisibility(View.INVISIBLE);
                    tv_double03.setVisibility(View.INVISIBLE);

                    chb_double01.setVisibility(View.INVISIBLE);
                    chb_double02.setVisibility(View.INVISIBLE);
                    chb_double03.setVisibility(View.INVISIBLE);

                    crd_double01.setVisibility(View.INVISIBLE);
                    crd_double02.setVisibility(View.INVISIBLE);
                    crd_double03.setVisibility(View.INVISIBLE);

                }
            }
        });

        btn_doubleReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                tv_double01.setVisibility(View.VISIBLE);
                tv_double02.setVisibility(View.VISIBLE);
                tv_double03.setVisibility(View.VISIBLE);
                tv_double04.setVisibility(View.VISIBLE);
                tv_double05.setVisibility(View.VISIBLE);

                chb_double01.setVisibility(View.VISIBLE);
                chb_double01.setChecked(false);
                chb_double02.setVisibility(View.VISIBLE);
                chb_double02.setChecked(false);
                chb_double03.setVisibility(View.VISIBLE);
                chb_double03.setChecked(false);
                chb_double04.setVisibility(View.VISIBLE);
                chb_double04.setChecked(false);
                chb_double05.setVisibility(View.VISIBLE);
                chb_double05.setChecked(false);

                crd_double01.setVisibility(View.VISIBLE);
                crd_double02.setVisibility(View.VISIBLE);
                crd_double03.setVisibility(View.VISIBLE);
                crd_double04.setVisibility(View.VISIBLE);
                crd_double05.setVisibility(View.VISIBLE);


            }
        });

        btn_doubleSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (chb_double01.isChecked() && chb_double02.isChecked() && chb_double03.isChecked())
                {
                    String bilanganPercent = "Cataract100";

                    Intent limaPuluh = new Intent(DoubleVisionActivity.this, ResultActivity.class);
                    limaPuluh.putExtra("50", bilanganPercent);
                    startActivity(limaPuluh);
                    finish();
                }


                else if (chb_double01.isChecked() && !chb_double02.isChecked() && !chb_double03.isChecked())
                {
                    String bilanganPercent = "Cataract50";

                    Intent limasatu = new Intent(DoubleVisionActivity.this, ResultActivity.class);
                    limasatu.putExtra("50", bilanganPercent);
                    startActivity(limasatu);
                    finish();
                }

                else if (chb_double02.isChecked() && !chb_double01.isChecked() && !chb_double03.isChecked())
                {
                    String bilanganPercent = "Cataract50";

                    Intent limadua = new Intent(DoubleVisionActivity.this, ResultActivity.class);
                    limadua.putExtra("50", bilanganPercent);
                    startActivity(limadua);
                    finish();
                }



                else if (chb_double01.isChecked() || chb_double02.isChecked() || chb_double03.isChecked())
                {
                    String bilanganPercent = "Cataract75";

                    Intent limatempat = new Intent(DoubleVisionActivity.this, ResultActivity.class);
                    limatempat.putExtra("50", bilanganPercent);
                    startActivity(limatempat);
                    finish();
                }

                else if (chb_double04.isChecked() && chb_double05.isChecked())
                {
                    String bilanganPercent = "Diabetic100";

                    Intent diabetic100 = new Intent(DoubleVisionActivity.this, ResultActivity.class);
                    diabetic100.putExtra("50", bilanganPercent);
                    startActivity(diabetic100);
                    finish();
                }

                else if (chb_double04.isChecked() || chb_double05.isChecked())
                {
                    String bilanganPercent = "Diabetic50";

                    Intent diabetic50 = new Intent(DoubleVisionActivity.this, ResultActivity.class);
                    diabetic50.putExtra("50", bilanganPercent);
                    startActivity(diabetic50);
                    finish();
                }



            }


        });





    }
}