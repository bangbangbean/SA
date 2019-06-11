package com.example.sa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class registered extends AppCompatActivity {
    private EditText username ;
    private EditText useraddress;
    private  EditText password;
    private EditText userpasswordcheck;
    private TextView test;
    private TextView test2;
    private ImageButton backbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);
        username=(EditText)findViewById(R.id.username);
        useraddress=(EditText)findViewById(R.id.useradress);
        password=(EditText)findViewById(R.id.password);
        userpasswordcheck=(EditText)findViewById(R.id.userpasswordcheck);
        test=(TextView)findViewById(R.id.test123);
        test2=(TextView) findViewById(R.id.test2);

        Button nextPageBtn = (Button)findViewById(R.id.registerbutton);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setClass(registered.this , login.class);
//                startActivity(intent);
          String account= username.getText().toString();
          String email =useraddress.getText().toString();
          String pass= password.getText().toString();
          String chpass=userpasswordcheck.getText().toString();

            test.setText("帳號是: "+account+"\n"+"信箱是: "+email+"\n"+"密碼是: "+pass+"\n"+"確認密碼是: "+chpass);
            if ( email.length()==0 || account.length()==0 || pass.length()==0 || chpass.length()==0){
                test2.setText("註冊欄位不得為空");
            }
           else if (pass.length()<6){
                test2.setText("密碼至少為6碼");
            }
            else if (pass.equals(chpass)==false){
                test2.setText("密碼與確認密碼不符");
            }
            }
        });

        backbt = (ImageButton) findViewById(R.id.imageButton2);
        backbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(registered.this, login.class);
                startActivity(intent);
            }
        });
    }
}
