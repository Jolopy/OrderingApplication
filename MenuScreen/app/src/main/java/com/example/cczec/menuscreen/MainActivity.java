package com.example.cczec.menuscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton androidImageButton1;
    ImageButton androidImageButton2;
    ImageButton androidImageButton3;
    ImageButton androidImageButton4;
    ImageButton androidImageButton5;
    ImageButton androidImageButton6;
    ImageButton androidImageButton7;
    ImageButton androidImageButton8;
    ImageButton androidImageButton9;
    ImageButton androidImageButton10;
    ImageButton androidImageButton11;
    ImageButton androidImageButton12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidImageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        androidImageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        androidImageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        androidImageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        androidImageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        androidImageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        androidImageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        androidImageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        androidImageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        androidImageButton10 = (ImageButton) findViewById(R.id.imageButton10);
        androidImageButton11 = (ImageButton) findViewById(R.id.imageButton11);
        androidImageButton12 = (ImageButton) findViewById(R.id.imageButton12);

        androidImageButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Coffee", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pancakes", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Apple", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Iced Coffee", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Soda", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Burger", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sub Sandwich", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hot Dog", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Beer", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Steak", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Turkey", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ice Cream", Toast.LENGTH_LONG).show();
            }
        });
    }
}
