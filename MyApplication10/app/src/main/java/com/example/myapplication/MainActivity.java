package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static ConstraintLayout ct;
    public static int count =0;
    public static int i=1;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        checkBackground();
        textView.setText(Integer.toString(count));
    }
    public void init(){
        textView = findViewById(R.id.textView);
        ct = findViewById(R.id.ct);
    }
    public void goUp(View view){
        count+=i;
        textView.setText(Integer.toString(count));
    }
    public void goPay(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void checkBackground(){
        if(CheckBuyShop.checkBuyBackground1==true){ ct.setBackgroundResource(R.drawable.avatar);}
        else if(CheckBuyShop.checkBuyBackground2==true){ ct.setBackgroundResource(R.drawable.background2);}
        else if(CheckBuyShop.checkBuyBackground3==true){ ct.setBackgroundResource(R.drawable.background3);}
    }
    public void goLibrary(View view){
        Intent intent = new Intent(this,LibraryActivity.class);
        startActivity(intent);
    }
    public void goProfile(View view){
        if(CheckBuyShop.checkReg==false){
            Intent intent = new Intent(this,RegActivity.class);
            startActivity(intent);
        }
        else{}
    }
}