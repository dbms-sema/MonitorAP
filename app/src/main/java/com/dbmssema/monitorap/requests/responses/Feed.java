package com.dbmssema.monitorap.requests.responses;

public class Feed {

    private String field1;

    private String field2;

    private String created_at;
    private String entry_id;

    public Feed(String field1, String field2, String created_at, String entry_id) {
        this.field1 = field1;
        this.field2 = field2;
        this.created_at = created_at;
        this.entry_id = entry_id;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getEntry_id() {
        return entry_id;
    }

    public void setEntry_id(String entry_id) {
        this.entry_id = entry_id;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", created_at='" + created_at + '\'' +
                ", entry_id='" + entry_id + '\'' +
                '}';
    }
}
