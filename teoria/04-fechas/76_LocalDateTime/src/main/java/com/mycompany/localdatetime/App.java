package com.mycompany.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        // Fecha de hoy con hora
        LocalDateTime fecha = LocalDateTime.now();
        System.out.println("Fecha de hoy " + fecha);

        // LocalDateTime to LocalDate
        LocalDate fechaSinHora = fecha.toLocalDate();
        System.out.println("La fecha sin hora " + fechaSinHora);

        // LocalDateTime to LocalTime
        LocalTime hora = fecha.toLocalTime();
        System.out.println("La fecha solo con la hora " + hora);

        // Formato
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatoFecha = formato.format(fecha);
        System.out.println("Fecha formateada " + formatoFecha);

    }
}
