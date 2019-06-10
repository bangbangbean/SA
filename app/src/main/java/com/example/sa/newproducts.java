package com.example.sa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class newproducts extends AppCompatActivity {
    test1 test1;
    private Button newproducts_shopcarbt;
    private Button newproducts_buybt;
    private ImageButton backbt;
    private List<String> number = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newproducts);

        newproducts_shopcarbt = (Button) findViewById(R.id.newproducts_shopcarbt);
        newproducts_shopcarbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(newproducts.this, checkout.class);
                startActivity(intent);
            }
        });

        newproducts_buybt = (Button) findViewById(R.id.newproducts_buybt);
        newproducts_buybt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getShopcar();
            }
        });

        backbt = (ImageButton) findViewById(R.id.imageButton2);
        backbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(newproducts.this, realhome.class);
                startActivity(intent);
            }
        });
    }

    public  void getShopcar(){
        test1 = RetrofitManager.getInstance().getAPI();

        // 3. 建立連線的Call，此處設置call為myAPIService中的getAlbums()連線
        //TODO 後續修改
        Call<Res<NormalGood>> call = test1.getNormalGoodId("recc2pQOPkvJEOWnA");

        // 4. 執行call
        call.enqueue(new Callback<Res<NormalGood>>() {
            @Override
            public void onResponse(Call<Res<NormalGood>> call, Response<Res<NormalGood>> response) {
                number.add(response.body().getFields().getNormal_product_number() + "");

                postinfor();//新增資料
            }

            @Override
            public void onFailure(Call<Res<NormalGood>> call, Throwable t) {

            }
        });
    }

    public void postinfor() {
        test1 = RetrofitManager.getInstance().getAPI();

        List<String> buyer = new ArrayList<>();
        buyer.add("406401252");

        Call<Res<ShopCar>> call = test1.addAShopCar(new Req<>(new ShopCar(buyer, number)));
        call.enqueue(new Callback<Res<ShopCar>>() {
            @Override
            public void onResponse(Call<Res<ShopCar>> call, Response<Res<ShopCar>> response) {
//               textView8.setText(response.body().getfieldsName());
//                sellername.setText(response.body().getfieldsColor());
//                price1.setText("$"+response.body().getfieldsPrice() + "");
            }

            @Override
            public void onFailure(Call<Res<ShopCar>> call, Throwable t) {
//                textView8.setText(t.getMessage());
//                sellername.setText(t.getMessage());
//                price1.setText(t.getMessage());

            }
        });

    }
}
