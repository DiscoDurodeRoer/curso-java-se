package com.mycompany.period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class App {

    public static void main(String[] args) {

        // Crear un periodo
        Period periodo = Period.of(1, 2, 5);
        System.out.println("Periodo: " + periodo);

        // Modificar periodo
        periodo = periodo.withYears(2).withMonths(3).withDays(1);
        System.out.println("Periodo modificado: " + periodo);

        // Periodo entre 2 fechas
        LocalDate fechaInicio = LocalDate.of(2023, Month.MARCH, 1);
        LocalDate fechaFin = LocalDate.of(2025, Month.JANUARY, 20);
        periodo = Period.between(fechaInicio, fechaFin);

        System.out.println("La diferencia entre " + fechaInicio + " y " + fechaFin + " es " + periodo);

        // Especificar diferencia
        System.out.println("Diferencia en años: " + periodo.getYears());
        System.out.println("Diferencia en meses: " + periodo.getMonths());
        System.out.println("Diferencia en dias: " + periodo.getDays());

        // Total de meses
        System.out.println("Total de meses " + periodo.toTotalMonths());

        // Parsear un Period
        periodo = Period.parse("P2Y2M2D");
        System.out.println("Periodo parseado " + periodo);

    }
}
