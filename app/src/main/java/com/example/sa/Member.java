package com.example.sa;

import java.util.List;

public class Member {

    private String normalshop_shopcar;
    private String member_account;
    private String member_gender;
    private String member_name;
    private String shopcar;
    private String member_phone;
    private String member_password;
    private List<String> as_seller_evaluation;
    private List<String> sell_to_normal;
    private List<String> as_buyer_evaluation;
    private List<String> sell_to_change;
    private List<String> ordersystem;

    public Member() {
    }

    public String getNormalshop_shopcar() {
        return normalshop_shopcar;
    }

    public void setNormalshop_shopcar(String normalshop_shopcar) {
        this.normalshop_shopcar = normalshop_shopcar;
    }

    public String getMember_account() {
        return member_account;
    }

    public void setMember_account(String member_account) {
        this.member_account = member_account;
    }

    public String getMember_gender() {
        return member_gender;
    }

    public void setMember_gender(String member_gender) {
        this.member_gender = member_gender;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getShopcar() {
        return shopcar;
    }

    public void setShopcar(String shopcar) {
        this.shopcar = shopcar;
    }

    public String getMember_phone() {
        return member_phone;
    }

    public void setMember_phone(String member_phone) {
        this.member_phone = member_phone;
    }

    public String getMember_password() {
        return member_password;
    }

    public void setMember_password(String member_password) {
        this.member_password = member_password;
    }

    public List<String> getAs_seller_evaluation() {
        return as_seller_evaluation;
    }

    public void setAs_seller_evaluation(List<String> as_seller_evaluation) {
        this.as_seller_evaluation = as_seller_evaluation;
    }

    public List<String> getSell_to_normal() {
        return sell_to_normal;
    }

    public void setSell_to_normal(List<String> sell_to_normal) {
        this.sell_to_normal = sell_to_normal;
    }

    public List<String> getAs_buyer_evaluation() {
        return as_buyer_evaluation;
    }

    public void setAs_buyer_evaluation(List<String> as_buyer_evaluation) {
        this.as_buyer_evaluation = as_buyer_evaluation;
    }

    public List<String> getSell_to_change() {
        return sell_to_change;
    }

    public void setSell_to_change(List<String> sell_to_change) {
        this.sell_to_change = sell_to_change;
    }

    public List<String> getOrdersystem() {
        return ordersystem;
    }

    public void setOrdersystem(List<String> ordersystem) {
        this.ordersystem = ordersystem;
    }
}
