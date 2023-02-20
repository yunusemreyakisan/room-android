package com.yakisan.roomdb.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/*
Database() ifadesi ile DB olusturuyoruz.
Olusturdugumuz sinifi RoomDatabase sinifindan extends ediyoruz.
*/
@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDAO userDAO();
    private static AppDatabase INSTANCE;

    public static AppDatabase getDBInstance(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "Ornek_DB")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }

}
