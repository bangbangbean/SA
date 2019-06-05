package com.example.sa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class checkout extends AppCompatActivity {

    private ImageButton backbt;
    checkout1 checkout1;
    private Object test1;
    private TextView productname;
    private TextView num;
    private TextView size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        backbt = (ImageButton) findViewById(R.id.imageButton2);
        backbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(checkout.this, newproducts.class);
                startActivity(intent);
            }
        });
        productname = (TextView) findViewById(R.id.productname);
        num = (TextView) findViewById(R.id.num);
        size = (TextView) findViewById(R.id.size);
        getCheck1();
    }

    public void getCheck1(){
        test1 = RetrofitManager.getInstance().getAPI();

        // 3. 建立連線的Call，此處設置call為myAPIService中的getAlbums()連線
        Call<checkout1> call = ((test1) test1).getCheck1();

        // 4. 執行call
        call.enqueue(new Callback<checkout1>() {
            @Override
            public void onResponse(Call<com.example.sa.checkout1> call, Response<checkout1> response) {
                productname.append(response.body().getfields(0).getNormal_product_name());
            }

            @Override
            public void onFailure(Call<com.example.sa.checkout1> call, Throwable t) {
                productname.append(t.getMessage());
            }
        });

        call.enqueue(new Callback<checkout1>() {
            @Override
            public void onResponse(Call<com.example.sa.checkout1> call, Response<checkout1> response) {
                num.append(response.body().getfields(0).getNormal_product_stocks());
            }

            @Override
            public void onFailure(Call<com.example.sa.checkout1> call, Throwable t) {
                num.append(t.getMessage());
            }
        });

        call.enqueue(new Callback<checkout1>() {
            @Override
            public void onResponse(Call<com.example.sa.checkout1> call, Response<checkout1> response) {
                size.append(response.body().getfields(0).getNormal_product_size());
            }

            @Override
            public void onFailure(Call<com.example.sa.checkout1> call, Throwable t) {
                size.append(t.getMessage());
            }
        });
    }

}
