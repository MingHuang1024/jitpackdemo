package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        findViewById(R.id.aaa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 测试一下能不能成功引用自己发布在JitPack上的aar包
                startActivity(new Intent(com.example.test.MainActivity.this, com.example.huangming.jitpackdemo
                    .MainActivity.class));
            }
        });
    }
}
