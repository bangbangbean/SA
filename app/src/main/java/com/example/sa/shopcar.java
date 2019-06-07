package com.example.sa;

public class shopcar {

    private shopcar[] records;
    private String id;
    private fields fields;

    public shopcar(String id){
        this.id = id;
    }

    public shopcar[] getRecords() {
        return records;
    }

    public String getId(int i){
        return records[i].id;
    }

    public fields getfields(int i){
        return records[i].fields;
    }

    public String getfieldsName() {
        return fields.getShopcar_name();
    }

    public String getfieldsSize(){
        return fields.getShopcar_size();
    }

    public String getfieldsColor(){
        return fields.getShopcar_color();
    }

    public int getfieldsNum(){
        return fields.getShopcar_num();
    }

    public int getfieldsPrice(){
        return fields.getShopcar_price();
    }


}
