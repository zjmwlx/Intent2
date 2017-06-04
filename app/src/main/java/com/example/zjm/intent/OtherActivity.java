package com.example.zjm.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    private TextView tv_1;

    public static String name;
    public static int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_1.setText("name:"+name+"\n"+"age:"+age);
    }
}
