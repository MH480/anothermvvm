package com.sanwix.mh.anothermvvm.viewModels;

import com.sanwix.mh.anothermvvm.utils.App;
import com.sanwix.mh.anothermvvm.views.activites.MainActivity.IMainNavigator;

import javax.inject.Inject;

public class MainActivityVM extends BaseViewModel<IMainNavigator>
{

    @Inject
    public MainActivityVM(App app)
    {
        super(app);
    }


    public void btnOpenLogin()
    {
        getNavigator().login();
    }

    public void btnExit()
    {
        getNavigator().exit();
    }
}
