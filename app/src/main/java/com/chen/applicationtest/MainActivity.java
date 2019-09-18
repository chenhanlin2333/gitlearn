package com.chen.applicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        int i = 1;
    }
}
