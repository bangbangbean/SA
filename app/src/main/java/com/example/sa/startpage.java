package com.example.sa;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class startpage extends AppCompatActivity {
    private ImageView image1;
    //定义一个int数组来存放图片，在R文件中图片是以int形式存在的
    int[] images = new int[] { R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            };
    //定义一图片计数器
    int currentImg = 0;
    //定义一个handler来进行隔时间操作
    private Handler handler = new Handler();
    //新建一个runnable对象
    private Runnable myRunnable = new Runnable() {
        public void run() {
            //每隔1秒切换一次
            handler.postDelayed(this, 1000);

            if (currentImg >= 2) {
                currentImg = -1;
            }
            // 改变ImageView里显示的图片
            image1.setImageResource(images[++currentImg]);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);
        image1 = (ImageView) findViewById(R.id.imageView);
        //初始化时显示第一张图片
        image1.setImageResource(images[0]);
        Button btn = (Button) findViewById(R.id.registerbutton);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //将请求提交给runnable
                handler.post(myRunnable);

            }
        });
    }}
