package com.example.cczec.ruautomation;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DecimalFormat;

/**
 * Created by cczec on 2/6/2018.
 */

public class ChefActivity extends AppCompatActivity {
public String getOrderString = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference refChef = database.getReference("TableNumber");
        Button getOrder = findViewById(R.id.getOrder);



        getOrder.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Log.i("Hello","Order Number" + getOrderString);
                refChef.child("TableNumber").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        getOrderString = dataSnapshot.getValue(String.class);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }

                });
            }
        });



    }
}