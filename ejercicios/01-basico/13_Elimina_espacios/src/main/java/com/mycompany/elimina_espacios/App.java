package com.mycompany.elimina_espacios;

import java.util.Scanner;

/*
    Pide una frase por teclado, elimina los espacios y guardarlos en otra variable
 */
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        // Para evitar problemas de espacios
        sn.useDelimiter("\n");
        
        // Pido una frase
        System.out.println("Introduce una frase");
        String frase = sn.next();
        
        // Variable para la frase sin espacios
        String fraseSinEspacios = "";
        
        // Recorremos la cadena
        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            
            // Si el caracter es diferente de un espacio
            // Lo agregamos a la variable fraseSinEspacios
            if(caracter != ' '){
                fraseSinEspacios += caracter;
            }
        }
        
        // Mostramos la frase
        System.out.println("La frase sin espacios es " + fraseSinEspacios);
        
        
        
        
    }
}
