package com.example.explicitintent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        result = findViewById(R.id.textView6);
        String number = getIntent().getStringExtra("number");
        int n = Integer.parseInt(number);
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        result.setText("Factorial of "+n+" is "+fact);
    }
}
