package com.example.Login;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class Activity_Login extends AppCompatActivity {

    RelativeLayout rellay1, rellay2;
    Button btn_signupnow,btn_forgetpwd,btn_login;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);
        rellay2 = (RelativeLayout) findViewById(R.id.rellay2);
        handler.postDelayed(runnable, 2000); //2000 is the timeout for the splash
        btn_signupnow=(Button)findViewById(R.id.btn_signupnow);
        btn_signupnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent il=new Intent(Activity_Login.this,SignupNow.class);
                startActivity(il);
            }
        });
        btn_forgetpwd=(Button)findViewById(R.id.btn_forgot);
        btn_forgetpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent il=new Intent(Activity_Login.this,ForgetPassword.class);
                startActivity(il);

            }
        });
        btn_login=(Button)findViewById(R.id.login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent il=new Intent(Activity_Login.this,ProfileActivity.class);
                startActivity(il);
            }
        });

    }
}
