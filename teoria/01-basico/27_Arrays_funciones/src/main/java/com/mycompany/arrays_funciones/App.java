package com.mycompany.arrays_funciones;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        // Creo un array
        int[] array = {1, 2, 3, 4, 5};

        int multiplicador = 10;

        // Llamo a la funcion
        multiplicarValores(array, multiplicador);

        // muestro el array
        System.out.println("Array: " + Arrays.toString(array));

    }

    /*
        Los arrays se pasan por referencia, esto quiere decir que si se modifica
        dentro de la función, se vera reflejado fuera de la función
     */
    public static void multiplicarValores(int[] array, int multiplicador) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= multiplicador;
        }
    }
}
