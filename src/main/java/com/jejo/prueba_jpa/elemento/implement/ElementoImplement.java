package com.jejo.prueba_jpa.elemento.implement;

import com.jejo.prueba_jpa.classes.Areas;
import com.jejo.prueba_jpa.classes.Medidas3D;
import com.jejo.prueba_jpa.classes.Message;
import com.jejo.prueba_jpa.elemento.dto.EntityDto;
import com.jejo.prueba_jpa.elemento.entity.Elemento;
import com.jejo.prueba_jpa.elemento.repository.ElementoRespository;
import com.jejo.prueba_jpa.elemento.service.ElementoService;
import com.jejo.prueba_jpa.ladrillo.Ladrillo;
import com.jejo.prueba_jpa.ladrillo.LadrilloDto;
import com.jejo.prueba_jpa.placa.PlacaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElementoImplement implements ElementoService {

    private final ElementoRespository elementoRespository;

    @Autowired
    public ElementoImplement(ElementoRespository elementoRespository) {
        this.elementoRespository = elementoRespository;
    }

    private Elemento dtoToEntity(EntityDto entityDto){
        if(entityDto instanceof LadrilloDto){
            Ladrillo ladrillo = new Ladrillo(
                    null,
                    ((LadrilloDto) entityDto).name(),
                    ((LadrilloDto) entityDto).lot(),
                    new Medidas3D(
                            null,
                            ((LadrilloDto) entityDto).kind(),
                            ((LadrilloDto) entityDto).largo(),
                            ((LadrilloDto) entityDto).ancho(),
                            ((LadrilloDto) entityDto).alto(),
                            null
                    ),
                    new Areas(
                            null,
                            ((LadrilloDto) entityDto).kind(),
                            ((LadrilloDto) entityDto).areaOne(),
                            ((LadrilloDto) entityDto).areaAll(),
                            null
                    )
            );
            ladrillo.getMedidas().setElemento(ladrillo);
            ladrillo.getAreas().setElemento(ladrillo);
            return ladrillo;

        } else if (entityDto instanceof PlacaDto) {
            return null;
            /*return new Placa(
                    null,
                    ((Placa) entityDto).getName(),
                    ((Placa) entityDto).getLot(),
                    new Medidas(
                            null,
                            "3d",
                            ((Placa) entityDto).getMedidasPlaca().getLargo(),
                    )
            );*/
        }
        else {
            throw new RuntimeException("Instancia no encontrada");
        }
    }

    @Override
    public Message saveElemento(EntityDto entityDto) {
        elementoRespository.save(dtoToEntity(entityDto));
        return new Message("Guardado");
    }

    @Override
    public Message deleElemento(Integer id) {
        return null;
    }
}
