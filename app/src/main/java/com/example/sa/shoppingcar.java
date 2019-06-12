package com.example.sa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class shoppingcar extends AppCompatActivity {
    private ImageButton backbt;
    //@Override
//--------------------------------------------------------------------------------------
            //ListView
   // ListView listView = (ListView) findViewById(R.id.list_view);
    //final ArrayList<String> list = new ArrayList<>();
//--------------------------------------------------------------------------------------


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcar);

        backbt = (ImageButton) findViewById(R.id.imageButton2);
        backbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(shoppingcar.this, realexchengehome.class);
                startActivity(intent);
            }
        });
    }





}

