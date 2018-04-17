package com.example.cczec.ruautomation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class BitcoinPayActivity extends Activity{


    private TextView textviewTotal;
    private TextView bitcoinTipPercent;
    private TextView getBitcoinTip;
    private TextView finalTotal;
    private Button minus;
    private Button plus;
    private Button confirm;
    public double tipPercent  = 15.0;
    public double total_int;
    public double tipTotal;

    private TextView scanhere;
    private TextView address;
    private ImageView qrCode;

    Button bitcoinBack;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitcoinpay);

        textviewTotal = findViewById(R.id.bitcoinTotal);
        bitcoinTipPercent  = findViewById(R.id.bitcoinTipPercent);
        getBitcoinTip = findViewById(R.id.bitcoinTipAmount);
        finalTotal = findViewById(R.id.bitcoinFinalPrice);
        minus = findViewById(R.id.bitcoinMinus);
        plus = findViewById(R.id.bitcoinPlus);
        confirm = findViewById(R.id.bitcoinConfirm);

        scanhere = findViewById(R.id.bitcoinQRSCAN);
        address = findViewById(R.id.bitcoinAddress);
        qrCode = findViewById(R.id.bitcoinQR);
        bitcoinBack = (Button)findViewById(R.id.bitcoinButtonBack);



        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width * 0.8) ,(int)(height * 0.8));

        scanhere.setVisibility(View.INVISIBLE);
        address.setVisibility(View.INVISIBLE);
        qrCode.setVisibility(View.INVISIBLE);
        bitcoinBack.setVisibility(View.INVISIBLE);


        String price = getIntent().getStringExtra("total_Price");

        DecimalFormat df = new DecimalFormat("0.00");
        total_int = Double.parseDouble(price);

        tipTotal = total_int * .15;

        getBitcoinTip.setText(String.format("$ %s", df.format(tipTotal)));
        finalTotal.setText(String.format("$ %s", df.format(total_int + tipTotal)));
        textviewTotal.setText(String.format("$ %s", df.format(total_int)));

        String bitcoinAddress = "1HF37iq59D1D6cw2pwm5BYFqiZpYYC4opu";


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("0.00");
                tipPercent--;
                bitcoinTipPercent.setText("Tip: " + tipPercent + "%");
                tipTotal =  (Double)(tipPercent/100) * total_int;
                getBitcoinTip.setText(String.format("$ %s", df.format(tipTotal)));
                finalTotal.setText(String.format("$ %s", df.format(total_int + tipTotal)));

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("0.00");
                tipPercent++;
                bitcoinTipPercent.setText("Tip: " + tipPercent + "%");
                tipTotal =  (Double)(tipPercent/100) * total_int;
                getBitcoinTip.setText(String.format("$ %s", df.format(tipTotal)));
                finalTotal.setText(String.format("$ %s", df.format(total_int + tipTotal)));

            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scanhere.setVisibility(View.VISIBLE);
                address.setVisibility(View.VISIBLE);
                qrCode.setVisibility(View.VISIBLE);
                bitcoinBack.setVisibility(View.VISIBLE);

            }
        });

        bitcoinBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(BitcoinPayActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });


    }

    @Override
    public void onBackPressed() {
        Intent myIntent = new Intent(BitcoinPayActivity.this, MainActivity.class);
        startActivity(myIntent);
    }
}
