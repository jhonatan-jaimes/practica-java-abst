package com.jejo.prueba_jpa.ladrillo;

import com.jejo.prueba_jpa.classes.Areas;
import com.jejo.prueba_jpa.classes.Medidas;
import com.jejo.prueba_jpa.elemento.entity.Elemento;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

@Entity
public class Ladrillo extends Elemento {

    @Basic
    private Medidas medidas;
    private Areas areas;

    public Ladrillo() {
    }

    public Ladrillo(Long id, String name, Integer lot, Medidas medidas, Areas areas) {
        super(id, name, lot);
        this.medidas = medidas;
        this.areas = areas;
    }

    public Medidas getMedidas() {
        return medidas;
    }

    public void setMedidas(Medidas medidas) {
        this.medidas = medidas;
    }

    public Areas getAreas() {
        return areas;
    }

    public void setAreas(Areas areas) {
        this.areas = areas;
    }
}
