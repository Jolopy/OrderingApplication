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

public class MainActivity extends AppCompatActivity {

    private TextView orderReadyFB;
    private DatabaseReference mDatabaseFB;
    private Button confirmBtnFB;
    private TextView orderNumberFB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabaseFB = FirebaseDatabase.getInstance().getReference().child("OrderReady");
        orderReadyFB = (TextView) findViewById(R.id.orderReady);

        mDatabaseFB.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String orderReady = dataSnapshot.getValue().toString();
                orderReadyFB.setText("OrderReady : " + orderReady);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        confirmBtnFB = (Button) findViewById(R.id.confirmBtn);
        confirmBtnFB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //orderNumberFB = (EditText) findViewById(R.id.orderNum);
                //DatabaseReference order = FirebaseDatabase.getInstance().getReference().child("OrderReady/OrderNum" + orderNumberFB);
                DatabaseReference order = FirebaseDatabase.getInstance().getReference().child("OrderReady/OrderNum01");
                order.removeValue();

            }
        });



        //("https://ruautomation-918ed.firebaseio.com/TableNumber/1");
    }
}
