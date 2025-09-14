package com.jejo.prueba_jpa.classes;

import jakarta.persistence.*;

@Entity
@Table(name = "areas")
public class Areas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String kind;
    private Double areaOne;
    private Double areaAll;

    public Areas() {
    }

    public Areas(Long id, String kind, Double areaOne, Double areaAll) {
        this.id = id;
        this.kind = kind;
        this.areaOne = areaOne;
        this.areaAll = areaAll;
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
}
