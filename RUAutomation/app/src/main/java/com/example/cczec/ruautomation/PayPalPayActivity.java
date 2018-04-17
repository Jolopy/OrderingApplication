package com.example.cczec.ruautomation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cczec.ruautomation.Config.Config;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalPayment;
import com.paypal.android.sdk.payments.PayPalPaymentDetails;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentActivity;
import com.paypal.android.sdk.payments.PaymentConfirmation;

import org.json.JSONException;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class PayPalPayActivity extends Activity{

    public static final String PAYPAL_CLIENT_ID = "AUeMkHQBX6BbmIimHC_XQ5kWSW3Xk85A2_2iUx7u-IMtWU0FBUC0UqqoVyNtKjjEp3PfmMy7TLJndE4z";
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
    public double amount = 0.0;

    public static final int PAYPAL_REQUEST_CODE = 7171;
    private static PayPalConfiguration config = new PayPalConfiguration().environment(PayPalConfiguration.ENVIRONMENT_SANDBOX).clientId(Config.PAYPAL_CLIENT_ID);

    @Override
    protected void onDestroy(){
        stopService(new Intent(this,PayPalService.class));
        super.onDestroy();
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paypalpay);

        //Payppal shit
        Intent intent =  new Intent(this,PayPalService.class);
        intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION,config);
        startService(intent);

        textviewTotal = findViewById(R.id.paypalTotal);
        bitcoinTipPercent  = findViewById(R.id.paypalTipPercent);
        getBitcoinTip = findViewById(R.id.paypalTipAmount);
        finalTotal = findViewById(R.id.paypalFinalPrice);
        minus = findViewById(R.id.paypalMinus);
        plus = findViewById(R.id.paypalPlus);
        confirm = findViewById(R.id.paypalConfirm);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width * 0.8) ,(int)(height * 0.8));

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
                processPayment();

            }
        });

    }

    private void processPayment(){
        amount = (total_int + tipTotal);
        PayPalPayment payPalPayment = new PayPalPayment(new BigDecimal(String.valueOf(amount)),"USD","Pay Now",PayPalPayment.PAYMENT_INTENT_SALE);
        Intent intent =  new Intent(this, PaymentActivity.class);
        intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION,config);
        intent.putExtra(PaymentActivity.EXTRA_PAYMENT,payPalPayment);
        startActivityForResult(intent,PAYPAL_REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == PAYPAL_REQUEST_CODE)
        {
            if(resultCode == RESULT_OK)
            {
                PaymentConfirmation confirmation =  data.getParcelableExtra(PaymentActivity.EXTRA_RESULT_CONFIRMATION);
                if(confirmation != null){
                    String paymentDetails = confirmation.toJSONObject().toString();
                    startActivity(new Intent(this, PaymentDetails.class).putExtra("PaymentDetails",paymentDetails).putExtra("PaymentAmount",amount));

                }
            }
            else if(resultCode == Activity.RESULT_CANCELED){
                Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show();
            }
        }
        else if(resultCode == PaymentActivity.RESULT_EXTRAS_INVALID){
            Toast.makeText(this,"Invalid",Toast.LENGTH_SHORT).show();
        }


    }

}
