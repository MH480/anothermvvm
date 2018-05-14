package com.sanwix.mh.anothermvvm.views.activites.ListActivity;

import android.content.Context;

import com.sanwix.mh.anothermvvm.App;
import com.sanwix.mh.anothermvvm.data.apis.DataSender;
import com.sanwix.mh.anothermvvm.viewModels.PersonListActivityVM;

import dagger.Module;
import dagger.Provides;

@Module
public class PersonListActivityModule
{

    @Provides
    public PersonListActivityVM getListViewModel(Context context, DataSender repo)
    {
        return new PersonListActivityVM(((App) context), repo);
    }
}
