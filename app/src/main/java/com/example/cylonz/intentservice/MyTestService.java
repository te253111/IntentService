package com.example.cylonz.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Cylonz on 25/7/2559.
 */

public class MyTestService extends IntentService {
    Handler mHandler;
    public MyTestService() {
        super("testservice");
        mHandler = new Handler();
    }
    @Override
    protected void onHandleIntent(Intent intent) {
       for(int i=0;i<100;i++) {
           try {
               Thread.sleep(1000);
               mHandler.post(new DisplayToast(this, "Num"+String.valueOf(i)));
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

       }
    }
}
