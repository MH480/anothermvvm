package com.sanwix.mh.anothermvvm.utils;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;
import com.jacksonandroidnetworking.JacksonParserFactory;
import com.sanwix.mh.anothermvvm.di.Component.DaggerAppComponent;

public class App extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .Inject(this)
        ;

        AndroidNetworking.initialize(this);
        AndroidNetworking.setParserFactory(new JacksonParserFactory());
    }
}
