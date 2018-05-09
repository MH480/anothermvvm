package com.sanwix.mh.anothermvvm.commands;


import com.sanwix.mh.anothermvvm.data.orms.actions.IPersonActions;

public class LoginCommand implements ICommand
{
    IPersonActions person;

    public LoginCommand(IPersonActions person)
    {
        this.person = person;
    }

    @Override
    public void execute()
    {
        if (canExecute())
            person.login();

    }

    @Override
    public boolean canExecute()
    {
        return false;
    }
}
