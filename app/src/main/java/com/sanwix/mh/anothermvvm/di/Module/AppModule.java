package com.sanwix.mh.anothermvvm.di.Module;

import android.app.Application;
import android.content.Context;

import com.sanwix.mh.anothermvvm.App;
import com.sanwix.mh.anothermvvm.data.apis.DataSender;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
@Module
public class AppModule
{
    @Provides
    @Singleton
    Context ProvideContext(Application app)
    {
        return app;
    }

    @Provides
    @Singleton
    App getApp(App app)
    {
        return app;
    }

    @Provides
    EventBus getEventBus(){ return EventBus.getDefault();}

    @Provides
    DataSender getDataSender()
    {
        return new DataSender();
    }

}
