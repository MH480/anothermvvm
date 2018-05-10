package com.sanwix.mh.anothermvvm;

import android.app.Activity;
import android.app.Application;

import com.androidnetworking.AndroidNetworking;
import com.jacksonandroidnetworking.JacksonParserFactory;
import com.sanwix.mh.anothermvvm.di.Component.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class App extends Application implements HasActivityInjector
{

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate()
    {
        super.onCreate();
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .Inject(this);

        AndroidNetworking.initialize(this);
        AndroidNetworking.setParserFactory(new JacksonParserFactory());
    }

    @Override
    public AndroidInjector<Activity> activityInjector()
    {
        return activityDispatchingAndroidInjector;
    }


}
