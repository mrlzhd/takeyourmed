package com.example.takeyourmed.ui.eyedisease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.takeyourmed.R;

public class InformationActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spn_diseaseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        spn_diseaseList = findViewById(R.id.spn_diseaseList);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.diseaseList, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn_diseaseList.setAdapter(adapter);
        spn_diseaseList.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        if (adapterView.getItemAtPosition(i).equals("Conjunctivity"))
        {
            Intent gotoCat = new Intent(InformationActivity.this, ConjunctivityActivity.class);
            startActivity(gotoCat);
            finish();
        }

        if (adapterView.getItemAtPosition(i).equals("Presbiopia"))
        {
            Intent gotoPres = new Intent(InformationActivity.this, PresbiopiaActivity.class);
            startActivity(gotoPres);
            finish();
        }

        if (adapterView.getItemAtPosition(i).equals("Episkleritis"))
        {
            Intent gotoEpis = new Intent(InformationActivity.this, EpiskleritisActivity.class);
            startActivity(gotoEpis);
            finish();
        }

        if (adapterView.getItemAtPosition(i).equals("Keratitis"))
        {
            Intent gotoKerat = new Intent(InformationActivity.this, KeratitisActivity.class);
            startActivity(gotoKerat);
            finish();
        }

        if (adapterView.getItemAtPosition(i).equals("Skleritis"))
        {
            Intent gotoSkle = new Intent(InformationActivity.this, SkleritisActivity.class);
            startActivity(gotoSkle);
            finish();
        }

        if (adapterView.getItemAtPosition(i).equals("Uveitis"))
        {
            Intent gotoUvei = new Intent(InformationActivity.this, UveitisActivity.class);
            startActivity(gotoUvei);
            finish();
        }

        if (adapterView.getItemAtPosition(i).equals("Hordeolum"))
        {
            Intent gotoHord = new Intent(InformationActivity.this, HordeolumActivity.class);
            startActivity(gotoHord);
            finish();
        }





    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}