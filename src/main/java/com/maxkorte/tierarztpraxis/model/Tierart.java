package com.maxkorte.tierarztpraxis.model;

import javax.persistence.Entity;

@Entity
public class Tierart extends BaseEntity {
    private String name;

    public Tierart(String name) {
        this.name = name;
    }

    public Tierart() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tierart{" +
                "name='" + name + '\'' +
                '}';
    }
}