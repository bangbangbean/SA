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


public class bartergoods extends AppCompatActivity {

    private ImageButton backbt;
    bartergoods1 bartergoods1;
    private Object test1;
    private TextView selleraccount;
    private TextView changearea;
    private TextView name;
    private TextView narrative;
    private TextView price;
    private TextView color;
    private TextView size;
    private TextView method;
    private TextView area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bartergoods);

        backbt = (ImageButton) findViewById(R.id.imageButton2);
        backbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(bartergoods.this, realexchengehome.class);
                startActivity(intent);
            }
        });
        selleraccount = (TextView) findViewById(R.id.selleraccount);
        changearea = (TextView) findViewById(R.id.changearea);
        name = (TextView) findViewById(R.id.name);
        narrative = (TextView) findViewById(R.id.narrative);
        price = (TextView) findViewById(R.id.price);
        color = (TextView) findViewById(R.id.color);
        size = (TextView) findViewById(R.id.size);
        method = (TextView) findViewById(R.id.method);
        area = (TextView) findViewById(R.id.area);
        getChange1();
    }
    public void getChange1(){
        test1 = RetrofitManager.getInstance().getAPI();

        // 3. 建立連線的Call，此處設置call為myAPIService中的getAlbums()連線
        Call<bartergoods1> call = ((test1) test1).getChange1();

        // 4. 執行call
        call.enqueue(new Callback<bartergoods1>() {
            @Override
            public void onResponse(Call<com.example.sa.bartergoods1> call, Response<bartergoods1> response) {
                selleraccount.setText(response.body().getfields(0).getSeller_account().get(0));
//                changearea.setText(response.body().getfields(0).getChange_area());
//                name.setText(response.body().getfields(0).getChange_product_name());
//                narrative.setText(response.body().getfields(0).getChange_product_narrative());
//                price.setText(response.body().getfields(0).getChange_product_price()+"");
//                color.setText(response.body().getfields(0).getChange_color());
//                size.setText(response.body().getfields(0).getChange_size());
//                method.setText(response.body().getfields(0).getChange_transport_method().get(0));
//                area.setText(response.body().getfields(0).getChange_area());
            }

            @Override
            public void onFailure(Call<com.example.sa.bartergoods1> call, Throwable t) {
                selleraccount.setText(t.getMessage());
                changearea.setText(t.getMessage());
                name.setText(t.getMessage());
                narrative.setText(t.getMessage());
                price.setText(t.getMessage());
                color.setText(t.getMessage());
                size.setText(t.getMessage());
                method.setText(t.getMessage());
                area.setText(t.getMessage());
            }
        });
    }
}
