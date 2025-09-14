package com.jejo.prueba_jpa.elemento.repository;

import com.jejo.prueba_jpa.elemento.entity.Elemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementoRespository extends JpaRepository <Elemento, Long> {
}
