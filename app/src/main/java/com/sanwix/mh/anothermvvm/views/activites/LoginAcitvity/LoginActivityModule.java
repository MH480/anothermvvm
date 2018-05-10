package com.sanwix.mh.anothermvvm.views.activites.LoginAcitvity;

import com.sanwix.mh.anothermvvm.App;
import com.sanwix.mh.anothermvvm.viewModels.LoginActivityVM;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule
{
    @Provides
    LoginActivityVM getLoginViewModel(App app)
    {
        return new LoginActivityVM(app);
    }

}
