package com.example.cczec.ruautomation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("OrderNumber");

        button1 = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference ryRef = database.getReference("OrderNumber");
            @Override
            public void onClick(View view) {
                for(int i = 0; i < 5; i++){
                    ryRef.child("number").child(Integer.toString(i)).setValue("Hello, World! ");
                }

            }
        });



    }
}
