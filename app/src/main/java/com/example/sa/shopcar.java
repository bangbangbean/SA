package com.example.sa;

public class shopcar {

    private shopcar[] records;
    private String id;
    private fields fields;
    private String createTime;

    public shopcar(String id, fields fields1, String createTime){
        this.id = id;
        this.fields =fields1;
        this.createTime = createTime;
    }

    public shopcar[] getRecords() {
        return records;
    }

    public String getId(int i){
        return records[i].id;
    }

    public fields getfields(int i){
        return fields;
    }

    public String getCreateTime(){return createTime;}

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
