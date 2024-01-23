package com.mycompany.matrices;

public class App {

    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Otra forma de crear una matriz
        // int[][] matriz = new int[3][3];
        
        // Obtener el valor de una posicion
        System.out.println("Valor en una posicion: " + matriz[1][0]);

        // Recorrer la matroz con dos bucles
        System.out.println("Recorrer matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
