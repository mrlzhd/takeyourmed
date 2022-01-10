package com.example.takeyourmed.ui.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.takeyourmed.R;

public class InfoFragment extends Fragment {

    private InfoViewModel infoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        infoViewModel =
                new ViewModelProvider(this).get(InfoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_info, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        infoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText("info");
            }
        });
        return root;
    }
}