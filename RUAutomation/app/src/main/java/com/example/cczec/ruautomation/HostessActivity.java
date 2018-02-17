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

    public int table1,table2,table3,table4,table5,table6,table7,
            table8,table9,table10,table11,table12,table13,table14,
            table15,table16,table17,table18,table19,table20 = 0;

    Timer tableTimer = new Timer();

    public long table1SeatedTime1 = 0;
    public long table1SeatedTime2 = 0;
    public long table1SeatedTime3 = 0;
    public long table1SeatedTime4 = 0;
    public long table1SeatedTime5 = 0;
    public long table1SeatedTime6 = 0;
    public long table1SeatedTime7 = 0;
    public long table1SeatedTime8 = 0;
    public long table1SeatedTime9 = 0;
    public long table1SeatedTime10 = 0;
    public long table1SeatedTime11 = 0;
    public long table1SeatedTime12 = 0;
    public long table1SeatedTime13 = 0;
    public long table1SeatedTime14 = 0;
    public long table1SeatedTime15 = 0;
    public long table1SeatedTime16 = 0;
    public long table1SeatedTime17 = 0;
    public long table1SeatedTime18 = 0;
    public long table1SeatedTime19 = 0;
    public long table1SeatedTime20 = 0;


    public int seated1 = 0;
    public int seated2 = 0;
    public int seated3 = 0;
    public int seated4 = 0;
    public int seated5 = 0;
    public int seated6 = 0;
    public int seated7 = 0;
    public int seated8 = 0;
    public int seated9 = 0;
    public int seated10 = 0;
    public int seated11 = 0;
    public int seated12 = 0;
    public int seated13 = 0;
    public int seated14 = 0;
    public int seated15 = 0;
    public int seated16 = 0;
    public int seated17 = 0;
    public int seated18 = 0;
    public int seated19 = 0;
    public int seated20 = 0;

    public long tableAvgTime = 0;
    public long tableAvgCount = 0;
    public long tableTotalAvg = 0;

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
                                             }
                                       },
                //set the amount of time in milliseconds before first execution
                0,
                //Set the amount of time between each execution (in milliseconds)
                600);





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
                }
                else if(table6 == 1)
                {
                    tableNumber6.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("6").setValue("Cleaning");
                    table6++;
                }
                else if(table6 == 0)
                {
                    tableNumber6.setBackgroundResource(R.drawable.taken);
                    tableRef.child("6").setValue("Taken");
                    table6++;
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
                }
                else if(table7 == 1)
                {
                    tableNumber7.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("7").setValue("Cleaning");
                    table7++;
                }
                else if(table7 == 0)
                {
                    tableNumber7.setBackgroundResource(R.drawable.taken);
                    tableRef.child("7").setValue("Taken");
                    table7++;
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
                }
                else if(table8 == 1)
                {
                    tableNumber8.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("8").setValue("Cleaning");
                    table8++;
                }
                else if(table8 == 0)
                {
                    tableNumber8.setBackgroundResource(R.drawable.taken);
                    tableRef.child("8").setValue("Taken");
                    table8++;
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
                }
                else if(table9 == 1)
                {
                    tableNumber9.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("9").setValue("Cleaning");
                    table9++;
                }
                else if(table9 == 0)
                {
                    tableNumber9.setBackgroundResource(R.drawable.taken);
                    tableRef.child("9").setValue("Taken");
                    table9++;
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
                }
                else if(table10 == 1)
                {
                    tableNumber10.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("10").setValue("Cleaning");
                    table10++;
                }
                else if(table10 == 0)
                {
                    tableNumber10.setBackgroundResource(R.drawable.taken);
                    tableRef.child("10").setValue("Taken");
                    table10++;
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
                }
                else if(table11 == 1)
                {
                    tableNumber11.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("11").setValue("Cleaning");
                    table11++;
                }
                else if(table11 == 0)
                {
                    tableNumber11.setBackgroundResource(R.drawable.taken);
                    tableRef.child("11").setValue("Taken");
                    table11++;
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
                if(table2 == 12)
                {
                    tableNumber12.setBackgroundResource(R.drawable.empty);
                    tableRef.child("12").setValue("Empty");
                    table12 = 10;
                }
                else if(table12 == 1)
                {
                    tableNumber12.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("12").setValue("Cleaning");
                    table12++;
                }
                else if(table12 == 0)
                {
                    tableNumber12.setBackgroundResource(R.drawable.taken);
                    tableRef.child("12").setValue("Taken");
                    table12++;
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
                }
                else if(table13 == 1)
                {
                    tableNumber13.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("13").setValue("Cleaning");
                    table13++;
                }
                else if(table13 == 0)
                {
                    tableNumber13.setBackgroundResource(R.drawable.taken);
                    tableRef.child("13").setValue("Taken");
                    table13++;
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
                }
                else if(table14 == 1)
                {
                    tableNumber14.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("14").setValue("Cleaning");
                    table14++;
                }
                else if(table14 == 0)
                {
                    tableNumber14.setBackgroundResource(R.drawable.taken);
                    tableRef.child("14").setValue("Taken");
                    table14++;
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
                }
                else if(table15 == 1)
                {
                    tableNumber15.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("15").setValue("Cleaning");
                    table15++;
                }
                else if(table15 == 0)
                {
                    tableNumber15.setBackgroundResource(R.drawable.taken);
                    tableRef.child("15").setValue("Taken");
                    table15++;
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
                }
                else if(table16 == 1)
                {
                    tableNumber16.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("16").setValue("Cleaning");
                    table16++;
                }
                else if(table16 == 0)
                {
                    tableNumber16.setBackgroundResource(R.drawable.taken);
                    tableRef.child("16").setValue("Taken");
                    table16++;
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
                }
                else if(table17 == 1)
                {
                    tableNumber17.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("17").setValue("Cleaning");
                    table17++;
                }
                else if(table17 == 0)
                {
                    tableNumber17.setBackgroundResource(R.drawable.taken);
                    tableRef.child("17").setValue("Taken");
                    table17++;
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
                }
                else if(table18 == 1)
                {
                    tableNumber18.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("18").setValue("Cleaning");
                    table18++;
                }
                else if(table18 == 0)
                {
                    tableNumber18.setBackgroundResource(R.drawable.taken);
                    tableRef.child("18").setValue("Taken");
                    table18++;
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
                }
                else if(table19 == 1)
                {
                    tableNumber19.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("19").setValue("Cleaning");
                    table19++;
                }
                else if(table19 == 0)
                {
                    tableNumber19.setBackgroundResource(R.drawable.taken);
                    tableRef.child("19").setValue("Taken");
                    table19++;
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
                }
                else if(table20 == 1)
                {
                    tableNumber20.setBackgroundResource(R.drawable.cleaning);
                    tableRef.child("20").setValue("Cleaning");
                    table20++;
                }
                else if(table20 == 0)
                {
                    tableNumber20.setBackgroundResource(R.drawable.taken);
                    tableRef.child("20").setValue("Taken");
                    table20++;
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