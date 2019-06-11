package com.example.sa;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface test1<normalgood> {
    // 測試網站      https://jsonplaceholder.typicode.com/
    // GET網址      https://jsonplaceholder.typicode.com/albums/1
    // ...typicode.com/[這裡就是API的路徑]

    @GET("normalgood/{record_id}?api_key=keyq0EkjYQRAzfrUN")    // 設置一個GET連線，路徑為albums/1
    Call<Res<NormalGood>> getNormalGoodId(@Path("record_id") String recordId);    // 取得的回傳資料用Albums物件接收，連線名稱取為getAlbums

    @GET("shopcar?api_key=keyq0EkjYQRAzfrUN")    // 設置一個GET連線，路徑為albums/1
    Call<checkout1> getCheck1();    // 取得的回傳資料用Albums物件接收，連線名稱取為getAlbums

    @GET("changegood?api_key=keyq0EkjYQRAzfrUN")
    Call<bartergoods1> getChange1();



    @GET("member?api_key=keyq0EkjYQRAzfrUN&view=Grid%20view")
    Call<ListRes<Member>> getmem();

    @GET("normalgood/{id}") // 用{}表示路徑參數，@Path會將參數帶入至該位置
    Call<Req> getShopcarById(@Path("id") String id);

    @POST("shopcar?api_key=keyq0EkjYQRAzfrUN") // 用@Body表示要傳送Body資料
    @Headers({
            "Accept: application/json; charset=utf-8",
            "Content-Type: application/json; charset=utf-8"
    })
    Call<Res<ShopCar>> addAShopCar(@Body Req<ShopCar> data);
}
