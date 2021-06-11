package com.maxkorte.tierarztpraxis.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

@Entity
public class Haustier extends BaseEntity {
    private String name;
    private Date geburtsdatum;
    private Tierart art;
    private Eigentuemer eigentuemer;
    private Set<Besuch> besuche;

    public Haustier(String name, Date geburtsdatum, Tierart art, Eigentuemer eigentuemer) {
        this.name = name;
        this.geburtsdatum = geburtsdatum;
        this.art = art;
        this.eigentuemer = eigentuemer;
    }

    public Haustier() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public Tierart getArt() {
        return art;
    }

    public void setArt(Tierart art) {
        this.art = art;
    }

    public Eigentuemer getEigentuemer() {
        return eigentuemer;
    }

    public void setEigentuemer(Eigentuemer eigentuemer) {
        this.eigentuemer = eigentuemer;
    }

    public Set<Besuch> getBesuche() {
        return besuche;
    }

    public void setBesuche(Set<Besuch> besuche) {
        this.besuche = besuche;
    }

    @Override
    public String toString() {
        return "Haustier{" +
                "name='" + name + '\'' +
                ", geburtsdatum=" + geburtsdatum +
                ", art=" + art +
                ", eigentuemer=" + eigentuemer +
                '}';
    }
}