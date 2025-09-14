package com.jejo.prueba_jpa.ladrillo;

public record DtoToLadrillo(
        String name,
        int lot,
        double largo,
        double ancho,
        double alto,
        double areaAll,
        double areaOne
) {
}
