package com.mycompany.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class App {

    public static void main(String[] args) {

        // Fecha de hoy
        LocalDate fecha = LocalDate.now();
        System.out.println("Fecha de hoy: " + fecha);

        // Fecha personalizada
        fecha = LocalDate.of(2025, Month.FEBRUARY, 5);
        System.out.println("Fecha personalizada: " + fecha);

        // Cambiar valor
        fecha = fecha.withYear(1990).with(ChronoField.MONTH_OF_YEAR, Month.MARCH.getValue());
        System.out.println("Fecha modificada: " + fecha);

        // Obtener año, mes y dia
        // 1º forma
        System.out.println("Año: " + fecha.getYear());
        System.out.println("Mes: " + fecha.getMonth().getValue());
        System.out.println("Dia: " + fecha.getDayOfMonth());

        // 2º forma
        System.out.println("Año: " + fecha.get(ChronoField.YEAR));
        System.out.println("Mes: " + fecha.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("Dia: " + fecha.get(ChronoField.DAY_OF_MONTH));

        // Formato de fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatoFecha = formato.format(fecha);
        System.out.println("Fecha formateada: " + formatoFecha);

        // isAfter y isBefore 
        System.out.println("¿Es " + formatoFecha + " posterior a hoy? " + fecha.isAfter(LocalDate.now()));
        System.out.println("¿Es " + formatoFecha + " anterior a hoy? " + fecha.isBefore(LocalDate.now()));
        System.out.println("¿Es " + formatoFecha + " igual a hoy? " + fecha.isEqual(LocalDate.now()));

        // Año bisiesto
        System.out.println("¿Es " + fecha.getYear() + " bisiesto? " + fecha.isLeapYear());
        fecha = fecha.withYear(2004);
        System.out.println("¿Es " + fecha.getYear() + " bisiesto? " + fecha.isLeapYear());

        // Sumar dias (u otras unidades)
        fecha = fecha.plus(60, ChronoUnit.DAYS);
        System.out.println("Sumo 60 dias " + fecha);

        // Restar dias (u otras unidades)
        fecha = fecha.minus(2, ChronoUnit.MONTHS);
        System.out.println("Resto 2 meses " + fecha);

        // Lista de fechas
        LocalDate fechaFin = fecha.withDayOfMonth(10);
        System.out.println("Fechas del " + fecha + " al " + fechaFin);
        Object[] fechas = fecha.datesUntil(fechaFin).toArray();

        for (Object f : fechas) {
            System.out.println(f);
        }

        // Lista de fechas con periodo
        System.out.println("Fechas del " + fecha + " al " + fechaFin + " de 3 en 3");
        fechas = fecha.datesUntil(fechaFin, Period.ofDays(3)).toArray();

        for (Object f : fechas) {
            System.out.println(f);
        }
    }
}
