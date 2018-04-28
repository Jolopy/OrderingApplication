package com.example.cczec.ruautomation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private TextView textViewPrice;
    private TextView orderReview1;
    private TextView orderReview2;
    private TextView orderReview3;
    private TextView orderReview4;
    private TextView orderReview5;
    private TextView orderReview6;
    private TextView orderReview7;
    private TextView orderReview8;
    private TextView orderReview9;
    private TextView orderReview10;
    private TextView orderReview11;
    private TextView orderReview12;

    public String str1 = "Coffee",str2 = "Caesar Salad",str3 = "Tomato Mutz",
            str4 = "Pumpkin Pie",str5 = "Royal Burger",str6 = "Chicken Wrap",str7 = "Bacon Potatoes",
            str8 = "Chocolate Cake",str9 = "Grilled Salmon",str10 = "Spaghetti",str11 = "Pork Chops",
            str12 = "Hot Fudge";

    //Constants
    public double total_price = 0;
    public int order_number = 1;

    //Price for food
    public double price1  = 1.49;
    public double price2  = 6.99;
    public double price3  = 7.99;
    public double price4  = 4.99;
    public double price5  = 14.99;
    public double price6  = 12.99;
    public double price7  = 12.99;
    public double price8  = 4.99;
    public double price9  = 17.99;
    public double price10 = 9.99;
    public double price11 = 16.99;
    public double price12 = 5.99;

    public int count1, count2, count3, count4, count5,
                count6, count7, count8, count9, count10,
                count11, count12;

    private DatabaseReference inventoryRef1;
    private DatabaseReference inventoryRef2;
    private DatabaseReference inventoryRef3;
    private DatabaseReference inventoryRef4;
    private DatabaseReference inventoryRef5;
    private DatabaseReference inventoryRef6;
    private DatabaseReference inventoryRef7;
    private DatabaseReference inventoryRef8;
    private DatabaseReference inventoryRef9;
    private DatabaseReference inventoryRef10;
    private DatabaseReference inventoryRef11;
    private DatabaseReference inventoryRef12;



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

        final Button orderButton = findViewById(R.id.orderButton);
        //Button managerButton = findViewById(R.id.callManager);
        //Button waiterButton = findViewById(R.id.callButton);
        Button payButton = findViewById(R.id.payNow);

        final EditText tableNumber = findViewById(R.id.tableNumber);

        textViewPrice = findViewById(R.id.textViewPrice);
        orderReview1 =findViewById(R.id.orderReview1);
        orderReview2 =findViewById(R.id.orderReview2);
        orderReview3 =findViewById(R.id.orderReview3);
        orderReview4 =findViewById(R.id.orderReview4);
        orderReview5 =findViewById(R.id.orderReview5);
        orderReview6 =findViewById(R.id.orderReview6);
        orderReview7 =findViewById(R.id.orderReview7);
        orderReview8 =findViewById(R.id.orderReview8);
        orderReview9 =findViewById(R.id.orderReview9);
        orderReview10 =findViewById(R.id.orderReview10);
        orderReview11 =findViewById(R.id.orderReview11);
        orderReview12 =findViewById(R.id.orderReview12);

        //##########################################################################################
        //First Row Pricing
        //##########################################################################################
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               total_price = total_price + price1;
               DecimalFormat df = new DecimalFormat("0.00");
               textViewPrice.setText(String.format("$ %s", df.format(total_price)));
               count1++;
               orderReview1.setText(str1 + ": " + Integer.toString(count1));

                /**inventoryRef = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str1);
                inventoryRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Integer invLevel = (Integer.parseInt(dataSnapshot.getValue().toString()) - 1);
                        System.out.println("invLevel: " + invLevel);
                        inventoryRef.setValue(invLevel);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });**/

               //Minus Item
               if(count1 >= 1){
                   orderReview1.setOnClickListener(new View.OnClickListener() {
                       DecimalFormat df = new DecimalFormat("0.00");
                       @Override
                       public void onClick(View view) {
                           if(count1 > 0) {
                               count1--;
                               orderReview1.setText(str1 + ": " + Integer.toString(count1));
                               total_price = total_price - price1;
                           }
                           textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                           if(count1 == 0)
                           {
                               orderReview1.setText("");
                           }
                       }
                   });
               }

            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               total_price = total_price + price2;
               DecimalFormat df = new DecimalFormat("0.00");
               textViewPrice.setText(String.format("$ %s", df.format(total_price)));
               count2++;
               orderReview2.setText(str2 + ": " + Integer.toString(count2));
                //Minus Item
                if(count2 >= 1){
                    orderReview2.setOnClickListener(new View.OnClickListener() {
                        DecimalFormat df = new DecimalFormat("0.00");
                        @Override
                        public void onClick(View view) {
                            if(count2 > 0) {
                                count2--;
                                orderReview2.setText(str2 + Integer.toString(count2));
                                total_price = total_price - price2;
                            }
                            textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                            if(count2 == 0)
                            {
                                orderReview2.setText("");
                            }
                        }
                    });
                }
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + price3;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                count3++;
                orderReview3.setText(str3 + ": " + Integer.toString(count3));
                //Minus Item
                if(count3 >= 1){
                    orderReview3.setOnClickListener(new View.OnClickListener() {
                        DecimalFormat df = new DecimalFormat("0.00");
                        @Override
                        public void onClick(View view) {
                            if(count3 > 0) {
                                count3--;
                                orderReview3.setText(str3 + Integer.toString(count3));
                                total_price = total_price - price3;
                            }
                            textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                            if(count3 == 0)
                            {
                                orderReview3.setText("");
                            }
                        }
                    });
                }
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + price4;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                count4++;
                orderReview4.setText(str4 + ": " + Integer.toString(count4));
                //Minus Item
                if(count4 >= 1){
                    orderReview4.setOnClickListener(new View.OnClickListener() {
                        DecimalFormat df = new DecimalFormat("0.00");
                        @Override
                        public void onClick(View view) {
                            if(count4 > 0) {
                                count4--;
                                orderReview4.setText(str4 + Integer.toString(count4));
                                total_price = total_price - price4;
                            }
                            textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                            if(count4 == 0)
                            {
                                orderReview4.setText("");
                            }
                        }
                    });
                }
            }
        });
        //##########################################################################################
        //Second Row Pricing
        //##########################################################################################
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + price5;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                count5++;
                orderReview5.setText(str5 + ": " + Integer.toString(count5));
                //Minus Item
                if(count5 >= 1){
                    orderReview5.setOnClickListener(new View.OnClickListener() {
                        DecimalFormat df = new DecimalFormat("0.00");
                        @Override
                        public void onClick(View view) {
                            if(count5 > 0) {
                                count5--;
                                orderReview5.setText(str5 + Integer.toString(count5));
                                total_price = total_price - price5;
                            }
                            textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                            if(count5 == 0)
                            {
                                orderReview5.setText("");
                            }
                        }
                    });
                }
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + price6;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                count6++;
                orderReview6.setText(str6 + ": " + Integer.toString(count6));
                //Minus Item
                if(count6 >= 1){
                    orderReview6.setOnClickListener(new View.OnClickListener() {
                        DecimalFormat df = new DecimalFormat("0.00");
                        @Override
                        public void onClick(View view) {
                            if(count6 > 0) {
                                count6--;
                                orderReview6.setText(str6 + Integer.toString(count6));
                                total_price = total_price - price6;
                            }
                            textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                            if(count6 == 0)
                            {
                                orderReview6.setText("");
                            }
                        }
                    });
                }
            }
        });

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + price7;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                count7++;
                orderReview7.setText(str7 + ": " + Integer.toString(count7));
                //Minus Item
                if(count7 >= 1){
                    orderReview7.setOnClickListener(new View.OnClickListener() {
                        DecimalFormat df = new DecimalFormat("0.00");
                        @Override
                        public void onClick(View view) {
                            if(count7 > 0) {
                                count7--;
                                orderReview7.setText(str7 + Integer.toString(count7));
                                total_price = total_price - price7;
                            }
                            textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                            if(count7 == 0)
                            {
                                orderReview7.setText("");
                            }
                        }
                    });
                }
            }
        });

        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + price8;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                count8++;
                orderReview8.setText(str8 + ": " + Integer.toString(count8));
                //Minus Item
                if(count8 >= 1){
                    orderReview8.setOnClickListener(new View.OnClickListener() {
                        DecimalFormat df = new DecimalFormat("0.00");
                        @Override
                        public void onClick(View view) {
                            if(count8 > 0) {
                                count8--;
                                orderReview8.setText(str8 + Integer.toString(count8));
                                total_price = total_price - price8;
                            }
                            textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                            if(count8 == 0)
                            {
                                orderReview8.setText("");
                            }
                        }
                    });
                }
            }
        });
        //##########################################################################################
        //Third Row Pricing
        //##########################################################################################
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + price9;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                count9++;
                orderReview9.setText(str9 + ": " + Integer.toString(count9));
                //Minus Item
                if(count9 >= 1){
                    orderReview9.setOnClickListener(new View.OnClickListener() {
                        DecimalFormat df = new DecimalFormat("0.00");
                        @Override
                        public void onClick(View view) {
                            if(count9 > 0) {
                                count9--;
                                orderReview9.setText(str9 + Integer.toString(count9));
                                total_price = total_price - price9;
                            }
                            textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                            if(count9 == 0)
                            {
                                orderReview9.setText("");
                            }
                        }
                    });
                }
            }
        });

        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + price10;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                count10++;
                orderReview10.setText(str10 + ": " + Integer.toString(count10));
                //Minus Item
                if(count10 >= 1){
                    orderReview10.setOnClickListener(new View.OnClickListener() {
                        DecimalFormat df = new DecimalFormat("0.00");
                        @Override
                        public void onClick(View view) {
                            if(count10 > 0) {
                                count10--;
                                orderReview10.setText(str10 + Integer.toString(count10));
                                total_price = total_price - price10;
                            }
                            textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                            if(count10 == 0)
                            {
                                orderReview10.setText("");
                            }
                        }
                    });
                }
            }
        });

        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + price11;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                count11++;
                orderReview11.setText(str11 + ": " + Integer.toString(count11));
                //Minus Item
                if(count11 >= 1){
                    orderReview11.setOnClickListener(new View.OnClickListener() {
                        DecimalFormat df = new DecimalFormat("0.00");
                        @Override
                        public void onClick(View view) {
                            if(count11 > 0) {
                                count11--;
                                orderReview11.setText(str11 + Integer.toString(count11));
                                total_price = total_price - price11;
                            }
                            textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                            if(count11 == 0)
                            {
                                orderReview11.setText("");
                            }
                        }
                    });
                }
            }
        });

        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total_price = total_price + price12;
                DecimalFormat df = new DecimalFormat("0.00");
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                count12++;
                orderReview12.setText(str12 + ": " + Integer.toString(count12));
                //Minus Item
                if(count12 >= 1){
                    orderReview12.setOnClickListener(new View.OnClickListener() {
                        DecimalFormat df = new DecimalFormat("0.00");
                        @Override
                        public void onClick(View view) {
                            if(count12 > 0) {
                                count12--;
                                orderReview12.setText(str12 + Integer.toString(count12));
                                total_price = total_price - price12;
                            }
                            textViewPrice.setText(String.format("$ %s", df.format(total_price)));
                            if(count12 == 0)
                            {
                                orderReview12.setText("");
                            }
                        }
                    });
                }
            }
        });


        //##########################################################################################
        //Order Button
        //##########################################################################################

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference payRef= database.getReference("TablePayStatus");

        // added
        final DatabaseReference refCurrentOrder = FirebaseDatabase.getInstance().getReference().child("CurrentOrder");


        refCurrentOrder.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Integer tempInt = (Integer.parseInt(dataSnapshot.getValue().toString()) + 1);
                refCurrentOrder.setValue(tempInt);
                order_number = tempInt;
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        // end added

        orderButton.setOnClickListener(new View.OnClickListener() {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference orderNumberRef= database.getReference("OrderNumber");

            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("0.00");

                orderNumberRef.child(Integer.toString(order_number)).setValue(" ");
                orderNumberRef.child(Integer.toString(order_number)).child("TableNumber").setValue(tableNumber.getText().toString());
                orderNumberRef.child(Integer.toString(order_number)).child("Total").setValue(df.format(total_price));
                orderNumberRef.child(Integer.toString(order_number)).child("Date").setValue(getDate());
                orderNumberRef.child(Integer.toString(order_number)).child("Time").setValue(getTime());
                orderNumberRef.child(Integer.toString(order_number)).child("OrderNumber").setValue(order_number);

                if (count1 >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).child(str1).setValue(count1);

                    inventoryRef1 = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str1);
                    inventoryRef1.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Integer invLevel1 = (Integer.parseInt(dataSnapshot.getValue().toString()) - count1);
                            System.out.println("coffee: " + invLevel1);
                            inventoryRef1.setValue(invLevel1);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });

                }
                if (count2 >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).child(str2).setValue(count2);

                    inventoryRef2 = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str2);
                    inventoryRef2.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Integer invLevel2 = (Integer.parseInt(dataSnapshot.getValue().toString()) - count2);
                            System.out.println("caesar salad: " + invLevel2);
                            inventoryRef2.setValue(invLevel2);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                if (count3 >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).child(str3).setValue(count3);

                    inventoryRef3 = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str3);
                    inventoryRef3.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Integer invLevel3 = (Integer.parseInt(dataSnapshot.getValue().toString()) - count3);
                            System.out.println("tom mutz: " + invLevel3);
                            inventoryRef3.setValue(invLevel3);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                if (count4 >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).child(str4).setValue(count4);

                    inventoryRef4 = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str4);
                    inventoryRef4.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Integer invLevel4 = (Integer.parseInt(dataSnapshot.getValue().toString()) - count4);
                            System.out.println("pump pie: " + invLevel4);
                            inventoryRef4.setValue(invLevel4);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                if (count5 >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).child(str5).setValue(count5);

                    inventoryRef5 = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str5);
                    inventoryRef5.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Integer invLevel5 = (Integer.parseInt(dataSnapshot.getValue().toString()) - count5);
                            System.out.println("roy burg: " + invLevel5);
                            inventoryRef5.setValue(invLevel5);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                if (count6 >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).child(str6).setValue(count6);

                    inventoryRef6 = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str6);
                    inventoryRef6.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Integer invLevel6 = (Integer.parseInt(dataSnapshot.getValue().toString()) - count6);
                            System.out.println("chix wrap: " + invLevel6);
                            inventoryRef6.setValue(invLevel6);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                if (count7 >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).child(str7).setValue(count7);

                    inventoryRef7 = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str7);
                    inventoryRef7.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Integer invLevel7 = (Integer.parseInt(dataSnapshot.getValue().toString()) - count7);
                            System.out.println("bac pot: " + invLevel7);
                            inventoryRef7.setValue(invLevel7);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                if (count8 >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).child(str8).setValue(count8);

                    inventoryRef8 = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str8);
                    inventoryRef8.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Integer invLevel8 = (Integer.parseInt(dataSnapshot.getValue().toString()) - count8);
                            System.out.println("choc cake: " + invLevel8);
                            inventoryRef8.setValue(invLevel8);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                if (count9 >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).child(str9).setValue(count9);

                    inventoryRef9 = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str9);
                    inventoryRef9.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Integer invLevel9 = (Integer.parseInt(dataSnapshot.getValue().toString()) - count9);
                            System.out.println("gril salmon: " + invLevel9);
                            inventoryRef9.setValue(invLevel9);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                if (count10 >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).child(str10).setValue(count10);

                    inventoryRef10 = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str10);
                    inventoryRef10.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Integer invLevel10 = (Integer.parseInt(dataSnapshot.getValue().toString()) - count10);
                            System.out.println("spag: " + invLevel10);
                            inventoryRef10.setValue(invLevel10);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                if (count11 >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).child(str11).setValue(count11);

                    inventoryRef11 = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str11);
                    inventoryRef11.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Integer invLevel11 = (Integer.parseInt(dataSnapshot.getValue().toString()) - count11);
                            System.out.println("pork chop: " + invLevel11);
                            inventoryRef11.setValue(invLevel11);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                if (count12 >= 1){
                    orderNumberRef.child(Integer.toString(order_number)).child(str12).setValue(count12);

                    inventoryRef12 = FirebaseDatabase.getInstance().getReference().child("Inventory/Current Level/" + str12);
                    inventoryRef12.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            Integer invLevel12 = (Integer.parseInt(dataSnapshot.getValue().toString()) - count12);
                            System.out.println("hot fudge: " + invLevel12);
                            inventoryRef12.setValue(invLevel12);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                payRef.child(tableNumber.getText().toString()).setValue("Ordered");

                Toast.makeText(getApplicationContext(), "Your order has been placed", Toast.LENGTH_LONG).show();

            }
        });

        //##########################################################################################
        //PAY Button
        //##########################################################################################

        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, PayPopUpActivity.class);
                myIntent.putExtra("total_Price", Double.toString(total_price));
                DecimalFormat df = new DecimalFormat("0.00");
                startActivity(myIntent);
                /**
                total_price = 0;
                textViewPrice.setText(String.format("$ %s", df.format(total_price)));

                orderReview1.setText("");
                orderReview2.setText("");
                orderReview3.setText("");
                orderReview4.setText("");
                orderReview5.setText("");
                orderReview6.setText("");
                orderReview7.setText("");
                orderReview8.setText("");
                orderReview9.setText("");
                orderReview10.setText("");
                orderReview11.setText("");
                orderReview12.setText("");
                count1 = 0;
                count2 = 0;
                count3 = 0;
                count4 = 0;
                count5 = 0;
                count6 = 0;
                count7 = 0;
                count8 = 0;
                count9 = 0;
                count10 = 0;
                count11 = 0;
                count12 = 0;
                order_number = order_number + 1;
                 **/
                payRef.child(tableNumber.getText().toString()).setValue("Started Payment");
                Toast.makeText(getApplicationContext(), "Table number " + tableNumber.getText().toString() + " is Paying!", Toast.LENGTH_SHORT).show();


            }
        });

        Button btnCallWaiter = findViewById(R.id.callWaiter);
        final String strCallWaiter = "Call Waiter";

        btnCallWaiter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final DatabaseReference refCallWaiter = FirebaseDatabase.getInstance().getReference().child(strCallWaiter).child("Table " + tableNumber.getText().toString());
                refCallWaiter.setValue("True");
                Toast.makeText(getApplicationContext(), "Table number " + tableNumber.getText().toString() + " called Waiter!", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public void onBackPressed() {
        Intent myIntent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(myIntent);
    }

    public String getDate() {
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = dateFormat.format(c);

        return formattedDate;
    }

    public String getTime() {
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = timeFormat.format(c);
        return formattedTime;
    }
}
