package com.example.cczec.ruautomation;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ManagerActivity extends AppCompatActivity {

    // FirebaseDatabase declerations
    private DatabaseReference refCurrentLevel;
    private DatabaseReference refThresholdLevel;

    private DataSnapshot snapCurrentLevel;

    public DatabaseReference currentLevelRef;
    public DatabaseReference thresholdRef;
    public ArrayList<String> currentName = new ArrayList<String>();
    public ArrayList<String> currentCount = new ArrayList<String>();
    public ArrayList<String> threshName = new ArrayList<String>();
    public ArrayList<String> threshCount = new ArrayList<String>();
    public ArrayList<String> lowInvName = new ArrayList<String>();
    public ArrayList<String> lowInvCount = new ArrayList<String>();
    public ArrayAdapter<String> itemsAdapter;
    public ArrayAdapter<String> countAdapter;
    Context context = this;
    public ListView invNameView;
    public ListView invCountView;
    public ArrayAdapter<String> invNameAdapter;
    public ArrayAdapter<String> invCountAdapter;

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
                refThresholdLevel.setValue(Integer.parseInt(strThresholdItemAmount));

                Toast.makeText(getApplicationContext(), "Threshold Set!", Toast.LENGTH_SHORT).show();

                reload();
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

                Toast.makeText(getApplicationContext(), "Inventory Status!", Toast.LENGTH_SHORT).show();

                refCurrentLevel = FirebaseDatabase.getInstance().getReference().child(current_level + "/" + strGetItemAmount);
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

                Toast.makeText(getApplicationContext(), "Restock Success!", Toast.LENGTH_SHORT).show();

                refCurrentLevel =  FirebaseDatabase.getInstance().getReference().child(current_level + "/" + strRestockItem);
                refCurrentLevel.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        refCurrentLevel.setValue(Integer.parseInt(dataSnapshot.getValue().toString()) + intRestockItemAmount);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

                reload();
            }
        });
        /*
        alertThreshold          - need another field that will be an EventListener to when the stock supply drops below a certain level*/

        //final TextView alertThreshold = findViewById(R.id.alertThreshold); COMMENTED OUT BECAUSE I DELETED ORIGINAL ALERT TEXT FIELD

        invNameView = findViewById(R.id.invNameView);
        invCountView = findViewById(R.id.invCountView);
        itemsAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, lowInvName);
        countAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, lowInvCount);
        invNameView.setAdapter(itemsAdapter);
        invCountView.setAdapter(countAdapter);

        currentLevelRef = FirebaseDatabase.getInstance().getReference().child(current_level);
        thresholdRef = FirebaseDatabase.getInstance().getReference().child(threshold_level);
        currentLevelRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                lowInvName.clear();
                lowInvCount.clear();
                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    currentName.add(ds.getKey().toString());
                    currentCount.add(ds.getValue().toString());
                }

                thresholdRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for(DataSnapshot ds1 : dataSnapshot.getChildren()) {
                            threshName.add(ds1.getKey().toString());
                            threshCount.add(ds1.getValue().toString());
                        }

                        for(int i = 0; i < currentName.size(); i++) {
                            if(Integer.parseInt(currentCount.get(i)) <= Integer.parseInt(threshCount.get(i))) {
                                lowInvName.add(currentName.get(i));
                                lowInvCount.add(currentCount.get(i));
                            }
                        }

                        itemsAdapter.notifyDataSetChanged();
                        countAdapter.notifyDataSetChanged();

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        refThresholdLevel = FirebaseDatabase.getInstance().getReference().child(threshold_level);
        refCurrentLevel =  FirebaseDatabase.getInstance().getReference().child(current_level);
        refCurrentLevel.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (final DataSnapshot dataCurrent : dataSnapshot.getChildren()){
                    //final int current_value = Integer.parseInt(data.getValue().toString());
                    //final int threshold_value;
                    final String tempCurrent = dataCurrent.toString();
                    final Integer tempCurrentValue = Integer.parseInt(dataCurrent.getValue().toString());
                    refThresholdLevel = FirebaseDatabase.getInstance().getReference().child(threshold_level + "/" + tempCurrent);
                    refThresholdLevel.addListenerForSingleValueEvent(new ValueEventListener() {

                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            //final Integer intThresholdLevel = Integer.parseInt(refThresholdLevel.getValue().toString());

                            refThresholdLevel.addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(DataSnapshot dataSnapshot) {
                                    for (final DataSnapshot dataThresh : dataSnapshot.getChildren()){
                                        if (dataCurrent.toString() == dataThresh.toString() && Integer.parseInt(dataCurrent.getValue().toString()) < Integer.parseInt(dataThresh.getValue().toString())){
                                            //alertThreshold.setText(dataCurrent.getKey() + " is running low"); COMMENTED OUT BECAUSE I DELETED ORIGINAL ALERT TEXT FIELD
                                        }
                                    }
                                }

                                @Override
                                public void onCancelled(DatabaseError databaseError) {

                                }
                            });


                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }

                    });

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }

    private void reload() {
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();
        overridePendingTransition(0,0);
        startActivity(intent);
    }

}