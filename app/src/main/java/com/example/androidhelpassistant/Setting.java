package com.example.androidhelpassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void Edit(View view) {
        Intent l = new Intent(Setting.this, Edit.class);
        startActivity(l);

    }

    public void LO(View view) {
        Intent i = new Intent(Setting.this , MainActivity.class);
        startActivity(i);
    }
}
