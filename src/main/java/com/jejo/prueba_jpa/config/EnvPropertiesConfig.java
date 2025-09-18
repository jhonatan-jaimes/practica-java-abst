package com.jejo.prueba_jpa.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EnvPropertiesConfig {

    public static void load() {
        Properties properties = new Properties();

        try (InputStream input = EnvPropertiesConfig.class
                .getClassLoader()
                .getResourceAsStream("env.properties")) {

            if (input != null) {
                properties.load(input);
                System.out.println("✅ Archivo env.properties cargado");
            } else {
                System.out.println("⚠️ No se encontró env.properties, usando solo variables de entorno");
            }

        } catch (IOException e) {
            System.out.println("⚠️ Error cargando env.properties: " + e.getMessage());
        }

        // MYSQL
        System.setProperty("MYSQL_URI", getEnv("MYSQL_URI", properties));
        System.setProperty("MYSQL_USER", getEnv("MYSQL_USER", properties));
        System.setProperty("MYSQL_PASS", getEnv("MYSQL_PASS", properties));

    }

    private static String getEnv(String key, Properties properties) {
        // 1. Intenta leer desde env.properties
        if (properties != null && properties.getProperty(key) != null) {
            return properties.getProperty(key);
        }
        // 2. Si no existe, toma la variable de entorno del sistema (producción)
        return System.getenv(key);
    }
}
