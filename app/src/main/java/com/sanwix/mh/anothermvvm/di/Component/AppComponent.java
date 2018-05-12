package com.sanwix.mh.anothermvvm.di.Component;

import android.app.Application;

import com.sanwix.mh.anothermvvm.App;
import com.sanwix.mh.anothermvvm.di.Builder.ActivityBuilder;
import com.sanwix.mh.anothermvvm.di.Module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent
{
    void Inject(App app);

    @Component.Builder
    interface Builder
    {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
