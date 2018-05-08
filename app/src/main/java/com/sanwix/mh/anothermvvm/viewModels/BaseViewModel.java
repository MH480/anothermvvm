package com.sanwix.mh.anothermvvm.viewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.content.Context;

import com.sanwix.mh.anothermvvm.utils.App;

import javax.inject.Inject;

public abstract class BaseViewModel extends AndroidViewModel
{

    public BaseViewModel(App app)
    {
        super(app);
    }

    @Override
    protected void onCleared()
    {
        super.onCleared();
    }
}
