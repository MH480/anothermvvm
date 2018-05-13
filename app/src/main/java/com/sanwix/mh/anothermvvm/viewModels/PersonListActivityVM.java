package com.sanwix.mh.anothermvvm.viewModels;

import com.sanwix.mh.anothermvvm.App;
import com.sanwix.mh.anothermvvm.viewModels.baseVMs.BaseViewModel;
import com.sanwix.mh.anothermvvm.views.activites.ListActivity.IPersonListNavigator;

public class PersonListActivityVM extends BaseViewModel<IPersonListNavigator>
{


    private PersonRecyclerVM rvViewModel;

    public PersonListActivityVM(App app)
    {
        super(app);
        rvViewModel = new PersonRecyclerVM(app);
    }

    public PersonRecyclerVM getPeopleListAdapter()
    {
        return rvViewModel;
    }

    public void LoadData()
    {
        ///
        /*repo.GetAllPeople()
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
                            rvViewModel.getAdapter().setItems(people);
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
                });*/
    }


}
