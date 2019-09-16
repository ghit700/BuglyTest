package com.xmrbi.buglytest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;


/**
 * Created by wzn on 2019/9/12.
 */
public class MyServices extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MyServices","8978967745");

    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
