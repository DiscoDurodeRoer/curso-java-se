package com.mycompany.clock;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {

    public static void main(String[] args) {

        // Zona horaria predeterminada del sistema
        Clock reloj = Clock.systemDefaultZone();
        System.out.println("Reloj " + reloj.instant());
        System.out.println("Zona horaria del reloj " + reloj.getZone());

        // ZonedDateTime
        ZonedDateTime fecha = ZonedDateTime.now(reloj);
        System.out.println("ZonedDateTime con reloj " + fecha);

        // Obtenemos la hora UTC
        reloj = Clock.systemUTC();
        System.out.println("Hora UTC " + reloj.instant());

        // Hora de Tokyo
        reloj = Clock.system(ZoneId.of("Asia/Tokyo"));
        fecha = ZonedDateTime.now(reloj);
        System.out.println("Fecha en Tokyo " + fecha);

        // Reloj desfasado
        reloj = Clock.offset(reloj, Duration.ofHours(5));
        fecha = ZonedDateTime.now(reloj);
        System.out.println("Fecha en Tokyo retrasado 5 horas " + fecha);

        // Reloj fijo
        Instant instante = Instant.parse("2025-01-01T12:00:00Z");
        reloj = Clock.fixed(instante, ZoneId.of("Asia/Tokyo"));
        System.out.println("Reloj fijo: " + reloj.instant());

        // Tick
        reloj = Clock.tick(reloj, Duration.ofSeconds(30));
        System.out.println("Reloj redondeado " + reloj.instant());

    }
}
