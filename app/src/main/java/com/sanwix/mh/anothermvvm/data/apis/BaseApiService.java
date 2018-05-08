package com.sanwix.mh.anothermvvm.data.apis;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.rx2androidnetworking.Rx2ANRequest;
import com.rx2androidnetworking.Rx2AndroidNetworking;
import com.sanwix.mh.anothermvvm.data.ServerResponse;



import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public abstract class BaseApiService
{


    BaseApiService()
    {

    }

    public void MakeRequest(RequestType requestType)
    {
        Rx2ANRequest req = null;
        switch (requestType)
        {

            case Post:
                req = Rx2AndroidNetworking.post("").build();
                break;
            case Get:
                req = Rx2AndroidNetworking.get("").build();
                break;
            case Delete:
                req = Rx2AndroidNetworking.delete("").build();
                break;
            case Upload:
                req = Rx2AndroidNetworking.upload("").build();
                break;

        }

        req.getJSONObjectObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(jsonObject -> {
                    ServerResponse sr = new ServerResponse<Object>();
                    sr.ReturnValue = new ObjectMapper().convertValue(jsonObject,ServerResponse.class);
                    return sr;
                }).subscribe(new Observer<ServerResponse>()
        {
            @Override
            public void onSubscribe(Disposable d)
            {

            }

            @Override
            public void onNext(ServerResponse serverResponse)
            {

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


    protected enum RequestType
    {
        Post,
        Get,
        Delete,
        Upload
    }

}
