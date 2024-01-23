package com.mycompany._unir_arrays;

import java.util.Arrays;

/*
    Crea dos arrays y fusionalos en uno
 */
public class App {
    
    public static void main(String[] args) {
        
        // Creo los dos arrays
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9, 10};
        
        // Array fusionado
        int[] array3 = new int[array1.length + array2.length];
        
        // Paso la informacion del array1 al array3
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        
        // Paso la informacion del array2 al array3
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        
        // Muestro el array fusionado
        System.out.println("Array fusionado " + Arrays.toString(array3));
        
    }
}
