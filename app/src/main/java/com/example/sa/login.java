package com.example.sa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class login extends AppCompatActivity {
    private String posturl="";
    private EditText useraccount ;
    private EditText password ;
    private TextView tv4;
    private TextView tv3;
    private ArrayList<String> acc =new ArrayList<String>();
    private  ArrayList<String> passs = new ArrayList<String>();
    private Button btn1;
    private ImageButton backbt;
    private Object test1;
    private TextView test2;
    memberlst memberlst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        test1 =RetrofitManager.getInstance().getAPI();
        final Call<ListRes<Member>> call= ((test1) test1).getmem();
        test2=(TextView)findViewById(R.id.test2);
        useraccount =(EditText)findViewById(R.id.useraccount);
        password =(EditText)findViewById(R.id.password);
        call.enqueue(new Callback<ListRes<Member>>() {
            @Override
            public void onResponse(Call<ListRes<Member>> call, Response<ListRes<Member>> response) {

//                    test2.setText(response.body().getRecords().get(1).getFields().getMember_name());
                for(Res<Member> xxx : response.body().getRecords()){
                    acc.add(xxx.getFields().getMember_account());
                }
                for (Res<Member> aaa : response.body().getRecords()){
                    passs.add((aaa.getFields().getMember_password()));
                }
//                   確認有沒有接到值 test2.setText(response.body().getRecords().get(1).getFields().getMember_account()+passs);




            }

            @Override
            public void onFailure(Call<ListRes<Member>> call, Throwable t) {
                t.printStackTrace();
            }
        });







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
                int log =0;
                int passd=0;
              String user =useraccount.getText().toString();
                String pass = password.getText().toString();
                for (int i=0 ; i<acc.size();i=i+1){
                    if (acc.get(i).equals(user)){
                        log=1;
                        break;
                    }
                }
                for (int j =0 ;j<passs.size();j=j+1){
                    if (passs.get(j).equals(pass)){
                        passd=1;
                        break;
                    }
                }
                if (log==1 && passd==1){

                    Intent intent= new Intent(login.this, realhome.class);
                    startActivity(intent);
                }
                else if(log==0){
                    test2.setText("Warning : 查無帳號");
            }
                else if (log==1 && passd==0){
                    test2.setText("Warning : 密碼錯誤");
                }

//            test2.setText("帳號是: "+user+"\n"+"密碼是: "+pass);





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
