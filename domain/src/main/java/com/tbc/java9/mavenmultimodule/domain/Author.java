package com.tbc.java9.mavenmultimodule.domain;

public class Author {

    private long id;

    private String name;

    public Author(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
