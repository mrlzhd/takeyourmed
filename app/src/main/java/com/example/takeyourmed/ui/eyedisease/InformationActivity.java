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

        if (adapterView.getItemAtPosition(i).equals("Cataract"))
        {
            Intent gotoCat = new Intent(InformationActivity.this, CataractActivity.class);
            startActivity(gotoCat);
            finish();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}