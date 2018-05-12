package com.sanwix.mh.anothermvvm.di.Builder;


import com.sanwix.mh.anothermvvm.views.activites.ListActivity.PersonListActivity;
import com.sanwix.mh.anothermvvm.views.activites.ListActivity.PersonListActivityModule;
import com.sanwix.mh.anothermvvm.views.activites.LoginAcitvity.LoginActivity;
import com.sanwix.mh.anothermvvm.views.activites.LoginAcitvity.LoginActivityModule;
import com.sanwix.mh.anothermvvm.views.activites.MainActivity.MainActivity;
import com.sanwix.mh.anothermvvm.views.activites.MainActivity.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder
{
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    public abstract MainActivity mainActivity();
    @ContributesAndroidInjector(modules = {LoginActivityModule.class})
    public abstract LoginActivity loginActivity();

    @ContributesAndroidInjector(modules = {PersonListActivityModule.class})
    public abstract PersonListActivity peronListActivity();
}
