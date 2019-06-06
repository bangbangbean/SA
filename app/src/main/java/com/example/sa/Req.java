package com.example.sa;

public class Req {

    public String id;
    private shopcar shopcar;
    private fields fields;

    public String getId(){
        return id;
    }
    public Req(fields fields){
        this.fields = fields;
    }
    public fields getFields(){
        return fields;
    }
    public void setFields(com.example.sa.shopcar shopcar){
        this.shopcar = shopcar;
    }





}
