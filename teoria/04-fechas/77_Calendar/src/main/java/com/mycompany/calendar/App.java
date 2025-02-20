package com.mycompany.calendar;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;

public class App {

    public static void main(String[] args) {

        // Obtener instancia de calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println("Fecha de hoy " + calendar.getTime());
        
        // set field
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 5);

        System.out.println("Fecha seteada: " + calendar.getTime());

        calendar.set(2025, Calendar.MAY, 10);

        System.out.println("Fecha seteada en una linea: " + calendar.getTime());
        
        // get field
        System.out.println("Año: " + calendar.get(Calendar.YEAR));
        System.out.println("Mes: " + calendar.get(Calendar.MONTH));
        System.out.println("Dia: " + calendar.get(Calendar.DAY_OF_MONTH));
        
        // Sumar unidades de tiempo
        calendar.add(Calendar.MONTH, 2);
        System.out.println("Sumamos 2 meses " + calendar.getTime());
        
        // Restar unidades de tiempo
        calendar.add(Calendar.DAY_OF_MONTH, -20);
        System.out.println("restamos 20 dias " + calendar.getTime());

        // Convertir calendar a LocalDateTime
        LocalDate fecha = LocalDate.ofInstant(calendar.getTime().toInstant(), ZoneId.systemDefault());
        System.out.println("Calendar a localdate " + fecha);

        // Convertir calendar a LocalDateTime
        LocalDateTime fechaHora = LocalDateTime.ofInstant(calendar.getTime().toInstant(), ZoneId.systemDefault());
        System.out.println("Calendar a localdatetime " + fechaHora);
        
        // Formato
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Formato calendar " + formato.format(calendar.getTime()));

    }
}
