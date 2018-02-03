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

    public int coffee_Count,pancake_Count,apple_Count,
            ice_Coffee_Count,soda_Count,sub_Count,
            hot_Dog_Count,burger_Count,beer_Count,
            steak_Count, turkey_Count,ice_Cream_Count;


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
               coffee_Count++;
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               total_price = total_price + pancake_price;
               DecimalFormat df = new DecimalFormat("0.00");
               textViewPrice.setText(String.format("$ %s", df.format(total_price)));
               pancake_Count++;
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + apple_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                apple_Count++;
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + ice_coffee_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                ice_Coffee_Count++;
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
                soda_Count++;
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + sub_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                sub_Count++;
            }
        });

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + hot_dog_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                hot_Dog_Count++;
            }
        });

        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + burger_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                burger_Count++;
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
                beer_Count++;
            }
        });

        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + steak_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                steak_Count++;
            }
        });

        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + turkey_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                turkey_Count++;
            }
        });

        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + ice_cream_price;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                ice_Cream_Count++;
            }
        });
        //##########################################################################################
        //Order Button
        //##########################################################################################
        orderButton.setOnClickListener(new View.OnClickListener() {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference orderNumberRef= database.getReference("OrderNumber");
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("0.00");
                orderNumberRef.child(Integer.toString(order_number)).setValue(" ");
                orderNumberRef.child(Integer.toString(order_number)).push().setValue("Total:" + df.format(total_price));
                if (coffee_Count >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).push().setValue("Coffee: " + coffee_Count);
                    coffee_Count = 0;
                }
                if (pancake_Count >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).push().setValue("Pancakes: " + pancake_Count);
                    pancake_Count = 0;
                }
                if (apple_Count >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).push().setValue("Apple: " + apple_Count);
                    apple_Count = 0;
                }
                if (ice_Coffee_Count >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).push().setValue("Ice Coffee: " + ice_Coffee_Count);
                    ice_Coffee_Count = 0;
                }
                if (soda_Count >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).push().setValue("Soda: " + soda_Count);
                    soda_Count = 0;
                }
                if (sub_Count >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).push().setValue("Sub: " + sub_Count);
                    sub_Count = 0;
                }
                if (hot_Dog_Count >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).push().setValue("Hot Dog: " + hot_Dog_Count);
                    hot_Dog_Count = 0;
                }
                if (burger_Count >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).push().setValue("Burger: " + burger_Count);
                    burger_Count = 0;
                }
                if (beer_Count >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).push().setValue("Beer: " + beer_Count);
                    beer_Count = 0;
                }
                if (steak_Count >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).push().setValue("Steak: " + steak_Count);
                    steak_Count = 0;
                }
                if (turkey_Count >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).push().setValue("Turkey: " + turkey_Count);
                    turkey_Count = 0;
                }
                if (ice_Cream_Count >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).push().setValue("Ice Cream: " + ice_Cream_Count);
                    ice_Cream_Count = 0;
                }
                order_number = order_number + 1;
                total_price = 0;
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));

            }
        });


    }
}
