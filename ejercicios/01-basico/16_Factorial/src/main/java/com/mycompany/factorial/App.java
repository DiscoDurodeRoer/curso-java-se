package com.mycompany.factorial;

import java.util.Scanner;

/*
    Pide un numero por teclado y saca su factorial.

    El factorial se obtiene de multiplicar los numeros de n a 1.

    Por ejemplo, 5*4*3*2*1 = 120
 */
public class App {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = sn.nextInt();

        int factorial = factorial(numero);

        System.out.println("El factorial de " + numero + " es " + factorial);

    }

    public static int factorial(int n) {
        int factorial = n;
        for (int i = n - 1; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

}
