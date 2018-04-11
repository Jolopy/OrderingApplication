package com.example.cczec.ruautomation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ManagerActivity extends AppCompatActivity {

    // FirebaseDatabase declerations
    private DatabaseReference refCurrentLevel;
    private DatabaseReference refThresholdLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

        // FirebaseDatabase reference instantiation
        refCurrentLevel = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level");
        refThresholdLevel = FirebaseDatabase.getInstance().getReference().child("Inventory/Threshold");

        /*
        setThresholdItem        - enter the name of the item you want to set a new threshold
        thresholdItemAmount     - enter the number that will be the new threshold
        btnThreshold            - press to execute*/
        TextView setThresholdItem = findViewById(R.id.setThresholdItem);
        TextView thresholdItemAmount = findViewById(R.id.thresholdItemAmount);
        Button btnThreshold = findViewById(R.id.btnThreshold);

        // Set on click Listener
        btnThreshold.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        /*
        getItemAmount           - enter the name of the item you want to view the supply levels
        displayItemAmount       - this is where the items inventory value should be displayed
        btnCheckItem            - press to execute*/
        TextView getItemAmount = findViewById(R.id.getItemAmount);
        TextView displayItemAmount = findViewById(R.id.displayItemAmount);
        Button btnCheckItem = findViewById(R.id.btnCheckItem);

        // Set on click Listener
        btnCheckItem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        /*
        restockItem             - enter the name of the item you want to restock
        restockItemAmount       - enter the number items you want to restock (this is adding to what we already have)
        btnRestock              - press to execute*/
        TextView restockItem = findViewById(R.id.restockItem);
        TextView restockItemAmount = findViewById(R.id.restockItemAmount);
        Button btnRestock = findViewById(R.id.btnRestock);

        // Set on click Listener
        btnRestock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        /*
        alertThreshold          - need another field that will be an EventListener to when the stock supply drops below a certain level*/
        TextView alertThreshold = findViewById(R.id.alertThreshold);

/*
        .addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

            }
        });
*/
    }

}




