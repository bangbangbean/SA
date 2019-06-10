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
    private TextView price;
    private TextView pricetotal;
    private int total=0;
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
        price = (TextView) findViewById(R.id.price);
        pricetotal = (TextView) findViewById(R.id.pricetotal);
        //getCheck1();

    }

    public void getCheck1(){
        test1 = RetrofitManager.getInstance().getAPI();

        // 3. 建立連線的Call，此處設置call為myAPIService中的getAlbums()連線
        Call<checkout1> call = ((test1) test1).getCheck1();

        // 4. 執行call
        call.enqueue(new Callback<checkout1>() {
            @Override
            public void onResponse(Call<com.example.sa.checkout1> call, Response<checkout1> response) {
                productname.setText(response.body().getfields(0).getShopcar_name().get(0));
                //num.setText(response.body().getfields(0).getShopcar_num()+"");
                //size.setText(response.body().getfields(0).getShopcar_size());
                //price.setText(response.body().getfields(0).getShopcar_price()+"");
                //計算訂單總價數量X單價
                int dEt1 = Integer.valueOf(num.getText().toString());
                int dEt2 = Integer.valueOf(price.getText().toString());
                total = dEt1 * dEt2;
                pricetotal.setText(Integer.toString(total));
            }

            @Override
            public void onFailure(Call<com.example.sa.checkout1> call, Throwable t) {
                productname.setText(t.getMessage());
                num.setText(t.getMessage());
                size.setText(t.getMessage());
                price.setText(t.getMessage());
            }
        });
    }

}
