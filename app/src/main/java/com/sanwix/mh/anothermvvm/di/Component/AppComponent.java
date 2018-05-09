package com.sanwix.mh.anothermvvm.di.Component;

import android.app.Application;

import com.sanwix.mh.anothermvvm.di.Builder.ActivityBuilder;
import com.sanwix.mh.anothermvvm.di.Module.AppModule;
import com.sanwix.mh.anothermvvm.utils.App;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {AppModule.class,ActivityBuilder.class})
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
