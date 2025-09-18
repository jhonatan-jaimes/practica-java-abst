package com.jejo.prueba_jpa.classes;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "mortero")
public class Mortero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String nameArea;
    private Double cemento;
    private Double arena;
    private Double Agua;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;

    public Mortero() {
    }

    public Mortero(Long id, String nameArea, Double cemento, Double arena, Double agua) {
        this.id = id;
        this.nameArea = nameArea;
        this.cemento = cemento;
        this.arena = arena;
        Agua = agua;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameArea() {
        return nameArea;
    }

    public void setNameArea(String nameArea) {
        this.nameArea = nameArea;
    }

    public Double getCemento() {
        return cemento;
    }

    public void setCemento(Double cemento) {
        this.cemento = cemento;
    }

    public Double getArena() {
        return arena;
    }

    public void setArena(Double arena) {
        this.arena = arena;
    }

    public Double getAgua() {
        return Agua;
    }

    public void setAgua(Double agua) {
        Agua = agua;
    }
}
