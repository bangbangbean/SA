package com.example.sa;

public class bartergoods1 {
    private bartergoods1 [] records;
    private String id;
    private fields fields;

    public bartergoods1(String id) { this.id = id; }

    public bartergoods1[] getRecords() { return records;}
    public String getId(int i){
        return records[i].id;
    }
    public fields getfields(int i){return records[i].fields;}
}
