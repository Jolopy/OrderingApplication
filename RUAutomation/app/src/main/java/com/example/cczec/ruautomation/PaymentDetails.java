package com.example.cczec.ruautomation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cczec.ruautomation.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONException;
import org.json.JSONObject;

public class PaymentDetails extends AppCompatActivity {


    TextView detailID,detailAmount,detailStatus;
    Button backMenu;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference payRef= database.getReference("TablePayStatus");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentdetails);


        detailID = (TextView) findViewById(R.id.detailID);
        detailAmount = (TextView) findViewById(R.id.detailAmount);
        detailStatus = (TextView) findViewById(R.id.detailStatus);
        backMenu  = (Button) findViewById(R.id.detailButton);

        Intent intent = getIntent();
        try {
            JSONObject jsonObject = new JSONObject(intent.getStringExtra("PaymentDetails"));
            showDetails(jsonObject.getJSONObject("response"),intent.getStringExtra("PaymentAmount"));
        } catch (JSONException e){
            e.printStackTrace();
        }

        backMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(PaymentDetails.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent myIntent = new Intent(PaymentDetails.this, MainActivity.class);
        startActivity(myIntent);
    }

    private void showDetails(JSONObject response,String paymentAmount){
        try {
            detailID.setText(response.getString("id"));
            detailStatus.setText(response.getString("state"));
            detailAmount.setText("$" + paymentAmount);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
