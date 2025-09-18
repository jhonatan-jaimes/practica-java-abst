package com.jejo.prueba_jpa.placa;

import com.jejo.prueba_jpa.classes.Areas;
import com.jejo.prueba_jpa.classes.Material;
import com.jejo.prueba_jpa.classes.Medidas3D;
import com.jejo.prueba_jpa.elemento.entity.Elemento;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;


@Entity
public class Placa extends Elemento {

    @OneToMany(mappedBy = "elemento", cascade = CascadeType.ALL)
    private List<Medidas3D> medidasPlaca;


    @OneToMany(mappedBy = "elemento", cascade = CascadeType.ALL)
    private List<Areas> areasPlaca;

    @OneToOne(mappedBy = "elemento", cascade = CascadeType.ALL)
    private Material material;

    public Placa() {
    }

    public Placa(Long id, String name, Integer lot, List<Medidas3D> medidasPlaca, List<Areas> areasPlaca, Material material) {
        super(id, name, lot);
        this.medidasPlaca = medidasPlaca;
        this.areasPlaca = areasPlaca;
        this.material = material;
    }

    public List<Medidas3D> getMedidasPlaca() {
        return medidasPlaca;
    }

    public void setMedidasPlaca(List<Medidas3D> medidasPlaca) {
        this.medidasPlaca = medidasPlaca;
    }

    public List<Areas> getAreasPlaca() {
        return areasPlaca;
    }

    public void setAreasPlaca(List<Areas> areasPlaca) {
        this.areasPlaca = areasPlaca;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
