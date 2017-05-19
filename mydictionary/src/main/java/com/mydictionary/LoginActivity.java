package com.mydictionary;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText et_username;//用户名
    private EditText et_password;//密码
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);


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
                //TODO 1判断用户名和密码是否则正确
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                if ("".equals(username)){
                    Toast.makeText(LoginActivity.this, "用户名不能为空", Toast.LENGTH_SHORT).show();
                    return;//不能再继续
                }
                if ("".equals(password)){
                    Toast.makeText(LoginActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                    return;//不能再继续
                }
                //TODO 3查看记事本的用户名和密码[2步骤]
                SharedPreferences sp = getSharedPreferences("yq",0);
                String us = sp.getString("username","");//""
                String pw = sp.getString("password","");//没有
                if (us.equals(username)&&pw.equals(password)){
                    openMain();//假设登陆成功
                }else{
                    Toast.makeText(LoginActivity.this, "登陆失败", Toast.LENGTH_SHORT).show();
                }

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
