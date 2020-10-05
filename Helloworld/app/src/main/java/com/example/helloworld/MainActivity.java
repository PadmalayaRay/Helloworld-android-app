package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


<LinearLayout xmlns:android = "http://schemas.android.com/apk/res/android"
        xmlns:
        tools = "http://schemas.android.com/tools"
        android:
        layout_width = "match_parent"
        android:
        layout_height = "match_parent"
        android:
        paddingBottom = "16dp"
        android:
        paddingTop = "16dp"
        android:
        paddingLeft = "16dp
        android:
        paddingRight = "16dp"
        android:
        orientation = "vertical"
        tools:
        context = ".MainActivity" >
</LinearLayout >
     <ImageView
        android:
        layout_width = "match_parent"
        android:
        layout_height = "300dp"
        android:
        background = "@drawable/city_image"
        android:
        layout_marginBottom = "20dp" >
</ImageView >
    }
}