package com.example.cylonz.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Cylonz on 25/7/2559.
 */

public class MyTestService extends IntentService {

    public MyTestService() {
        super("testservice");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
       for(int i=0;i<100;i++) {
           try {
               Thread.sleep(1000);
               Log.d("test", String.valueOf(i));
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

       }
    }
}
