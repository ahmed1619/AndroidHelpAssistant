package com.example.androidhelpassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void Setting(View view) {
        Intent k = new Intent(Home.this,SetupContact.class);
        startActivity(k);
    }

    public void SetuoC(View view) {
        Intent M = new Intent(Home.this , SetupContact.class);
        startActivity(M);
    }

    public void Maps(View view) {
        Intent M = new Intent(Home.this ,Maps.class );
        startActivity(M);
    }
}
