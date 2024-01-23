package com.mycompany.arrays_utils;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] array1 = {20, 10, 30, 50, 60};
        int[] array2 = {10, 20, 30, 40, 50};

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        System.out.println("Ordenando array1");
        Arrays.sort(array1);

        System.out.println("Array1 ordenado: " + Arrays.toString(array1));

        if (Arrays.equals(array1, array2)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }

    }
}
