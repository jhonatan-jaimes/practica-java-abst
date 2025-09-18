package com.jejo.prueba_jpa;

import com.jejo.prueba_jpa.config.EnvPropertiesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaJpaApplication {

	public static void main(String[] args) {
        EnvPropertiesConfig.load();
		SpringApplication.run(PruebaJpaApplication.class, args);
	}

}
