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
    private Object test1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcar);

        sellername = (TextView) findViewById(R.id.sellername);
        getShopcar();

        try {
            postinfor();//新增資料
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
        Call<shopcar> call = ((test1) test1).postInfor(new Req(new fields("123123")));
        call.enqueue(new Callback<shopcar>() {
            @Override
            public void onResponse(Call<shopcar> call, Response<shopcar> response) {

                textView8.setText(response.body().getfieldsName());
            }

            @Override
            public void onFailure(Call<shopcar> call, Throwable t) {
                textView8.setText(t.getMessage());
            }
        });

    }



}

