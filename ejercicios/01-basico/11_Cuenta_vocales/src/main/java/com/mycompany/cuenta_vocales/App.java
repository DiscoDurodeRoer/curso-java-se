package com.mycompany.cuenta_vocales;

import java.util.Scanner;

/*
    Pide una frase por teclado y cuenta cuentas vocales tiene.
 */
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        // 
        sn.useDelimiter("\n");

        // Pedimos una frase
        System.out.println("Introduce una frase");
        String frase = sn.next().toLowerCase();

        // Variable donde guardare el numero de vocales
        int contador = 0;
        
        // Recorro la frase caracter a caracter
        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            // Obtengo el caracter
            caracter = frase.charAt(i);

            // Compruebo si es una vocal
            switch (caracter) {
                case 'a', 'e', 'i', 'o', 'u' ->
                    contador++;
            }
        }

        // Muestro el numero de vocales que hay
        System.out.println("Hay " + contador + " vocales");
        
    }
}
