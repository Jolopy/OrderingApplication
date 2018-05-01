/**
 * Created by Joseph Del Duca on 4/16/18.
 * Assisted by Dax Dalwadi and Manthan Shah
 */

package com.example.cczec.ruautomation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ChefActivity extends AppCompatActivity {

    public DatabaseReference mDatabaseWrite;
    public DatabaseReference mDatabaseOrdNo;
    public Button ord1btn;
    public DatabaseReference mDatabaseOrdDetails;
    public Button ord2btn;
    public Button ord3btn;
    public Button ord4btn;
    public Button ord5btn;
    public Button orderComplete;
    public Button ord6btn;
    public Button ord7btn;
    public Button ord8btn;
    public Button ord9btn;
    public Button ord10btn;
    public Button ord11btn;
    public Button ord12btn;
    public DatabaseReference mDatabaseDelete;
    public ArrayList<String> ordNos = new ArrayList<>();
    public DatabaseReference orderArchive;
    public ListView orderViewItems;
    public ListView orderViewCount;
    public ArrayList<String> items = new ArrayList<String>();
    public ArrayList<String> count = new ArrayList<String>();
    public ArrayAdapter<String> itemsAdapter;
    public ArrayAdapter<String> countAdapter;
    Context context = this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef);

        mDatabaseOrdNo = FirebaseDatabase.getInstance().getReference().child("OrderNumber");
        ord1btn = (Button) findViewById(R.id.ord1btn);
        ord2btn = (Button) findViewById(R.id.ord2btn);
        ord3btn = (Button) findViewById(R.id.ord3btn);
        ord4btn = (Button) findViewById(R.id.ord4btn);
        ord5btn = (Button) findViewById(R.id.ord5btn);
        ord6btn = (Button) findViewById(R.id.ord6btn);
        ord7btn = (Button) findViewById(R.id.ord7btn);
        ord8btn = (Button) findViewById(R.id.ord8btn);
        ord9btn = (Button) findViewById(R.id.ord9btn);
        ord10btn = (Button) findViewById(R.id.ord10btn);
        ord11btn = (Button) findViewById(R.id.ord11btn);
        ord12btn = (Button) findViewById(R.id.ord12btn);
        orderComplete = (Button) findViewById(R.id.orderComplete);

        orderViewItems = findViewById(R.id.orderViewItems);
        orderViewCount = findViewById(R.id.orderViewCount);

        ord1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder(0);
            }
        });

        ord2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder(1);
            }
        });

        ord3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder(2);
            }
        });

        ord4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder(3);
            }
        });

        ord5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder(4);
            }
        });

        ord6btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder(5);
            }
        });

        ord7btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder(6);
            }
        });

        ord8btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder(7);
            }
        });

        ord9btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder(8);
            }
        });

        ord10btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder(9);
            }
        });

        ord11btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder(10);
            }
        });

        ord12btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrder(11);
            }
        });
    }

    private void reload() {
        Intent intent = getIntent();
        overridePendingTransition(0,0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();
        overridePendingTransition(0,0);
        startActivity(intent);
    }

    private void displayOrder(final int index) {

        itemsAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, items);
        countAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, count);
        orderViewItems.setAdapter(itemsAdapter);
        orderViewCount.setAdapter(countAdapter);
        ordNos = new ArrayList<>();

        mDatabaseOrdNo.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    ordNos.add(ds.getKey());
                }
                if (ordNos.size() > index) {
                    mDatabaseOrdDetails = FirebaseDatabase.getInstance().getReference().child("OrderNumber/" + ordNos.get(index));
                    mDatabaseOrdDetails.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            if (dataSnapshot.exists()) {
                                items.clear();
                                count.clear();
                                for (DataSnapshot childSs : dataSnapshot.getChildren()) {
                                    items.add(childSs.getKey().toString());
                                    count.add(childSs.getValue().toString());
                                }

                                itemsAdapter.notifyDataSetChanged();
                                countAdapter.notifyDataSetChanged();

                                String ordStr = dataSnapshot.getValue().toString();
                                ordStr = ordStr.replaceAll("[{}]", ""); //removes only curly brackets from string
                                int ind = ordStr.indexOf("TableNumber");
                                char tableDig0 = ordStr.charAt(ind + 12);
                                char tableDig1 = ordStr.charAt(ind + 13);
                                final String tableNumber = new StringBuilder().append(tableDig0).append(tableDig1).toString();
                                orderComplete.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        mDatabaseWrite = FirebaseDatabase.getInstance().getReference().child("OrderReady");
                                        mDatabaseWrite.child("Order " + ordNos.get(index)).setValue(tableNumber);

                                        mDatabaseOrdDetails.addListenerForSingleValueEvent(new ValueEventListener() {
                                            @Override
                                            public void onDataChange(DataSnapshot dataSnapshot) {
                                                if (dataSnapshot.exists()) {
                                                    orderArchive = FirebaseDatabase.getInstance().getReference().child("OrderArchive/" + ordNos.get(index));
                                                    orderArchive.setValue(dataSnapshot.getValue(), new DatabaseReference.CompletionListener() {
                                                        @Override
                                                        public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                                                            if (databaseError != null) {
                                                                System.out.println("Copy Failed");
                                                            } else {
                                                                System.out.println("Success");
                                                            }
                                                        }
                                                    });
                                                    mDatabaseDelete = FirebaseDatabase.getInstance().getReference().child("OrderNumber/" + ordNos.get(index));
                                                    mDatabaseDelete.removeValue();
                                                    orderViewItems.setAdapter(null);
                                                    orderViewCount.setAdapter(null);

                                                    reload();
                                                }

                                            }

                                            @Override
                                            public void onCancelled(DatabaseError databaseError) {
                                                System.out.println("Copy Failed in onCancelled");
                                            }
                                        });


                                    }
                                });
                            } else {
                                Toast.makeText(getApplicationContext(), "Order Completed", Toast.LENGTH_LONG).show();
                            }
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                } else {
                    Toast.makeText(getApplicationContext(), "Order Queue Empty", Toast.LENGTH_SHORT).show();
                }

            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}