package com.bkkn.me.vkgroup;

import android.app.Application;

import com.bkkn.me.vkgroup.di.component.ApplicationComponent;
import com.bkkn.me.vkgroup.di.component.DaggerApplicationComponent;
import com.bkkn.me.vkgroup.di.module.ApplicationModule;
import com.vk.sdk.VKSdk;

/**
 * Created by Sergey on 02.09.2017.
 */

public class MyApplication extends Application {

    private static ApplicationComponent sApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initComponent();

        VKSdk.initialize(this);
    }

    private void initComponent() {

        sApplicationComponent = DaggerApplicationComponent.builder()

                .applicationModule(new ApplicationModule(this)).build();

    }

    public static ApplicationComponent getApplicationComponent() {

        return sApplicationComponent;

    }
}
