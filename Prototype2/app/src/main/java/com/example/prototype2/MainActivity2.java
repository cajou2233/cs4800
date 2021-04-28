package com.example.prototype2;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void submitButton(View view)
    {
        // Do something in response to button click
        setContentView(R.layout.activity_main4);
    }
}