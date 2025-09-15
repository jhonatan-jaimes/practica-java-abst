package com.jejo.prueba_jpa.placa;

import com.jejo.prueba_jpa.classes.Areas;
import com.jejo.prueba_jpa.classes.Medidas3D;
import com.jejo.prueba_jpa.elemento.entity.Elemento;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;


@Entity
public class Placa extends Elemento {

    @OneToOne(mappedBy = "elemento", cascade = CascadeType.ALL)
    private Medidas3D medidas3DPlaca;

    @OneToOne(mappedBy = "elemento", cascade = CascadeType.ALL)
    private Medidas3D restaPlaca;

    @OneToOne(mappedBy = "elemento", cascade = CascadeType.ALL)
    private Areas areaPlaca;

    @OneToOne(mappedBy = "elemento", cascade = CascadeType.ALL)
    private Areas areaMateUno;

    @OneToOne(mappedBy = "elemento", cascade = CascadeType.ALL)
    private Areas areaMateDos;

    public Placa() {
    }

    public Placa(Long id, String name, Integer lot, Medidas3D medidas3DPlaca, Medidas3D restaPlaca, Areas areaPlaca, Areas areaMateUno, Areas areaMateDos) {
        super(id, name, lot);
        this.medidas3DPlaca = medidas3DPlaca;
        this.restaPlaca = restaPlaca;
        this.areaPlaca = areaPlaca;
        this.areaMateUno = areaMateUno;
        this.areaMateDos = areaMateDos;
    }

    public Medidas3D getMedidasPlaca() {
        return medidas3DPlaca;
    }

    public void setMedidasPlaca(Medidas3D medidas3DPlaca) {
        this.medidas3DPlaca = medidas3DPlaca;
    }

    public Medidas3D getRestaPlaca() {
        return restaPlaca;
    }

    public void setRestaPlaca(Medidas3D restaPlaca) {
        this.restaPlaca = restaPlaca;
    }

    public Areas getAreaPlaca() {
        return areaPlaca;
    }

    public void setAreaPlaca(Areas areaPlaca) {
        this.areaPlaca = areaPlaca;
    }

    public Areas getAreaMateUno() {
        return areaMateUno;
    }

    public void setAreaMateUno(Areas areaMateUno) {
        this.areaMateUno = areaMateUno;
    }

    public Areas getAreaMateDos() {
        return areaMateDos;
    }

    public void setAreaMateDos(Areas areaMateDos) {
        this.areaMateDos = areaMateDos;
    }
}
