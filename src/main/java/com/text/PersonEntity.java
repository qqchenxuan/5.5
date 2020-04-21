package com.text;

public class PersonEntity {
    private int id;
    private String name;
    private Integer carid;
    private BycleEntity per;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public BycleEntity getPer() {
        return per;
    }

    public void setPer(BycleEntity per) {
        this.per = per;
    }
}
