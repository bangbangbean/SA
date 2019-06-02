package com.example.sa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class forget_password extends AppCompatActivity {
    private Button btn1;
    private ImageButton backbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        btn1 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(forget_password.this, certification.class);
                startActivity(intent);
            }
        });

        backbt = (ImageButton) findViewById(R.id.imageButton2);
        backbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(forget_password.this, login.class);
                startActivity(intent);
            }
        });
    }
}
