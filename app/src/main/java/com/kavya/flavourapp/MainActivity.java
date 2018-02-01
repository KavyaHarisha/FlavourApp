package com.kavya.flavourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView userName,userEmail;
    User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = (TextView)findViewById(R.id.txt_name);
        userEmail = (TextView)findViewById(R.id.txt_email);
        mUser = new User(getResources().getString(R.string.name_kavya),getResources().getString(R.string.email_kavya));
        userEmail.setText(mUser.getmEmail());
        userName.setText(mUser.getmName());
    }
}
