package com.example.sa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class shoppingcar extends AppCompatActivity {

    private  TextView textView8;
    private  TextView sellername;
    private  TextView price1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcar);

        textView8 = (TextView) findViewById(R.id.goodname1);
        sellername = (TextView) findViewById(R.id.sellername);
        price1 = (TextView) findViewById(R.id.price1);


        // 2. 透過RetrofitManager取得連線基底

    }





}

