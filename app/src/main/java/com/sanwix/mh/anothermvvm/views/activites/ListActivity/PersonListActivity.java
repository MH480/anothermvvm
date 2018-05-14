package com.sanwix.mh.anothermvvm.views.activites.ListActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.android.databinding.library.baseAdapters.BR;
import com.sanwix.mh.anothermvvm.R;
import com.sanwix.mh.anothermvvm.data.Event;
import com.sanwix.mh.anothermvvm.databinding.ActivityListBinding;
import com.sanwix.mh.anothermvvm.viewModels.PersonListActivityVM;
import com.sanwix.mh.anothermvvm.views.bases.BaseActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import javax.inject.Inject;

public class PersonListActivity extends BaseActivity<ActivityListBinding, PersonListActivityVM> implements IPersonListNavigator
{
    @Inject
    PersonListActivityVM viewModel;
    @Inject
    EventBus eventBus;


    private ActivityListBinding viewData;

    public static Intent newIntent(BaseActivity base)
    {
        return new Intent(base, PersonListActivity.class);
    }

    @Override
    public int getLayoutId()
    {
        return R.layout.activity_list;
    }

    @Override
    public int getBindingVarriables()
    {
        return BR.VModel;
    }

    @Override
    public PersonListActivityVM getViewModel()
    {
        return viewModel;
    }

    @Override
    public EventBus getEventBus()
    {
        return eventBus;
    }

    @Subscribe
    @Override
    public void onEvent(Event e)
    {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        viewData = getViewData();
        viewModel.setNavigator(this);
        viewModel.LoadData();

    }
}
