package com.example.bmicalculator.a07_bean_uebung;

import java.io.Serializable;

public class Databean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String adresse;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    private int Id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}