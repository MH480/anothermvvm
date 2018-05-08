package com.sanwix.mh.anothermvvm.data.orms.infrastructures;

import android.arch.persistence.room.Dao;

import com.sanwix.mh.anothermvvm.data.orms.models.IBaseModel;


@Dao
public interface IRepository<Entity extends IBaseModel>
{


}
