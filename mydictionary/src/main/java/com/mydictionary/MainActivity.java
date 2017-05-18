package com.mydictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//TODO 标题中， 包含有多少个词库数目
public class MainActivity extends AppCompatActivity {//所有的界面， 都是属于Activity的子类

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置生词本的点击事件
        Button btn_shengciben = (Button) findViewById(R.id.btn_shengciben);
        btn_shengciben.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDicBook();
            }
        });
    }

    private void openDicBook() {
        Intent intent = new Intent(MainActivity.this,DicBookActivity.class);
        startActivity(intent);
    }

    //查询英文单词到中文翻译
    public void chaXun(View view) {
        String[] chinese = TWordsChinese.t_words;
        TextView tv = (TextView) findViewById(R.id.tv);
        //View ,EditText
        EditText et_english = (EditText) findViewById(R.id.et_english);
        String english = et_english.getText().toString();//英文去数组当中去查询
        String[] words = TWordsEnglish.t_words;
        boolean isFind = false;
        for(int i = 0;i<words.length;i++){
            if(english.equals(words[i])){
                isFind = true;
                tv.setText(chinese[i]);
                break;
            }
        }
        if (isFind==false){
            tv.setText("抱歉， 没有该单词");
        }
    }
    //Intent意图，
    public void gengduo(View view) {
                        //Intent有参数的构造方法
        Intent intent = new Intent(this,GendDuoActivity.class);
        startActivity(intent);

    }

    /**
     * public boolean contains(CharSequence s)当且仅当此字符串包含指定的 char 值序列时，返回 true。
     * @param view
     */
    public void chaxunChinese(View view) {//杀死
        TextView tv = (TextView) findViewById(R.id.tv);
        String[] englishs = TWordsEnglish.t_words;
        EditText et = (EditText) findViewById(R.id.chinese);
        String chinese = et.getText().toString();//用户输入的中文
        if ("".equals(chinese)){
            //create a toast 确定
            Toast.makeText(this, "请输入中文", Toast.LENGTH_SHORT).show();
//            Toast.makeText(this,"xxx",0).show();
            return;
        }


        String[] words = TWordsChinese.t_words;
        boolean isFind = false;
        for(int i = 0;i<words.length;i++){
            if(words[i].contains(chinese)){
                isFind = true;
                //设置内容到TextView上去
                tv.setText(englishs[i]);
                break;
            }
        }
        if(isFind==false){
            tv.setText("找不到该单词");
        }
    }
}
