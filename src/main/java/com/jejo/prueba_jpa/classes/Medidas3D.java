package com.jejo.prueba_jpa.classes;

import com.jejo.prueba_jpa.elemento.entity.Elemento;
import jakarta.persistence.*;

@Entity
public class Medidas3D extends Medidas2D {

    @Basic
    private Double alto;

    public Medidas3D() {
    }

    public Medidas3D(Long id, String kind, Double largo, Double ancho, Double alto, Elemento elemento) {
        super(id, kind, largo, ancho, elemento);
        this.alto = alto;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }
}
