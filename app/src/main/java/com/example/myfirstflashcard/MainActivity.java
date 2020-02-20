package com.example.myfirstflashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView2)).setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.textView)).setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.textView2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View p) {
                ((TextView) findViewById(R.id.textView2)).setVisibility(View.INVISIBLE);
                ((TextView) findViewById(R.id.textView)).setVisibility(View.VISIBLE);
            }
        });
    }
}
