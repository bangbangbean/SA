package com.example.sa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class newproducts extends AppCompatActivity {

    private Button newproducts_shopcarbt;
    private Button newproducts_buybt;
    private ImageButton backbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newproducts);

        newproducts_shopcarbt = (Button) findViewById(R.id.newproducts_shopcarbt);
        newproducts_shopcarbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(newproducts.this, checkout.class);
                startActivity(intent);
            }
        });

        newproducts_buybt = (Button) findViewById(R.id.newproducts_buybt);
        newproducts_buybt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(newproducts.this, shoppingcar.class);
                startActivity(intent);
            }
        });

        backbt = (ImageButton) findViewById(R.id.imageButton2);
        backbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(newproducts.this, realhome.class);
                startActivity(intent);
            }
        });
    }
}
