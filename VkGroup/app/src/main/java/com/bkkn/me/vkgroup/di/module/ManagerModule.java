package com.bkkn.me.vkgroup.di.module;

import com.bkkn.me.vkgroup.common.manager.MyFragmentManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sergey on 02.09.2017.
 */


@Module
public class ManagerModule {
    @Provides
    @Singleton
    MyFragmentManager provideMyFragmentManager() {
        return new MyFragmentManager();
    }
}