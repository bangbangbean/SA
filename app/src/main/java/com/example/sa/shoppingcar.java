package com.example.sa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
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
    private List<String> number = new ArrayList<>();

    private Button okbt;
    //@Override
//--------------------------------------------------------------------------------------
            //ListView
   // ListView listView = (ListView) findViewById(R.id.list_view);
    //final ArrayList<String> list = new ArrayList<>();
//--------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //-----------------------------------------------------------------------------
        //登入身分
        SharedPreferences session = getSharedPreferences("save_useraccount",MODE_PRIVATE);
        SharedPreferences.Editor editor=session.edit();
        String who = session.getString("user_id","目前沒人登入");
        //------------------------------------------------------------------------------


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcar);

        //ListView listView = (ListView) findViewById(R.id.lvl);
        //getShopcar(who);


        backbt = (ImageButton) findViewById(R.id.imageButton2);
        backbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(shoppingcar.this, realexchengehome.class);
                startActivity(intent);
            }
        });
        okbt = (Button) findViewById(R.id.okbt);
        okbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(shoppingcar.this, checkout.class);
                startActivity(intent);
            }
        });
    }
    public  void getShopcar(final String who){
        test1 = RetrofitManager.getInstance().getAPI();

        // 3. 建立連線的Call，此處設置call為myAPIService中的getAlbums()連線
        //TODO 後續修改
        Call<ShopCar> call = test1.getShop();
        call.enqueue(new Callback<ShopCar>() {
            @Override
            public void onResponse(Call<ShopCar> call, Response<ShopCar> response) {
                int len = response.body().getRecords().length;
                int j = 0;
                int count = 0;
                count = len;
                String[][] date2 = new String[len][6];
                while (j < len){
                    if(response.body().getFields(j).getId().equals(who)){
                        date2[j][0] = response.body().getFields(j).getMember_name().get(j);
                        date2[j][1] = response.body().getFields(j).getShopcar_name().get(j);
                        date2[j][2] = response.body().getFields(j).getShopcar_price().get(j) + "";
                        date2[j][3] = response.body().getFields(j).getShopcar_num() + "";
                        date2[j][4] = "規格";
                        date2[j][5] = response.body().getFields(j).getShopcar_size().get(j);
                        date2[j][6] = response.body().getFields(j).getShopcar_color().get(j);
                        j++;
                    }
                }
            }

            @Override
            public void onFailure(Call<ShopCar> call, Throwable t) {

            }
        });

    }





}

