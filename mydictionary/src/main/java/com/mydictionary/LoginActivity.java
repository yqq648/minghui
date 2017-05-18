package com.mydictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //给注册和登陆按钮注册点击事件
        Button btn_register = (Button) findViewById(R.id.btn_register);
        //如何查看方法中的参数是什么，ctrl+p。一定要new一个类,new ctrl+shift+space
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//这就是点击事件的方法
                openRegister();
            }
        });
        //登陆的点击事件
        Button btn_login = (Button) findViewById(R.id.btn_login);
        //如何查看方法中的参数是什么，ctrl+p。一定要new一个类,new ctrl+shift+space
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//这就是点击事件的方法
                //判断用户名和密码是否则正确
                openMain();//假设登陆成功
            }
        });
    }

    private void openRegister() {
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
    private void openMain() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
