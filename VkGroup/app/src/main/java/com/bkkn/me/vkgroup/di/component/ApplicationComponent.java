package com.bkkn.me.vkgroup.di.component;

import com.bkkn.me.vkgroup.MainActivity;
import com.bkkn.me.vkgroup.di.module.ApplicationModule;
import com.bkkn.me.vkgroup.di.module.ManagerModule;
import com.bkkn.me.vkgroup.di.module.RestModule;
import com.bkkn.me.vkgroup.ui.activity.BaseActivity;
import com.bkkn.me.vkgroup.ui.fragment.NewsFeedFragment;
import com.bkkn.me.vkgroup.ui.holder.NewsItemBodyHolder;
import com.bkkn.me.vkgroup.ui.holder.NewsItemFooterHolder;

import javax.inject.Singleton;

import dagger.Component;

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

    //holders
    void inject(NewsItemBodyHolder holder);
    void inject(NewsItemFooterHolder holder);
}
