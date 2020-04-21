package com.text;

import java.util.Set;

public class BydeEntity {
    private int id;
    private String name;
    private Set<PersonEntity> bye;

    public BydeEntity() {
    }

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

    public Set<PersonEntity> getBye() {
        return bye;
    }

    public void setBye(Set<PersonEntity> bye) {
        this.bye = bye;
    }
}
