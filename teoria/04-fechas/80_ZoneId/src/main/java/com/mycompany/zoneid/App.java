package com.mycompany.zoneid;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        // Obtener la zona del sistema
        ZoneId zona = ZoneId.systemDefault();
        System.out.println("Zona " + zona);

        // Obtener la zona de Londres
        zona = ZoneId.of("Europe/London");
        System.out.println("Zona de londres " + zona);

        // Zonas disponibles
        Set<String> zonas = ZoneId.getAvailableZoneIds();

        for (String z : zonas) {
            System.out.println(z);
        }

        // Fecha de Londres
        LocalDateTime fechaLondres = LocalDateTime.now(zona);
        System.out.println("Fecha de londres " + fechaLondres);

    }
}
