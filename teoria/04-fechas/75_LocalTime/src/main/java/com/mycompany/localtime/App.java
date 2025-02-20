package com.mycompany.localtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class App {

    public static void main(String[] args) {

        // Hora actual
        LocalTime tiempo = LocalTime.now();
        System.out.println("Hora actual: " + tiempo);

        // Hora personalizada
        tiempo = LocalTime.of(20, 30, 20);
        System.out.println("Hora personalizada: " + tiempo);

        // Modificar hora, minutos y segundos
        tiempo = tiempo.withHour(15).with(ChronoField.MINUTE_OF_HOUR, 20);
        System.out.println("Hora modificada " + tiempo);

        // Obtener hora, minutos y segundos
        System.out.println("Hora: " + tiempo.getHour());
        System.out.println("Minuto: " + tiempo.getMinute());
        System.out.println("Segundo: " + tiempo.getSecond());
        System.out.println("Nanosegundo: " + tiempo.getNano());

        // Formato
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH mm ss");
        String horaFormato = formato.format(tiempo);
        System.out.println("Hora formato: " + horaFormato);

        // Sumar horas
        tiempo = tiempo.plusHours(15);
        System.out.println("Sumamos 15 horas " + tiempo);

        // Restar horas
        tiempo = tiempo.minusMinutes(120);
        System.out.println("Restar 120 minutos " + tiempo);

        // Tiempo a segundos
        System.out.println("Nuestro tiempo a segundos " + tiempo.toSecondOfDay());

        // isAfter y isBefore 
        System.out.println("¿Es " + horaFormato + " posterior a ahora? " + tiempo.isAfter(LocalTime.now()));
        System.out.println("¿Es " + horaFormato + " anterior a ahora? " + tiempo.isBefore(LocalTime.now()));
        System.out.println("¿Es " + horaFormato + " igual a ahora? " + tiempo.equals(LocalTime.now()));

    }
}
