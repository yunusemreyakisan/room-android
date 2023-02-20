package com.yakisan.roomdb.views;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;

import com.yakisan.roomdb.adapter.KullanicilarAdapter;
import com.yakisan.roomdb.databinding.ActivityMainBinding;
import com.yakisan.roomdb.db.AppDatabase;
import com.yakisan.roomdb.db.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    KullanicilarAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //bind items
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Intent
        binding.addUserFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(getApplicationContext(), AddNewUser.class), 100);
            }
        });

        //init rv
        initRV();
        loadUserList();
    }

    private void initRV() {
        adapter = new KullanicilarAdapter(this);
        binding.kullanicilarRV.setLayoutManager(new LinearLayoutManager(this));
        binding.kullanicilarRV.setAdapter(adapter);
    }

    private void loadUserList(){
        AppDatabase db = AppDatabase.getDBInstance(getApplicationContext());
        List<User> list = db.userDAO().tumKullanicilariGetir();
        //set users
        adapter.setUserList(list);
    }

    //onActivityForResult
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 100){
            loadUserList();
        }
    }
}