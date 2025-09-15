package com.jejo.prueba_jpa.elemento.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.jejo.prueba_jpa.ladrillo.LadrilloDto;
import com.jejo.prueba_jpa.placa.PlacaDto;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = LadrilloDto.class, name = "ladrillo"),
        @JsonSubTypes.Type(value = LadrilloDto.class, name = "pasto"),
        @JsonSubTypes.Type(value = PlacaDto.class, name = "placa")
})
public interface EntityDto {
}
