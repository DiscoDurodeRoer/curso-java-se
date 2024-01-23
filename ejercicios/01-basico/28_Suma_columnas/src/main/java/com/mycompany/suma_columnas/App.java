package com.mycompany.suma_columnas;

import java.util.Scanner;

/*
    Pide una columna por teclado y realiza la suma de los valores de esa columna
 */
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);

        // Creo una matriz con valores
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Pido una columna, siempre sera entre 0 y matriz[0].length - 1
        System.out.println("Introduce una columna");
        int columna = Math.clamp(sn.nextInt(), 0, matriz[0].length - 1);

        // Variable para almacenar la suma
        int suma = 0;
        // Realizo la suma
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }

        // Muestro el resultado
        System.out.println("La suma es " + suma);

    }
}
