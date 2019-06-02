package com.example.sa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class exchangehome extends AppCompatActivity {

    private Button shopbt;
    private Button dickshopbt;
    private ImageButton product1;
    private ImageButton product2;
    private ImageButton product3;
    private ImageButton product4;

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

        dickshopbt = (Button) findViewById(R.id.functionlist_dickshopbt);
        dickshopbt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(exchangehome.this, dickshop.class);
                startActivity(intent);
            }
        });


        product1 = (ImageButton) findViewById(R.id.product1);
        product1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(exchangehome.this, bartergoods.class);
                startActivity(intent);
            }
        });
        product2 = (ImageButton) findViewById(R.id.product2);
        product2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(exchangehome.this, bartergoods.class);
                startActivity(intent);
            }
        });
        product3 = (ImageButton) findViewById(R.id.product3);
        product3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(exchangehome.this, bartergoods.class);
                startActivity(intent);
            }
        });
        product4 = (ImageButton) findViewById(R.id.product4);
        product4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(exchangehome.this, exchangehome.class);
                startActivity(intent);
            }
        });
    }
}
