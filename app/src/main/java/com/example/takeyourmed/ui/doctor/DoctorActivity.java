package com.example.takeyourmed.ui.doctor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.takeyourmed.R;
import com.example.takeyourmed.data.model.DataGetFirebase;
import com.example.takeyourmed.data.model.FirebaseViewHolder;
import com.example.takeyourmed.data.model.Prevalent;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class DoctorActivity extends AppCompatActivity {

    private TextView tv_drTest;
    private Button btn_addDr;

    private RecyclerView recyclerView;
    private ArrayList<DataGetFirebase> arrayList;
    private FirebaseRecyclerOptions<DataGetFirebase> options;
    private FirebaseRecyclerAdapter<DataGetFirebase, FirebaseViewHolder> adapter;
    private DatabaseReference databaseReference;
    String dbname = "Doctor List";
    String user = Prevalent.currentOnlineUser.getUsername();


    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        btn_addDr = findViewById(R.id.btn_addDr);

        btn_addDr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoAddDr = new Intent(DoctorActivity.this, AddDoctorActivity.class);
                startActivity(gotoAddDr);
            }
        });

        recyclerView = findViewById(R.id.rc_drList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(null);

        arrayList = new ArrayList<DataGetFirebase>();
        databaseReference = FirebaseDatabase.getInstance().getReference().child(dbname).child(user);
        databaseReference.keepSynced(true);

        options = new FirebaseRecyclerOptions.Builder<DataGetFirebase>().setQuery(databaseReference, DataGetFirebase.class).build();

        adapter = new FirebaseRecyclerAdapter<DataGetFirebase, FirebaseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull FirebaseViewHolder holder, int position, @NonNull DataGetFirebase model) {

                holder.tv_drNameList.setText(model.getDocName());
                holder.tv_drPhone.setText(model.getDocPhone());
                holder.tv_drMail.setText(model.getDocMail());

                String phoneNumber = holder.tv_drPhone.getText().toString();
                String emailAdd = holder.tv_drMail.getText().toString();

                holder.btn_callDr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:"+phoneNumber));
                        startActivity(callIntent);

                    }
                });

                holder.btn_emailDr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent email = new Intent(Intent.ACTION_SEND);
                        email.putExtra(Intent.EXTRA_EMAIL, new String[]{ emailAdd});
                        email.putExtra(Intent.EXTRA_SUBJECT, "Eye disease");
                        email.putExtra(Intent.EXTRA_TEXT, "Sent from TakeYourMed Application");

//need this to prompts email client only
                        email.setType("message/rfc822");

                        startActivity(Intent.createChooser(email, "Choose an Email client :"));
                    }
                });

                if (emailAdd.equals(""))
                {
                    holder.btn_emailDr.setVisibility(View.INVISIBLE);
                }
                else
                {
                    holder.btn_emailDr.setVisibility(View.VISIBLE);
                }


            }

            @NonNull
            @Override
            public FirebaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new FirebaseViewHolder(LayoutInflater.from(DoctorActivity.this).inflate(R.layout.dr_row, parent, false));
            }
        };

        recyclerView.setAdapter(adapter);


    }
}