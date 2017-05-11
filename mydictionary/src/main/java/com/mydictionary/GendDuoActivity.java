package com.mydictionary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * 方法的覆盖,需要的条件
 * 1.必须是父子关系
 * 2.访问修饰词只能放大，不能缩小
 */
public class GendDuoActivity extends AppCompatActivity {

    @Override//
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gend_duo);
    }

    public void click1(View view) {//联系我们，，DIAL拨号盘, action想要做的事情
        Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:15010559566"));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
//        Intent intent = new Intent();//15010559566
//        intent.setAction(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tell:15010559566"));
//        startActivity(intent);
    }
    public void click2(View view) {//提意见
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://mail.qq.com/cgi-bin/qm_share?t=qm_mailme&email=VCc9PyE1OjMUMjssOTU9OHo3Ozk"));
        startActivity(intent);
    }
    public void click3(View view) {//更新版本

    }
    public void click4(View view) {//合作

    }
    public void click5(View view) {//退出
        //退出
    }
}
