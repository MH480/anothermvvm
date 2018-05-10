package com.sanwix.mh.anothermvvm.data.apis;


import com.rx2androidnetworking.Rx2AndroidNetworking;
import com.sanwix.mh.anothermvvm.BuildConfig;
import com.sanwix.mh.anothermvvm.data.ServerResponse;

import io.reactivex.Observable;

/**
 * Created by m.hoseini on 3/15/2018.
 */

public class DataSender implements IDataServices
{
    public static final String BASE_URL = BuildConfig.BASE_URL;
    public static final String Base_USER = BuildConfig.BASE_USER;

    public DataSender()
    {
    }

    @Override
    public Observable<ServerResponse> GetAllPeople()
    {
        return Rx2AndroidNetworking.get(BASE_URL + "/2bd7032de8be3c4094f871ad4b172047")
                .build()
                .getObjectObservable(ServerResponse.class);
    }
}
