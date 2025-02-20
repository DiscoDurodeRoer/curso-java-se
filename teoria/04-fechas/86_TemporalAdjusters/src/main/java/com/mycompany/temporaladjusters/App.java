package com.mycompany.temporaladjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class App {

    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();

        // Primer día del mes actual
        LocalDate fecha = hoy.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Primer dia del mes " + fecha);

        // Último día del mes actual
        fecha = hoy.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Ultimo dia del mes " + fecha);

        // Primer lunes del mes actual
        fecha = hoy.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("Proximo lunes " + fecha);

        // Próximo viernes desde la fecha actual
        fecha = hoy.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("Proximo viernes " + fecha);

        // Último viernes del mes actual
        fecha = hoy.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        System.out.println("Ultimo viernes del mes " + fecha);

    }
}
