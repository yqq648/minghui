package com.minghui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Intent intent = getIntent();
        String str = intent.getStringExtra("address");//获取打包过来的值
        System.out.println(str);
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(str);

    }
}
