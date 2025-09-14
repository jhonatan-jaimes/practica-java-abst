package com.jejo.prueba_jpa.elemento.controller;

import com.jejo.prueba_jpa.classes.Message;
import com.jejo.prueba_jpa.elemento.dto.EntityDto;
import com.jejo.prueba_jpa.elemento.service.ElementoService;
import com.jejo.prueba_jpa.placa.Placa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ElementoController {

    private final ElementoService elementoService;

    @Autowired
    public ElementoController(ElementoService elementoService){
        this.elementoService = elementoService;
    }

    @PostMapping("/save")
    public ResponseEntity<Message> saveElement(@RequestBody EntityDto entityDto){
        return ResponseEntity.ok(elementoService.saveElemento(entityDto));
    }

}
