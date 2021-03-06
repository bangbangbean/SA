package com.example.sa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class shoppingcar extends AppCompatActivity {
    private ImageButton backbt;
    test1 test1;
    private ListView listView;
    private MyListAdapter myListAdapter;


    private Button okbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //-----------------------------------------------------------------------------
        //登入身分
        SharedPreferences session = getSharedPreferences("save_useraccount", MODE_PRIVATE);
        SharedPreferences.Editor editor = session.edit();
        String who = session.getString("user_id", "目前沒人登入");
        //------------------------------------------------------------------------------


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcar);

        listView = (ListView) findViewById(R.id.lvl);
        myListAdapter = new MyListAdapter(this, new ArrayList<Res<ShopCar>>());
        listView.setAdapter(myListAdapter);
        getShopcar(who);

        backbt = (ImageButton) findViewById(R.id.imageButton2);
        backbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(shoppingcar.this, realexchengehome.class);
                startActivity(intent);
            }
        });
        okbt = (Button) findViewById(R.id.okbt);
        okbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(shoppingcar.this, checkout.class);
                startActivity(intent);
            }
        });
    }

    public void getShopcar(String who) {
        test1 = RetrofitManager.getInstance().getAPI();
        //TODO 後續修改
        Call<ListRes<ShopCar>> call = test1.getShop("{added_to_shopcar} = '" + who + "'");
        call.enqueue(new Callback<ListRes<ShopCar>>() {
            @Override
            public void onResponse(Call<ListRes<ShopCar>> call, Response<ListRes<ShopCar>> response) {
                if (response.isSuccessful()) {
                    List<Res<ShopCar>> shopcarList = response.body().getRecords();
                    myListAdapter.updateData(shopcarList);
                } else {
                    Log.e("shoppingcar", response.message());
                    Log.e("shoppingcar", response.code() + "");
                }
            }

            @Override
            public void onFailure(Call<ListRes<ShopCar>> call, Throwable t) {
                Log.e("shoppingcar", t.getMessage());
            }
        });

    }

}

