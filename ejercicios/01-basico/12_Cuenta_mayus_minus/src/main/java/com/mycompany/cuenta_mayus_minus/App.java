package com.mycompany.cuenta_mayus_minus;

import java.util.Scanner;

/*
    Pide una frase por teclado y cuenta cuantas mayusculas y minusculas hay.
 */
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        // Para evitar problemas de espacios
        sn.useDelimiter("\n");

        // pido una frase
        System.out.println("Introduce una frase");
        String frase = sn.next();

        // Variables donde guardo las mayusculas
        int contadorMayus = 0;
        
        // Variables donde guardo las minusculas
        int contadorMinus = 0;

        // Recorremos la frase
        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);

            // Si el caracter esta entre A (65) y Z (90)
            // Aumentamos el contador de las mayusculas
            if (caracter >= 'A' && caracter <= 'Z') {
                contadorMayus++;
            }
            
            // Si el caracter esta entre A (97) y Z (122)
            // Aumentamos el contador de las minusculas
            if (caracter >= 'a' && caracter <= 'z') {
                contadorMinus++;
            }

        }
        
        // Muestro los contadores
        System.out.println("Hay " + contadorMayus + " mayusculas");
        System.out.println("Hay " + contadorMinus + " minusculas");

    }
}
