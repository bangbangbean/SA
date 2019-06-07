package com.example.sa;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class shoppingcar extends AppCompatActivity {

    shopcar shopcar;
    private TextView sellername;
    private  TextView textView8;
    private  TextView textView25;
    private  TextView textView29;
    private  TextView textView20;
    private Object test1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcar);

        sellername = (TextView) findViewById(R.id.sellername);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView25 = (TextView) findViewById(R.id.textView25);
        textView29 = (TextView) findViewById(R.id.textView29);
        textView20 = (TextView) findViewById(R.id.textView20);
        //getShopcar();

        try {
            //postinfor();//新增資料
        } catch (Exception e) {
            textView8.setText(e.toString());
            Log.e("MainActivity", e.getMessage());//
        }

        // 2. 透過RetrofitManager取得連線基底

    }

    public  void getShopcar(){
        test1 = RetrofitManager.getInstance().getAPI();

        // 3. 建立連線的Call，此處設置call為myAPIService中的getAlbums()連線
        Call<shopcar> call = ((test1) test1).getShopcar();

        // 4. 執行call
        call.enqueue(new Callback<shopcar>() {
            @Override
            public void onResponse(Call<com.example.sa.shopcar> call, Response<shopcar> response) {

                sellername.setText(response.body().getfields(0).getNormal_product_name());
                textView8.setText(response.body().getfields(0).getmembername(0));
            }

            @Override
            public void onFailure(Call<com.example.sa.shopcar> call, Throwable t) {
                sellername.setText(t.getMessage());
                textView8.setText(t.getMessage());

            }
        });
    }

   public void postinfor() {
       test1 = RetrofitManager.getInstance().getAPI();
        Call<shopcar> call = ((test1) test1).postInfor(new Req(new fields("123123", "紅", "L",1,5000)));
        call.enqueue(new Callback<shopcar>() {
            @Override
            public void onResponse(Call<com.example.sa.shopcar> call, Response<shopcar> response) {
               textView8.setText(response.body().getfieldsName());
               textView20.setText(response.body().getfieldsColor());
               textView25.setText(response.body().getfieldsSize());
              textView29.setText(response.body().getfieldsNum() + "");
               sellername.setText(response.body().getfieldsPrice() + "");
            }

            @Override
            public void onFailure(Call<shopcar> call, Throwable t) {

            textView8.setText(t.getMessage());
                textView20.setText(t.getMessage());
               textView25.setText(t.getMessage());
               textView29.setText(t.getMessage());
                sellername.setText(t.getMessage());
            }
        });

    }



}

