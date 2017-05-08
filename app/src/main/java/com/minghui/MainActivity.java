package com.minghui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override//main
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//手机界面布局
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this,MessageActivity.class);
        startActivity(intent);
    }
}
