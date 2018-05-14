package com.example.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignupNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_now);
    }

    public void login(View view) {
        Intent intent=new Intent(SignupNow.this,ProfileActivity.class);
        startActivity(intent);
    }
}
