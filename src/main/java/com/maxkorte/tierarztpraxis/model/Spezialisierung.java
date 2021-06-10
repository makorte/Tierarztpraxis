package com.maxkorte.tierarztpraxis.model;

import javax.persistence.Entity;

@Entity
public class Spezialisierung extends BaseEntity {
    private String name;

    public Spezialisierung(String name) {
        this.name = name;
    }

    public Spezialisierung() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Spezialisierung{" +
                "name='" + name + '\'' +
                '}';
    }
}