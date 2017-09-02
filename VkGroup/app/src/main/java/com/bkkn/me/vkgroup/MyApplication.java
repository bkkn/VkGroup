package com.bkkn.me.vkgroup;

import android.app.Application;

import com.vk.sdk.VKSdk;

/**
 * Created by Sergey on 02.09.2017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        VKSdk.initialize(this);
    }
}
