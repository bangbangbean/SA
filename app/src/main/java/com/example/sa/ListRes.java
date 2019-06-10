package com.example.sa;

import java.util.List;

public class ListRes<T> {
    private List<Res<T>> records;
    private String offset;

    public List<Res<T>> getRecords() {
        return records;
    }

    public void setRecords(List<Res<T>> records) {
        this.records = records;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }
}
