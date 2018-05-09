package com.sanwix.mh.anothermvvm.data.orms.vModels;

import android.util.Log;

import com.sanwix.mh.anothermvvm.data.orms.actions.IPersonActions;
import com.sanwix.mh.anothermvvm.data.orms.models.Person;

import java.util.Locale;

public class PersonModel implements IPersonActions
{
    public String id;
    public boolean isActive;
    public String name;
    public String email;
    public String phone;

    public PersonModel()
    {

    }

    public PersonModel(Person p)
    {
        this.id = p.id;
        this.isActive = p.isActive;
        this.name = p.name;
        this.email = p.email;
        this.phone = p.phone;
    }

    @Override
    public void login()
    {
        Log.i(toString(), String.format(new Locale("fa"), "loging in %s . %s . %s . %s", id, name, email, phone));
    }
}
