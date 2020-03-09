package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Log.d("Lifecycle","Created");
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d("Lifecycle","Resumed");
//    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d("Lifecycle","Started");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d("Lifecycle","Paused");
//    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle","Stoped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle","Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","Destroyed");
    }
}
