package com.example.prototype2;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void repeatButton(View repeat)
    {
        // Do something in response to button click
        setContentView(R.layout.activity_main);
    }

    /*public void exitButton(View view)
    {
        // Do something in response to button click
        finish();
        System.exit(0);
    }*/
}