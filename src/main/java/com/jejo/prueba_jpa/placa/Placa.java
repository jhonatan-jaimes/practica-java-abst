package com.jejo.prueba_jpa.placa;

import com.jejo.prueba_jpa.classes.Areas;
import com.jejo.prueba_jpa.classes.Medidas;
import com.jejo.prueba_jpa.elemento.entity.Elemento;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;



@Entity
public class Placa extends Elemento {

    @Basic
    private Medidas medidasPlaca;
    private Medidas restaPlaca;
    private Areas areaPlaca;
    private Areas areaMateUno;
    private Areas areaMateDos;

    public Placa() {
    }

    public Placa(Long id, String name, Integer lot, Medidas medidasPlaca, Medidas restaPlaca, Areas areaPlaca, Areas areaMateUno, Areas areaMateDos) {
        super(id, name, lot);
        this.medidasPlaca = medidasPlaca;
        this.restaPlaca = restaPlaca;
        this.areaPlaca = areaPlaca;
        this.areaMateUno = areaMateUno;
        this.areaMateDos = areaMateDos;
    }

    public Medidas getMedidasPlaca() {
        return medidasPlaca;
    }

    public void setMedidasPlaca(Medidas medidasPlaca) {
        this.medidasPlaca = medidasPlaca;
    }

    public Medidas getRestaPlaca() {
        return restaPlaca;
    }

    public void setRestaPlaca(Medidas restaPlaca) {
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
