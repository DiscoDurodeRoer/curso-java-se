package com.mycompany.aleatorio;

import java.util.Random;

/*
    Crea una funcion que genere un numero aleatorio entre 2 numeros inclusive.
 */
public class App {

    public static void main(String[] args) {

        int aleatorio;
        for (int i = 0; i < 10; i++) {
            // Genero un aleatorio y lo muestro
            aleatorio = generaAleatorio(1,10);
            System.out.println(aleatorio);
        }
        
    }

    
    public static int generaAleatorio(int min, int max) {
        // Creo un random
        Random random = new Random();
        // Genero y devuelvo un numero aleatorio entre los numeros pedidos
        return random.nextInt(min, max + 1);
    }

}
