package com.sanwix.mh.anothermvvm.views.Activites.LoginAcitvity;


import com.sanwix.mh.anothermvvm.commands.ICommand;

public class LoginInvoker
{
    ICommand Ilogin;
    public LoginInvoker(ICommand cmd)
    {
        Ilogin  = cmd;
    }

    public void Login()
    {
        Ilogin.execute();
    }

    public void Logout()
    {
        Ilogin.unExecute();
    }
}
