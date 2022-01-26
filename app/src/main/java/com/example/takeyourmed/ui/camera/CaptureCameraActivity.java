package com.example.takeyourmed.ui.camera;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.takeyourmed.R;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CaptureCameraActivity extends AppCompatActivity {
    private static final int MY_CAMERA_REQUEST_CODE = 7171;
    @BindView(R.id.btn_camera)
    ImageView btn_camera;
    @BindView(R.id.img_preview)
    ImageView img_preview;



    Button btn_saveImage;

    private Uri imageUri;

    @OnClick(R.id.btn_camera)
    void onCaptureImageClick(){
        Dexter.withContext(this)
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
                            imageUri = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,contentValues);
                            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                            intent.putExtra(MediaStore.EXTRA_OUTPUT,imageUri);
                            startActivityForResult(intent,MY_CAMERA_REQUEST_CODE);
                        }
                        else {
                            Toast.makeText(CaptureCameraActivity.this,"You must accept all permission", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) { }
                }).check();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == MY_CAMERA_REQUEST_CODE)
        {
            if(resultCode == Activity.RESULT_OK)
            {
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),imageUri);
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
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture_camera );
        ButterKnife.bind(this);

        getSupportActionBar().setTitle("Camera");
//        ActivityCompat.requestPermissions(CaptureCameraActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
//        ActivityCompat.requestPermissions(CaptureCameraActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
//
//        btn_saveImage = findViewById(R.id.btn_saveImage);
//
//        btn_saveImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                saveToGallery();
//            }
//        });
    }

//    private void saveToGallery() {
//
//        BitmapDrawable bitmapDrawable = (BitmapDrawable) img_preview.getDrawable();
//        Bitmap bitmap = bitmapDrawable.getBitmap();
//
//        FileOutputStream outputStream = null;
//        File file = Environment.getExternalStorageDirectory();
//        File dir = new File(file.getAbsoluteFile() + "/");
//        dir.mkdirs();
//
//
//        String filename = String.format("%d.png", System.currentTimeMillis());
//        File outFile = new File(dir, filename);
//
//        try {
//            outputStream = new FileOutputStream(outFile);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
//        try {
//            outputStream.flush();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            outputStream.close();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }
}