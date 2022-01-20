package com.example.takeyourmed.ui.home;

import android.Manifest;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.takeyourmed.R;
import com.example.takeyourmed.ui.camera.CaptureCameraActivity;
import com.example.takeyourmed.ui.doctor.DoctorActivity;
import com.example.takeyourmed.ui.eyedisease.EyeDiseaseActivity;
import com.example.takeyourmed.ui.reminder.ReminderActivity;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import butterknife.ButterKnife;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private Uri imageUri;


    ImageView img_preview;
    private static final int MY_CAMERA_REQUEST_CODE = 7171;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        View cam = inflater.inflate(R.layout.activity_capture_camera, container, false);

        GridLayout mainGrid = (GridLayout)root.findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
//        setToggleEvents(mainGrid);

//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }

    private void setToggleEvents(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++){
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(getActivity().getApplicationContext(), "true", Toast.LENGTH_SHORT).show();

                    }
                    else {
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(getActivity().getApplicationContext(), "False", Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++){
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if( finalI == 0){
                        Intent ReminderIntent = new Intent(getActivity().getApplicationContext(), ReminderActivity.class);
                        startActivity(ReminderIntent);
                    }
                    else if (finalI == 1) {
                        Intent DoctorIntent = new Intent(getActivity().getApplicationContext(), DoctorActivity.class);
                        startActivity(DoctorIntent);
                    }
                    else if (finalI == 2) {
                        Intent EyeDiseaseIntent = new Intent(getActivity().getApplicationContext(), EyeDiseaseActivity.class);
                        startActivity(EyeDiseaseIntent);
                    }
                    else if (finalI == 3) {
                        Intent cameraIntent = new Intent(getActivity().getApplicationContext(), CaptureCameraActivity.class);
                        startActivity(cameraIntent);

//                        bukakcamera();

                    }
                    else if (finalI == 4) {
                        //Toast.makeText(getActivity().getApplicationContext(), "Share Picture Action", Toast.LENGTH_SHORT).show();

                        Intent img = new Intent(getContext(), OpenGalleryActivity.class);
//                        img.setAction(android.content.Intent.ACTION_VIEW);
//                        img.setType("image/*");
//                        img.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(img);
                        startActivity(img);
                    }
                    else if (finalI == 5) {
                        Toast.makeText(getActivity().getApplicationContext(), "Share Log Action", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void bukakcamera() {


        Dexter.withContext(getContext())
                .withPermissions(Arrays.asList(
                        Manifest.permission.CAMERA,
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                ))
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                        if (multiplePermissionsReport.areAllPermissionsGranted()){
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MediaStore.Images.Media.TITLE, "New Picture");
                            contentValues.put(MediaStore.Images.Media.DESCRIPTION,"FROM YOUR camera");
                            imageUri = getActivity().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,contentValues);
                            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                            intent.putExtra(MediaStore.EXTRA_OUTPUT,imageUri);
                            startActivityForResult(intent,MY_CAMERA_REQUEST_CODE);
                        }
                        else {
                            Toast.makeText(getContext(),"You must accept all permission", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) { }
                }).check();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == MY_CAMERA_REQUEST_CODE)
        {
            if(resultCode == Activity.RESULT_OK)
            {
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(),imageUri);
                    img_preview.setImageBitmap(bitmap);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //setContentView(R.layout.activity_capture_camera );

        ButterKnife.bind(getActivity());
    }
}