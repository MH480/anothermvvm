package com.sanwix.mh.anothermvvm.data.orms.vModels;

import android.util.Log;

import com.sanwix.mh.anothermvvm.data.orms.models.Person;
import com.sanwix.mh.anothermvvm.viewModels.actions.IPersonActions;

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

    public static class Builder
    {
        PersonModel model;

        public Builder()
        {
            model = new PersonModel();
        }

        public PersonModel build()
        {
            return model;
        }

        public Builder setName(String name)
        {
            model.name = name;
            return this;
        }

        public Builder setEmail(String email)
        {
            model.email = email;
            return this;
        }

        public Builder setPhone(String phone)
        {
            model.phone = phone;
            return this;
        }

        public Builder setActivate(boolean activated)
        {
            model.isActive = activated;
            return this;
        }
    }
}
