package com.dunn.instrument.alarms;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;


public class TestAlarmsService extends Service {
    final static String TAG = "Alarms_TestAlarmsService";
    @SuppressLint("LongLogTag")
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG,"oncrete");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Log.i(TAG,"onStartCommand");
        Toast.makeText(this,"服务已启动",Toast.LENGTH_LONG).show();
        return START_NOT_STICKY;
    }

//    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
