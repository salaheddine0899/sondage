package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    boolean voted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RadioGroup rg = (RadioGroup) findViewById(R.id.rgroup1);
        if (rg != null) {
            rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {
                        case R.id.rb1:
                            voted=true;
                            break;
                        case R.id.rb2:
                            voted=false;
                            break;
                    }
                }
            });
        }

    }

    public void vote(View view) {


        Intent myIntent =new Intent(this,MainActivity.class);
        Bundle b=new Bundle();
        if(voted==true) {
            b.putString("val", "vous avez bien vote");
        }
        else{
            b.putString("val","vous n'avez pas vote");
        }
        myIntent.putExtras(b);
        startActivity(myIntent);
    }
}