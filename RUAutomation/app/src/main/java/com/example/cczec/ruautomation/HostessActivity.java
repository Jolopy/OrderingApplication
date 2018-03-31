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


    Handler handler = new Handler();
    int delay = 2000; //milliseconds

    int time1,time2,time3,time4,time5,time6,time7,time8,time9,time10,
            time11,time12,time13,time14,time15,time16,time17,time18,
            time19,time20 = 0;

    int taken1,taken2,taken3,taken4,taken5,taken6,taken7,taken8,taken9,
            taken10,taken11,taken12,taken13,taken14,taken15,
            taken16,taken17,taken18,taken19,taken20 = 0;

    public int totalAvg = 0;
    public int totalTaken = 0;
    public int totalAvgTotal = 0;


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
        final TextView timer2 = findViewById(R.id.Timer2);
        final TextView timer3 = findViewById(R.id.Timer3);
        final TextView timer4 = findViewById(R.id.Timer4);
        final TextView timer5 = findViewById(R.id.Timer5);
        final TextView timer6 = findViewById(R.id.Timer6);
        final TextView timer7 = findViewById(R.id.Timer7);
        final TextView timer8 = findViewById(R.id.Timer8);
        final TextView timer9 = findViewById(R.id.Timer9);
        final TextView timer10 = findViewById(R.id.Timer10);
        final TextView timer11 = findViewById(R.id.Timer11);
        final TextView timer12 = findViewById(R.id.Timer12);
        final TextView timer13 = findViewById(R.id.Timer13);
        final TextView timer14 = findViewById(R.id.Timer14);
        final TextView timer15 = findViewById(R.id.Timer15);
        final TextView timer16 = findViewById(R.id.Timer16);
        final TextView timer17 = findViewById(R.id.Timer17);
        final TextView timer18 = findViewById(R.id.Timer18);
        final TextView timer20 = findViewById(R.id.Timer20);

        final   TextView avg =  findViewById(R.id.avgWaitTime);


        handler.postDelayed(new Runnable() {
            public void run() {
                if(taken1 == 1) {
                    time1++;
                    timer1.setText("Table 1 Time: " + time1);
                }
                if(taken2 == 1) {
                    time2++;
                    timer2.setText("Table 2 Time: " + time2);
                }
                if(taken3 == 1) {
                    time3++;
                    timer3.setText("Table 3 Time: " + time3);
                }
                if(taken4 == 1) {
                    time4++;
                    timer4.setText("Table 4 Time: " + time4);
                }
                handler.postDelayed(this, delay);
            }}, delay);



        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 1~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
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
                            timer1.setText("Table 1: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time1;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
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
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 2~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber2.setText("Table 2: " + value);
                if(value.equals("Cleaning")){
                    tableNumber2.setBackgroundColor(Color.YELLOW);
                    tableNumber2.setTextColor(Color.BLACK);
                    tableNumber2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("2").setValue("Empty");
                            timer2.setText("Table 2: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber2.setBackgroundColor(Color.WHITE);
                    tableNumber2.setTextColor(Color.BLACK);
                    tableNumber2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("2").setValue("Taken");
                            taken2 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber2.setBackgroundColor(Color.BLACK);
                    tableNumber2.setTextColor(Color.WHITE);

                    tableNumber2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("2").setValue("Cleaning");
                            timer2.setText("Table 2: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time2;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken2 = 0;
                            time2 = 0;
                        }
                    });
                }
                else{
                    tableNumber2.setBackgroundColor(Color.WHITE);
                    tableNumber2.setTextColor(Color.BLACK);
                    tableRef.child("2").setValue("Table 2: Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 3~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber3.setText("Table 3: " + value);
                if(value.equals("Cleaning")){
                    tableNumber3.setBackgroundColor(Color.YELLOW);
                    tableNumber3.setTextColor(Color.BLACK);
                    tableNumber3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("3").setValue("Empty");
                            timer3.setText("Table 3: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber3.setBackgroundColor(Color.WHITE);
                    tableNumber3.setTextColor(Color.BLACK);
                    tableNumber3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("3").setValue("Taken");
                            taken3 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber3.setBackgroundColor(Color.BLACK);
                    tableNumber3.setTextColor(Color.WHITE);

                    tableNumber3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("3").setValue("Cleaning");
                            timer3.setText("Table 3: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time3;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken3 = 0;
                            time3 = 0;
                        }
                    });
                }
                else{
                    tableNumber3.setBackgroundColor(Color.WHITE);
                    tableNumber3.setTextColor(Color.BLACK);
                    tableRef.child("3").setValue("Table 3: Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 4~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t4Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber4.setText("Table 4: " + value);
                if(value.equals("Cleaning")){
                    tableNumber4.setBackgroundColor(Color.YELLOW);
                    tableNumber4.setTextColor(Color.BLACK);
                    tableNumber4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("4").setValue("Empty");
                            timer4.setText("Table 4: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber4.setBackgroundColor(Color.WHITE);
                    tableNumber4.setTextColor(Color.BLACK);
                    tableNumber4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("4").setValue("Taken");
                            taken4 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber4.setBackgroundColor(Color.BLACK);
                    tableNumber4.setTextColor(Color.WHITE);

                    tableNumber4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("4").setValue("Cleaning");
                            timer4.setText("Table 4: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time4;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken4 = 0;
                            time4 = 0;
                        }
                    });
                }
                else{
                    tableNumber4.setBackgroundColor(Color.WHITE);
                    tableNumber4.setTextColor(Color.BLACK);
                    tableRef.child("4").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }

}