package com.example.sa;

public class checkout1 {
    private checkout1[] records;
    private String id;
    private fields fields;

    public checkout1(String id){
        this.id = id;
    }

    public checkout1[] getRecords() { return records;}
    public String getId(int i){
        return records[i].id;
    }
    public fields getfields(int i){return records[i].fields;}
}
