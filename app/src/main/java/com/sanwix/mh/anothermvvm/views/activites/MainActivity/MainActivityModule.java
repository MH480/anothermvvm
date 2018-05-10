package com.sanwix.mh.anothermvvm.views.activites.MainActivity;

import com.sanwix.mh.anothermvvm.App;
import com.sanwix.mh.anothermvvm.viewModels.MainActivityVM;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule
{
    @Provides
    MainActivityVM getMainViewModel(App app)
    {
        return new MainActivityVM(app);
    }

}
