package com.example.takeyourmed.ui.eyedisease;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.takeyourmed.R;
import com.example.takeyourmed.data.model.DataGetFirebase;
import com.example.takeyourmed.data.model.FirebaseViewHolder;
import com.example.takeyourmed.data.model.Prevalent;
import com.example.takeyourmed.ui.doctor.DoctorActivity;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<DataGetFirebase> arrayList;
    private FirebaseRecyclerOptions<DataGetFirebase> options;
    private FirebaseRecyclerAdapter<DataGetFirebase, FirebaseViewHolder> adapter;
    private DatabaseReference databaseReference;
    String dbname = "DiseaseResult";
    //String user = Prevalent.currentOnlineUser.getUsername();

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
        setContentView(R.layout.activity_result);

        recyclerView = findViewById(R.id.rc_resultList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(null);

        String doubleVision01 = getIntent().getStringExtra("50");
        String doubleVision02 = getIntent().getStringExtra("75");






        arrayList = new ArrayList<DataGetFirebase>();
        databaseReference = FirebaseDatabase.getInstance().getReference().child(dbname).child(doubleVision01);
        databaseReference.keepSynced(true);

        options = new FirebaseRecyclerOptions.Builder<DataGetFirebase>().setQuery(databaseReference, DataGetFirebase.class).build();

        adapter = new FirebaseRecyclerAdapter<DataGetFirebase, FirebaseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull FirebaseViewHolder holder, int position, @NonNull DataGetFirebase model) {

                holder.tv_resultName.setText("Disease Name: "+model.getDiseaseName());
                holder.tv_resultPercent.setText("Percentage: "+model.getDiseasePercent());
                holder.tv_resultPercent.setVisibility(View.INVISIBLE);

            }

            @NonNull
            @Override
            public FirebaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new FirebaseViewHolder(LayoutInflater.from(ResultActivity.this).inflate(R.layout.result_row, parent, false));
            }
        };
        recyclerView.setAdapter(adapter);


    }
}