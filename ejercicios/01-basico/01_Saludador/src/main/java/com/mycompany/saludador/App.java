package com.mycompany.saludador;

import java.util.Scanner;

/*
    Pide un nombre por teclado y haz que te salude.

    Por ejemplo, si introduces "Fernando", la respuesta debe ser ¡Hola Fernando!

 */
public class App {

    public static void main(String[] args) {

        // Creamos Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        // para evitar problemas con espacios
        sn.useDelimiter("\n");
        
        // Pedimos un nombre
        System.out.println("Introduce un nombre");
        String nombre = sn.next();
        
        // Mostramos el mensaje
        System.out.println("¡Hola " + nombre + "!");
        
    }
}
