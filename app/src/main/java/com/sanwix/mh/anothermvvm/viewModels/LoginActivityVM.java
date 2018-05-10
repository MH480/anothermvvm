package com.sanwix.mh.anothermvvm.viewModels;

import com.sanwix.mh.anothermvvm.commands.ICommand;
import com.sanwix.mh.anothermvvm.utils.App;
import com.sanwix.mh.anothermvvm.views.activites.LoginAcitvity.ILoginNavigator;


public class LoginActivityVM extends BaseViewModel<ILoginNavigator>
{

    public LoginActivityVM(App app)
    {
        super(app);
    }

    public void Login(ICommand cmd)
    {
        cmd.execute();
    }

}
