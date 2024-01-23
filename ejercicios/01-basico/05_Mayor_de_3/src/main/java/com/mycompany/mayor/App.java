package com.mycompany.mayor;

import java.util.Scanner;

/*
    Pide 3 numeros por teclado e indica cual es el mayor.
 */
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);

        // Pido los 3 numeros
        System.out.println("Introduce el numero 1");
        int numero1 = sn.nextInt();

        System.out.println("Introduce el numero 2");
        int numero2 = sn.nextInt();

        System.out.println("Introduce el numero 3");
        int numero3 = sn.nextInt();

        // Comrpuebo si el numero 1 es mayor que los otros 2 numeros
        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El numero mayor es " + numero1);
            // Compruebo si el numero 2 es mayor que el numero 3
        } else if (numero2 >= numero3) {
            System.out.println("El numero mayor es " + numero2);
            // Por descarte, el numero 3 es el mayor
        } else {
            System.out.println("El numero mayor es " + numero3);
        }

    }
}
