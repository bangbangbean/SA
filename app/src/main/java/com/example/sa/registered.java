package com.example.sa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Call;

public class registered extends AppCompatActivity {

    private EditText username ;
    private EditText useraddress;
    private  EditText password;
    private EditText userpasswordcheck;
    private TextView test;
    private TextView test2;
    private  Object test1;
    private ImageButton backbt;
    private ArrayList<String> accr =new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences session = getSharedPreferences("save_useraccount",MODE_PRIVATE);
        SharedPreferences.Editor editor=session.edit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);

        test1 =RetrofitManager.getInstance().getAPI();
        final Call<ListRes<Member>> call= ((test1) test1).getmem();

        username=(EditText)findViewById(R.id.username);
        useraddress=(EditText)findViewById(R.id.useradress);
        password=(EditText)findViewById(R.id.password);
        userpasswordcheck=(EditText)findViewById(R.id.userpasswordcheck);
        test=(TextView)findViewById(R.id.test123);
        test2=(TextView) findViewById(R.id.test2);
        String x = session.getString("user_id","目前沒人登入");
        test2.setText(x);

        call.enqueue(new Callback<ListRes<Member>>() {
            @Override
            public void onResponse(Call<ListRes<Member>> call, Response<ListRes<Member>> response) {
                for (Res<Member> bbb :response.body().getRecords()){
                    accr.add(bbb.getFields().getMember_account());
                }
//                test2.setText(response.body().getRecords().get(0).getFields().getMember_account()+"\n"+accr);
            }

            @Override
            public void onFailure(Call<ListRes<Member>> call, Throwable t) {

            }
        });

        Button nextPageBtn = (Button)findViewById(R.id.registerbutton);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setClass(registered.this , login.class);
//                startActivity(intent);

          String account= username.getText().toString();
          String phone =useraddress.getText().toString();
          String pass= password.getText().toString();
          String chpass=userpasswordcheck.getText().toString();

//            final Member member=new Member();
//            member.setMember_account("123");
//            Call<Res<Member>> call= ((test1) test1).addAMember(new Req<Member>(member));
//            call.enqueue(new Callback<Res<Member>>() {
//                @Override
//                public void onResponse(Call<Res<Member>> call, Response<Res<Member>> response) {
//                    Log.v("login", response.body().getFields().getMember_account());
//                }
//
//                @Override
//                public void onFailure(Call<Res<Member>> call, Throwable t) {
//
//                }
//            });
          int reg=0;
          int nu=0;
          int pas=0;
          int pasch=0;
          for (int i =0;i<accr.size();i=i+1){
              if (account.equals(accr.get(i))){
                  reg=1;
                  break;
              }
          }

//            test.setText("帳號是: "+account+"\n"+"信箱是: "+email+"\n"+"密碼是: "+pass+"\n"+"確認密碼是: "+chpass);

            if(reg==1){
                test2.setText("Warning : 註冊帳號已有人使用");
            }
            else if ( phone.length()==0 || account.length()==0 || pass.length()==0 || chpass.length()==0){
                    nu=1;
                    test2.setText(" Warning : 註冊欄位不得為空");

                }
           else if (pass.length()<6){
               pas=1;
                test2.setText("Warning : 密碼至少為6碼");
            }
            else if (pass.equals(chpass)==false){
                pasch=1;
                test2.setText("Warning : 密碼與確認密碼不符");
            }
            if (reg==0 && nu==0 && pas==0 && pasch==0){
                final Member member=new Member();
                member.setMember_account(account);
                member.setMember_phone(phone);
                member.setMember_password(pass);
                Call<Res<Member>> call= ((test1) test1).addAMember(new Req<Member>(member));
                call.enqueue(new Callback<Res<Member>>() {
                    @Override
                    public void onResponse(Call<Res<Member>> call, Response<Res<Member>> response) {
                        Log.v("login", response.body().getFields().getMember_account());
                    }

                    @Override
                    public void onFailure(Call<Res<Member>> call, Throwable t) {

                    }
                });
                Intent intent= new Intent(registered.this, login.class);
                startActivity(intent);
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
