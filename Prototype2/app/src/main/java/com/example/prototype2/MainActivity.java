package com.example.prototype2;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void nextButton(View view)
    {
        // Do something in response to button click
        setContentView(R.layout.activity_main2);
    }
}