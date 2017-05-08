package com.minghui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override//main
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//手机界面布局
    }

    //点击事件四要素， public ,void ,点击事件方法名,View view
    public void sendMessage(View view) {
        //Activity界面之间的交通枢纽,可以打包数据
        Intent intent = new Intent(this,MessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);//寻找视图
        System.out.println(editText.getText());
        intent.putExtra("address",editText.getText().toString());//地址：北京市朝阳区菜市口...
        startActivity(intent);
    }
}
