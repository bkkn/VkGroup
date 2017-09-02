package com.bkkn.me.vkgroup.di.component;

import android.app.Application;

import com.bkkn.me.vkgroup.MainActivity;
import com.bkkn.me.vkgroup.di.module.ApplicationModule;
import com.bkkn.me.vkgroup.di.module.ManagerModule;
import com.bkkn.me.vkgroup.di.module.RestModule;
import com.bkkn.me.vkgroup.ui.activity.BaseActivity;
import com.bkkn.me.vkgroup.ui.fragment.NewsFeedFragment;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by Sergey on 02.09.2017.
 */
@Singleton
@Component(modules = {ApplicationModule.class, ManagerModule.class, RestModule.class})
public interface ApplicationComponent {

    //activities
    void inject(BaseActivity activity);
    void inject(MainActivity activity);

    //fragment
    void inject(NewsFeedFragment fragment);
}
