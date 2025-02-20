package com.mycompany.duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class App {

    public static void main(String[] args) {

        // Creacion una duracion de un dia
        Duration duracion = Duration.of(1, ChronoUnit.DAYS);
        System.out.println("Duracion " + duracion);

        // Duracion entre 2 horas
        LocalTime horaInicio = LocalTime.of(5, 10, 30);
        LocalTime horaFin = LocalTime.of(12, 5, 20);
        duracion = Duration.between(horaInicio, horaFin);
        System.out.println("Duracion entre 2 horas " + duracion);

        // Duracion entre 2 fechas
        LocalDateTime fechaInicio = LocalDateTime.of(2025, Month.MARCH, 1, 10, 30);
        LocalDateTime fechaFin = LocalDateTime.of(2025, Month.MARCH, 5, 20, 20);
        duracion = Duration.between(fechaInicio, fechaFin);
        System.out.println("Duracion entre 2 fechas " + duracion);

        // Especificar parte de la diferencia 
        System.out.println("Parte de diferencia horas " + duracion.toHoursPart());
        System.out.println("Parte de diferencia minutos " + duracion.toMinutesPart());
        System.out.println("Parte de diferencia segundos " + duracion.toSecondsPart());

        // Especificar total de diferencia 
        System.out.println("Diferencia horas " + duracion.toHours());
        System.out.println("Diferencia minutos " + duracion.toMinutes());
        System.out.println("Diferencia segundos " + duracion.toSeconds());

        // Parsear un Duration
        duracion = Duration.parse("PT20H20M10S");
        System.out.println("Duracion parseada " + duracion);

    }
}
