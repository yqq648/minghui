package com.mydictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
