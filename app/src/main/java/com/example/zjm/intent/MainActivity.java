package com.example.zjm.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText ed_name;
    private EditText ed_age;
    private String name;
    private int age;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_name = (EditText) findViewById(R.id.ed_name);
        ed_age = (EditText) findViewById(R.id.ed_age);
        btn = (Button) findViewById(R.id.btn_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = ed_name.getText().toString();
                age = Integer.parseInt(ed_age.getText().toString());
                if(name!=null&age!=0){
                    //定义一个意图
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,OtherActivity.class);
                    OtherActivity.age = age;
                    OtherActivity.name = name;
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"请输入姓名和年龄",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
