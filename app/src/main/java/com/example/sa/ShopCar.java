package com.example.sa;

import java.util.List;

public class ShopCar {
    private Integer num = null;
    private int shopcar_num =1;
    private List<String> Seller_account;
    private List<String> added_to_shopcar;
    private List<String> normal_product_number;
    private List<String> member_name;
    private List<String> shopcar_name;
    private List<Integer> shopcar_price;
    private List<String> shopcar_color;
    private List<String> shopcar_size;

    private String id;
    private ShopCar[] records;
    private ShopCar fields;

    public ShopCar[] getRecords(){
        return records;
    }
    public ShopCar getFields(int i){
        return records[i].fields;
    }
    public String getId(){
        return id;
    }
    public ShopCar(String id){this.id = id;}


    public ShopCar(List<String> added_to_shopcar, List<String> normal_product_number) {
        this.added_to_shopcar = added_to_shopcar;
        this.normal_product_number = normal_product_number;
    }



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getShopcar_num() {
        return shopcar_num;
    }

    public void setShopcar_num(int shopcar_num) {
        this.shopcar_num = shopcar_num;
    }

    public List<String> getSeller_account() {
        return Seller_account;
    }

    public void setSeller_account(List<String> Seller_account) {
        this.Seller_account = Seller_account;
    }

    public List<String> getAdded_to_shopcar() {
        return added_to_shopcar;
    }

    public void setAdded_to_shopcar(List<String> added_to_shopcar) {
        this.added_to_shopcar = added_to_shopcar;
    }

    public List<String> getNormal_product_number() {
        return normal_product_number;
    }

    public void setNormal_product_number(List<String> normal_product_number) {
        this.normal_product_number = normal_product_number;
    }

    public List<String> getMember_name() {
        return member_name;
    }

    public void setMember_name(List<String> member_name) {
        this.member_name = member_name;
    }

    public List<String> getShopcar_name() {
        return shopcar_name;
    }

    public void setShopcar_name(List<String> shopcar_name) {
        this.shopcar_name = shopcar_name;
    }

    public List<Integer> getShopcar_price() {
        return shopcar_price;
    }

    public void setShopcar_price(List<Integer> shopcar_price) {
        this.shopcar_price = shopcar_price;
    }

    public List<String> getShopcar_color() {
        return shopcar_color;
    }

    public void setShopcar_color(List<String> shopcar_color) {
        this.shopcar_color = shopcar_color;
    }

    public List<String> getShopcar_size() {
        return shopcar_size;
    }

    public void setShopcar_size(List<String> shopcar_size) {
        this.shopcar_size = shopcar_size;
    }


//    private int normal_product_number;
//    private String member_name;
//    private String normal_product_name;
//    private String normal_product_size;
//    private String normal_product_color;
//    private int normal_product_price;
//
//    public int getNormal_product_number() {
//        return normal_product_number;
//    }
//
//    public String getNormal_product_name(){
//        return normal_product_name;
//    }
//
//    public String getMember_name() {
//        return member_name;
//    }
//
//    public String getNormal_product_size() {
//        return normal_product_size;
//    }
//
//    public String getNormal_product_color() {
//        return normal_product_color;
//    }
//
//    public int getNormal_product_price() {
//        return normal_product_price;
//    }




    //-------------------------------------------------------------------------------------------
//shopping car
//    private String shopcar_name;
//    private int shopcar_price;
//    private  String shopcar_color;
//    private  String shopcar_size;
//
//    public fields(String shopcar_name, String shopcar_color, String shopcar_size, int shopcar_price) {
//        this.shopcar_name = shopcar_name;
//        this.shopcar_color = shopcar_color;
//        this.shopcar_size = shopcar_size;
//        this.shopcar_price = shopcar_price;
//    }
//
//    public String getShopcar_name() {
//        return shopcar_name;
//    }
//
//    public String getShopcar_color(){return shopcar_color;}
//
//    public String getShopcar_size(){return shopcar_size;}
//
//    public  int getShopcar_price(){return shopcar_price;}

    //------------------------------------------------------------------------------------------



}
