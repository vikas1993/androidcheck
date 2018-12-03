package com.example.vikas_aggarwal.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        AppController.getInstance().Logger("Inside SecondActvity Create");
    }
    @Override
    protected void onStart() {
        super.onStart();
        AppController.getInstance().Logger("Inside SecondActvity Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        AppController.getInstance().Logger("Inside SecondActvity Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        AppController.getInstance().Logger("Inside SecondActvity Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        AppController.getInstance().Logger("Inside SecondActvity Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppController.getInstance().Logger("Inside SecondActvity Destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        AppController.getInstance().Logger("Inside SecondActvity Restart");
    }
}
