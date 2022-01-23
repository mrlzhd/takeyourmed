package com.example.takeyourmed.ui.eyedisease.Symptom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.takeyourmed.R;

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



    }
}