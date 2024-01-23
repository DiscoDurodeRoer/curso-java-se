package com.mycompany.string;

public class App {

    public static void main(String[] args) {

        // Declarar strings
        String cadena1 = "Hola";
        String cadena2 = "hola";

        // Funciones String
        System.out.println("Longitud de una cadena: " + cadena1.length());
        System.out.println("Obtener el caracter 0: " + cadena1.charAt(0));
        System.out.println("Minusculas: " + cadena1.toLowerCase());
        System.out.println("Mayusculas: " + cadena1.toUpperCase());
        System.out.println("Concatenar: " + cadena1.concat(cadena2));
        System.out.println("Substring: " + cadena1.substring(1, 3));
        System.out.println("IndexOf: " + cadena1.indexOf('a'));
        System.out.println("Comprobando si son iguales");

        if (cadena1.equals(cadena2)) {
            System.out.println("Son iguales (equals)");
        } else {
            System.out.println("No son iguales (equals)");
        }

        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Son iguales (equalsIgnoreCase)");
        } else {
            System.out.println("No son iguales (equalsIgnoreCase)");
        }

        System.out.println("Recorriendo una cadena: ");
        // recorrer una cadena
        char caracter;
        for (int i = 0; i < cadena1.length(); i++) {
            caracter = cadena1.charAt(i);
            System.out.println(caracter);
        }

    }
}
