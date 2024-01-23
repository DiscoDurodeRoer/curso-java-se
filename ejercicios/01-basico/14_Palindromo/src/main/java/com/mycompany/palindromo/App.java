package com.mycompany.palindromo;

import java.util.Scanner;

/*
    Pide una frase e indica si es palindromo.

    Un palindromo es una palabra o frase que se lee igual al reves sin espacios.

    Por ejemplo, "Amad a la dama"
 */
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        // Para evitar problemas de espacios
        sn.useDelimiter("\n");

        // Introduce una frase
        System.out.println("Introduce la frase");
        String frase = sn.next();

        // Variable con frases sin espacios
        String fraseSinEspacios = "";

        // Recorremos la frase
        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);

            // Si el caracter es diferente a un espacio
            // Lo agregamos a la variable fraseSinEspacios
            if (caracter != ' ') {
                fraseSinEspacios += caracter;
            }
        }

        // Variable donde guardaremos la frase al reves
        String fraseAlReves = "";

        // Recorremos la frase sin espacios al reves
        for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
            caracter = fraseSinEspacios.charAt(i);
            fraseAlReves += caracter;
        }

        // Si la frase sin espacios y la que hemos puesto del reves son iguales
        // Es palindromo
        if (fraseSinEspacios.equalsIgnoreCase(fraseAlReves)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

    }
}
