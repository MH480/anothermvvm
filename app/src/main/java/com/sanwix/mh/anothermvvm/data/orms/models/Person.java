package com.sanwix.mh.anothermvvm.data.orms.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "tbPerson")
public class Person implements IBaseModel
{
    @NonNull
    @PrimaryKey
    public String id ;
    public boolean isActive ;
    public String name ;
    public String email ;
    public String phone ;
}
