package com.example.cczec.ruautomation;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;

import java.util.Calendar;




/**
 * Created by cczec on 2/6/2018.
 */

public class HostessActivity extends AppCompatActivity {

    private int table1,table2,table3,table4,table5,table6,table7,
            table8,table9,table10,table11,table12,table13,table14,
            table15,table16,table17,table18,table19,table20 = 0;



    Handler handler = new Handler();
    int delay = 6000; //milliseconds

    int time1 = 0;

    int taken1 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostess);

        //Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference tableRef = database.getReference("TableNumber");
        final TextView tableNumber1 = findViewById(R.id.hostessTable1);
        final TextView tableNumber2 = findViewById(R.id.hostessTable2);
        final TextView tableNumber3 = findViewById(R.id.hostessTable3);
        final TextView tableNumber4 = findViewById(R.id.hostessTable4);
        final TextView tableNumber5 = findViewById(R.id.hostessTable5);
        final TextView tableNumber6 = findViewById(R.id.hostessTable6);
        final TextView tableNumber7 = findViewById(R.id.hostessTable7);
        final TextView tableNumber8 = findViewById(R.id.hostessTable8);
        final TextView tableNumber9 = findViewById(R.id.hostessTable9);
        final TextView tableNumber10 = findViewById(R.id.hostessTable10);
        final TextView tableNumber11 = findViewById(R.id.hostessTable11);
        final TextView tableNumber12 = findViewById(R.id.hostessTable12);
        final TextView tableNumber13 = findViewById(R.id.hostessTable13);
        final TextView tableNumber14 = findViewById(R.id.hostessTable14);
        final TextView tableNumber15 = findViewById(R.id.hostessTable15);
        final TextView tableNumber16 = findViewById(R.id.hostessTable16);
        final TextView tableNumber17 = findViewById(R.id.hostessTable17);
        final TextView tableNumber18 = findViewById(R.id.hostessTable18);
        final TextView tableNumber19 = findViewById(R.id.hostessTable19);
        final TextView tableNumber20 = findViewById(R.id.hostessTable20);


        final DatabaseReference t1Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/1");
        final DatabaseReference t2Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/2");
        final DatabaseReference t3Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/3");
        final DatabaseReference t4Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/4");
        final DatabaseReference t5Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/5");
        final DatabaseReference t6Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/6");
        final DatabaseReference t7Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/7");
        final DatabaseReference t8Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/8");
        final DatabaseReference t9Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/9");
        final DatabaseReference t10Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/10");
        final DatabaseReference t11Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/11");
        final DatabaseReference t12Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/12");
        final DatabaseReference t13Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/13");
        final DatabaseReference t14Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/14");
        final DatabaseReference t15Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/15");
        final DatabaseReference t16Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/16");
        final DatabaseReference t17Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/17");
        final DatabaseReference t18Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/18");
        final DatabaseReference t19Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/19");
        final DatabaseReference t20Ref = database.getReferenceFromUrl("https://ruautomation-918ed.firebaseio.com/TableNumber/20");

        final TextView timer1 = findViewById(R.id.Timer1);
        TextView timer2 = findViewById(R.id.Timer2);
        TextView timer3 = findViewById(R.id.Timer3);
        TextView timer4 = findViewById(R.id.Timer4);
        TextView timer5 = findViewById(R.id.Timer5);
        TextView timer6 = findViewById(R.id.Timer6);
        TextView timer7 = findViewById(R.id.Timer7);
        TextView timer8 = findViewById(R.id.Timer8);
        TextView timer9 = findViewById(R.id.Timer9);
        TextView timer10 = findViewById(R.id.Timer10);
        TextView timer11 = findViewById(R.id.Timer11);
        TextView timer12 = findViewById(R.id.Timer12);
        TextView timer13 = findViewById(R.id.Timer13);
        TextView timer14 = findViewById(R.id.Timer14);
        TextView timer15 = findViewById(R.id.Timer15);
        TextView timer16 = findViewById(R.id.Timer16);
        TextView timer17 = findViewById(R.id.Timer17);
        TextView timer18 = findViewById(R.id.Timer18);
        TextView timer19 = findViewById(R.id.Timer19);
        TextView timer20 = findViewById(R.id.Timer20);


        handler.postDelayed(new Runnable() {
            public void run() {
                if(taken1 == 1) {
                    time1++;
                    timer1.setText("Table 1 Time: " + time1);
                }
                handler.postDelayed(this, delay);
            }}, delay);




        t1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber1.setText("Table 1: " + value);
                if(value.equals("Cleaning")){
                    tableNumber1.setBackgroundColor(Color.YELLOW);
                    tableNumber1.setTextColor(Color.BLACK);
                    tableNumber1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("1").setValue("Empty");
                            timer1.setText("Table 1: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber1.setBackgroundColor(Color.WHITE);
                    tableNumber1.setTextColor(Color.BLACK);
                    tableNumber1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("1").setValue("Taken");
                            taken1 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber1.setBackgroundColor(Color.BLACK);
                    tableNumber1.setTextColor(Color.WHITE);

                    tableNumber1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("1").setValue("Cleaning");
                            timer1.setText("Needs Cleaning");
                            taken1 = 0;
                            time1 = 0;
                        }
                    });
                }
                else{
                    tableNumber1.setBackgroundColor(Color.WHITE);
                    tableNumber1.setTextColor(Color.BLACK);
                    tableRef.child("1").setValue("Table 1: Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }

}