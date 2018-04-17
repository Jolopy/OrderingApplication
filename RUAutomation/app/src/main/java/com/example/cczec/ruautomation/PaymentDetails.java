package com.example.cczec.ruautomation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.cczec.ruautomation.R;

import org.json.JSONException;
import org.json.JSONObject;

public class PaymentDetails extends AppCompatActivity {


    TextView detailID,detailAmount,detailStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentdetails);

        detailID = (TextView) findViewById(R.id.detailID);
        detailAmount = (TextView) findViewById(R.id.detailAmount);
        detailStatus = (TextView) findViewById(R.id.detailStatus);

        Intent intent = getIntent();

        try {
            JSONObject jsonObject = new JSONObject(intent.getStringExtra("PaymentDetails"));
            showDetails(jsonObject.getJSONObject("response"),intent.getStringExtra("PaymentAmount"));
        } catch (JSONException e){
            e.printStackTrace();
        }

    }

    private void showDetails(JSONObject response,String paymentAmount){
        try {
            detailID.setText(response.getString("id"));
            detailStatus.setText(response.getString("state"));
            detailAmount.setText(response.getString("$"+paymentAmount));


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
