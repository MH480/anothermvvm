package com.sanwix.mh.anothermvvm.data.repositories;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.sanwix.mh.anothermvvm.data.orms.models.Person;

import java.util.List;

@Dao
public interface IPersonRepository
{
    @Query("select * from tbperson where name like :name")
    List<Person> getList(String name);
    @Query("select * from tbperson where isActive = 1")
    List<Person> getActivated();
    @Query("select * from tbperson where phone = :phoneOrEmail or email = :phoneOrEmail ")
    Person getSingle(String phoneOrEmail);
    @Query("select * from tbperson ")
    List<Person> getAll();

    @Insert
    long save(Person obj);
    @Update
    int update(Person obj);
    @Delete
    int delete(Person key);



}
