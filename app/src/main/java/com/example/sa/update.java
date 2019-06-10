package com.example.sa;

public class update {
    private update[] records;
    private String id;
    private ShopCar fields;

    public update(String id){
        this.id = id;
    }

    public update[] getRecords() { return records;}
    public String getId(int i){
        return records[i].id;
    }
    public ShopCar getfields(int i){return records[i].fields;}
}
