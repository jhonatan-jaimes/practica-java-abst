package com.jejo.prueba_jpa.ladrillo;

import com.jejo.prueba_jpa.elemento.dto.EntityDto;

public record LadrilloDto(
        String name,
        int lot,
        String kind,
        double largo,
        double ancho,
        double alto,
        double areaAll,
        double areaOne
) implements EntityDto {
}
