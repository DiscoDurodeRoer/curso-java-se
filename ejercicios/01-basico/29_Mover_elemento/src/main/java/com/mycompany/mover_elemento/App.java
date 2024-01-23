package com.mycompany.mover_elemento;

import java.util.Scanner;

/*
    Crea una matriz de caracteres, donde este todo vacio excepto una donde este
    el caracter X.

    El objetivo es mover ese X por el tablero sin que se salga del tablero.

    Las direcciones son arriba, abajo, izquierda y derecha.
 */
public class App {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        char[][] tablero = {
            {'.', '.', '.', '.'},
            {'.', '.', '.', '.'},
            {'.', '.', '.', '.'},
            {'.', '.', '.', '.'},
            {'.', '.', 'X', '.'},
            {'.', '.', '.', '.'},
            {'.', '.', '.', '.'},
            {'.', '.', '.', '.'},
            {'.', '.', '.', '.'},
            {'.', '.', '.', '.'}
        };

        int fila = 4;
        int columna = 2;

        boolean salir = false;
        int opcion;
        while (!salir) {

            mostrarMatriz(tablero);
            
            System.out.println("1. Arriba");
            System.out.println("2. Derecha");
            System.out.println("3. Abajo");
            System.out.println("4. Izquierda");
            System.out.println("5. salir");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1 -> {
                    if (fila != 0) {
                        tablero[fila][columna] = '.';
                        fila--;
                        tablero[fila][columna] = 'X';
                    } else {
                        System.out.println("No se puede mover");
                    }
                }
                case 2 -> {
                    if (columna != tablero[0].length - 1) {
                        tablero[fila][columna] = '.';
                        columna++;
                        tablero[fila][columna] = 'X';
                    } else {
                        System.out.println("No se puede mover");
                    }
                }
                case 3 -> {
                    if (fila != tablero.length - 1) {
                        tablero[fila][columna] = '.';
                        fila++;
                        tablero[fila][columna] = 'X';
                    } else {
                        System.out.println("No se puede mover");
                    }
                }
                case 4 -> {
                    if (columna != 0) {
                        tablero[fila][columna] = '.';
                        columna--;
                        tablero[fila][columna] = 'X';
                    } else {
                        System.out.println("No se puede mover");
                    }
                }
                case 5 -> {
                    salir = true;
                }
                default -> {
                    System.out.println("Elige una opcion valida");
                }
            }

        }

    }
    
    public static void mostrarMatriz(char[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
