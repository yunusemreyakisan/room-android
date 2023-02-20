package com.yakisan.roomdb.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    //@PrimaryKey(autoGenerate = true) ile id blogunun otomatik sayi olusturmasini istiyoruz.
    @PrimaryKey(autoGenerate = true)
    public int id;

    //@ColumnInfo ifadesi ile veriyi tutacak sutunun adini veriyoruz.
    @ColumnInfo(name = "First_Name")
    public String firstName;

    @ColumnInfo(name = "Last_Name")
    public String lastName;

}
