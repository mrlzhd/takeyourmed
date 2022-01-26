package com.example.takeyourmed.ui.profile;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.takeyourmed.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class ProfileFragment extends Fragment {

    private ProfileViewModel profileViewModel;
    private EditText etProfileUsername;
    private EditText etProfileEmail;
    private EditText etProfilePhone;
    private DatabaseReference parentdb;
    private FirebaseAuth mAuth;
    private Button btnUpdateProfile;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profileViewModel =
                new ViewModelProvider(this).get(ProfileViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profile,container, false);


        etProfileUsername = root.findViewById(R.id.et_profileUsername);
        etProfileEmail = root.findViewById(R.id.et_profileEmail);
        etProfilePhone = root.findViewById(R.id.et_profilePhone);
        btnUpdateProfile = root.findViewById(R.id.btn_updateProfile);


//        final String userId = mAuth.getUid();

//        LoggedInUser userDetail = snapshot.getValue(LoggedInUser.class);
//        String name = userDetail.getUserId();

        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        String finalUser = firebaseUser.getUid();

//        String childname= mAuth.getUid();


        parentdb = FirebaseDatabase.getInstance().getReference(finalUser);
        parentdb.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                String newUsername = snapshot.child("username").getValue().toString();
                String newUsermail = snapshot.child("email").getValue().toString();
                String newPhone = snapshot.child("phone").getValue().toString();


                etProfileUsername.setText(newUsername);
                etProfileEmail.setText(newUsermail);
                etProfilePhone.setText(newPhone);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        btnUpdateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceed();
            }
        });


        return root;


    }

    private void proceed() {

        String lastUsername = etProfileUsername.getText().toString();
        String lastEmail = etProfileEmail.getText().toString();
        String lastPhone = etProfilePhone.getText().toString();


        if (TextUtils.isEmpty(lastUsername))
        {

            Toast.makeText(getContext(), "Please fill in your username", Toast.LENGTH_SHORT).show();

        }

        if (TextUtils.isEmpty(lastEmail))
        {

            Toast.makeText(getContext(), "Please fill in your Email", Toast.LENGTH_SHORT).show();

        }

        if (TextUtils.isEmpty(lastPhone))
        {

            Toast.makeText(getContext(), "Please fill in your phone number", Toast.LENGTH_SHORT).show();

        }

        else
        {
            allowToChange(lastUsername, lastEmail, lastPhone);
        }
    }

    private void allowToChange(String lastUsername, String lastEmail, String lastPhone) {

        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        String finalUser = firebaseUser.getUid();

        final DatabaseReference finalreff;
        finalreff = FirebaseDatabase.getInstance().getReference();

        finalreff.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                if (snapshot.child(finalUser).exists())
                {
                    HashMap <String, Object> userdatamap = new HashMap<>();
                    userdatamap.put("username", lastUsername);
                    userdatamap.put("email", lastEmail);
                    userdatamap.put("phone", lastPhone);

                    finalreff.child(finalUser).updateChildren(userdatamap)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    if (task.isSuccessful())
                                    {
                                        Toast.makeText(getContext(), "Profile Updated", Toast.LENGTH_SHORT).show();
                                    }

                                    else
                                    {
                                        Toast.makeText(getContext(), "Check your connection", Toast.LENGTH_SHORT).show();
                                    }

                                }
                            });
                }

                else
                {
                    Toast.makeText(getContext(), "Session invalid! Please contact developer", Toast.LENGTH_SHORT).show();
                }



            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}