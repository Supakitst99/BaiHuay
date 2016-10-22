package com.example.supakit.baihuay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button randomButton2 = (Button)findViewById(R.id.button);
        Button randomButton3 = (Button)findViewById(R.id.button2);
        randomButton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a = (int)(Math.random()*98)+1;

                Intent intent2 = new Intent(MainActivity.this,Huay.class);
                startActivity(intent2);


            }
        });
        randomButton3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int b = (int)(Math.random()*998)+1;


                Intent intent3 = new Intent(MainActivity.this,Huay.class);
                startActivity(intent3);


            }
        });
    }
}
