package com.example.androidhelpassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Edit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
    }

    public void save(View view) {
        Intent j = new Intent(Edit.this , Home.class);
        startActivity(j);

    }

    public void Del(View view) {
        Intent j = new Intent(Edit.this , MainActivity.class);
        startActivity(j);
    }
}
