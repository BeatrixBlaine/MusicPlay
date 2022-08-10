package com.uas.icad;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class ApplicationClass extends Application {
    public static final String CHANNEL_ID_1 = "channel1";
    public static final String CHANNEL_ID_2 = "channel2";

    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
        
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel1 = new NotificationChannel(CHANNEL_ID_1,"channel(1)", NotificationManager.IMPORTANCE_HIGH);
            channel1.setDescription("Channel 1 ....");

            NotificationChannel channel2 = new NotificationChannel(CHANNEL_ID_2,"channel(2)", NotificationManager.IMPORTANCE_HIGH);
            channel1.setDescription("Channel 2 ....");
            NotificationManager notificationManager =
                    getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel1);
            notificationManager.createNotificationChannel(channel2);
        }
    }
}
