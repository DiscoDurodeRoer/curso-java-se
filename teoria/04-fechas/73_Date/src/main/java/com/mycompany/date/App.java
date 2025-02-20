package com.mycompany.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

    public static void main(String[] args) {

        // Fecha de hoy
        Date fecha = new Date();

        System.out.println("Fecha de hoy: " + fecha);

        // Fecha personalizada
        int anio = 2025 - 1900;
        int mes = 2 - 1;
        int dia = 5;

        fecha = new Date(anio, mes, dia);

        System.out.println("Fecha personalizada: " + fecha);

        // Modificar año
        fecha.setYear(1990 - 1900);
        System.out.println("Fecha 05/02/1990: " + fecha);

        // Obtener año, mes y dia
        System.out.println("Año: " + (fecha.getYear() + 1900));
        System.out.println("Mes: " + (fecha.getMonth() + 1));
        System.out.println("Dia: " + fecha.getDate());

        // Formato
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String formatoFecha = formato.format(fecha);
        System.out.println("Fecha formateada: " + formatoFecha);

        // Obtener la fecha en milisegundos desde January 1, 1970, 00:00:00 GMT
        long tiempo = fecha.getTime();
        System.out.println("Fecha en ms: " + tiempo);

        // after, before y equals 
        System.out.println("¿Es " + formatoFecha + " posterior a hoy? " + fecha.after(new Date()));
        System.out.println("¿Es " + formatoFecha + " anterior a hoy? " + fecha.before(new Date()));
        System.out.println("¿Es " + formatoFecha + " igual a hoy? " + fecha.equals(new Date()));

    }
}
