package com.sanwix.mh.anothermvvm.views.activites.MainActivity;

import android.content.Context;

import com.sanwix.mh.anothermvvm.App;
import com.sanwix.mh.anothermvvm.viewModels.MainActivityVM;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule
{
    @Provides
    public MainActivityVM getMainViewModel(Context context)
    {
        return new MainActivityVM(((App) context));
    }

}
