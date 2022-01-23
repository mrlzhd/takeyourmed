package com.example.takeyourmed.ui.eyedisease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.takeyourmed.R;

public class TestCodeActivity extends AppCompatActivity {

    Button btn_test01, btn_test02, btn_test03, btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_code);

        btn_test01 = findViewById(R.id.btn_test01);
        btn_test02 = findViewById(R.id.btn_test02);
        btn_test03 = findViewById(R.id.btn_test03);
        btn_reset = findViewById(R.id.btn_reset);

        btn_test01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_test03.setVisibility(View.INVISIBLE);

            }
        });

        btn_test02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_test03.setVisibility(View.INVISIBLE);

            }
        });

        btn_test03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_test01.setVisibility(View.INVISIBLE);
                btn_test02.setVisibility(View.INVISIBLE);

            }
        });


        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_test01.setVisibility(View.VISIBLE);
                btn_test02.setVisibility(View.VISIBLE);
                btn_test03.setVisibility(View.VISIBLE);

            }
        });
    }
}