package com.example.androidhelpassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view) {
        Intent l = new Intent(MainActivity.this , Home.class);
        startActivity(l);
    }

    public void CNA(View view) {
        Intent c = new Intent( MainActivity.this , CNA.class);
        startActivity(c);
    }

    public void FP(View view) {
        Intent f =new Intent( MainActivity.this , ForgetPassword.class);
        startActivity(f);
    }
}
