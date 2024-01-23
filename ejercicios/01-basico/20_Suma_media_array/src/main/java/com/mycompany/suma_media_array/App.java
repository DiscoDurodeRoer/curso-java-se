package com.mycompany.suma_media_array;

/*
    Crea un array de numeros y obten la suma y la media de sus elementos.
 */
public class App {

    public static void main(String[] args) {

        // Creo el array
        int[] array = {1, 2, 3, 4, 5};

        // Variable para almacenar la suma
        int suma = 0;

        // Obtenemos la suma recorriendo los elementos
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        // Variable para almacenar la media
        double media = (double) suma / array.length;

        // Mostramos los resultados
        System.out.println("La suma es " + suma);
        System.out.println("La media es " + media);

    }
}
