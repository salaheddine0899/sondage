package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle b=getIntent().getExtras();
        if(b!=null) {
            Toast.makeText(this, b.getString("val"), Toast.LENGTH_SHORT).show();
        }
    }

    public void goToVote(View view) {
        Intent myIntent=new Intent(this,MainActivity2.class);
        startActivity(myIntent);

    }
}