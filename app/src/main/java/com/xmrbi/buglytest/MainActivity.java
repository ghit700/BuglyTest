package com.xmrbi.buglytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startService(new Intent(this, MyServices.class));

        Toast.makeText(getApplicationContext(), "Hello World 99999", Toast.LENGTH_SHORT).show();

    }
}
