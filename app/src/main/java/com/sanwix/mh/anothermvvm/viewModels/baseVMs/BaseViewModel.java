package com.sanwix.mh.anothermvvm.viewModels.baseVMs;

import android.arch.lifecycle.AndroidViewModel;
import android.databinding.ObservableField;

import com.sanwix.mh.anothermvvm.App;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;


public abstract class BaseViewModel<N> extends AndroidViewModel
{
    public BaseViewModel(App app)
    {
        super(app);
    }

    protected N Navigator;

    public N getNavigator()
    {
        return Navigator;
    }


    public void setNavigator(N navigator)
    {
        Navigator = navigator;
    }

    public static <T> Observable<T> toObservable(@NonNull final ObservableField<T> observableField)
    {
        return Observable.create(emitter -> {
            final android.databinding.Observable.OnPropertyChangedCallback callback = new android.databinding.Observable.OnPropertyChangedCallback()
            {
                @Override
                public void onPropertyChanged(android.databinding.Observable dataBindingObservable, int propertyId)
                {
                    if (dataBindingObservable == observableField)
                    {
                        emitter.onNext(observableField.get());
                    }
                }
            };
            observableField.addOnPropertyChangedCallback(callback);

            emitter.setCancellable(() -> observableField.removeOnPropertyChangedCallback(callback));
        });
    }


    @Override
    protected void onCleared()
    {
        super.onCleared();
    }
}
