package com.sanwix.mh.anothermvvm.data;

/**
 * Created by m.hoseini on 3/17/2018.
 */

public interface IOnServiceResult
{
    <T extends Object> void onServiceResult(ServerResponse<T> data, int callBackID);
}
