package com.sanwix.mh.anothermvvm.data.apis;


import com.google.gson.reflect.TypeToken;
import com.rx2androidnetworking.Rx2AndroidNetworking;
import com.sanwix.mh.anothermvvm.BuildConfig;
import com.sanwix.mh.anothermvvm.data.ServerResponse;
import com.sanwix.mh.anothermvvm.data.orms.vModels.PersonModel;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by m.hoseini on 3/15/2018.
 */

public class DataSender implements IDataServices
{
    public static final String BASE_URL = "http://www.mhmusic.ir/testJson/json.html";
    public static final String Base_USER = BuildConfig.BASE_USER;

    public DataSender()
    {
    }

    @Override
    public Observable<ServerResponse<List<PersonModel>>> GetAllPeople()
    {
        TypeToken<ServerResponse<List<PersonModel>>> t = new TypeToken<ServerResponse<List<PersonModel>>>()
        {
        };
        return Rx2AndroidNetworking.get(BASE_URL)
                .build()
                .getParseObservable(t);
    }

    @Override
    public Observable<String> GetAllPeopleAsString()
    {
        return Rx2AndroidNetworking.get("http://test.services.sayeh.ir/api/ProblemCategory/GetByApplicationId?id=1")
                .build()
                .getStringObservable();
    }


}
