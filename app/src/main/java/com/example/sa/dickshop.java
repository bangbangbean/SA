package com.example.sa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dickshop extends AppCompatActivity {
    private Button exchangebt;
    private Button homebt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dickshop);

        exchangebt = (Button) findViewById(R.id.functionlist_exchangebt);
        exchangebt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(dickshop.this, realexchengehome.class);
                startActivity(intent);
            }
        });

        homebt = (Button) findViewById(R.id.functionlist_shopbt);
        homebt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(dickshop.this, realhome.class);
                startActivity(intent);
            }
        });
    }
}
