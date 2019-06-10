package com.example.sa;

public class Res<T> {
    private String id;
    private T fields;
    private String createdTime;

    public String getId() {
        return id;
    }

    public T getFields() {
        return fields;
    }

    public String getCreatedTime() {
        return createdTime;
    }
}
