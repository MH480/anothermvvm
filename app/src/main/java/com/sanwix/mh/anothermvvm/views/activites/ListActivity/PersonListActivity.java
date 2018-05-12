package com.sanwix.mh.anothermvvm.views.activites.ListActivity;

import com.sanwix.mh.anothermvvm.R;
import com.sanwix.mh.anothermvvm.data.Event;
import com.sanwix.mh.anothermvvm.viewModels.BaseViewModel;
import com.sanwix.mh.anothermvvm.viewModels.PersonListActivityVM;
import com.sanwix.mh.anothermvvm.views.bases.BaseActivity;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

public class PersonListActivity extends BaseActivity
{
    @Inject
    PersonListActivityVM viewModel;

    @Override
    public int getBindingVarriables()
    {
        return 0;
    }

    @Override
    public int getLayoutId()
    {
        return R.layout.activity_list;
    }

    @Override
    public BaseViewModel getViewModel()
    {
        return null;
    }

    @Override
    public EventBus getEventBus()
    {
        return null;
    }

    @Override
    public void onEvent(Event e)
    {

    }
}
