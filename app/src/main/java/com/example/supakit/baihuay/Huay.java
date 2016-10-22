package com.example.supakit.baihuay;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Huay extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            int x= (int)(Math.random()*98)+1;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_number);
            Intent intent2 = getIntent();
            TextView NumTextView = (TextView)findViewById(R.id.textView3);
            NumTextView.setText(x);
    }
}
