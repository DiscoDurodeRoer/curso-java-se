package com.mycompany._tabla_multiplicar;

import java.util.Scanner;

/*
    Pide un numero por teclado y muestra su tabla de multiplicar hasta 10.
 */
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        
        // Pedimos un numero
        System.out.println("Introduce un numero");
        int numero = sn.nextInt();
        
        // Variable donde guardaremos el resultado
        int resultado;
        for (int i = 1; i <= 10; i++) {
            // Resultado de la multiplicacion
            resultado = numero * i;
            // Formateamos el mensaje
            System.out.println(numero + "x" + i + "=" + resultado);
        }
        
        
    }
}
