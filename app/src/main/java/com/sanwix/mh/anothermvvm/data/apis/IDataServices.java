package com.sanwix.mh.anothermvvm.data.apis;

import com.sanwix.mh.anothermvvm.data.ServerResponse;
import com.sanwix.mh.anothermvvm.data.orms.vModels.PersonModel;

import java.util.List;

import io.reactivex.Observable;

public interface IDataServices
{
    Observable<ServerResponse<List<PersonModel>>> GetAllPeople();

    Observable<String> GetAllPeopleAsString();



}
