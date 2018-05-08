package com.sanwix.mh.anothermvvm.data.orms.infrastructures;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.sanwix.mh.anothermvvm.data.orms.models.Person;
import com.sanwix.mh.anothermvvm.data.repositories.IPersonRepository;

@Database(version = 1,entities = {Person.class},exportSchema = false)
public abstract class DbContext extends RoomDatabase
{
    private static final String DB_NAME = "dbcontext";

    public abstract IPersonRepository taskDao();

    public static DbContext sInstance;

    public static synchronized DbContext getDatabaseInstance(Context context) {
        if (sInstance == null) {
            sInstance = create(context);
        }
        return sInstance;
    }

    static DbContext  create(Context context)
    {
        return Room.databaseBuilder(context,DbContext.class,DB_NAME)
                .build();
    }
}
