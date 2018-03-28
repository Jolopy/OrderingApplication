package com.example.cczec.templateruapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView orderReadyFB;
    private DatabaseReference mDatabaseFB;
    EditText orderNum;
    ArrayList<String> tables = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orderNum = findViewById(R.id.orderNum);
        mDatabaseFB = FirebaseDatabase.getInstance().getReference().child("OrderReady");
        orderReadyFB = (TextView) findViewById(R.id.orderReady);

        mDatabaseFB.addValueEventListener(new ValueEventListener() {
            @Override

            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot childSnapshot: dataSnapshot.getChildren()) {
                    tables.add(childSnapshot.getValue().toString());
                }

                //String orderReady = dataSnapshot.getValue().toString();
                orderReadyFB.setText("Orders READY for Table Numbers : " + tables);
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
            }
        });
        //("https://ruautomation-918ed.firebaseio.com/TableNumber/1");
    }
}