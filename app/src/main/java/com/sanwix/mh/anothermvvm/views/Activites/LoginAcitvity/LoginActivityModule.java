package com.sanwix.mh.anothermvvm.views.Activites.LoginAcitvity;

import com.sanwix.mh.anothermvvm.utils.App;
import com.sanwix.mh.anothermvvm.viewModels.LoginActivityVM;
import com.sanwix.mh.anothermvvm.viewModels.MainActivityVM;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule
{
    @Inject App app;
    @Provides
    LoginActivityVM getLoginViewModel()
    {
        return new LoginActivityVM(app);
    }

}
