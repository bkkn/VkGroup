package com.bkkn.me.vkgroup.di.module;

import com.bkkn.me.vkgroup.rest.RestClient;
import com.bkkn.me.vkgroup.rest.api.WallApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sergey on 02.09.2017.
 */

@Module
public class RestModule {
    private RestClient mRestClient;


    public RestModule() {
        mRestClient = new RestClient();
    }


    @Provides
    @Singleton
    public RestClient provideRestClient() {
        return mRestClient;
    }

    @Provides

    @Singleton

    public WallApi provideWallApi() {

        return mRestClient.createService(WallApi.class);

    }
}