package com.sanwix.mh.anothermvvm.views.activites.LoginAcitvity;

import android.content.Context;

import com.sanwix.mh.anothermvvm.App;
import com.sanwix.mh.anothermvvm.viewModels.LoginActivityVM;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule
{
    @Provides
    public LoginActivityVM getLoginViewModel(Context context)
    {
        return new LoginActivityVM(((App) context));
    }

}
