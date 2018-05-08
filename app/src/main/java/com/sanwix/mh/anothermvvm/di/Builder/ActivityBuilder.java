package com.sanwix.mh.anothermvvm.di.Builder;


import com.sanwix.mh.anothermvvm.views.Activites.LoginAcitvity.LoginActivity;
import com.sanwix.mh.anothermvvm.views.Activites.LoginAcitvity.LoginActivityModule;
import com.sanwix.mh.anothermvvm.views.Activites.MainActivity.MainActivity;
import com.sanwix.mh.anothermvvm.views.Activites.MainActivity.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder
{
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    public abstract MainActivity mainActivity();
    @ContributesAndroidInjector(modules = {LoginActivityModule.class})
    public abstract LoginActivity loginActivity();
}
