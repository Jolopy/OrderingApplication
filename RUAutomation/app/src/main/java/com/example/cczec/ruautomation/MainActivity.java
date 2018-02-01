package com.example.cczec.ruautomation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private Button button1,button2;
    private TextView textView;

    public int counter = 0;
    public String total = "total";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("OrderNumber");

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        textView = (TextView)findViewById(R.id.textView);


        button1.setOnClickListener(new View.OnClickListener() {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference ryRef = database.getReference("OrderNumber");
            @Override
            public void onClick(View view) {
                for(int i = 0; i < counter; i++){
                    ryRef.child("number").child(Integer.toString(i)).setValue("Hello, World! ");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference rxRef = database.getReference("OrderNumber");
            @Override
            public void onClick(View view) {
               counter = counter + 1;
                textView.setText("Total: "+counter+"");
            }
        });

    }
}
