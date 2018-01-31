package com.example.cczec.rutgersrestaurantautomation;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.LayoutInflater;

import com.example.cczec.rutgersrestaurantautomation.Model.User;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignIn extends AppCompatActivity {

    EditText editPhone,editPassword;
    Button btnSignIn;
    private View view;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        LayoutInflater inflater = this.getLayoutInflater();
        // inflate the View
        view = inflater.inflate(R.layout.activity_sign_in, null);



        editPassword = (EditText)view.findViewById(R.id.editPassword);
        editPassword = (EditText)view.findViewById(R.id.editPhone);
        btnSignIn = (Button)view.findViewById(R.id.btnSignIn);

        //Int Firebase
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("User");

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final ProgressDialog mDialog = new ProgressDialog(SignIn.this);
                mDialog.setMessage("Please wait.");
                mDialog.show();

                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        //Checks database first
                        if(dataSnapshot.child(editPhone.getText().toString()).exists()) {
                            //Gets user Info
                            mDialog.dismiss();
                            User user = dataSnapshot.child(editPhone.getText().toString()).getValue(User.class);
                            if (user.getPassword().equals(editPassword.getText().toString())) {
                                Toast.makeText(SignIn.this, "Sign in Sucessful", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(SignIn.this, "Sign in Failed", Toast.LENGTH_LONG).show();
                            }
                        }
                        else{
                            Toast.makeText(SignIn.this, "You do not have a Account", Toast.LENGTH_LONG).show();

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
