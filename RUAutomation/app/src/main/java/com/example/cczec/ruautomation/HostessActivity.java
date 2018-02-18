package com.example.cczec.ruautomation;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;



/**
 * Created by cczec on 2/6/2018.
 */

public class HostessActivity extends AppCompatActivity {

    private int table1,table2,table3,table4,table5,table6,table7,
            table8,table9,table10,table11,table12,table13,table14,
            table15,table16,table17,table18,table19,table20 = 0;

    Timer tableTimer = new Timer();

    private int table1SeatedTime1 = 0;
    private int table1SeatedTime2 = 0;
    private int table1SeatedTime3 = 0;
    private int table1SeatedTime4 = 0;
    private int table1SeatedTime5 = 0;
    private int table1SeatedTime6 = 0;
    private int table1SeatedTime7 = 0;
    private int table1SeatedTime8 = 0;
    private int table1SeatedTime9 = 0;
    private int table1SeatedTime10 = 0;
    private int table1SeatedTime11 = 0;
    private int table1SeatedTime12 = 0;
    private int table1SeatedTime13 = 0;
    private int table1SeatedTime14 = 0;
    private int table1SeatedTime15 = 0;
    private int table1SeatedTime16 = 0;
    private int table1SeatedTime17 = 0;
    private int table1SeatedTime18 = 0;
    private int table1SeatedTime19 = 0;
    private int table1SeatedTime20 = 0;


    private int seated1 = 0;
    private int seated2 = 0;
    private int seated3 = 0;
    private int seated4 = 0;
    private int seated5 = 0;
    private int seated6 = 0;
    private int seated7 = 0;
    private int seated8 = 0;
    private int seated9 = 0;
    private int seated10 = 0;
    private int seated11 = 0;
    private int seated12 = 0;
    private int seated13 = 0;
    private int seated14 = 0;
    private int seated15 = 0;
    private int seated16 = 0;
    private int seated17 = 0;
    private int seated18 = 0;
    private int seated19 = 0;
    private int seated20 = 0;

    private int tableAvgTime = 0;
    private int tableAvgCount = 0;
    private int tableTotalAvg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostess);

        //Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference tableRef = database.getReference("TableNumber");
        final ImageButton tableNumber1 = findViewById(R.id.tableNumber1);
        final ImageButton tableNumber2 = findViewById(R.id.tableNumber2);
        final ImageButton tableNumber3 = findViewById(R.id.tableNumber3);
        final ImageButton tableNumber4 = findViewById(R.id.tableNumber4);
        final ImageButton tableNumber5 = findViewById(R.id.tableNumber5);
        final ImageButton tableNumber6 = findViewById(R.id.tableNumber6);
        final ImageButton tableNumber7 = findViewById(R.id.tableNumber7);
        final ImageButton tableNumber8 = findViewById(R.id.tableNumber8);
        final ImageButton tableNumber9 = findViewById(R.id.tableNumber9);
        final ImageButton tableNumber10 = findViewById(R.id.tableNumber10);
        final ImageButton tableNumber11 = findViewById(R.id.tableNumber11);
        final ImageButton tableNumber12 = findViewById(R.id.tableNumber12);
        final ImageButton tableNumber13 = findViewById(R.id.tableNumber13);
        final ImageButton tableNumber14 = findViewById(R.id.tableNumber14);
        final ImageButton tableNumber15 = findViewById(R.id.tableNumber15);
        final ImageButton tableNumber16 = findViewById(R.id.tableNumber16);
        final ImageButton tableNumber17 = findViewById(R.id.tableNumber17);
        final ImageButton tableNumber18 = findViewById(R.id.tableNumber18);
        final ImageButton tableNumber19 = findViewById(R.id.tableNumber19);
        final ImageButton tableNumber20 = findViewById(R.id.tableNumber20);

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

        final TextView avgWaitTime = findViewById(R.id.avgWaitTime);



        Timer tableTimer = new Timer();
        tableTimer.scheduleAtFixedRate(new TimerTask() {
                                             @Override
                                             public void run() {
                                                 //Called at every 1000 milliseconds (1 second)
                                                 if(seated1 == 1) {
                                                     Log.i("Table Time 1: ", "Minute Added");
                                                     table1SeatedTime1 = table1SeatedTime1 + 1;
                                                     timer1.setText("Table 1 Time: " + table1SeatedTime1);
                                                 }
                                                 if(seated2 == 1) {
                                                     Log.i("Table Time 2: ", "Minute Added");
                                                     table1SeatedTime2 = table1SeatedTime2 + 1;
                                                     timer2.setText("Table 2 Time: " + table1SeatedTime2);
                                                 }
                                                 if(seated3 == 1) {
                                                     Log.i("Table Time 3: ", "Minute Added");
                                                     table1SeatedTime3 = table1SeatedTime3 + 1;
                                                     timer3.setText("Table 3 Time: " + table1SeatedTime3);
                                                 }
                                                 if(seated4 == 1) {
                                                     Log.i("Table Time 4: ", "Minute Added");
                                                     table1SeatedTime4 = table1SeatedTime4 + 1;
                                                     timer4.setText("Table 4 Time: " + table1SeatedTime4);
                                                 }
                                                 if(seated5 == 1) {
                                                     Log.i("Table Time 5: ", "Minute Added");
                                                     table1SeatedTime5 = table1SeatedTime5 + 1;
                                                     timer5.setText("Table 5 Time: " + table1SeatedTime5);
                                                 }
                                                 if(seated6 == 1) {
                                                     Log.i("Table Time 6: ", "Minute Added");
                                                     table1SeatedTime6 = table1SeatedTime6 + 1;
                                                     timer6.setText("Table 6 Time: " + table1SeatedTime6);
                                                 }
                                                 if(seated7 == 1) {
                                                     Log.i("Table Time 7: ", "Minute Added");
                                                     table1SeatedTime7 = table1SeatedTime7 + 1;
                                                     timer7.setText("Table 7 Time: " + table1SeatedTime7);
                                                 }
                                                 if(seated8 == 1) {
                                                     Log.i("Table Time 8: ", "Minute Added");
                                                     table1SeatedTime8 = table1SeatedTime8 + 1;
                                                     timer8.setText("Table 8 Time: " + table1SeatedTime8);
                                                 }
                                                 if(seated9 == 1) {
                                                     Log.i("Table Time 9: ", "Minute Added");
                                                     table1SeatedTime9 = table1SeatedTime9 + 1;
                                                     timer9.setText("Table 9 Time: " + table1SeatedTime9);
                                                 }
                                                 if(seated10 == 1) {
                                                     Log.i("Table Time 10: ", "Minute Added");
                                                     table1SeatedTime10 = table1SeatedTime10 + 1;
                                                     timer10.setText("Table 10 Time: " + table1SeatedTime10);
                                                 }
                                                 if(seated11 == 1) {
                                                     Log.i("Table Time 11: ", "Minute Added");
                                                     table1SeatedTime11 = table1SeatedTime11 + 1;
                                                     timer11.setText("Table 11 Time: " + table1SeatedTime11);
                                                 }
                                                 if(seated12 == 1) {
                                                     Log.i("Table Time 12: ", "Minute Added");
                                                     table1SeatedTime12 = table1SeatedTime12 + 1;
                                                     timer12.setText("Table 12 Time: " + table1SeatedTime12);
                                                 }
                                                 if(seated13 == 1) {
                                                     Log.i("Table Time 13: ", "Minute Added");
                                                     table1SeatedTime13 = table1SeatedTime13 + 1;
                                                     timer13.setText("Table 13 Time: " + table1SeatedTime13);
                                                 }
                                                 if(seated14 == 1) {
                                                     Log.i("Table Time 14: ", "Minute Added");
                                                     table1SeatedTime14 = table1SeatedTime14 + 1;
                                                     timer14.setText("Table 14 Time: " + table1SeatedTime14);
                                                 }
                                                 if(seated15 == 1) {
                                                     Log.i("Table Time 15: ", "Minute Added");
                                                     table1SeatedTime15 = table1SeatedTime15 + 1;
                                                     timer15.setText("Table 15 Time: " + table1SeatedTime15);
                                                 }
                                                 if(seated16 == 1) {
                                                     Log.i("Table Time 16: ", "Minute Added");
                                                     table1SeatedTime16 = table1SeatedTime16 + 1;
                                                     timer16.setText("Table 16 Time: " + table1SeatedTime16);
                                                 }
                                                 if(seated17 == 1) {
                                                     Log.i("Table Time 17: ", "Minute Added");
                                                     table1SeatedTime17 = table1SeatedTime17 + 1;
                                                     timer17.setText("Table 17 Time: " + table1SeatedTime17);
                                                 }
                                                 if(seated18 == 1) {
                                                     Log.i("Table Time 18: ", "Minute Added");
                                                     table1SeatedTime18 = table1SeatedTime18 + 1;
                                                     timer18.setText("Table 18 Time: " + table1SeatedTime18);
                                                 }
                                                 if(seated19 == 1) {
                                                     Log.i("Table Time 19: ", "Minute Added");
                                                     table1SeatedTime19 = table1SeatedTime19 + 1;
                                                     timer19.setText("Table 19 Time: " + table1SeatedTime19);
                                                 }
                                                 if(seated20 == 1) {
                                                     Log.i("Table Time 20: ", "Minute Added");
                                                     table1SeatedTime20 = table1SeatedTime20 + 1;
                                                     timer20.setText("Table 20 Time: " + table1SeatedTime20);
                                                 }


                                             }
                                       },
                //set the amount of time in milliseconds before first execution
                0,
                //Set the amount of time between each execution (in milliseconds)
                6000);





        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 1
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table1 == 2)
                {
                    tableNumber1.setBackgroundResource(R.drawable.empty);
                    tableRef.child("1").setValue("Empty");
                    table1 = 0;
                    //TIMER
                    timer1.setText("Table 1 Open");
                    //TIMER
                }
                else if(table1 == 1)
                {
                    tableNumber1.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("1").setValue("Cleaning");
                    table1++;

                    //TIMER
                    timer1.setText("Table 1 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime1;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated1 = 0;
                    table1SeatedTime1 = 0;
                    //TIMER
                }
                else if(table1 == 0)
                {
                    tableNumber1.setBackgroundResource(R.drawable.taken);
                    tableRef.child("1").setValue("Taken");
                    table1++;
                    //TIMER
                    seated1 = 1;
                    //TIMER
                }
                else{
                    tableNumber1.setBackgroundResource(R.drawable.empty);
                    tableRef.child("1").setValue("Empty");
                    table1 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 2
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table2 == 2)
                {
                    tableNumber2.setBackgroundResource(R.drawable.empty);
                    tableRef.child("2").setValue("Empty");
                    table2 = 0;
                    //TIMER
                    timer2.setText("Table 2 Open");
                    //TIMER

                }
                else if(table2 == 1)
                {
                    tableNumber2.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("2").setValue("Cleaning");
                    table2++;
                    //TIMER
                    timer2.setText("Table 2 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime2;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated2 = 0;
                    table1SeatedTime2 = 0;
                    //TIMER

                }
                else if(table2 == 0)
                {
                    tableNumber2.setBackgroundResource(R.drawable.taken);
                    tableRef.child("2").setValue("Taken");
                    table2++;
                    //TIMER
                    seated2 = 1;
                    //TIMER

                }
                else{
                    tableNumber2.setBackgroundResource(R.drawable.empty);
                    tableRef.child("2").setValue("Empty");
                    table2 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 3
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table3 == 2)
                {
                    tableNumber3.setBackgroundResource(R.drawable.empty);
                    tableRef.child("3").setValue("Empty");
                    table3 = 0;
                    //TIMER
                    timer3.setText("Table 3 Open");
                    //TIMER

                }
                else if(table3 == 1)
                {
                    tableNumber3.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("3").setValue("Cleaning");
                    table3++;
                    //TIMER
                    timer3.setText("Table 3 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime3;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated3 = 0;
                    table1SeatedTime3 = 0;
                    //TIMER

                }
                else if(table3 == 0)
                {
                    tableNumber3.setBackgroundResource(R.drawable.taken);
                    tableRef.child("3").setValue("Taken");
                    table3++;
                    //TIMER
                    seated3 = 1;
                    //TIMER

                }
                else{
                    tableNumber3.setBackgroundResource(R.drawable.empty);
                    tableRef.child("3").setValue("Empty");
                    table3 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 4
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table4 == 2)
                {
                    tableNumber4.setBackgroundResource(R.drawable.empty);
                    tableRef.child("4").setValue("Empty");
                    table4 = 0;
                    //TIMER
                    timer4.setText("Table 4 Open");
                    //TIMER

                }
                else if(table4 == 1)
                {
                    tableNumber4.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("4").setValue("Cleaning");
                    table4++;
                    //TIMER
                    timer4.setText("Table 4 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime4;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated4 = 0;
                    table1SeatedTime4 = 0;
                    //TIMER

                }
                else if(table4 == 0)
                {
                    tableNumber4.setBackgroundResource(R.drawable.taken);
                    tableRef.child("4").setValue("Taken");
                    table4++;
                    //TIMER
                    seated4 = 1;
                    //TIMER

                }
                else{
                    tableNumber4.setBackgroundResource(R.drawable.empty);
                    tableRef.child("4").setValue("Empty");
                    table4 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 5
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table5 == 2)
                {
                    tableNumber5.setBackgroundResource(R.drawable.empty);
                    tableRef.child("5").setValue("Empty");
                    table5 = 0;
                    //TIMER
                    timer5.setText("Table 5 Open");
                    //TIMER

                }
                else if(table5 == 1)
                {
                    tableNumber5.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("5").setValue("Cleaning");
                    table5++;
                    //TIMER
                    timer5.setText("Table 5 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime5;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated5 = 0;
                    table1SeatedTime5 = 0;
                    //TIMER

                }
                else if(table5 == 0)
                {
                    tableNumber5.setBackgroundResource(R.drawable.taken);
                    tableRef.child("5").setValue("Taken");
                    table5++;
                    //TIMER
                    seated5 = 1;
                    //TIMER
                }
                else{
                    tableNumber5.setBackgroundResource(R.drawable.empty);
                    tableRef.child("5").setValue("Empty");
                    table5 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 6
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table6 == 2)
                {
                    tableNumber6.setBackgroundResource(R.drawable.empty);
                    tableRef.child("6").setValue("Empty");
                    table6 = 0;
                    //TIMER
                    timer6.setText("Table 6 Open");
                    //TIMER
                }
                else if(table6 == 1)
                {
                    tableNumber6.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("6").setValue("Cleaning");
                    table6++;
                    //TIMER
                    timer6.setText("Table 6 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime6;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated6 = 0;
                    table1SeatedTime6 = 0;
                    //TIMER
                }
                else if(table6 == 0)
                {
                    tableNumber6.setBackgroundResource(R.drawable.taken);
                    tableRef.child("6").setValue("Taken");
                    table6++;
                    //TIMER
                    seated6 = 1;
                    //TIMER
                }
                else{
                    tableNumber6.setBackgroundResource(R.drawable.empty);
                    tableRef.child("6").setValue("Empty");
                    table6 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 7
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table7 == 2)
                {
                    tableNumber7.setBackgroundResource(R.drawable.empty);
                    tableRef.child("7").setValue("Empty");
                    table7 = 0;
                    //TIMER
                    timer7.setText("Table 7 Open");
                    //TIMER
                }
                else if(table7 == 1)
                {
                    tableNumber7.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("7").setValue("Cleaning");
                    table7++;
                    //TIMER
                    timer7.setText("Table 7 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime7;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated7 = 0;
                    table1SeatedTime7 = 0;
                    //TIMER
                }
                else if(table7 == 0)
                {
                    tableNumber7.setBackgroundResource(R.drawable.taken);
                    tableRef.child("7").setValue("Taken");
                    table7++;
                    //TIMER
                    seated7 = 1;
                    //TIMER
                }
                else{
                    tableNumber7.setBackgroundResource(R.drawable.empty);
                    tableRef.child("7").setValue("Empty");
                    table7 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 8
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table8 == 2)
                {
                    tableNumber8.setBackgroundResource(R.drawable.empty);
                    tableRef.child("8").setValue("Empty");
                    table8 = 0;
                    //TIMER
                    timer8.setText("Table 8 Open");
                    //TIMER
                }
                else if(table8 == 1)
                {
                    tableNumber8.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("8").setValue("Cleaning");
                    table8++;
                    //TIMER
                    timer8.setText("Table 8 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime8;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated8 = 0;
                    table1SeatedTime8 = 0;
                    //TIMER
                }
                else if(table8 == 0)
                {
                    tableNumber8.setBackgroundResource(R.drawable.taken);
                    tableRef.child("8").setValue("Taken");
                    table8++;
                    //TIMER
                    seated8 = 1;
                    //TIMER
                }
                else{
                    tableNumber8.setBackgroundResource(R.drawable.empty);
                    tableRef.child("8").setValue("Empty");
                    table8 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 9
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table9 == 2)
                {
                    tableNumber9.setBackgroundResource(R.drawable.empty);
                    tableRef.child("9").setValue("Empty");
                    table9 = 0;
                    //TIMER
                    timer9.setText("Table 9 Open");
                    //TIMER
                }
                else if(table9 == 1)
                {
                    tableNumber9.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("9").setValue("Cleaning");
                    table9++;
                    //TIMER
                    timer9.setText("Table 9 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime9;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated9 = 0;
                    table1SeatedTime9 = 0;
                    //TIMER
                }
                else if(table9 == 0)
                {
                    tableNumber9.setBackgroundResource(R.drawable.taken);
                    tableRef.child("9").setValue("Taken");
                    table9++;
                    //TIMER
                    seated9 = 1;
                    //TIMER
                }
                else{
                    tableNumber9.setBackgroundResource(R.drawable.empty);
                    tableRef.child("9").setValue("Empty");
                    table9 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 10
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table10 == 2)
                {
                    tableNumber10.setBackgroundResource(R.drawable.empty);
                    tableRef.child("10").setValue("Empty");
                    table10 = 0;
                    //TIMER
                    timer10.setText("Table 10 Open");
                    //TIMER
                }
                else if(table10 == 1)
                {
                    tableNumber10.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("10").setValue("Cleaning");
                    table10++;
                    //TIMER
                    timer10.setText("Table 10 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime10;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated10 = 0;
                    table1SeatedTime10 = 0;
                    //TIMER
                }
                else if(table10 == 0)
                {
                    tableNumber10.setBackgroundResource(R.drawable.taken);
                    tableRef.child("10").setValue("Taken");
                    table10++;
                    //TIMER
                    seated10 = 1;
                    //TIMER
                }
                else{
                    tableNumber10.setBackgroundResource(R.drawable.empty);
                    tableRef.child("10").setValue("Empty");
                    table10 = 0;
                }
            }
        });////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 11
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table11 == 2)
                {
                    tableNumber11.setBackgroundResource(R.drawable.empty);
                    tableRef.child("11").setValue("Empty");
                    table11 = 0;
                    //TIMER
                    timer11.setText("Table 11 Open");
                    //TIMER
                }
                else if(table11 == 1)
                {
                    tableNumber11.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("11").setValue("Cleaning");
                    table11++;
                    //TIMER
                    timer11.setText("Table 11 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime11;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated11 = 0;
                    table1SeatedTime11 = 0;
                    //TIMER
                }
                else if(table11 == 0)
                {
                    tableNumber11.setBackgroundResource(R.drawable.taken);
                    tableRef.child("11").setValue("Taken");
                    table11++;
                    //TIMER
                    seated11 = 1;
                    //TIMER
                }
                else{
                    tableNumber11.setBackgroundResource(R.drawable.empty);
                    tableRef.child("11").setValue("Empty");
                    table11 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 12
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table12 == 2)
                {
                    tableNumber12.setBackgroundResource(R.drawable.empty);
                    tableRef.child("12").setValue("Empty");
                    table12 = 0;
                    //TIMER
                    timer12.setText("Table 12 Open");
                    //TIMER
                }
                else if(table12 == 1)
                {
                    tableNumber12.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("12").setValue("Cleaning");
                    table12++;
                    //TIMER
                    timer12.setText("Table 12 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime12;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated12 = 0;
                    table1SeatedTime12 = 0;
                    //TIMER
                }
                else if(table12 == 0)
                {
                    tableNumber12.setBackgroundResource(R.drawable.taken);
                    tableRef.child("12").setValue("Taken");
                    table12++;
                    //TIMER
                    seated12 = 1;
                    //TIMER
                }
                else{
                    tableNumber12.setBackgroundResource(R.drawable.empty);
                    tableRef.child("12").setValue("Empty");
                    table12 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 13
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table13 == 2)
                {
                    tableNumber13.setBackgroundResource(R.drawable.empty);
                    tableRef.child("13").setValue("Empty");
                    table13 = 0;
                    //TIMER
                    timer13.setText("Table 13 Open");
                    //TIMER
                }
                else if(table13 == 1)
                {
                    tableNumber13.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("13").setValue("Cleaning");
                    table13++;
                    //TIMER
                    timer13.setText("Table 13 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime13;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated13 = 0;
                    table1SeatedTime13 = 0;
                    //TIMER
                }
                else if(table13 == 0)
                {
                    tableNumber13.setBackgroundResource(R.drawable.taken);
                    tableRef.child("13").setValue("Taken");
                    table13++;
                    //TIMER
                    seated13 = 1;
                    //TIMER
                }
                else{
                    tableNumber13.setBackgroundResource(R.drawable.empty);
                    tableRef.child("13").setValue("Empty");
                    table13 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 14
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table14 == 2)
                {
                    tableNumber14.setBackgroundResource(R.drawable.empty);
                    tableRef.child("14").setValue("Empty");
                    table14 = 0;
                    //TIMER
                    timer14.setText("Table 14 Open");
                    //TIMER
                }
                else if(table14 == 1)
                {
                    tableNumber14.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("14").setValue("Cleaning");
                    table14++;
                    //TIMER
                    timer14.setText("Table 14 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime14;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated14 = 0;
                    table1SeatedTime14 = 0;
                    //TIMER
                }
                else if(table14 == 0)
                {
                    tableNumber14.setBackgroundResource(R.drawable.taken);
                    tableRef.child("14").setValue("Taken");
                    table14++;
                    //TIMER
                    seated14 = 1;
                    //TIMER
                }
                else{
                    tableNumber14.setBackgroundResource(R.drawable.empty);
                    tableRef.child("14").setValue("Empty");
                    table14 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 15
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table15 == 2)
                {
                    tableNumber15.setBackgroundResource(R.drawable.empty);
                    tableRef.child("15").setValue("Empty");
                    table15 = 0;
                    //TIMER
                    timer15.setText("Table 15 Open");
                    //TIMER
                }
                else if(table15 == 1)
                {
                    tableNumber15.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("15").setValue("Cleaning");
                    table15++;
                    //TIMER
                    timer15.setText("Table 15 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime15;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated15 = 0;
                    table1SeatedTime15 = 0;
                    //TIMER
                }
                else if(table15 == 0)
                {
                    tableNumber15.setBackgroundResource(R.drawable.taken);
                    tableRef.child("15").setValue("Taken");
                    table15++;
                    //TIMER
                    seated15 = 1;
                    //TIMER
                }
                else{
                    tableNumber15.setBackgroundResource(R.drawable.empty);
                    tableRef.child("15").setValue("Empty");
                    table15 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 16
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table16 == 2)
                {
                    tableNumber16.setBackgroundResource(R.drawable.empty);
                    tableRef.child("16").setValue("Empty");
                    table16 = 0;
                    //TIMER
                    timer16.setText("Table 16 Open");
                    //TIMER
                }
                else if(table16 == 1)
                {
                    tableNumber16.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("16").setValue("Cleaning");
                    table16++;
                    //TIMER
                    timer16.setText("Table 16 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime16;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated16 = 0;
                    table1SeatedTime16 = 0;
                    //TIMER
                }
                else if(table16 == 0)
                {
                    tableNumber16.setBackgroundResource(R.drawable.taken);
                    tableRef.child("16").setValue("Taken");
                    table16++;
                    //TIMER
                    seated16 = 1;
                    //TIMER
                }
                else{
                    tableNumber16.setBackgroundResource(R.drawable.empty);
                    tableRef.child("16").setValue("Empty");
                    table16 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 17
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table17 == 2)
                {
                    tableNumber17.setBackgroundResource(R.drawable.empty);
                    tableRef.child("17").setValue("Empty");
                    table17 = 0;
                    //TIMER
                    timer17.setText("Table 17 Open");
                    //TIMER
                }
                else if(table17 == 1)
                {
                    tableNumber17.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("17").setValue("Cleaning");
                    table17++;
                    //TIMER
                    timer17.setText("Table 17 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime17;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated17 = 0;
                    table1SeatedTime17 = 0;
                    //TIMER
                }
                else if(table17 == 0)
                {
                    tableNumber17.setBackgroundResource(R.drawable.taken);
                    tableRef.child("17").setValue("Taken");
                    table17++;
                    //TIMER
                    seated17 = 1;
                    //TIMER
                }
                else{
                    tableNumber17.setBackgroundResource(R.drawable.empty);
                    tableRef.child("17").setValue("Empty");
                    table17 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 18
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table18 == 2)
                {
                    tableNumber18.setBackgroundResource(R.drawable.empty);
                    tableRef.child("18").setValue("Empty");
                    table18 = 0;
                    //TIMER
                    timer18.setText("Table 18 Open");
                    //TIMER
                }
                else if(table18 == 1)
                {
                    tableNumber18.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("18").setValue("Cleaning");
                    table18++;
                    //TIMER
                    timer18.setText("Table 18 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime18;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated18 = 0;
                    table1SeatedTime18 = 0;
                    //TIMER
                }
                else if(table18 == 0)
                {
                    tableNumber18.setBackgroundResource(R.drawable.taken);
                    tableRef.child("18").setValue("Taken");
                    table18++;
                    //TIMER
                    seated18 = 1;
                    //TIMER
                }
                else{
                    tableNumber18.setBackgroundResource(R.drawable.empty);
                    tableRef.child("18").setValue("Empty");
                    table18 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 19
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table19 == 2)
                {
                    tableNumber19.setBackgroundResource(R.drawable.empty);
                    tableRef.child("19").setValue("Empty");
                    table19 = 0;
                    //TIMER
                    timer19.setText("Table 19 Open");
                    //TIMER
                }
                else if(table19 == 1)
                {
                    tableNumber19.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("19").setValue("Cleaning");
                    table19++;
                    //TIMER
                    timer19.setText("Table 19 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime19;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated19 = 0;
                    table1SeatedTime19 = 0;
                    //TIMER
                }
                else if(table19 == 0)
                {
                    tableNumber19.setBackgroundResource(R.drawable.taken);
                    tableRef.child("19").setValue("Taken");
                    table19++;
                    //TIMER
                    seated19 = 1;
                    //TIMER
                }
                else{
                    tableNumber19.setBackgroundResource(R.drawable.empty);
                    tableRef.child("19").setValue("Empty");
                    table19 = 0;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        //////////////// TABLE 20
        ////////////////////////////////////////////////////////////////////////////////////////////
        tableNumber20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(table20 == 2)
                {
                    tableNumber20.setBackgroundResource(R.drawable.empty);
                    tableRef.child("20").setValue("Empty");
                    table20 = 0;
                    //TIMER
                    timer20.setText("Table 20 Open");
                    //TIMER
                }
                else if(table20 == 1)
                {
                    tableNumber20.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("20").setValue("Cleaning");
                    table20++;
                    //TIMER
                    timer20.setText("Table 20 Cleaning");
                    tableAvgTime = tableAvgTime + table1SeatedTime20;
                    tableAvgCount = tableAvgCount + 1;
                    tableTotalAvg = tableAvgTime/tableAvgCount;
                    avgWaitTime.setText("Avg Wait Time: " + tableTotalAvg);
                    seated20 = 0;
                    table1SeatedTime20 = 0;
                    //TIMER
                }
                else if(table20 == 0)
                {
                    tableNumber20.setBackgroundResource(R.drawable.taken);
                    tableRef.child("20").setValue("Taken");
                    table20++;
                    //TIMER
                    seated20 = 1;
                    //TIMER
                }
                else{
                    tableNumber20.setBackgroundResource(R.drawable.empty);
                    tableRef.child("20").setValue("Empty");
                    table20 = 0;
                }
            }
        });





    }
}