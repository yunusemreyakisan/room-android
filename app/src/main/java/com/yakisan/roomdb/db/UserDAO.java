package com.yakisan.roomdb.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

//Dao oldugunu belirtmek icin kullanilan annotation
@Dao
public interface UserDAO {

    @Query("SELECT * FROM user")
    List<User> tumKullanicilariGetir();

    //insertUser methodumuz ile icerisine birden fazla arguman atayabileyecegimizi soyluyoruz.
    @Insert
    void insertUser(User... user);

    //deleteUser methodu ile kullanıcı silinmesi saglanacak.
    @Delete
    void deleteUser(User user);

}
