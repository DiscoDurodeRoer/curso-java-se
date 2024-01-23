package com.mycompany.existe_elemento;

import java.util.Scanner;

/*
    Indicar si un elemento existe en un array usando una función.
 */
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);

        // Creo el array
        int[] array = {1, 2, 3, 4, 5};

        // Introduzco el valor a buscar
        System.out.println("Introduce un valor");
        int elemento = sn.nextInt();

        // Si el elemento existe dentro del array, lo indicamos
        if (existeElemento(array, elemento)) {
            System.out.println("El numero " + elemento + " existe");
        } else {
            System.out.println("El numero " + elemento + " no existe");
        }

    }

    public static boolean existeElemento(int[] array, int elemento) {
        // Recorro el array
        for (int i = 0; i < array.length; i++) {
            // Si el valor actual es igual al elemento
            if (array[i] == elemento) {
                // Encontrado, salimos del bucle y de la funcion
                return true;
            }
        }
        // No encontrado
        return false;
    }

}
