package com.example.hobbytestactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("pil","onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("pil","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("pil","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("pil","onDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("pil","onCreate");
    }
}