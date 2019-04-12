package com.jk.model;

import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID = 2628547043996630768L;
    private Integer id;
    private String name;
    private String author;
    private Integer city;
    private Integer region;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }
}
