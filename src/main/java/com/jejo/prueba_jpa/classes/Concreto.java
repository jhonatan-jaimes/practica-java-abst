package com.jejo.prueba_jpa.classes;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "concreto")
public class Concreto extends Mortero{

    @Basic
    private Double grava;

    public Concreto() {
    }

    public Concreto(Long id, String nameArea, Double cemento, Double arena, Double grava, Double agua) {
        super(id, nameArea, cemento, arena, agua);
        this.grava = grava;
    }

    public Double getGrava() {
        return grava;
    }

    public void setGrava(Double grava) {
        this.grava = grava;
    }
}
