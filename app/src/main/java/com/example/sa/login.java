package com.example.sa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;

import org.w3c.dom.Text;


public class login extends AppCompatActivity {

    private TextView tv4;
    private TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv4 = (TextView) findViewById(R.id.register);
        tv4.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(login.this, registered.class);
                startActivity(intent);
            }
        });

        tv3 = (TextView) findViewById(R.id.forgetpassword);
        tv3.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(login.this, forget_password.class);
                startActivity(intent);
            }
        });
    }
}
