package com.mycompany.arrays;

public class App {

    public static void main(String[] args) {

        int[] array = new int[5];
        // Otra forma de crear una array
        // int[] array = { 10, 20, 30, 40, 50 };

        // Asignacion de valores
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 10;
        }

        // Se pueden asignar uno a uno
        /*
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
         */
        
        // Obtener un valor de una posicion concreta
        System.out.println("Valor de la primera posicion: " + array[0]);

        // Recorrer array (estandar)
        System.out.println("for estandar");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Recorrer array (foreach)
        System.out.println("foreach");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
