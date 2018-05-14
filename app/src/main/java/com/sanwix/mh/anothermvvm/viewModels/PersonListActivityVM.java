package com.sanwix.mh.anothermvvm.viewModels;


import android.databinding.ObservableField;
import android.view.View;

import com.sanwix.mh.anothermvvm.App;
import com.sanwix.mh.anothermvvm.data.ServerResponse;
import com.sanwix.mh.anothermvvm.data.apis.DataSender;
import com.sanwix.mh.anothermvvm.data.orms.vModels.PersonModel;
import com.sanwix.mh.anothermvvm.utils.ErrorUtils;
import com.sanwix.mh.anothermvvm.utils.StringUtils;
import com.sanwix.mh.anothermvvm.viewModels.baseVMs.BaseViewModel;
import com.sanwix.mh.anothermvvm.views.activites.ListActivity.IPersonListNavigator;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class PersonListActivityVM extends BaseViewModel<IPersonListNavigator>
{

    public final ObservableField<Integer> ErrorVisibility = new ObservableField<>(View.GONE);
    private PersonRecyclerVM rvViewModel;
    public final ObservableField<String> ErrorText = new ObservableField<>(StringUtils.Empty);
    private DataSender repo;

    public PersonListActivityVM(App app, DataSender repo)
    {
        super(app);
        rvViewModel = new PersonRecyclerVM(app);
        this.repo = repo;
    }

    public PersonRecyclerVM getPeopleListAdapter()
    {
        return rvViewModel;
    }

    public void LoadData()
    {
        LoadingState.set(View.VISIBLE);
        repo.GetAllPeople()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ServerResponse>()
                {
                    @Override
                    public void onSubscribe(Disposable d)
                    {

                    }

                    @Override
                    public void onNext(ServerResponse serverResponse)
                    {
                        ErrorVisibility.set(View.GONE);
                        LoadingState.set(View.GONE);
                        if (serverResponse.successful && serverResponse.returnValue != null)
                        {
                            List<PersonModel> people = (List<PersonModel>) serverResponse.returnValue;
                            rvViewModel.getAdapter().setItems(people);
                        }
                    }

                    @Override
                    public void onError(Throwable e)
                    {
                        LoadingState.set(View.GONE);
                        ErrorVisibility.set(View.VISIBLE);
                        ErrorText.set(ErrorUtils.ErrorTimeOut);
                    }

                    @Override
                    public void onComplete()
                    {
                        LoadingState.set(View.GONE);
                        ErrorVisibility.set(View.GONE);
                        ErrorText.set(ErrorUtils.OK);
                    }
                });
    }


}
