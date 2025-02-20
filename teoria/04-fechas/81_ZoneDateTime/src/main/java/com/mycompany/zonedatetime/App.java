package com.mycompany.zonedatetime;

import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        // Zona horaria predeterminada del sistema
        ZonedDateTime fecha = ZonedDateTime.now();
        System.out.println("Fecha de la zona actual " + fecha);

        // Fecha y hora en UTC
        fecha = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("Fecha en UTC: " + fecha);

        // Fecha y hora en Tokyo
        fecha = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Fecha en Tokyo: " + fecha);

        // Fecha y hora en una zona horaria
        fecha = ZonedDateTime.of(2025, Month.MARCH.getValue(), 1, 10, 30, 30, 0, ZoneId.of("America/New_York"));
        System.out.println("Fecha en Nueva York: " + fecha);

        // Convertir a otra zona horaria (de Nueva York a Londres)
        fecha = fecha.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("Fecha en londres desde Nueva York " + fecha);

        // Formato
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z Z");
        String formatoFecha = formato.format(fecha);
        System.out.println("Formato fecha: " + formatoFecha);

    }
}
