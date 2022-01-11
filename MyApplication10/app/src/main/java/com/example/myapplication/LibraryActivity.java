package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LibraryActivity extends AppCompatActivity {
    ImageView background1,background2,background3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        init();
        changeBackground();
    }
    public void changeBackground(){

        background1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBuyShop.checkBuyBackground1 = true;
                CheckBuyShop.checkBuyBackground2 = false;
                CheckBuyShop.checkBuyBackground3 = false;
            }
        });
        if(CheckBuyShop.back2==true) {
            background2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CheckBuyShop.checkBuyBackground1 = false;
                    CheckBuyShop.checkBuyBackground2 = true;
                    CheckBuyShop.checkBuyBackground3 = false;
                }
            });
        }
        else{
            background2.setImageResource(R.drawable.sell);
        }
        if(CheckBuyShop.back3==true) {
            background3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CheckBuyShop.checkBuyBackground1 = false;
                    CheckBuyShop.checkBuyBackground2 = false;
                    CheckBuyShop.checkBuyBackground3 = true;
                }
            });
        }
        else{
            background3.setImageResource(R.drawable.sell);
        }

    }
    public void init(){
        background1= findViewById(R.id.imageView7);
        background2= findViewById(R.id.imageView8);
        background3= findViewById(R.id.imageView9);
    }
    public void goBack(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}