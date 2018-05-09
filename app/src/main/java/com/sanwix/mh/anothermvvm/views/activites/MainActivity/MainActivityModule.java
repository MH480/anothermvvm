package com.sanwix.mh.anothermvvm.views.activites.MainActivity;

import com.sanwix.mh.anothermvvm.utils.App;
import com.sanwix.mh.anothermvvm.viewModels.MainActivityVM;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule
{
    @Inject
    App app;
    @Provides
    MainActivityVM getMainViewModel()
    {
        return new MainActivityVM(app);
    }

}
