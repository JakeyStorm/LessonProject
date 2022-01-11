package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegActivity extends AppCompatActivity {
    EditText edLogin,edPassword;
    DatabaseReference databaseReference;
    String MY_KEY = "User";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        init();
    }
    public void init(){
        edLogin = findViewById(R.id.editTextTextPersonName);
        edPassword = findViewById(R.id.editTextTextPersonName2);
        databaseReference = FirebaseDatabase.getInstance().getReference(MY_KEY);
    }
    public void save(View view){
        String id = databaseReference.getKey();
        String login = edLogin.getText().toString();
        String password = edPassword.getText().toString();
        User user = new User(id,login,password);

        databaseReference.push().setValue(user);
    }

}