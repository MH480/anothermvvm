package com.sanwix.mh.anothermvvm.viewModels;

import com.sanwix.mh.anothermvvm.Adapters.PeopleListAdapter;
import com.sanwix.mh.anothermvvm.App;
import com.sanwix.mh.anothermvvm.data.ServerResponse;
import com.sanwix.mh.anothermvvm.data.apis.DataSender;
import com.sanwix.mh.anothermvvm.data.orms.vModels.PersonModel;
import com.sanwix.mh.anothermvvm.views.activites.ListActivity.IPersonListNavigator;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class PersonListActivityVM extends BaseViewModel<IPersonListNavigator>
{
    @Inject
    DataSender repo;

    private PeopleListAdapter mPeopleListAdapter;

    public PersonListActivityVM(App app)
    {
        super(app);
        mPeopleListAdapter = new PeopleListAdapter();
    }

    public PeopleListAdapter getPeopleListAdapter()
    {
        return mPeopleListAdapter;
    }

    public void LoadData()
    {
        ///
        repo.GetAllPeople()
                .subscribeOn(Schedulers.computation())
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
                        if (serverResponse.successful && serverResponse.returnValue != null)
                        {
                            List<PersonModel> people = (List<PersonModel>) serverResponse.returnValue;
                            mPeopleListAdapter.setItems(people);
                        }
                    }

                    @Override
                    public void onError(Throwable e)
                    {

                    }

                    @Override
                    public void onComplete()
                    {

                    }
                });
    }
}
