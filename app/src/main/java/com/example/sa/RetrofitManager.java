package com.example.sa;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {
    private static RetrofitManager mInstance = new RetrofitManager();

    private test1 myAPIService;

    private RetrofitManager() {

        // 設置baseUrl即要連的網站，addConverterFactory用Gson作為資料處理Converter
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.airtable.com/v0/appnAW5KTAE4iS2iv/") //自己的資料庫
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        myAPIService = retrofit.create(test1.class);
    }

    public static RetrofitManager getInstance() {
        return mInstance;
    }

    public test1 getAPI() {
        return myAPIService;
    }
}
