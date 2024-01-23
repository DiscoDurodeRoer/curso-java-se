package com.mycompany.rellenar_array;

import java.util.Arrays;
import java.util.Random;

/*
    Crea una funcion que guarde en un array numeros aleatorios 
    entre un minimo y un maximo
 */
public class App {

    public static void main(String[] args) {

        // Creo un array
        int[] array = new int[10];

        // Relleno el array con numeros aleatorios entre 1 y 100
        rellenarArrayAleatorios(array, 1, 100);

        // Muestro el array
        System.out.println("Array " + Arrays.toString(array));

    }

    public static int generaAleatorio(int min, int max) {
        // Creo un random
        Random random = new Random();
        // Genero y devuelvo un numero aleatorio entre los numeros pedidos
        return random.nextInt(min, max + 1);
    }

    public static void rellenarArrayAleatorios(int[] array, int min, int max) {
        // Recorro el array
        for (int i = 0; i < array.length; i++) {
            // Genero un aleatorio
            array[i] = generaAleatorio(min, max);
        }
    }

}
