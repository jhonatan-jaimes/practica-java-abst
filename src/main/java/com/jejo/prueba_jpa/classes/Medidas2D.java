package com.jejo.prueba_jpa.classes;

import com.jejo.prueba_jpa.elemento.entity.Elemento;
import jakarta.persistence.*;

@Entity
public class Medidas2D {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String kind;
    private Double largo;
    private Double ancho;

    @ManyToOne
    @JoinColumn(name = "elemento_id")
    private Elemento elemento;

    public Medidas2D() {
    }

    public Medidas2D(Long id, String kind, Double largo, Double ancho, Elemento elemento) {
        this.id = id;
        this.kind = kind;
        this.largo = largo;
        this.ancho = ancho;
        this.elemento = elemento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }
}
