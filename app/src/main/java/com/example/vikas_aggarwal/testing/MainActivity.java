package com.example.vikas_aggarwal.testing;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.vikas_aggarwal.testing.MainFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainFragment.SendMessage {

    SecondFragment secondFragment;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        MainViewModel model = ViewModelProviders.of(this).get(MainViewModel.class);
        model.getUsers().observe(this, users -> {
            // update UI
        });
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, MainFragment.newInstance())
                    .commitNow();
            secondFragment = SecondFragment.getInstance();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container1,secondFragment)
                    .commitNow();
            fragmentManager =getSupportFragmentManager();
            // changed here
            Log.e("ok","ksdjs");
        }

        AppController.getInstance().Logger("Inside MainActivity Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        AppController.getInstance().Logger("Inside MainActivity Start");


    }

    @Override
    protected void onResume() {
        super.onResume();
        AppController.getInstance().Logger("Inside MainActivity Resume");

        for(Fragment fragments : fragmentManager.getFragments()){
            AppController.getInstance().Logger("Fragments "+fragments.getClass().getSimpleName());
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        AppController.getInstance().Logger("Inside MainActivity Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        AppController.getInstance().Logger("Inside MainActivity Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppController.getInstance().Logger("Inside MainActivity Destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        AppController.getInstance().Logger("Inside MainActivity Restart");
    }

    @Override
    public void send(String msg) {
      //  SecondFragment secondFragment = (SecondFragment) getSupportFragmentManager().findFragmentByTag("secondFragment");
       // secondFragment.setMessage(msg);
    }
}
