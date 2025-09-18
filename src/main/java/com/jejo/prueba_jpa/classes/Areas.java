package com.jejo.prueba_jpa.classes;

import com.jejo.prueba_jpa.elemento.entity.Elemento;
import jakarta.persistence.*;

@Entity
public class Areas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String kind;
    private Double areaOne;
    private Double areaAll;

    @ManyToOne
    @JoinColumn(name = "elemento_id")
    private Elemento elemento;

    public Areas() {
    }

    public Areas(Long id, String kind, Double areaOne, Double areaAll, Elemento elemento) {
        this.id = id;
        this.kind = kind;
        this.areaOne = areaOne;
        this.areaAll = areaAll;
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

    public Double getAreaOne() {
        return areaOne;
    }

    public void setAreaOne(Double areaOne) {
        this.areaOne = areaOne;
    }

    public Double getAreaAll() {
        return areaAll;
    }

    public void setAreaAll(Double areaAll) {
        this.areaAll = areaAll;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }
}
