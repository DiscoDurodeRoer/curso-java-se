package com.mycompany.mayor_menor_array;

/*
    Crea un array de numeros y obten el mayor y el menor del array.
 */
public class App {

    public static void main(String[] args) {

        // Creo el array
        int[] array = {40, 50, 10, 30, 20};

        // Tomo el primer elemento como referencia
        int menor = array[0];
        int mayor = array[0];

        // Recorro el array desde la posicion 1
        for (int i = 1; i < array.length; i++) {
            // Si el numero actual es menor que el que yo considero menor
            // ese es mi nuevo menor
            if (array[i] < menor) {
                menor = array[i];
            }
            // Si el numero actual es mayor que el que yo considero mayor
            // ese es mi nuevo mayor
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }

        // Mostramos los valores
        System.out.println("El menor es " + menor);
        System.out.println("El mayor es " + mayor);

    }
}
