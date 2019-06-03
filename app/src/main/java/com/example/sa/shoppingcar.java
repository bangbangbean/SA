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
    private TextView textView28;
    private Object test1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcar);

        textView28 = (TextView) findViewById(R.id.textView28);
        getShopcar();


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

                textView28.setText(response.body().getfields(0).getNormal_product_name());
            }

            @Override
            public void onFailure(Call<com.example.sa.shopcar> call, Throwable t) {
                textView28.setText(t.getMessage());

            }
        });
    }



}
