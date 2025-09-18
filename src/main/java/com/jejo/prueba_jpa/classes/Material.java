package com.jejo.prueba_jpa.classes;

import com.jejo.prueba_jpa.elemento.entity.Elemento;
import com.jejo.prueba_jpa.placa.Placa;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String nameMaterial;

    @OneToMany(mappedBy = "material", cascade = CascadeType.ALL)
    private List<Mortero> mortero;

    @OneToMany(mappedBy = "material", cascade = CascadeType.ALL)
    private List<Concreto> concreto;

    @OneToOne
    @JoinColumn(name = "elemento_id")
    private Elemento elemento;

    public Material() {
    }

    public Material(Long id, String nameMaterial, List<Mortero> mortero, List<Concreto> concreto) {
        this.id = id;
        this.nameMaterial = nameMaterial;
        this.mortero = mortero;
        this.concreto = concreto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameMaterial() {
        return nameMaterial;
    }

    public void setNameMaterial(String nameMaterial) {
        this.nameMaterial = nameMaterial;
    }

    public List<Mortero> getMortero() {
        return mortero;
    }

    public void setMortero(List<Mortero> mortero) {
        this.mortero = mortero;
    }

    public List<Concreto> getConcreto() {
        return concreto;
    }

    public void setConcreto(List<Concreto> concreto) {
        this.concreto = concreto;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }
}
