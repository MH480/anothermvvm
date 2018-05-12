package com.sanwix.mh.anothermvvm.viewModels;

import android.arch.lifecycle.ViewModel;

public abstract class ItemViewModel<T> extends ViewModel
{
    public ItemViewModel()
    {
        super();
    }

    public abstract void setItem(T item);
}
