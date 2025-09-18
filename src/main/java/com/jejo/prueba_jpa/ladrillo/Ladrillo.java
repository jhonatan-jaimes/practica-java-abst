package com.jejo.prueba_jpa.ladrillo;

import com.jejo.prueba_jpa.classes.Areas;
import com.jejo.prueba_jpa.classes.Material;
import com.jejo.prueba_jpa.classes.Medidas3D;
import com.jejo.prueba_jpa.elemento.entity.Elemento;
import jakarta.persistence.*;

@Entity
public class Ladrillo extends Elemento {

    @OneToOne(mappedBy = "elemento", cascade = CascadeType.ALL)
    private Medidas3D medidas3D;

    @OneToOne(mappedBy = "elemento", cascade = CascadeType.ALL)
    private Areas areas;

    @OneToOne(mappedBy = "elemento", cascade = CascadeType.ALL)
    private Material material;

    public Ladrillo() {
    }

    public Ladrillo(Long id, String name, Integer lot, Medidas3D medidas3D, Areas areas) {
        super(id, name, lot);
        this.medidas3D = medidas3D;
        this.areas = areas;
    }

    public Medidas3D getMedidas() {
        return medidas3D;
    }

    public void setMedidas(Medidas3D medidas3D) {
        this.medidas3D = medidas3D;
    }

    public Areas getAreas() {
        return areas;
    }

    public void setAreas(Areas areas) {
        this.areas = areas;
    }
}
