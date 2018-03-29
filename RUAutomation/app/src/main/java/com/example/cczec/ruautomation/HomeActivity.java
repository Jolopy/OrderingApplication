package com.example.cczec.ruautomation;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.text.DecimalFormat;

/**
 * Created by cczec on 2/6/2018.
 */

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button buttonCustomerHome = findViewById(R.id.buttonCustomerHome);
        Button buttonHostessHome  = findViewById(R.id.HostessHome);
        Button buttonBusboyHome  = findViewById(R.id.BusboyHome);
        Button buttonWaiterHome  = findViewById(R.id.buttonWaiterHome);
        Button buttonChefHome = findViewById(R.id.ChefHome);
        //Button buttonChefHome = findViewById(R.id.ChefHome);
        //Button chefButton = findViewById(R.id.buttonChef);
        /*
        * Button employeeHome = findViewById(R.id.buttonEmployeeHome);
        * Button customerHome = findViewById(R.id.buttonCustomerHome);
        * Button careerHome   = findViewById(R.id.buttonCareerHome);
        */

        buttonCustomerHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }
        });

        buttonHostessHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, HostessActivity.class));
            }
        });

        buttonBusboyHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, BusboyActivity.class));
            }
        });

        buttonWaiterHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, WaiterActivity.class));
            }
        });

        buttonChefHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ChefActivity.class));
            }
        });

    }
}