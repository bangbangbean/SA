package com.example.sa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Button;

import org.w3c.dom.Text;


public class login extends AppCompatActivity {

    private TextView tv4;
    private TextView tv3;
    private Button btn1;
    private ImageButton backbt;
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
        btn1 = (Button) findViewById(R.id.loginbutton);
        btn1.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(login.this, realhome.class);
                startActivity(intent);
            }
        });
        backbt = (ImageButton) findViewById(R.id.imageButton2);
        backbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(login.this, startpage.class);
                startActivity(intent);
            }
        });
    }
}
