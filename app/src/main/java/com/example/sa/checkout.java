package com.example.sa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class checkout extends AppCompatActivity {
    private Button okbt;
    private ImageButton backbt;
    checkout1 checkout1;
    test1 test1;
    private TextView productname;
    private TextView num;
    private TextView size;
    private TextView price;
    private TextView pricetotal;
    private TextView pricetotal1;
    private TextView pricesend;
    private TextView finalprice;
    private int total=0;
    private int order_totalmoney = 0;
    private int order_payprice = 0;
    private String str;
    private String str2;

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
        okbt = (Button) findViewById(R.id.okbt);
        okbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                postinfor();
                Intent intent= new Intent(checkout.this, newproducts.class);
                startActivity(intent);
            }
        });
        //-------------------------------------------------------------------------------------------
        final Spinner spinner = (Spinner) findViewById(R.id.howsend);
        str = (String) spinner.getSelectedItem();
        pricesend = (TextView) findViewById(R.id.pricesend);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                //拿到被选择项的值
                str = (String) spinner.getSelectedItem();
                pricesend.setText(str);
                if (str.equals("選擇寄送方式")){
                    pricesend.setText("0");
                    int dEt1 = Integer.valueOf(pricesend.getText().toString());
                    finalprice.setText(dEt1+total+"");
                    order_payprice = dEt1;
                    order_totalmoney = (dEt1+total);
                }
                else if (str.equals("超商取貨")){
                    pricesend.setText("60");
                    int dEt1 = Integer.valueOf(pricesend.getText().toString());
                    finalprice.setText(dEt1+total+"");
                    order_payprice = 60;
                    order_totalmoney = (dEt1+total);
                }
                else if (str.equals("宅配")){
                    pricesend.setText(120+"");
                    int dEt1 = Integer.valueOf(pricesend.getText().toString());
                    finalprice.setText(dEt1+total+"");
                    order_payprice = 120;
                    order_totalmoney = (dEt1+total);
                }
                else if (str.equals("店到店")){
                    pricesend.setText(30+"");
                    int dEt1 = Integer.valueOf(pricesend.getText().toString());
                    finalprice.setText(dEt1+total+"");
                    order_payprice = 30;
                    order_totalmoney = (dEt1+total);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        final Spinner spinner1 = (Spinner) findViewById(R.id.howbuy);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                str2 = (String) spinner1.getSelectedItem();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        //------------------------------------------------------------------------------------------
        productname = (TextView) findViewById(R.id.productname);
        num = (TextView) findViewById(R.id.num);
        size = (TextView) findViewById(R.id.size);
        price = (TextView) findViewById(R.id.price);
        pricetotal = (TextView) findViewById(R.id.pricetotal);
        pricetotal1 = (TextView) findViewById(R.id.pricetotal1);
        finalprice = (TextView) findViewById(R.id.finalprice);
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
                productname.setText(response.body().getfields(0).getShopcar_name().get(0));
                num.setText(response.body().getfields(0).getShopcar_num()+"");
                size.setText(response.body().getfields(0).getShopcar_size().get(0));
                price.setText(response.body().getfields(0).getShopcar_price().get(0)+"");
                //計算訂單總價數量X單價
                int dEt1 = Integer.valueOf(num.getText().toString());
                int dEt2 = Integer.valueOf(price.getText().toString());
                total = dEt1 * dEt2;
                pricetotal.setText(Integer.toString(total));
                pricetotal1.setText(Integer.toString(total));
                finalprice.setText(Integer.toString(total));
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
    public void postinfor() {
        test1 = RetrofitManager.getInstance().getAPI();

        List<String> buyer = new ArrayList<>();
        List<String> shopcar = new ArrayList<>();
        buyer.add("406401252");
        shopcar.add("32");

                Call<Res<checkorder>> call = test1.addACheckorder(new Req<>(new checkorder
                        (buyer, shopcar, str, str2, order_payprice, order_totalmoney)
        ));
        call.enqueue(new Callback<Res<checkorder>>() {
            @Override
            public void onResponse(Call<Res<checkorder>> call, Response<Res<checkorder>> response) {
            }
            @Override
            public void onFailure(Call<Res<checkorder>> call, Throwable t) {
            }
        });
    }
}
