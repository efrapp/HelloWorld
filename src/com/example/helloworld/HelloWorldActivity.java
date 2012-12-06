package com.example.helloworld;

import android.os.Bundle;

import org.apache.cordova.*;

public class HelloWorldActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        super.loadUrl("file:///android_asset/www/index.html");
    } 
}
