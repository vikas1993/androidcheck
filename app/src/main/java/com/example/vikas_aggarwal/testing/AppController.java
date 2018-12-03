package com.example.vikas_aggarwal.testing;

import android.app.Application;
import android.util.Log;

public class AppController extends Application {

    private static AppController context;

    private AppController(){}

    public static AppController getInstance(){

        if(context == null){
            context = new AppController();
        }
        return context;
    }

    public void Logger(String msg){
        Log.e("AppController",msg);
    }
}
