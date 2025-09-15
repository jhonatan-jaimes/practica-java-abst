package com.jejo.prueba_jpa.tipo;

import com.jejo.prueba_jpa.classes.Medidas2D;
import com.jejo.prueba_jpa.classes.Medidas3D;
import com.jejo.prueba_jpa.elemento.entity.Elemento;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Tipo extends Elemento {

    private String kind;

    @OneToOne(mappedBy = "elemento", cascade = CascadeType.ALL)
    private Medidas2D medidas2D;

    @OneToOne(mappedBy = "elemento", cascade = CascadeType.ALL)
    private Medidas3D medidas3D;

}
