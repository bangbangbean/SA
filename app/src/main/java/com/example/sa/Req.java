package com.example.sa;

public class Req<T> {

    private T fields;
    private boolean typecast = true;

    public Req(T fields) {
        this.fields = fields;
    }

    public T getFields() {
        return fields;
    }

    public void setFields(T fields) {
        this.fields = fields;
    }
}
