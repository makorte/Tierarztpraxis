package com.maxkorte.tierarztpraxis.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity
public class Eigentuemer extends Person {
    private String adresse;
    private String stadt;
    private String telefon;
    private Set<Haustier> haustiere;

    public Eigentuemer(String vorname, String nachname, String adresse, String stadt, String telefon) {
        super(vorname, nachname);
        this.adresse = adresse;
        this.stadt = stadt;
        this.telefon = telefon;
    }

    public Eigentuemer() {
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Set<Haustier> getHaustiere() {
        return haustiere;
    }

    public void setHaustiere(Set<Haustier> haustiere) {
        this.haustiere = haustiere;
    }

    @Override
    public String toString() {
        return "Eigentuemer{" +
                "adresse='" + adresse + '\'' +
                ", stadt='" + stadt + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}