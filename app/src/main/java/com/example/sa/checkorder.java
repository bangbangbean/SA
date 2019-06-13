package com.example.sa;

import java.util.List;

public class checkorder {
    private Integer num = null;
    private List<String> added_to_shopcar;
    private List<String> buyer_account;
    private List<String> seller_account;
    private List<String> normal_product_number;
    private List<String> member_name;
    private List<String> shopcar_name;
    private List<Integer> shopcar_price;
    private List<String> shopcar_color;
    private List<String> shopcar_size;
    private List<String> shopcar;
    private int order_totalmoney;
    private String order_sendway;
    private String order_payway;
    private int order_payprice;

    public checkorder(List<String> buyer_account, List<String> seller_account,
                      String order_sendway, String order_payway,
                      int order_payprice,int order_totalmoney) {
        this.buyer_account = buyer_account;
        this.seller_account = seller_account;
        this.order_sendway = order_sendway;
        this.order_payway = order_payway;
        this.order_payprice = order_payprice;
        this.order_totalmoney = order_totalmoney;
    }

    public List<String> getBuyer_account() {
        return buyer_account;
    }

    public List<String> getShopcar() {
        return shopcar;
    }

    public int getOrder_totalmoney() {
        return order_totalmoney;
    }

    public String getOrder_sendway() {
        return order_sendway;
    }

    public String getOrder_payway() {
        return order_payway;
    }

    public int getOrder_payprice() {
        return order_payprice;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<String> getSeller_account() {
        return seller_account;
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


}
