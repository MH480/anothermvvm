package com.sanwix.mh.anothermvvm.viewModels;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.sanwix.mh.anothermvvm.Adapters.BaseRecyclerAdapter;
import com.sanwix.mh.anothermvvm.Adapters.PeopleListAdapter;
import com.sanwix.mh.anothermvvm.viewModels.baseVMs.BaseRv_ViewModel;

public class PersonRecyclerVM extends BaseRv_ViewModel
{
    PeopleListAdapter adapter;

    public PersonRecyclerVM(@NonNull Application application)
    {
        super(application);
        adapter = new PeopleListAdapter();
    }

    @Override
    protected BaseRecyclerAdapter getAdapter()
    {
        return adapter;
    }

    @Override
    protected RecyclerView.LayoutManager getLayoutManager(LayoutManagerAttributeBuilder data)
    {
        switch (data.getType())
        {
            case Linear:
                layoutManager = new LinearLayoutManager(getApplication(), data.isVertically() ? LinearLayoutManager.VERTICAL : LinearLayoutManager.HORIZONTAL, data.isReverseLayout());
                break;
            case Grid:
                layoutManager = new GridLayoutManager(getApplication(), data.getColumnCount(), data.isVertically() ? GridLayoutManager.VERTICAL : GridLayoutManager.HORIZONTAL, data.isReverseLayout());
                break;
            case Staggered:
                layoutManager = new StaggeredGridLayoutManager(data.getColumnCount(), data.isVertically() ? StaggeredGridLayoutManager.VERTICAL : StaggeredGridLayoutManager.HORIZONTAL);
                break;
        }
        return layoutManager;
    }

}
