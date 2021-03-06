package com.example.takeyourmed.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.takeyourmed.data.DatabaseHelper;
import com.example.takeyourmed.data.model.Alarm;

import java.util.List;
import java.util.concurrent.Executors;

import static android.content.Intent.ACTION_BOOT_COMPLETED;
import static com.example.takeyourmed.service.AlarmReceiver.setReminderAlarms;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Executors.newSingleThreadExecutor().execute(() -> {
                final List<Alarm> alarms = DatabaseHelper.getInstance(context).getAlarms();
                setReminderAlarms(context, alarms);
            });
        }
    }

}
