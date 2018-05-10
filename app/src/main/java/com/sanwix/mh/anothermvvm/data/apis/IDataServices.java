package com.sanwix.mh.anothermvvm.data.apis;

import com.sanwix.mh.anothermvvm.data.ServerResponse;

import io.reactivex.Observable;

public interface IDataServices
{
    Observable<ServerResponse> GetAllPeople();

}
