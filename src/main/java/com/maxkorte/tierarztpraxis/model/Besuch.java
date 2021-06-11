package com.maxkorte.tierarztpraxis.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
public class Besuch extends BaseEntity {
    private Date datum;
    private String beschreibung;
    private Haustier haustier;

    public Besuch(Date datum, String beschreibung, Haustier haustier) {
        this.datum = datum;
        this.beschreibung = beschreibung;
        this.haustier = haustier;
    }

    public Besuch() {
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Haustier getHaustier() {
        return haustier;
    }

    public void setHaustier(Haustier haustier) {
        this.haustier = haustier;
    }

    @Override
    public String toString() {
        return "Besuch{" +
                "datum=" + datum +
                ", beschreibung='" + beschreibung + '\'' +
                ", haustier=" + haustier +
                '}';
    }


}