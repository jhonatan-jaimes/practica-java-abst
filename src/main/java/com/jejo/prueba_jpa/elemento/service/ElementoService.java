package com.jejo.prueba_jpa.elemento.service;

import com.jejo.prueba_jpa.classes.Message;
import com.jejo.prueba_jpa.elemento.dto.EntityDto;
import com.jejo.prueba_jpa.elemento.entity.Elemento;

public interface ElementoService {
    Message saveElemento(EntityDto entityDto);
    Message deleElemento(Integer id);
}
