package com.mydictionary;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private EditText et_username;//用户名
    private EditText et_password;//密码
    private EditText et_password2;//密码确定
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        et_password2 = (EditText) findViewById(R.id.et_password2);

        //getElementById(R.id.);
        Button btnRegister = (Button) findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO 1判断用户名和密码是否则正确
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                String password2 = et_password2.getText().toString();
                if ("".equals(username)){
                    Toast.makeText(RegisterActivity.this, "用户名不能为空", Toast.LENGTH_SHORT).show();
                    return;//不能再继续
                }
                if ("".equals(password)){
                    Toast.makeText(RegisterActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                    return;//不能再继续
                }
                if ("".equals(password2)){
                    Toast.makeText(RegisterActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                    return;//不能再继续
                }
                if (!password.equals(password2)){
                    Toast.makeText(RegisterActivity.this, "两次密码不一致", Toast.LENGTH_SHORT).show();
                    return;
                }
                ////////TODO  使用SharedPreferences[保存-4个步骤]注册成功的用户名和密码
                //username,password
                SharedPreferences sp = getSharedPreferences("yq",0);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("username",username);
                editor.putString("password",password);
                editor.commit();
            }
        });
    }
}
