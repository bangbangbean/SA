package com.example.sa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
public class forget_password extends AppCompatActivity {
    private Button btn1;

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
    }
}
