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
        final TextView timer19 = findViewById(R.id.Timer19);
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
                if(taken5 == 1) {
                    time5++;
                    timer5.setText("Table 5 Time: " + time5);
                }
                if(taken6 == 1) {
                    time6++;
                    timer6.setText("Table 6 Time: " + time6);
                }
                if(taken7 == 1) {
                    time7++;
                    timer7.setText("Table 7 Time: " + time7);
                }
                if(taken8 == 1) {
                    time8++;
                    timer8.setText("Table 8 Time: " + time8);
                }
                if(taken9 == 1) {
                    time9++;
                    timer9.setText("Table 9 Time: " + time9);
                }
                if(taken10 == 1) {
                    time10++;
                    timer10.setText("Table 10 Time: " + time10);
                }
                if(taken11 == 1) {
                    time11++;
                    timer11.setText("Table 11 Time: " + time11);
                }
                if(taken12 == 1) {
                    time12++;
                    timer12.setText("Table 12 Time: " + time12);
                }
                if(taken13 == 1) {
                    time13++;
                    timer13.setText("Table 13 Time: " + time13);
                }
                if(taken14 == 1) {
                    time14++;
                    timer14.setText("Table 14 Time: " + time14);
                }
                if(taken15 == 1) {
                    time15++;
                    timer15.setText("Table 15 Time: " + time15);
                }
                if(taken16 == 1) {
                    time16++;
                    timer16.setText("Table 16 Time: " + time16);
                }
                if(taken17 == 1) {
                    time17++;
                    timer17.setText("Table 17 Time: " + time17);
                }
                if(taken18 == 1) {
                    time18++;
                    timer18.setText("Table 18 Time: " + time18);
                }
                if(taken19 == 1) {
                    time19++;
                    timer19.setText("Table 19 Time: " + time19);
                }
                if(taken20 == 1) {
                    time20++;
                    timer20.setText("Table 20 Time: " + time20);
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
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 5~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t5Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber5.setText("Table 5: " + value);
                if(value.equals("Cleaning")){
                    tableNumber5.setBackgroundColor(Color.YELLOW);
                    tableNumber5.setTextColor(Color.BLACK);
                    tableNumber5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("5").setValue("Empty");
                            timer5.setText("Table 5: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber5.setBackgroundColor(Color.WHITE);
                    tableNumber5.setTextColor(Color.BLACK);
                    tableNumber5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("5").setValue("Taken");
                            taken5 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber5.setBackgroundColor(Color.BLACK);
                    tableNumber5.setTextColor(Color.WHITE);

                    tableNumber5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("5").setValue("Cleaning");
                            timer5.setText("Table 5: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time5;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken5 = 0;
                            time5 = 0;
                        }
                    });
                }
                else{
                    tableNumber5.setBackgroundColor(Color.WHITE);
                    tableNumber5.setTextColor(Color.BLACK);
                    tableRef.child("5").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 6~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t6Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber6.setText("Table 6: " + value);
                if(value.equals("Cleaning")){
                    tableNumber6.setBackgroundColor(Color.YELLOW);
                    tableNumber6.setTextColor(Color.BLACK);
                    tableNumber6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("6").setValue("Empty");
                            timer6.setText("Table 6: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber6.setBackgroundColor(Color.WHITE);
                    tableNumber6.setTextColor(Color.BLACK);
                    tableNumber6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("6").setValue("Taken");
                            taken6 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber6.setBackgroundColor(Color.BLACK);
                    tableNumber6.setTextColor(Color.WHITE);

                    tableNumber6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("6").setValue("Cleaning");
                            timer6.setText("Table 6: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time6;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken6 = 0;
                            time6 = 0;
                        }
                    });
                }
                else{
                    tableNumber6.setBackgroundColor(Color.WHITE);
                    tableNumber6.setTextColor(Color.BLACK);
                    tableRef.child("6").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 7~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t7Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber7.setText("Table 7: " + value);
                if(value.equals("Cleaning")){
                    tableNumber7.setBackgroundColor(Color.YELLOW);
                    tableNumber7.setTextColor(Color.BLACK);
                    tableNumber7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("7").setValue("Empty");
                            timer7.setText("Table 7: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber7.setBackgroundColor(Color.WHITE);
                    tableNumber7.setTextColor(Color.BLACK);
                    tableNumber7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("7").setValue("Taken");
                            taken7 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber7.setBackgroundColor(Color.BLACK);
                    tableNumber7.setTextColor(Color.WHITE);

                    tableNumber7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("7").setValue("Cleaning");
                            timer7.setText("Table 7: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time7;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken7 = 0;
                            time7 = 0;
                        }
                    });
                }
                else{
                    tableNumber7.setBackgroundColor(Color.WHITE);
                    tableNumber7.setTextColor(Color.BLACK);
                    tableRef.child("7").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 8~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t8Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber8.setText("Table 8: " + value);
                if(value.equals("Cleaning")){
                    tableNumber8.setBackgroundColor(Color.YELLOW);
                    tableNumber8.setTextColor(Color.BLACK);
                    tableNumber8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("8").setValue("Empty");
                            timer8.setText("Table 8: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber8.setBackgroundColor(Color.WHITE);
                    tableNumber8.setTextColor(Color.BLACK);
                    tableNumber8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("8").setValue("Taken");
                            taken8 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber8.setBackgroundColor(Color.BLACK);
                    tableNumber8.setTextColor(Color.WHITE);

                    tableNumber8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("8").setValue("Cleaning");
                            timer8.setText("Table 8: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time8;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken8 = 0;
                            time8 = 0;
                        }
                    });
                }
                else{
                    tableNumber8.setBackgroundColor(Color.WHITE);
                    tableNumber8.setTextColor(Color.BLACK);
                    tableRef.child("8").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 9~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t9Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber9.setText("Table 9: " + value);
                if(value.equals("Cleaning")){
                    tableNumber9.setBackgroundColor(Color.YELLOW);
                    tableNumber9.setTextColor(Color.BLACK);
                    tableNumber9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("9").setValue("Empty");
                            timer9.setText("Table 9: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber9.setBackgroundColor(Color.WHITE);
                    tableNumber9.setTextColor(Color.BLACK);
                    tableNumber9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("9").setValue("Taken");
                            taken9 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber9.setBackgroundColor(Color.BLACK);
                    tableNumber9.setTextColor(Color.WHITE);

                    tableNumber9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("9").setValue("Cleaning");
                            timer9.setText("Table 9: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time9;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken9 = 0;
                            time9 = 0;
                        }
                    });
                }
                else{
                    tableNumber9.setBackgroundColor(Color.WHITE);
                    tableNumber9.setTextColor(Color.BLACK);
                    tableRef.child("9").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 10~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t10Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber10.setText("Table 10: " + value);
                if(value.equals("Cleaning")){
                    tableNumber10.setBackgroundColor(Color.YELLOW);
                    tableNumber10.setTextColor(Color.BLACK);
                    tableNumber10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("10").setValue("Empty");
                            timer10.setText("Table 10: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber10.setBackgroundColor(Color.WHITE);
                    tableNumber10.setTextColor(Color.BLACK);
                    tableNumber10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("10").setValue("Taken");
                            taken10 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber10.setBackgroundColor(Color.BLACK);
                    tableNumber10.setTextColor(Color.WHITE);

                    tableNumber10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("10").setValue("Cleaning");
                            timer10.setText("Table 10: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time10;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken10 = 0;
                            time10 = 0;
                        }
                    });
                }
                else{
                    tableNumber10.setBackgroundColor(Color.WHITE);
                    tableNumber10.setTextColor(Color.BLACK);
                    tableRef.child("10").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 11~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t11Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber11.setText("Table 11: " + value);
                if(value.equals("Cleaning")){
                    tableNumber11.setBackgroundColor(Color.YELLOW);
                    tableNumber11.setTextColor(Color.BLACK);
                    tableNumber11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("11").setValue("Empty");
                            timer11.setText("Table 11: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber11.setBackgroundColor(Color.WHITE);
                    tableNumber11.setTextColor(Color.BLACK);
                    tableNumber11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("11").setValue("Taken");
                            taken11 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber11.setBackgroundColor(Color.BLACK);
                    tableNumber11.setTextColor(Color.WHITE);

                    tableNumber11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("11").setValue("Cleaning");
                            timer11.setText("Table 11: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time11;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken11 = 0;
                            time11 = 0;
                        }
                    });
                }
                else{
                    tableNumber11.setBackgroundColor(Color.WHITE);
                    tableNumber11.setTextColor(Color.BLACK);
                    tableRef.child("11").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 12~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t12Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber12.setText("Table 12: " + value);
                if(value.equals("Cleaning")){
                    tableNumber12.setBackgroundColor(Color.YELLOW);
                    tableNumber12.setTextColor(Color.BLACK);
                    tableNumber12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("12").setValue("Empty");
                            timer12.setText("Table 12: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber12.setBackgroundColor(Color.WHITE);
                    tableNumber12.setTextColor(Color.BLACK);
                    tableNumber12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("12").setValue("Taken");
                            taken12 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber12.setBackgroundColor(Color.BLACK);
                    tableNumber12.setTextColor(Color.WHITE);

                    tableNumber12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("12").setValue("Cleaning");
                            timer12.setText("Table 12: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time12;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken12 = 0;
                            time12 = 0;
                        }
                    });
                }
                else{
                    tableNumber12.setBackgroundColor(Color.WHITE);
                    tableNumber12.setTextColor(Color.BLACK);
                    tableRef.child("12").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 13~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t13Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber13.setText("Table 13: " + value);
                if(value.equals("Cleaning")){
                    tableNumber13.setBackgroundColor(Color.YELLOW);
                    tableNumber13.setTextColor(Color.BLACK);
                    tableNumber13.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("13").setValue("Empty");
                            timer13.setText("Table 13: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber13.setBackgroundColor(Color.WHITE);
                    tableNumber13.setTextColor(Color.BLACK);
                    tableNumber13.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("13").setValue("Taken");
                            taken13 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber13.setBackgroundColor(Color.BLACK);
                    tableNumber13.setTextColor(Color.WHITE);

                    tableNumber13.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("13").setValue("Cleaning");
                            timer13.setText("Table 13: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time13;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken13 = 0;
                            time13 = 0;
                        }
                    });
                }
                else{
                    tableNumber13.setBackgroundColor(Color.WHITE);
                    tableNumber13.setTextColor(Color.BLACK);
                    tableRef.child("13").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 14~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t14Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber14.setText("Table 14: " + value);
                if(value.equals("Cleaning")){
                    tableNumber14.setBackgroundColor(Color.YELLOW);
                    tableNumber14.setTextColor(Color.BLACK);
                    tableNumber14.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("14").setValue("Empty");
                            timer14.setText("Table 14: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber14.setBackgroundColor(Color.WHITE);
                    tableNumber14.setTextColor(Color.BLACK);
                    tableNumber14.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("14").setValue("Taken");
                            taken14 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber14.setBackgroundColor(Color.BLACK);
                    tableNumber14.setTextColor(Color.WHITE);

                    tableNumber14.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("14").setValue("Cleaning");
                            timer14.setText("Table 14: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time14;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken14 = 0;
                            time14 = 0;
                        }
                    });
                }
                else{
                    tableNumber14.setBackgroundColor(Color.WHITE);
                    tableNumber14.setTextColor(Color.BLACK);
                    tableRef.child("14").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 15~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t15Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber15.setText("Table 15: " + value);
                if(value.equals("Cleaning")){
                    tableNumber15.setBackgroundColor(Color.YELLOW);
                    tableNumber15.setTextColor(Color.BLACK);
                    tableNumber15.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("15").setValue("Empty");
                            timer15.setText("Table 15: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber15.setBackgroundColor(Color.WHITE);
                    tableNumber15.setTextColor(Color.BLACK);
                    tableNumber15.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("15").setValue("Taken");
                            taken15 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber15.setBackgroundColor(Color.BLACK);
                    tableNumber15.setTextColor(Color.WHITE);
                    tableNumber15.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("15").setValue("Cleaning");
                            timer15.setText("Table 15: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time15;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken15 = 0;
                            time15 = 0;
                        }
                    });
                }
                else{
                    tableNumber15.setBackgroundColor(Color.WHITE);
                    tableNumber15.setTextColor(Color.BLACK);
                    tableRef.child("15").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 16~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t16Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber16.setText("Table 16: " + value);
                if(value.equals("Cleaning")){
                    tableNumber16.setBackgroundColor(Color.YELLOW);
                    tableNumber16.setTextColor(Color.BLACK);
                    tableNumber16.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("16").setValue("Empty");
                            timer16.setText("Table 16: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber16.setBackgroundColor(Color.WHITE);
                    tableNumber16.setTextColor(Color.BLACK);
                    tableNumber16.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("16").setValue("Taken");
                            taken16 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber16.setBackgroundColor(Color.BLACK);
                    tableNumber16.setTextColor(Color.WHITE);

                    tableNumber16.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("16").setValue("Cleaning");
                            timer16.setText("Table 16: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time16;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken16 = 0;
                            time16 = 0;
                        }
                    });
                }
                else{
                    tableNumber16.setBackgroundColor(Color.WHITE);
                    tableNumber16.setTextColor(Color.BLACK);
                    tableRef.child("16").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 17~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t17Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber17.setText("Table 17: " + value);
                if(value.equals("Cleaning")){
                    tableNumber17.setBackgroundColor(Color.YELLOW);
                    tableNumber17.setTextColor(Color.BLACK);
                    tableNumber17.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("17").setValue("Empty");
                            timer17.setText("Table 17: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber17.setBackgroundColor(Color.WHITE);
                    tableNumber17.setTextColor(Color.BLACK);
                    tableNumber17.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("17").setValue("Taken");
                            taken17 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber17.setBackgroundColor(Color.BLACK);
                    tableNumber17.setTextColor(Color.WHITE);

                    tableNumber17.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("17").setValue("Cleaning");
                            timer17.setText("Table 17: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time17;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken17 = 0;
                            time17 = 0;
                        }
                    });
                }
                else{
                    tableNumber17.setBackgroundColor(Color.WHITE);
                    tableNumber17.setTextColor(Color.BLACK);
                    tableRef.child("17").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 18~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t18Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber18.setText("Table 18: " + value);
                if(value.equals("Cleaning")){
                    tableNumber18.setBackgroundColor(Color.YELLOW);
                    tableNumber18.setTextColor(Color.BLACK);
                    tableNumber18.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("18").setValue("Empty");
                            timer18.setText("Table 18: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber18.setBackgroundColor(Color.WHITE);
                    tableNumber18.setTextColor(Color.BLACK);
                    tableNumber18.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("18").setValue("Taken");
                            taken18 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber18.setBackgroundColor(Color.BLACK);
                    tableNumber18.setTextColor(Color.WHITE);

                    tableNumber18.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("18").setValue("Cleaning");
                            timer18.setText("Table 18: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time18;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken18 = 0;
                            time18 = 0;
                        }
                    });
                }
                else{
                    tableNumber18.setBackgroundColor(Color.WHITE);
                    tableNumber18.setTextColor(Color.BLACK);
                    tableRef.child("18").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 19~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t19Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber19.setText("Table 19: " + value);
                if(value.equals("Cleaning")){
                    tableNumber19.setBackgroundColor(Color.YELLOW);
                    tableNumber19.setTextColor(Color.BLACK);
                    tableNumber19.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("19").setValue("Empty");
                            timer19.setText("Table 19: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber19.setBackgroundColor(Color.WHITE);
                    tableNumber19.setTextColor(Color.BLACK);
                    tableNumber19.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("19").setValue("Taken");
                            taken19 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber19.setBackgroundColor(Color.BLACK);
                    tableNumber19.setTextColor(Color.WHITE);

                    tableNumber19.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("19").setValue("Cleaning");
                            timer19.setText("Table 19: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time19;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken19 = 0;
                            time19 = 0;
                        }
                    });
                }
                else{
                    tableNumber19.setBackgroundColor(Color.WHITE);
                    tableNumber19.setTextColor(Color.BLACK);
                    tableRef.child("19").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE 20~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        t20Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                tableNumber20.setText("Table 20: " + value);
                if(value.equals("Cleaning")){
                    tableNumber20.setBackgroundColor(Color.YELLOW);
                    tableNumber20.setTextColor(Color.BLACK);
                    tableNumber20.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("20").setValue("Empty");
                            timer20.setText("Table 20: Empty");
                        }
                    });
                }
                else if(value.equals("Empty")){
                    tableNumber20.setBackgroundColor(Color.WHITE);
                    tableNumber20.setTextColor(Color.BLACK);
                    tableNumber20.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("20").setValue("Taken");
                            taken20 = 1;
                        }
                    });
                }
                else if(value.equals("Taken")){
                    tableNumber20.setBackgroundColor(Color.BLACK);
                    tableNumber20.setTextColor(Color.WHITE);

                    tableNumber20.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("20").setValue("Cleaning");
                            timer20.setText("Table 20: Needs Cleaning");
                            totalTaken++;
                            totalAvgTotal = totalAvgTotal + time20;
                            totalAvg = totalAvgTotal/totalTaken;
                            avg.setText("Avg Wait: " + totalAvg + "min");
                            taken20 = 0;
                            time20 = 0;
                        }
                    });
                }
                else{
                    tableNumber20.setBackgroundColor(Color.WHITE);
                    tableNumber20.setTextColor(Color.BLACK);
                    tableRef.child("20").setValue("Empty");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }

}