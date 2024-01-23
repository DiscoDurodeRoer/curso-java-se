package com.mycompany._mostrar_datos;

public class App {

    public static void main(String[] args) {

        System.out.println("Mostrar y salto de linea");

        System.out.print("Mostrar ");
        System.out.print("sin salto de linea");

        System.out.println("");

        double valorDecimal = 10.55555;
        int valorEntero = 100;
        String cadena = "Hola mundo";

        System.out.printf("Formatear valores %.2f %d %s",
                valorDecimal,
                valorEntero,
                cadena);
 System.out.print("Mostrar ");
    }
}
