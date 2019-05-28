package com.example.sa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class exchangehome extends AppCompatActivity {

    private Button shopbt;
    private Button exchangebt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchangehome);

        shopbt = (Button) findViewById(R.id.functionlist_shopbt);
        shopbt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(exchangehome.this, realhome.class);
                startActivity(intent);
            }
        });

        exchangebt = (Button) findViewById(R.id.functionlist_exchangebt);
        exchangebt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(exchangehome.this, exchangehome.class);
                startActivity(intent);
            }
        });
    }
}
