package com.example.takeyourmed.data.model;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.takeyourmed.R;

public class FirebaseViewHolder extends RecyclerView.ViewHolder {

    public TextView tv_drNameList, tv_drPhone, tv_drMail, tv_resultName, tv_resultPercent;
    public Button btn_callDr, btn_emailDr;

    public FirebaseViewHolder(@NonNull View itemView) {
        super(itemView);

        tv_drNameList = itemView.findViewById(R.id.tv_drNameList);
        tv_drPhone = itemView.findViewById(R.id.tv_drPhone);
        tv_drMail = itemView.findViewById(R.id.tv_drMail);
        tv_resultName = itemView.findViewById(R.id.tv_resultName);
        tv_resultPercent = itemView.findViewById(R.id.tv_resultPercent);

        btn_callDr = itemView.findViewById(R.id.btn_callDr);
        btn_emailDr = itemView.findViewById(R.id.btn_emailDr);
    }
}
