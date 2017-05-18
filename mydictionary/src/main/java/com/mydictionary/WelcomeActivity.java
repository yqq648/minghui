package com.mydictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);//加载布局
        ImageView iv = (ImageView) findViewById(R.id.iv);
        //开始一个动画， 渐变动画，和投影仪关闭的时候一样， 慢慢的变暗.Alpha渐变动画
        //动画有四种1.渐变2.缩放3.平移4.帧动画，动画是所有类的父类
        Animation animation = new AlphaAnimation(0.0f,1.0f);
        //动画都有一个时间的长度 ,Duration间隔
        animation.setDuration(3000);//动画持续时间是3秒钟
        //动画结束后， 我们该怎么做。
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {//动画开始

            }

            @Override
            public void onAnimationEnd(Animation animation) {//动画结束
                openMain();//监听到动画结束后， 调用打开主界面的方法
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });//鱼钩方法，监听方法.ctrl+shift+space
        iv.startAnimation(animation);//每一个可以看见的控件视图，都可以打开动画
    }
    public void openMain(){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
