package com.jk.model;


import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -3557333572286688982L;
    private Integer  id;
    private String name;
    private Integer ltype;
    private Integer lpout;

    private String typel;

    public String getTypel() {
        return typel;
    }

    public void setTypel(String typel) {
        this.typel = typel;
    }

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

    public Integer getLtype() {
        return ltype;
    }

    public void setLtype(Integer ltype) {
        this.ltype = ltype;
    }

    public Integer getLpout() {
        return lpout;
    }

    public void setLpout(Integer lpout) {
        this.lpout = lpout;
    }
}
