package com.example.cczec.ruautomation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ManagerActivity extends AppCompatActivity {

    // FirebaseDatabase declerations
    private DatabaseReference refCurrentLevel;
    private DatabaseReference refThresholdLevel;

    private DataSnapshot snapCurrentLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

        final String current_level = "Inventory/Current Level";
        final String threshold_level = "Inventory/Threshold";

        // FirebaseDatabase reference instantiation
        refCurrentLevel = FirebaseDatabase.getInstance().getReference().child(current_level);
        refThresholdLevel = FirebaseDatabase.getInstance().getReference().child(threshold_level);

        /*
        setThresholdItem        - enter the name of the item you want to set a new threshold
        thresholdItemAmount     - enter the number that will be the new threshold
        btnThreshold            - press to execute*/
        final TextView setThresholdItem = findViewById(R.id.setThresholdItem);
        final TextView thresholdItemAmount = findViewById(R.id.thresholdItemAmount);
        Button btnThreshold = findViewById(R.id.btnThreshold);

        // Set on click Listener
        btnThreshold.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // this onClickListener should take in 1 string representing the ingredient,
                // and an int represent the threshold and set the value of the threshold to the input value
                // the button will then set the threshold of the target ingredient to the int value

                String strSetThresholdItem = setThresholdItem.getText().toString();
                String strThresholdItemAmount = thresholdItemAmount.getText().toString();
                //int intThresholdItemAmount = Integer.parseInt(thresholdItemAmount.getText().toString());
                refThresholdLevel =  FirebaseDatabase.getInstance().getReference().child(threshold_level + "/" + strSetThresholdItem);
                refThresholdLevel.setValue(strThresholdItemAmount);

            }
        });

        /*
        getItemAmount           - enter the name of the item you want to view the supply levels
        displayItemAmount       - this is where the items inventory value should be displayed
        btnCheckItem            - press to execute*/
        final TextView getItemAmount = findViewById(R.id.getItemAmount);
        final TextView displayItemAmount = findViewById(R.id.displayItemAmount);
        Button btnCheckItem = findViewById(R.id.btnCheckItem);

        // Set on click Listener
        btnCheckItem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // the onClickListener will take 1 string parameter and return an int value
                // the string is the name of the ingredient, and the return value is the current level in stock
                // the button will then call the function to execute
                String strGetItemAmount = getItemAmount.getText().toString();

                refCurrentLevel =  FirebaseDatabase.getInstance().getReference().child(current_level + "/" + strGetItemAmount);
                refCurrentLevel.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        displayItemAmount.setText(dataSnapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        displayItemAmount.setText(" ");
                    }
                });
                //snapCurrentLevel = DataSnapshot();
                //displayItemAmount.setText(refCurrentLevel.getKey().toString());
            }
        });

        /*
        restockItem             - enter the name of the item you want to restock
        restockItemAmount       - enter the number items you want to restock (this is adding to what we already have)
        btnRestock              - press to execute*/
        final TextView restockItem = findViewById(R.id.restockItem);
        final TextView restockItemAmount = findViewById(R.id.restockItemAmount);
        Button btnRestock = findViewById(R.id.btnRestock);

        // Set on click Listener
        btnRestock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // the onClickListener will take 2 parameters the name of the ingredient and the amount of that ingredient that is ordered
                // the int value that is ordered will then be added to whatever is there for the new stock amount
                // the button will execute the function call

                String strRestockItem = restockItem.getText().toString();
                final int intRestockItemAmount = Integer.parseInt(restockItemAmount.getText().toString());
                refCurrentLevel =  FirebaseDatabase.getInstance().getReference().child(current_level + "/" + strRestockItem);
                refCurrentLevel.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // this code causes an endless loop but it works :)
                        //refCurrentLevel.setValue(Integer.parseInt(dataSnapshot.getValue().toString()) + intRestockItemAmount);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

        /*
        alertThreshold          - need another field that will be an EventListener to when the stock supply drops below a certain level*/
        TextView alertThreshold = findViewById(R.id.alertThreshold);

/*
        .addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // the alert field is an EventListener which will be called anytime any of the
                // ingredient fields have gone below the threshold and return a string indicating the ingredient that is running low

                // multiple things can go below at the same time - think how to fix
            }
        });
*/
    }

}




