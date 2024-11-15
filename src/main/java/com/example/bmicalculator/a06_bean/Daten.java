package com.example.bmicalculator.a06_bean;

import java.io.Serializable;


// Das hier ist die Bean, die die Daten speichert
public class Daten implements Serializable {

    private static final long serialVersionUID = 1L; // Versionsnummer

    // Variablen für die Formulardaten sind immer private
    private String name;
    private String vorname;
    private String wohnort;

    // Wichtige Porg. Regel -> immer kleinbuchstaben für variablen, grossbuchstaben für Klassen und get/set Methoden automatisch erzeugen lassen


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }
}
