package com.sanwix.mh.anothermvvm.views.activites.LoginAcitvity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.sanwix.mh.anothermvvm.BR;
import com.sanwix.mh.anothermvvm.R;
import com.sanwix.mh.anothermvvm.data.Event;
import com.sanwix.mh.anothermvvm.data.orms.vModels.PersonModel;
import com.sanwix.mh.anothermvvm.databinding.ActivityLoginBinding;
import com.sanwix.mh.anothermvvm.viewModels.LoginActivityVM;
import com.sanwix.mh.anothermvvm.views.activites.MainActivity.MainActivity;
import com.sanwix.mh.anothermvvm.views.bases.BaseActivity;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity<ActivityLoginBinding, LoginActivityVM> implements ILoginNavigator
{
    @Inject LoginActivityVM mViewModel;
    @Inject
    EventBus eventBus;
    private ActivityLoginBinding mViewData;
    @Override
    public int getBindingVarriables()
    {
        return BR.VModel;
    }

    @Override
    public int getLayoutId()
    {
        return R.layout.activity_login;
    }

    @Override
    public LoginActivityVM getViewModel()
    {
        return mViewModel;
    }

    @Override
    public EventBus getEventBus()
    {
        return eventBus;
    }

    public static Intent newIntent(BaseActivity base)
    {
        return new Intent(base, LoginActivity.class);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mViewData = getViewData();
        mViewModel.setNavigator(this);
    }


    @Override
    public void onEvent(Event e)
    {
        Toast.makeText(this, e.eventName, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void btnLogin()
    {
        openMainActivity();
    }

    @Override
    public void openMainActivity()
    {
        startActivity(MainActivity.newIntent(this));
        eventBus.post(new Event("logged in user", new PersonModel.Builder()
                .setPhone(getViewModel().phone.get())
                .setName(getViewModel().pass.get())
                .build()));
        finish();
    }
}
