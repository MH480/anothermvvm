package com.sanwix.mh.anothermvvm.views.bases;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sanwix.mh.anothermvvm.data.Event;
import com.sanwix.mh.anothermvvm.viewModels.BaseViewModel;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import dagger.android.AndroidInjection;

public abstract class BaseActivity<T extends ViewDataBinding, VM extends BaseViewModel> extends AppCompatActivity
{
    private T mViewData;
    private VM mViewModel;
    private EventBus eBus;

    public T getViewData() {
        return mViewData;
    }

    public abstract int getBindingVarriables();

    public abstract int getLayoutId();

    public abstract VM getViewModel();

    public abstract EventBus getEventBus();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        PerformInjection();
        super.onCreate(savedInstanceState);
        eBus = getEventBus();
        mViewData = DataBindingUtil.setContentView(this, getLayoutId());
        mViewModel = mViewModel != null ? mViewModel : getViewModel();
        mViewData.setVariable(getBindingVarriables(), mViewModel);
    }

    private void PerformInjection()
    {
        AndroidInjection.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        eBus.register(this);
    }

    @Override
    protected void onStop() {
        if (eBus.isRegistered(this))
            eBus.unregister(this);
        super.onStop();
    }

    @Subscribe
    public abstract void onEvent(Event e);


}
