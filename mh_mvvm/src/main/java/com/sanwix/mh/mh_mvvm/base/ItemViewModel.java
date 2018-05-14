package com.sanwix.mh.mh_mvvm.base;

import android.arch.lifecycle.AndroidViewModel;

public abstract class ItemViewModel<T> extends AndroidViewModel
{
    public ItemViewModel()
    {
        super(null);
    }

    public abstract void setItem(T item);
}
