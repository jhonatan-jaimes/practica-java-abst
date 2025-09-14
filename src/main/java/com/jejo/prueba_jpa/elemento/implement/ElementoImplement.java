package com.jejo.prueba_jpa.elemento.implement;

import com.jejo.prueba_jpa.classes.Areas;
import com.jejo.prueba_jpa.classes.Medidas;
import com.jejo.prueba_jpa.classes.Message;
import com.jejo.prueba_jpa.elemento.dto.EntityDto;
import com.jejo.prueba_jpa.elemento.entity.Elemento;
import com.jejo.prueba_jpa.elemento.repository.ElementoRespository;
import com.jejo.prueba_jpa.elemento.service.ElementoService;
import com.jejo.prueba_jpa.ladrillo.Ladrillo;
import com.jejo.prueba_jpa.ladrillo.LadrilloDto;
import com.jejo.prueba_jpa.placa.Placa;
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

            return new Ladrillo(
                    null,
                    ((LadrilloDto) entityDto).name(),
                    ((LadrilloDto) entityDto).lot(),
                    new Medidas(
                            null,
                          "3d",
                          ((LadrilloDto) entityDto).largo(),
                          ((LadrilloDto) entityDto).ancho(),
                          ((LadrilloDto) entityDto).alto()
                    ),
                    new Areas(
                            null,
                            "3d",
                            ((LadrilloDto) entityDto).areaOne(),
                            ((LadrilloDto) entityDto).areaAll()
                    )
            );
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
