package com.example.cczec.ruautomation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;

import java.text.DecimalFormat;

public class PayPopUpActivity extends Activity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paypopup);

        ImageButton paypalButton = findViewById(R.id.paypalButton);
        ImageButton bitcoinButton = findViewById(R.id.bitcoinButton);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width * 0.8) ,(int)(height * 0.8));


        paypalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String price = getIntent().getStringExtra("total_Price");
                Intent myIntent = new Intent(PayPopUpActivity.this, PayPalPayActivity.class);
                myIntent.putExtra("total_Price", price);
                startActivity(myIntent);

            }
        });

        bitcoinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String price = getIntent().getStringExtra("total_Price");
                Intent myIntent = new Intent(PayPopUpActivity.this, BitcoinPayActivity.class);
                myIntent.putExtra("total_Price", price);
                startActivity(myIntent);

            }
        });

    }
}
