package com.jejo.prueba_jpa.elemento.dto;

import com.jejo.prueba_jpa.classes.Medidas;

public record elementoDto(
        String name,
        Integer lot,
        String kindMedidas,
        Double largo,
        Double ancho,
        Double alto


) {
}

