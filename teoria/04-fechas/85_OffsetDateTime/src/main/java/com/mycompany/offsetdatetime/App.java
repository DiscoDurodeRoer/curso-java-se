package com.mycompany.offsetdatetime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        // Crear un OffsetDateTime
        OffsetDateTime fecha = OffsetDateTime.now();
        System.out.println("Fecha " + fecha);

        // Crear un OffsetDateTime con un desplazamiento específico
        fecha = OffsetDateTime.of(2025, 1, 1, 0, 0, 0, 0, ZoneOffset.of("+02:00"));
        System.out.println("Fecha personalizada " + fecha);

        // Obtener offset
        System.out.println("Offset " + fecha.getOffset());

        // Usar ZoneOffset con OffsetDateTime
        ZoneOffset desplazamiento = ZoneOffset.of("+02:00");
        LocalDateTime fechaLocal = LocalDateTime.now();
        fecha = OffsetDateTime.of(fechaLocal, desplazamiento);
        System.out.println("Fecha con localdatetime y zonaoffset " + fecha);

        // Formato
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss Z");
        System.out.println("Formato fecha " + formato.format(fecha));

        // Convertir un OffsetDateTime a UTC
        fecha = fecha.withOffsetSameInstant(ZoneOffset.UTC);
        System.out.println("Fecha en UTC " + fecha);

        // Convertir un OffsetDateTime a UTC
        fecha = fecha.withOffsetSameInstant(ZoneOffset.of("+04:00"));
        System.out.println("Fecha con desplazamiento +04:00 " + fecha);

    }
}
