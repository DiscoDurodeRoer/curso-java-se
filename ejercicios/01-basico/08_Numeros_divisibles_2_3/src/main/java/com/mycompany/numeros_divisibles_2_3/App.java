package com.mycompany.numeros_divisibles_2_3;

/*
    Muestra los números del 1 al 100 que sean divisibles entre 2 y 3.
 */
public class App {

    public static void main(String[] args) {

        // Recorro de 1 a 100 (incluidos)
        for (int i = 1; i <= 100; i++) {
            // Si es divisible entre 2 y 3, muestro i
            if(i % 2 == 0 && i % 3 == 0){
                System.out.println(i);
            }
        }
        
    }
}
