package com.mydictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DicBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dic_book);
        //给+ 设置点击事件
        TextView add_dic_word = (TextView) findViewById(R.id.add_dic_word);
        add_dic_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddBook();
            }
        });
        //给ListView设置单词列表数据
        //查看android api的快捷键是 ctrl+q
        ListView lv_dic_book = (ListView) findViewById(R.id.lv_dic_book);
        //添加数据,要显示数据用数据适配器adapter，一般有好几种， 我们现在只显示文字， 所有就用普通的 [数组适配器]
        //系统里面自带的文字布局，android.R.layout.simple_list_item_1
        List<String> list = new ArrayList<>();
        list.add("ZHM");
        list.add("王马");
        list.add("王杰");
        list.add("ZHM");
        list.add("王马");
        list.add("王杰");
        list.add("ZHM");
        list.add("王马");
        list.add("王杰");
        list.add("ZHM");
        list.add("王马");
        list.add("王杰");
        list.add("ZHM");
        list.add("王马");
        list.add("王杰");
        list.add("ZHM");
        list.add("王马");
        list.add("王杰");
        list.add("ZHM");
        list.add("王马");
        list.add("王杰");
        list.add("ZHM");
        list.add("王马");
        list.add("王杰");
        list.add("ZHM");
        list.add("王马");
        list.add("王杰");
        lv_dic_book.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list));
    }
    //打开添加单词的界面
    private void openAddBook() {
        Intent intent = new Intent(this,AddDicWordActivity.class);
        startActivity(intent);
    }

}
