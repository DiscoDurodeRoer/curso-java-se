package com.mycompany.zoneoffset;

import java.time.ZoneOffset;

public class App {

    public static void main(String[] args) {

        // Crear un ZoneOffset
        ZoneOffset desplazamiento = ZoneOffset.of("+02:00");
        System.out.println("Desplazamiento: " + desplazamiento);

        // Crear un ZoneOffset personalizado
        desplazamiento = ZoneOffset.ofHoursMinutes(-2, -30);
        System.out.println("Desplazamiento personalizado " + desplazamiento);

        // Desplazamiento en segundos
        int segundos = desplazamiento.getTotalSeconds();
        System.out.println("Desplazamiento en segundos " + segundos);

    }
}
