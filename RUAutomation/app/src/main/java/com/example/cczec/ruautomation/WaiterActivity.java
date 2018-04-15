package com.example.cczec.ruautomation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WaiterActivity extends AppCompatActivity {

    private TextView orderReadyFB;
    private DatabaseReference mDatabaseFB;
    EditText orderNum;
    ArrayList<String> tables = new ArrayList<String>();
    ArrayList<String> orders = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiter);

        orderNum = findViewById(R.id.orderNum);
        mDatabaseFB = FirebaseDatabase.getInstance().getReference().child("OrderReady");
        orderReadyFB = findViewById(R.id.orderReady);

        mDatabaseFB.addValueEventListener(new ValueEventListener() {
            @Override

            public void onDataChange(DataSnapshot dataSnapshot) {
                tables.clear(); // Avoids appending already existing list
                orders.clear();
                for (DataSnapshot childSnapshot: dataSnapshot.getChildren()) {
                    tables.add(childSnapshot.getValue().toString());
                    orders.add(childSnapshot.getKey().toString().substring(6));
                }

                //String orderReady = dataSnapshot.getValue().toString();
                orderReadyFB.setText("Orders READY : \n" + "Order Number : " + orders + "\n" + "Table Number : " + tables);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        Button confirmBtn = findViewById(R.id.confirmBtn);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                DatabaseReference order = FirebaseDatabase.getInstance().getReference().child("OrderReady/Order " + orderNum.getText().toString());
                order.removeValue();
                Toast.makeText(getApplicationContext(), "Order was served!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}