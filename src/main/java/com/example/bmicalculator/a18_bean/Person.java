package com.example.bmicalculator.a18_bean;

import java.io.Serializable;

// Java-bean in der Personen bzw. Namen und Adressen
public class Person implements Serializable {
    private String vorname;
    private String nachname;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
