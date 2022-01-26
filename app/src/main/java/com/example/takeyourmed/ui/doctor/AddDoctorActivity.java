package com.example.takeyourmed.ui.doctor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.takeyourmed.R;
import com.example.takeyourmed.data.model.Prevalent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class AddDoctorActivity extends AppCompatActivity {

    private EditText et_drNameSubmit, et_drPhoneSubmit, et_drMailSubmit;
    private Button btn_drInfoSubmit;

    String parentDbName = "Doctor List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_doctor);

        getSupportActionBar().setTitle("Add Doctor");

        et_drNameSubmit = findViewById(R.id.et_drNameSubmit);
        et_drPhoneSubmit = findViewById(R.id.et_drPhoneSubmit);
        et_drMailSubmit = findViewById(R.id.et_drMailSubmit);
        btn_drInfoSubmit = findViewById(R.id.btn_drInfoSubmit);


        btn_drInfoSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verifyData();
            }
        });
    }

    private void verifyData() {

        String drName = et_drNameSubmit.getText().toString();
        String drPhone = et_drPhoneSubmit.getText().toString();
        String drMail = et_drMailSubmit.getText().toString();


        if (TextUtils.isEmpty(drName))
        {
            Toast.makeText(AddDoctorActivity.this, " Please fill in Dr Name", Toast.LENGTH_SHORT).show();

        }
        if (TextUtils.isEmpty(drPhone))
        {
            Toast.makeText(AddDoctorActivity.this, " Please fill in Dr Name", Toast.LENGTH_SHORT).show();

        }
        else
        {
            submitInfo(drName, drPhone, drMail);
        }

    }

    private void submitInfo(String drName, String drPhone, String drMail) {

        final DatabaseReference rootref;
        rootref = FirebaseDatabase.getInstance().getReference();

        String user = Prevalent.currentOnlineUser.getUsername();

        rootref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (!(snapshot).child(parentDbName).child(user).child(drName).exists())
                {

                    HashMap<String, Object> userDataMap= new HashMap<>();
                    userDataMap.put("DocName", drName);
                    userDataMap.put("DocPhone", drPhone);
                    userDataMap.put("DocMail", drMail);

                    rootref.child(parentDbName).child(user).child(drName).updateChildren(userDataMap)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    if (task.isSuccessful())
                                    {
                                        Toast.makeText(AddDoctorActivity.this, "Data successfully upload", Toast.LENGTH_SHORT).show();

                                        Intent gotoMain = new Intent(AddDoctorActivity.this, DoctorActivity.class);
                                        startActivity(gotoMain);
                                        finish();
                                    }

                                    else
                                    {
                                        Toast.makeText(AddDoctorActivity.this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
                                    }



                                }
                            });



                }
                else
                {
                    Toast.makeText(AddDoctorActivity.this, ""+drName+" already exist in your contact", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}