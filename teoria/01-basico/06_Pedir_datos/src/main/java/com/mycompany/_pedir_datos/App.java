package com.mycompany._pedir_datos;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Creamos Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        // Recomendado para cuando se piden valores decimales
        sn.useLocale(Locale.US);
        // Recomendado para cuando se piden cadenas con espacios
        sn.useDelimiter("\n");

        // Pedimos y mostramos un valor numero entero
        System.out.println("Introduce un valor");
        int numero = sn.nextInt();

        System.out.println("Has introducido el numero: " + numero);

        // Pedimos y mostramos un valor numero decimal
        System.out.println("Introduce un valor decimal");
        double decimal = sn.nextDouble();

        System.out.println("Has introducido el numero decimal: " + decimal);

        // Pedimos y mostramos una cadena
        System.out.println("Introduce una cadena");
        String cadena = sn.next();

        System.out.println("Has introducido la cadena: " + cadena);

    }
}
