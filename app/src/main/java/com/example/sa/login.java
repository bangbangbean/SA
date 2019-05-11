package com.example.sa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;


public class login extends AppCompatActivity {

    private TextView tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(login.this, registered.class);
                startActivity(intent);
            }
        });
    }
}
