package com.sanwix.mh.mh_mvvm.base;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;

public abstract class BaseViewModel<N> extends AndroidViewModel
{
    protected N Navigator;

    public BaseViewModel(Application app)
    {
        super(app);
    }

    public N getNavigator()
    {
        return Navigator;
    }


    public void setNavigator(N navigator)
    {
        Navigator = navigator;
    }


    @Override
    protected void onCleared()
    {
        super.onCleared();
    }
}
