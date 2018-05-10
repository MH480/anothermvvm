package com.sanwix.mh.anothermvvm.views.activites.MainActivity;

import android.content.Intent;
import android.os.Bundle;

import com.android.databinding.library.baseAdapters.BR;
import com.sanwix.mh.anothermvvm.R;
import com.sanwix.mh.anothermvvm.data.Event;
import com.sanwix.mh.anothermvvm.databinding.ActivityMainBinding;
import com.sanwix.mh.anothermvvm.viewModels.MainActivityVM;
import com.sanwix.mh.anothermvvm.views.activites.LoginAcitvity.LoginActivity;
import com.sanwix.mh.anothermvvm.views.bases.BaseActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import javax.inject.Inject;


public class MainActivity extends BaseActivity<ActivityMainBinding,MainActivityVM> implements IMainNavigator
{

    @Inject
    MainActivityVM viewModel;
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
        return viewModel;
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

        viewModel.setNavigator(this);
    }


    @Subscribe
    @Override
    public void onEvent(Event e)
    {

    }

    @Override
    public void login() {
        startActivity(LoginActivity.newIntent(this));
    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
