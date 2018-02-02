package com.example.cczec.ruautomation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    private TextView textViewPrice;

    //Constants
    public double total_price = 0;
    public int order_number = 1;

    //Price for food
    public double coffee_price = 1.99;
    public double pancake_price =3.50;
    public double apple_price =0.99;
    public double ice_coffee_price=2.50;
    public double soda_price=0.99;
    public double sub_price=4.99;
    public double hot_dog_price=2.50;
    public double burger_price=3.00;
    public double beer_price=2.50;
    public double steak_price=16.00;
    public double turkey_price=14.00;
    public double ice_cream_price=2.00;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("OrderNumber");

        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        ImageButton imageButton7 = findViewById(R.id.imageButton7);
        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        ImageButton imageButton9 = findViewById(R.id.imageButton9);
        ImageButton imageButton10 = findViewById(R.id.imageButton10);
        ImageButton imageButton11 = findViewById(R.id.imageButton11);
        ImageButton imageButton12 = findViewById(R.id.imageButton12);

        Button orderButton = findViewById(R.id.orderButton);
        textViewPrice = findViewById(R.id.textViewPrice);


        //##########################################################################################
        //First Row Pricing
        //##########################################################################################
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               total_price = total_price + coffee_price;
               DecimalFormat df = new DecimalFormat("0.00");
               textViewPrice.setText(String.format("$ %s", df.format(total_price)));
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               total_price = total_price + pancake_price;
               DecimalFormat df = new DecimalFormat("0.00");
               textViewPrice.setText(String.format("$ %s", df.format(total_price)));
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + apple_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + ice_coffee_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
            }
        });
        //##########################################################################################
        //Second Row Pricing
        //##########################################################################################
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + soda_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + sub_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
            }
        });

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + hot_dog_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
            }
        });

        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + burger_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
            }
        });
        //##########################################################################################
        //Third Row Pricing
        //##########################################################################################
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + beer_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
            }
        });

        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + steak_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
            }
        });

        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + turkey_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
            }
        });

        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + ice_cream_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
            }
        });
        //##########################################################################################
        //Order Button
        //##########################################################################################
        orderButton.setOnClickListener(new View.OnClickListener() {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference orderRef = database.getReference("OrderNumber");
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("0.00");
                orderRef.child("number").child(Integer.toString(order_number)).setValue("Total Price: " + df.format(total_price));
                order_number = order_number + 1;
                total_price = 0;
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));

            }
        });


    }
}
