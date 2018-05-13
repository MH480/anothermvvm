package com.sanwix.mh.anothermvvm.viewModels;

import android.databinding.ObservableField;

import com.sanwix.mh.anothermvvm.App;
import com.sanwix.mh.anothermvvm.utils.ValidatorUtils;
import com.sanwix.mh.anothermvvm.viewModels.baseVMs.BaseViewModel;
import com.sanwix.mh.anothermvvm.views.activites.LoginAcitvity.ILoginNavigator;

import io.reactivex.Observable;


public class LoginActivityVM extends BaseViewModel<ILoginNavigator>
{

    public final ObservableField<Boolean> isDataOk = new ObservableField<>(false);
    public final ObservableField<String> phone = new ObservableField<>();
    public final ObservableField<String> pass = new ObservableField<>();

    public LoginActivityVM(App app)
    {
        super(app);
        Observable.combineLatest(toObservable(phone), toObservable(pass),
                (enteredPhone, EnterdePass) -> ValidatorUtils.validatePhone(enteredPhone) && ValidatorUtils.validatePasword(EnterdePass))
                .subscribe(result -> {
                    isDataOk.set(result);
                });
    }


    public void btnLogin()
    {
        getNavigator().btnLogin();

    }


}
