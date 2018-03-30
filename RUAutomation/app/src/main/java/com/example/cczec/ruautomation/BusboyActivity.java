package com.example.cczec.ruautomation;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.text.DecimalFormat;


public class BusboyActivity extends AppCompatActivity {

    private TextView textViewTables1,textViewTables2,textViewTables3,
            textViewTables4,textViewTables5,textViewTables6,textViewTables7,
            textViewTables8,textViewTables9,textViewTables10,textViewTables11,
            textViewTables12,textViewTables13,textViewTables14,textViewTables15,
            textViewTables16,textViewTables17,textViewTables18,textViewTables19,
            textViewTables20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busboy);

        textViewTables1 = findViewById(R.id.textViewTables1);
        textViewTables2 = findViewById(R.id.textViewTables2);
        textViewTables3 = findViewById(R.id.textViewTables3);
        textViewTables4 = findViewById(R.id.textViewTables4);
        textViewTables5 = findViewById(R.id.textViewTables5);

        textViewTables6 = findViewById(R.id.textViewTables6);
        textViewTables7 = findViewById(R.id.textViewTables7);
        textViewTables8 = findViewById(R.id.textViewTables8);
        textViewTables9 = findViewById(R.id.textViewTables9);
        textViewTables10 = findViewById(R.id.textViewTables10);
        textViewTables11 = findViewById(R.id.textViewTables11);
        textViewTables12 = findViewById(R.id.textViewTables12);
        textViewTables13 = findViewById(R.id.textViewTables13);
        textViewTables14 = findViewById(R.id.textViewTables14);
        textViewTables15 = findViewById(R.id.textViewTables15);
        textViewTables16 = findViewById(R.id.textViewTables16);
        textViewTables17 = findViewById(R.id.textViewTables17);
        textViewTables18 = findViewById(R.id.textViewTables18);
        textViewTables19 = findViewById(R.id.textViewTables19);
        textViewTables20 = findViewById(R.id.textViewTables20);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
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

        final DatabaseReference tableRef= database.getReference("TableNumber");

        t1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables1.setText("Table 1: " + value);
                if(value.equals("Cleaning")){
                    textViewTables1.setBackgroundColor(Color.YELLOW);
                    textViewTables1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                               tableRef.child("1").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables1.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables2.setText("Table 2: " + value);
                if(value.equals("Cleaning")){
                    textViewTables2.setBackgroundColor(Color.YELLOW);
                    textViewTables2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("2").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables2.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables3.setText("Table 3: " + value);
                if(value.equals("Cleaning")){
                    textViewTables3.setBackgroundColor(Color.YELLOW);
                    textViewTables3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("3").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables3.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t4Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables4.setText("Table 4: " + value);
                if(value.equals("Cleaning")){
                    textViewTables4.setBackgroundColor(Color.YELLOW);
                    textViewTables4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("4").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables4.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t5Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables5.setText("Table 5: " + value);
                if(value.equals("Cleaning")){
                    textViewTables5.setBackgroundColor(Color.YELLOW);
                    textViewTables5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("5").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables5.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t6Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables6.setText("Table 6: " + value);
                if(value.equals("Cleaning")){
                    textViewTables6.setBackgroundColor(Color.YELLOW);
                    textViewTables6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("6").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables6.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }

        });

        t7Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables7.setText("Table 7: " + value);
                if(value.equals("Cleaning")){
                    textViewTables7.setBackgroundColor(Color.YELLOW);
                    textViewTables7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("7").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables7.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t8Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables8.setText("Table 8: " + value);
                if(value.equals("Cleaning")){
                    textViewTables8.setBackgroundColor(Color.YELLOW);
                    textViewTables8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("8").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables8.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t9Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables9.setText("Table 9: " + value);
                if(value.equals("Cleaning")){
                    textViewTables9.setBackgroundColor(Color.YELLOW);
                    textViewTables9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("9").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables9.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t10Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables10.setText("Table 10: " + value);
                if(value.equals("Cleaning")){
                    textViewTables10.setBackgroundColor(Color.YELLOW);
                    textViewTables10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("10").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables10.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t11Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables11.setText("Table 11: " + value);
                if(value.equals("Cleaning")){
                    textViewTables11.setBackgroundColor(Color.YELLOW);
                    textViewTables11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("11").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables11.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t12Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables12.setText("Table 12: " + value);
                if(value.equals("Cleaning")){
                    textViewTables12.setBackgroundColor(Color.YELLOW);
                    textViewTables12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("12").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables12.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t13Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables13.setText("Table 13: " + value);
                if(value.equals("Cleaning")){
                    textViewTables13.setBackgroundColor(Color.YELLOW);
                    textViewTables13.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("13").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables13.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t14Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables14.setText("Table 14: " + value);
                if(value.equals("Cleaning")){
                    textViewTables14.setBackgroundColor(Color.YELLOW);
                    textViewTables14.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("14").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables14.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t15Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables15.setText("Table 15: " + value);
                if(value.equals("Cleaning")){
                    textViewTables15.setBackgroundColor(Color.YELLOW);
                    textViewTables15.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("15").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables15.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t16Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables16.setText("Table 16: " + value);
                if(value.equals("Cleaning")){
                    textViewTables16.setBackgroundColor(Color.YELLOW);
                    textViewTables16.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("16").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables16.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t17Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables17.setText("Table 17: " + value);
                if(value.equals("Cleaning")){
                    textViewTables17.setBackgroundColor(Color.YELLOW);
                    textViewTables17.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("17").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables17.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t18Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables18.setText("Table 18: " + value);
                if(value.equals("Cleaning")){
                    textViewTables18.setBackgroundColor(Color.YELLOW);
                    textViewTables18.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("18").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables18.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t19Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables19.setText("Table 19: " + value);
                if(value.equals("Cleaning")){
                    textViewTables19.setBackgroundColor(Color.YELLOW);
                    textViewTables19.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("19").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables19.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t20Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables20.setText("Table 20: " + value);
                if(value.equals("Cleaning")){
                    textViewTables20.setBackgroundColor(Color.YELLOW);
                    textViewTables20.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tableRef.child("20").setValue("Empty");
                        }
                    });
                }
                else{
                    textViewTables20.setBackgroundColor(Color.WHITE);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}