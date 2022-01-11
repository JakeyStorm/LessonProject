package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageView background2,background3,bonusx2;
    TextView priceBackground2,priceBackground3,priceBonusx2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        checkBuy();

    }
    public void init(){
        background2 = findViewById(R.id.imageView4);
        background3 = findViewById(R.id.imageView5);
        bonusx2 = findViewById(R.id.imageView6);

        priceBackground2 = findViewById(R.id.textView2);
        priceBackground3 = findViewById(R.id.textView3);
        priceBonusx2 = findViewById(R.id.textView4);
    }
    public void checkBuy(){
        if(CheckBuyShop.checkBuyBackground2==false) {
            background2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (MainActivity.count > 50) {
                        MainActivity.count -= 50;
                        CheckBuyShop.checkBuyBackground1 = false;
                        CheckBuyShop.checkBuyBackground2 = true;
                        CheckBuyShop.checkBuyBackground3 = false;
                        priceBackground2.setText("Продано");
                        background2.setImageResource(R.drawable.sell);
                        CheckBuyShop.checkBuyBackground2=true;
                        CheckBuyShop.back2=true;
                    }
                }
            });
        }
        else {
            background2.setImageResource(R.drawable.sell);
            priceBackground2.setText("Продано");
        }
        if(CheckBuyShop.checkBuyBackground3==false) {
            background3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (MainActivity.count > 100) {
                        MainActivity.count -= 100;
                        CheckBuyShop.checkBuyBackground1 = false;
                        CheckBuyShop.checkBuyBackground2 = false;
                        CheckBuyShop.checkBuyBackground3 = true;
                        priceBackground3.setText("Продано");
                        background3.setImageResource(R.drawable.sell);
                        CheckBuyShop.checkBuyBackground3=true;
                        CheckBuyShop.back3=true;
                    }
                }
            });
        }
        else{
            background3.setImageResource(R.drawable.sell);
            priceBackground3.setText("Продано");
        }
        if(CheckBuyShop.checkBuyBonusx2==false) {
            bonusx2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (MainActivity.count > 25) {
                        MainActivity.count -= 25;
                        MainActivity.i=2;
                        priceBonusx2.setText("Продано");
                        bonusx2.setImageResource(R.drawable.sell);
                        CheckBuyShop.checkBuyBonusx2=true;
                    }
                }
            });
        }
        else {
            bonusx2.setImageResource(R.drawable.sell);
            priceBonusx2.setText("Продано");
        }

    }
    public void goBack(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}