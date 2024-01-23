package com.mycompany.capicua;

import java.util.Arrays;

/*
    Crea un array e indica si es capicua.

    Es decir, que el array es igual tanto de izquierda a derecha como de derecha a izquierda.
 */
public class App {

    public static void main(String[] args) {

        // Creamos un array
        int[] array = {5, 4, 3, 4, 5};

        // Creamos el array donde invertiremos los valores
        int[] arrayInvertido = new int[array.length];

        // guardamos los valores invertidos
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            arrayInvertido[i] = array[j];
        }

        // Comprobamos si los arrays son iguales
        // Si son iguales, es capicua
        if (Arrays.equals(array, arrayInvertido)) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }

    }
}
