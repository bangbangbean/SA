package com.example.sa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Button;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class login extends AppCompatActivity {
    private EditText useraccount ;
    private EditText password ;
    private TextView tv4;
    private TextView tv3;
    private TextView test;
    private Button btn1;
    private ImageButton backbt;
    private Object test1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        useraccount =(EditText)findViewById(R.id.useraccount);
        password =(EditText)findViewById(R.id.password);

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

//                Intent intent= new Intent(login.this, realhome.class);
//                startActivity(intent);

            }
        });
        backbt = (ImageButton) findViewById(R.id.imageButton2);
        backbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(login.this, startpage.class);
                startActivity(intent);
            }
        });

        test=(TextView)findViewById(R.id.test);
        getmem();
    }
        public void getmem(){
            test1 = RetrofitManager.getInstance().getAPI();

            // 3. 建立連線的Call，此處設置call為myAPIService中的getAlbums()連線
            Call<login1> call = ((test1) test1).getmem();

            // 4. 執行call
            call.enqueue(new Callback<login1>() {
                @Override
                public void onResponse(Call<com.example.sa.login1> call, Response<login1> response) {
                    //test.setText(response.body().getfields(0).getMember_password());

                }

                @Override
                public void onFailure(Call<com.example.sa.login1> call, Throwable t) {
                    test.setText(t.getMessage());

                }
            });

    }
}
