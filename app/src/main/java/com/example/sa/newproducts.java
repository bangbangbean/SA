package com.example.sa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

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
    private TextView selleraccount;
    private TextView name;
    private TextView narrative;
    private TextView price;

    private TextView method;
    private TextView area;
    private TextView areaa;
    private TextView preparetime;
    private TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newproducts);

        newproducts_shopcarbt = (Button) findViewById(R.id.newproducts_buybt);
        newproducts_shopcarbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(newproducts.this, shoppingcar.class);
                startActivity(intent);
            }
        });

        newproducts_buybt = (Button) findViewById(R.id.newproducts_shopcarbt);
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
        selleraccount = (TextView) findViewById(R.id.selleraccount);
        area = (TextView) findViewById(R.id.changearea);
        name = (TextView) findViewById(R.id.name);
        narrative = (TextView) findViewById(R.id.narrative);
        //price = (TextView) findViewById(R.id.price);

        method = (TextView) findViewById(R.id.method);
        areaa = (TextView) findViewById(R.id.area);
        preparetime = (TextView) findViewById(R.id.time);
        textView2 = (TextView) findViewById(R.id.textView2);
        getNewproduct();

        findViewById(R.id.newproducts_shopcarbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(newproducts.this, "已加入購物車!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public  void getNewproduct(){
        test1 = RetrofitManager.getInstance().getAPI();

        // 3. 建立連線的Call，此處設置call為myAPIService中的getAlbums()連線
        //TODO 後續修改
        Call<newproduct1> call = ((test1) test1).getNewproduct();
        // 4. 執行call

        call.enqueue(new Callback<newproduct1>() {
            @Override
            public void onResponse(Call<com.example.sa.newproduct1> call, Response<newproduct1> response) {
                textView2.setText(response.body().getfields(1).getNormal_product_name());
                selleraccount.setText(response.body().getfields(1).getMember_name().get(0));
                area.setText(response.body().getfields(1).getArea());
                name.setText(response.body().getfields(1).getNormal_product_name());
                narrative.setText(response.body().getfields(1).getNormal_product_narrative());
                //price.setText(response.body().getfields(1).getNormal_product_price()+"");
                method.setText(response.body().getfields(1).getTransport_way().get(0));
                areaa.setText(response.body().getfields(1).getArea());
                preparetime.setText(response.body().getfields(1).getPrepare_time());

            }
            @Override
            public void onFailure(Call<newproduct1> call, Throwable t) {
                selleraccount.setText(t.getMessage());
                area.setText(t.getMessage());
                name.setText(t.getMessage());
                narrative.setText(t.getMessage());
                //price.setText(t.getMessage());

                method.setText(t.getMessage());
                areaa.setText(t.getMessage());
                preparetime.setText(t.getMessage());
                textView2.setText(t.getMessage());


            }
        });
    }

    public  void getShopcar(){
        test1 = RetrofitManager.getInstance().getAPI();

        // 3. 建立連線的Call，此處設置call為myAPIService中的getAlbums()連線
        //TODO 後續修改
        Call<Res<NormalGood>> call = test1.getNormalGoodId("recpb68ablZeXbhiB");

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

        SharedPreferences session = getSharedPreferences("save_useraccount",MODE_PRIVATE);
        SharedPreferences.Editor editor=session.edit();

        String who = session.getString("user_id","目前沒人登入");

        List<String> buyer = new ArrayList<>();
        buyer.add(who);

        Call<Res<ShopCar>> call = test1.addAShopCar(new Req<>(new ShopCar(buyer, number)));
        call.enqueue(new Callback<Res<ShopCar>>() {
            @Override
            public void onResponse(Call<Res<ShopCar>> call, Response<Res<ShopCar>> response) {

            }

            @Override
            public void onFailure(Call<Res<ShopCar>> call, Throwable t) {

            }
        });
    }
}
