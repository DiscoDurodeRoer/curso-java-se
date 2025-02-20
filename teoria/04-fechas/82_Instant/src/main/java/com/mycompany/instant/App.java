package com.mycompany.instant;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class App {

    public static void main(String[] args) {
        
        // Instant actual
        Instant instante = Instant.now();
        System.out.println("Instante " + instante);

        // Crear un Instant personalizado
        instante = Instant.parse("2025-01-01T00:00:00Z");
        System.out.println("Instante parseado " + instante);

        // Instant a LocalDateTime
        instante = Instant.ofEpochMilli(900000000000L);
        System.out.println("Instante desde Epoch " + instante);

        // Instant a LocalDateTime
        LocalDateTime fecha = LocalDateTime.ofInstant(instante, ZoneId.systemDefault());
        System.out.println("Fecha desde instant " + fecha);
        
        // Suma de segundos
        instante = instante.plusSeconds(3600);
        System.out.println("Sumamos 3600 segundos " + instante);
        
        // Resta de segundos
        instante = instante.minusSeconds(86400);
        System.out.println("Restamos 86400 segundos " + instante);

    }
}
