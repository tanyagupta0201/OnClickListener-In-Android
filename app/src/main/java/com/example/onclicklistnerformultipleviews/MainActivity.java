package com.example.onclicklistnerformultipleviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvfirst, tvway, tvsecond, tvway2, tvway3, tvthird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        First Way

        tvfirst = findViewById(R.id.first);
        tvway = findViewById(R.id.way1);

        tvfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"1st Way" ,Toast.LENGTH_SHORT).show();
            }
        });

        tvway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "1st way", Toast.LENGTH_SHORT).show();
            }
        });

        tvfirst = findViewById(R.id.first);
        tvway = findViewById(R.id.way1);
        tvsecond = findViewById(R.id.second);
        tvway2 = findViewById(R.id.way2);
        tvthird = findViewById(R.id.third);
        tvway3 = findViewById(R.id.way3);

        tvsecond.setOnClickListener(this);
        tvway2.setOnClickListener(this);
    }

    // Ye sirf ek function hai, oncreate mein call karna padega isko
    @Override
    public void onClick(View view) {
        switch (view.getId()) // because hum id ke through usko access karenge phir functionality perform karenge
        {
            case R.id.second:
                Toast.makeText(this, "2nd way", Toast.LENGTH_SHORT).show();
                break;

            case R.id.way2:
                Toast.makeText(this, "2nd way", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void third(View view) {
        Toast.makeText(this, "3rd way", Toast.LENGTH_SHORT).show();

    }

    public void way3(View view) {
        Toast.makeText(this, "3rd way", Toast.LENGTH_SHORT).show();

    }
}