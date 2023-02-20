package com.yakisan.roomdb.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.yakisan.roomdb.R;
import com.yakisan.roomdb.databinding.ActivityAddNewUserBinding;
import com.yakisan.roomdb.db.AppDatabase;
import com.yakisan.roomdb.db.User;

public class AddNewUser extends AppCompatActivity {

    ActivityAddNewUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //bind items
        binding = ActivityAddNewUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Add New User
        binding.addUserButton.setOnClickListener(v -> saveNewUser(binding.txtFirstName.getText().toString(), binding.txtLastName.getText().toString()));

    }//eof onCreate

    private void saveNewUser(String firstName, String lastName) {
        AppDatabase db = AppDatabase.getDBInstance(this.getApplicationContext());
        //Add User
        User user = new User();
        user.firstName = firstName;
        user.lastName = lastName;
        db.userDAO().insertUser(user);

        //Toast
        Toast.makeText(this, "Kullanıcı eklendi", Toast.LENGTH_SHORT).show();

        //Intent
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}