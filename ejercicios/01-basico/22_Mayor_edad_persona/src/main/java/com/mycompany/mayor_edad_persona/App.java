package com.mycompany.mayor_edad_persona;

/*
    Dado dos arrays, uno con nombres de personas y otro con sus edades,
    indique cual es la persona con mas edad.
 */
public class App {

    public static void main(String[] args) {

        // Creo los arrays
        String[] nombres = {"Fernando", "Manuel", "Alfredo"};
        int[] edades = {33, 30, 18};

        // Tomo el primer indice como referencia
        int indiceMayor = 0;

        // Recorro el array desde la posicion 1
        for (int i = 1; i < edades.length; i++) {
            // Si el numero actual es mayor que el que esta el indice mayor
            // ese es mi nuevo indice
            if (edades[i] > edades[indiceMayor]) {
                indiceMayor = i;
            }
        }

        // Muestro la mayor edad y el nombre asociado
        System.out.println("La persona con mas edad (" + edades[indiceMayor] + ") es " + nombres[indiceMayor]);

    }
}
