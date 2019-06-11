package com.example.sa;

public class newproduct1 {
    private newproduct1[] records;
    private String id;
    private NormalGood fields;

    public newproduct1(String id){
        this.id = id;
    }

    public newproduct1[] getRecords() { return records;}
    public String getId(int i){
        return records[i].id;
    }
    public NormalGood getfields(int i){return records[i].fields;}
}

