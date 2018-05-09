package com.sanwix.mh.anothermvvm.views.Activites.MainActivity;

import android.content.Intent;
import android.os.Bundle;

import com.sanwix.mh.anothermvvm.BR;
import com.sanwix.mh.anothermvvm.R;
import com.sanwix.mh.anothermvvm.data.Event;
import com.sanwix.mh.anothermvvm.databinding.ActivityMainBinding;
import com.sanwix.mh.anothermvvm.viewModels.MainActivityVM;
import com.sanwix.mh.anothermvvm.views.Bases.BaseActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import javax.inject.Inject;


public class MainActivity extends BaseActivity<ActivityMainBinding,MainActivityVM>
{

    @Inject MainActivityVM vm;
    private ActivityMainBinding viewData;
    @Inject EventBus eventBus;
    @Override
    public int getBindingVarriables()
    {
        return BR.VModel;
    }

    @Override
    public int getLayoutId()
    {
        return R.layout.activity_main;
    }

    @Override
    public MainActivityVM getViewModel()
    {
        return vm;
    }

    @Override
    public EventBus getEventBus()
    {
        return eventBus;
    }

    public static Intent newIntent(BaseActivity base)
    {
        return new Intent(base, MainActivity.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        viewData = getViewData();
    }


    @Subscribe
    @Override
    public void onEvent(Event e)
    {

    }
}
