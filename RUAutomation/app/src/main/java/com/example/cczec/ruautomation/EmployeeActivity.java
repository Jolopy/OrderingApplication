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

public class EmployeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        /*
        Button managerHomeButton = findViewById(R.id.buttonManagerHome);
        Button chefHomeButton    = findViewById(R.id.buttonChefHome);
        Button serverHomeButton  = findViewById(R.id.buttonServerHome);
        Button hostessHomeButton = findViewById(R.id.buttonHostessHome);
        Button busboyHomeButton  = findViewById(R.id.buttonBusboyHome);

        managerHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmployeeActivity.this, ManagerActivity.class));
            }
        });
        chefHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmployeeActivity.this, ChefActivity.class));
            }
        });
        serverHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmployeeActivity.this, ServerActivity.class));
            }
        });
        hostessHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmployeeActivity.this, HostessActivity.class));
            }
        });
        busboyHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmployeeActivity.this, BusboyActivity.class));
            }
        });
        */


    }
}
