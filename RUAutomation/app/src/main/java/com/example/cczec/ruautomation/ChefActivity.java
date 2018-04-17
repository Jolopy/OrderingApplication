/**
 * Created by jdelduca on 4/16/18.
 */

package com.example.cczec.ruautomation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ChefActivity extends AppCompatActivity {

    private DatabaseReference mDatabaseCSI;
    private TextView ordInfo;
    private DatabaseReference mDatabaseWrite;
    private DatabaseReference mDatabaseOrdNo;
    private Button ord1btn;
    private DatabaseReference mDatabaseOrd1;
    private Button ord2btn;
    private DatabaseReference mDatabaseOrd2;
    private Button ord3btn;
    private DatabaseReference mDatabaseOrd3;
    private Button ord4btn;
    private DatabaseReference mDatabaseOrd4;
    private Button ord5btn;
    private DatabaseReference mDatabaseOrd5;
    private Button orderComplete;
    private Button ord6btn;
    private DatabaseReference mDatabaseOrd6;
    private Button ord7btn;
    private DatabaseReference mDatabaseOrd7;
    private Button ord8btn;
    private DatabaseReference mDatabaseOrd8;
    private Button ord9btn;
    private DatabaseReference mDatabaseOrd9;
    private Button ord10btn;
    private DatabaseReference mDatabaseOrd10;
    private DatabaseReference mDatabaseDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef);

        mDatabaseCSI = FirebaseDatabase.getInstance().getReference().child("OrderNumber/1");
        mDatabaseOrdNo = FirebaseDatabase.getInstance().getReference().child("OrderNumber");
        ordInfo = (TextView) findViewById(R.id.ordInfo);
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
        orderComplete = (Button) findViewById(R.id.orderComplete);

        ord1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseOrd1 = FirebaseDatabase.getInstance().getReference().child("OrderNumber/1");
                mDatabaseOrd1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            String ordStr = dataSnapshot.getValue().toString();
                            ordStr = ordStr.replaceAll("[{}]", ""); //removes only curly brackets from string
                            ordInfo.setText(ordStr);
                            int ind = ordStr.indexOf("TableNumber");
                            char tableDig0 = ordStr.charAt(ind+12);
                            char tableDig1 = ordStr.charAt(ind+13);
                            final String tableNumber = new StringBuilder().append(tableDig0).append(tableDig1).toString();
                            orderComplete.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mDatabaseWrite = FirebaseDatabase.getInstance().getReference().child("OrderReady");
                                    mDatabaseWrite.child("Order 01").setValue(tableNumber);
                                    mDatabaseDelete = FirebaseDatabase.getInstance().getReference().child("OrderNumber/1");
                                    mDatabaseDelete.removeValue();
                                    
                                }
                            });
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Order Not Found", Toast.LENGTH_LONG).show();
                            String errorStr = "Order Not Found";
                            ordInfo.setText(errorStr);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

        ord2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseOrd2 = FirebaseDatabase.getInstance().getReference().child("OrderNumber/2");
                mDatabaseOrd2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            String ordStr = dataSnapshot.getValue().toString();
                            ordStr = ordStr.replaceAll("[{}]", ""); //removes only curly brackets from string
                            ordInfo.setText(ordStr);
                            int ind = ordStr.indexOf("TableNumber");
                            char tableDig0 = ordStr.charAt(ind+12);
                            char tableDig1 = ordStr.charAt(ind+13);
                            final String tableNumber = new StringBuilder().append(tableDig0).append(tableDig1).toString();
                            orderComplete.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mDatabaseWrite = FirebaseDatabase.getInstance().getReference().child("OrderReady");
                                    mDatabaseWrite.child("Order 02").setValue(tableNumber);
                                    mDatabaseDelete = FirebaseDatabase.getInstance().getReference().child("OrderNumber/2");
                                    mDatabaseDelete.removeValue();
                                }
                            });
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Order Not Found", Toast.LENGTH_LONG).show();
                            String errorStr = "Order Not Found";
                            ordInfo.setText(errorStr);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

        ord3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseOrd3 = FirebaseDatabase.getInstance().getReference().child("OrderNumber/3");
                mDatabaseOrd3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            String ordStr = dataSnapshot.getValue().toString();
                            ordStr = ordStr.replaceAll("[{}]", ""); //removes only curly brackets from string
                            ordInfo.setText(ordStr);
                            int ind = ordStr.indexOf("TableNumber");
                            char tableDig0 = ordStr.charAt(ind+12);
                            char tableDig1 = ordStr.charAt(ind+13);
                            final String tableNumber = new StringBuilder().append(tableDig0).append(tableDig1).toString();
                            orderComplete.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mDatabaseWrite = FirebaseDatabase.getInstance().getReference().child("OrderReady");
                                    mDatabaseWrite.child("Order 03").setValue(tableNumber);
                                    mDatabaseDelete = FirebaseDatabase.getInstance().getReference().child("OrderNumber/3");
                                    mDatabaseDelete.removeValue();

                                }
                            });
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Order Not Found", Toast.LENGTH_LONG).show();
                            String errorStr = "Order Not Found";
                            ordInfo.setText(errorStr);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

        ord4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseOrd4 = FirebaseDatabase.getInstance().getReference().child("OrderNumber/4");
                mDatabaseOrd4.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            String ordStr = dataSnapshot.getValue().toString();
                            ordStr = ordStr.replaceAll("[{}]", ""); //removes only curly brackets from string
                            ordInfo.setText(ordStr);
                            int ind = ordStr.indexOf("TableNumber");
                            char tableDig0 = ordStr.charAt(ind+12);
                            char tableDig1 = ordStr.charAt(ind+13);
                            final String tableNumber = new StringBuilder().append(tableDig0).append(tableDig1).toString();
                            orderComplete.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mDatabaseWrite = FirebaseDatabase.getInstance().getReference().child("OrderReady");
                                    mDatabaseWrite.child("Order 04").setValue(tableNumber);
                                    mDatabaseDelete = FirebaseDatabase.getInstance().getReference().child("OrderNumber/4");
                                    mDatabaseDelete.removeValue();
                                }
                            });
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Order Not Found", Toast.LENGTH_LONG).show();
                            String errorStr = "Order Not Found";
                            ordInfo.setText(errorStr);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

        ord5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseOrd5 = FirebaseDatabase.getInstance().getReference().child("OrderNumber/5");
                mDatabaseOrd5.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            String ordStr = dataSnapshot.getValue().toString();
                            ordStr = ordStr.replaceAll("[{}]", ""); //removes only curly brackets from string
                            ordInfo.setText(ordStr);
                            int ind = ordStr.indexOf("TableNumber");
                            char tableDig0 = ordStr.charAt(ind+12);
                            char tableDig1 = ordStr.charAt(ind+13);
                            final String tableNumber = new StringBuilder().append(tableDig0).append(tableDig1).toString();
                            orderComplete.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mDatabaseWrite = FirebaseDatabase.getInstance().getReference().child("OrderReady");
                                    mDatabaseWrite.child("Order 05").setValue(tableNumber);
                                    mDatabaseDelete = FirebaseDatabase.getInstance().getReference().child("OrderNumber/5");
                                    mDatabaseDelete.removeValue();
                                }
                            });
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Order Not Found", Toast.LENGTH_LONG).show();
                            String errorStr = "Order Not Found";
                            ordInfo.setText(errorStr);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

        ord6btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseOrd6 = FirebaseDatabase.getInstance().getReference().child("OrderNumber/6");
                mDatabaseOrd6.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            String ordStr = dataSnapshot.getValue().toString();
                            ordStr = ordStr.replaceAll("[{}]", ""); //removes only curly brackets from string
                            ordInfo.setText(ordStr);
                            int ind = ordStr.indexOf("TableNumber");
                            char tableDig0 = ordStr.charAt(ind+12);
                            char tableDig1 = ordStr.charAt(ind+13);
                            final String tableNumber = new StringBuilder().append(tableDig0).append(tableDig1).toString();
                            orderComplete.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mDatabaseWrite = FirebaseDatabase.getInstance().getReference().child("OrderReady");
                                    mDatabaseWrite.child("Order 06").setValue(tableNumber);
                                    mDatabaseDelete = FirebaseDatabase.getInstance().getReference().child("OrderNumber/6");
                                    mDatabaseDelete.removeValue();
                                }
                            });
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Order Not Found", Toast.LENGTH_LONG).show();
                            String errorStr = "Order Not Found";
                            ordInfo.setText(errorStr);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

        ord7btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseOrd7 = FirebaseDatabase.getInstance().getReference().child("OrderNumber/7");
                mDatabaseOrd7.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            String ordStr = dataSnapshot.getValue().toString();
                            ordStr = ordStr.replaceAll("[{}]", ""); //removes only curly brackets from string
                            ordInfo.setText(ordStr);
                            int ind = ordStr.indexOf("TableNumber");
                            char tableDig0 = ordStr.charAt(ind+12);
                            char tableDig1 = ordStr.charAt(ind+13);
                            final String tableNumber = new StringBuilder().append(tableDig0).append(tableDig1).toString();
                            orderComplete.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mDatabaseWrite = FirebaseDatabase.getInstance().getReference().child("OrderReady");
                                    mDatabaseWrite.child("Order 07").setValue(tableNumber);
                                    mDatabaseDelete = FirebaseDatabase.getInstance().getReference().child("OrderNumber/7");
                                    mDatabaseDelete.removeValue();
                                }
                            });
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Order Not Found", Toast.LENGTH_LONG).show();
                            String errorStr = "Order Not Found";
                            ordInfo.setText(errorStr);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

        ord8btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseOrd8 = FirebaseDatabase.getInstance().getReference().child("OrderNumber/8");
                mDatabaseOrd8.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            String ordStr = dataSnapshot.getValue().toString();
                            ordStr = ordStr.replaceAll("[{}]", ""); //removes only curly brackets from string
                            ordInfo.setText(ordStr);
                            int ind = ordStr.indexOf("TableNumber");
                            char tableDig0 = ordStr.charAt(ind+12);
                            char tableDig1 = ordStr.charAt(ind+13);
                            final String tableNumber = new StringBuilder().append(tableDig0).append(tableDig1).toString();
                            orderComplete.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mDatabaseWrite = FirebaseDatabase.getInstance().getReference().child("OrderReady");
                                    mDatabaseWrite.child("Order 08").setValue(tableNumber);
                                    mDatabaseDelete = FirebaseDatabase.getInstance().getReference().child("OrderNumber/8");
                                    mDatabaseDelete.removeValue();
                                }
                            });
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Order Not Found", Toast.LENGTH_LONG).show();
                            String errorStr = "Order Not Found";
                            ordInfo.setText(errorStr);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

        ord9btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseOrd9 = FirebaseDatabase.getInstance().getReference().child("OrderNumber/9");
                mDatabaseOrd9.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            String ordStr = dataSnapshot.getValue().toString();
                            ordStr = ordStr.replaceAll("[{}]", ""); //removes only curly brackets from string
                            ordInfo.setText(ordStr);
                            int ind = ordStr.indexOf("TableNumber");
                            char tableDig0 = ordStr.charAt(ind+12);
                            char tableDig1 = ordStr.charAt(ind+13);
                            final String tableNumber = new StringBuilder().append(tableDig0).append(tableDig1).toString();
                            orderComplete.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mDatabaseWrite = FirebaseDatabase.getInstance().getReference().child("OrderReady");
                                    mDatabaseWrite.child("Order 09").setValue(tableNumber);
                                    mDatabaseDelete = FirebaseDatabase.getInstance().getReference().child("OrderNumber/9");
                                    mDatabaseDelete.removeValue();
                                }
                            });
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Order Not Found", Toast.LENGTH_LONG).show();
                            String errorStr = "Order Not Found";
                            ordInfo.setText(errorStr);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

        ord10btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseOrd10 = FirebaseDatabase.getInstance().getReference().child("OrderNumber/10");
                mDatabaseOrd10.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            String ordStr = dataSnapshot.getValue().toString();
                            ordStr = ordStr.replaceAll("[{}]", ""); //removes only curly brackets from string
                            ordInfo.setText(ordStr);
                            int ind = ordStr.indexOf("TableNumber");
                            char tableDig0 = ordStr.charAt(ind+12);
                            char tableDig1 = ordStr.charAt(ind+13);
                            final String tableNumber = new StringBuilder().append(tableDig0).append(tableDig1).toString();
                            orderComplete.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mDatabaseWrite = FirebaseDatabase.getInstance().getReference().child("OrderReady");
                                    mDatabaseWrite.child("Order 10").setValue(tableNumber);
                                    mDatabaseDelete = FirebaseDatabase.getInstance().getReference().child("OrderNumber/10");
                                    mDatabaseDelete.removeValue();
                                }
                            });
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Order Not Found", Toast.LENGTH_LONG).show();
                            String errorStr = "Order Not Found";
                            ordInfo.setText(errorStr);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}