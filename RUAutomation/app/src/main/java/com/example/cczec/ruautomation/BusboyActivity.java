package com.example.cczec.ruautomation;

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

        t1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value1 =  dataSnapshot.getValue(String.class);
                textViewTables1.setText(value1);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value2 =  dataSnapshot.getValue(String.class);
                textViewTables2.setText(value2);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value3 =  dataSnapshot.getValue(String.class);
                textViewTables3.setText(value3);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t4Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value4 =  dataSnapshot.getValue(String.class);
                textViewTables4.setText(value4);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t5Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value5 =  dataSnapshot.getValue(String.class);
                textViewTables5.setText(value5);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t6Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables6.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t7Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables7.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t8Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables8.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t9Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables9.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t10Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables10.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t11Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables11.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t12Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables12.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t13Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables13.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t14Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables14.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t15Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables15.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t16Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables16.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t17Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables17.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t18Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables18.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t19Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables19.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        t20Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                textViewTables20.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}