package com.example.sa;

public class fields {
    private String[] normal_product_number;
    private String[] member_name;
    private String normal_product_name;
    private int normal_product_price;
    private String normal_product_color;
    private String normal_product_size;
    private String[] added_to_shopping_car;

    //-------------------------------------------------------------------------------------------

    private String shopcar_name;
    private int shopcar_price;
    private String shopcar_color;
    private String shopcar_size;
    private int shopcar_num;

    //public fields(String shopcar_name, String shopcar_color, String shopcar_size, int shopcar_num, int shopcar_price) {
       // this.shopcar_name = shopcar_name;
       // this.shopcar_color = shopcar_color;
        //this.shopcar_size = shopcar_size;
       // this.shopcar_num = shopcar_num;
        //this.shopcar_price = shopcar_price;
   // }

    public String getShopcar_name() {
        return shopcar_name;
    }

    public int getShopcar_num(){
        return shopcar_num;
    }

    public int getShopcar_price() {
        return shopcar_price;
    }

    public String getShopcar_color() {
        return shopcar_color;
    }

    public String getShopcar_size() {
        return shopcar_size;
    }

    //------------------------------------------------------------------------------------------


    public String getNormal_product_number(int j) {
        return normal_product_number[j];
    }

    public String getmembername(int i) {
        return member_name[i];
    }

    public String getNormal_product_name() {
        return normal_product_name;
    }

    public int getNormal_product_price() {
        return normal_product_price;
    }

    public String getNormal_product_color() {
        return normal_product_color;
    }

    public String getNormal_product_size() {
        return normal_product_size;
    }

    public String[] getAdded_to_shopping_car() {
        return added_to_shopping_car;
    }

    //----------------------------------------------------------------------------------------

    //private String[] seller_account;
    private String change_area;
    private String change_product_name;
    private String change_product_narrative;
    private int change_product_price;
    private String change_color;
    private String change_size;
    private String[] change_transport_method;
    private String membername;

    public String getMembername() {
        return membername;
    }


    //public String[] getSeller_account() {
       // return seller_account;
    //}

    public String getChange_area() {
        return change_area;
    }

    public String getChange_product_name() {
        return change_product_name;
    }

    public String getChange_product_narrative() {
        return change_product_narrative;
    }

    public int getChange_product_price() {
        return change_product_price;
    }

    public String getChange_color() {
        return change_color;
    }

    public String getChange_size() {
        return change_size;
    }

    //public String[] getChange_transport_method() {
        //return change_transport_method;
    //}




}
