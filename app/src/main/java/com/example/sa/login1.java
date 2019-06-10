package com.example.sa;

public class login1 {
    private login1[] records;
    private String id;
    private ShopCar fields;

    public login1(String id){
        this.id = id;
    }

    public login1[] getRecords() { return records;}
    public String getId(int i){
        return records[i].id;
    }
    public ShopCar getfields(int i){return records[i].fields;}
}
