package com.maxkorte.tierarztpraxis.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity
public class Tierarzt extends Person {
    private Set<Spezialisierung> spezialisierungen;

    public Tierarzt(String vorname, String nachname, Set<Spezialisierung> spezialisierungen) {
        super(vorname, nachname);
        this.spezialisierungen = spezialisierungen;
    }

    public Tierarzt() {
    }

    public Set<Spezialisierung> getSpezialisierungen() {
        return spezialisierungen;
    }

    public void setSpezialisierungen(Set<Spezialisierung> spezialisierungen) {
        this.spezialisierungen = spezialisierungen;
    }

    @Override
    public String toString() {
        return "Tierarzt{" +
                "spezialisierungen=" + spezialisierungen +
                '}';
    }
}