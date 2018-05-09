package com.sanwix.mh.anothermvvm.viewModels;

import android.arch.lifecycle.AndroidViewModel;

import com.sanwix.mh.anothermvvm.utils.App;

public abstract class BaseViewModel<N> extends AndroidViewModel
{

    public BaseViewModel(App app)
    {
        super(app);
    }

    protected N Navigator;

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
