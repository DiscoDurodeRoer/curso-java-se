package com.mycompany.random;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        // Creamos un objeto Random
        Random r = new Random();

        // Genero un numero entero entre 1 y 10
        int aleatorioInt = r.nextInt(1, 10);
        System.out.println("Numero aleatorio (int): " + aleatorioInt);

        // Genero un numero real entre 1 y 10
        double aleatorioDouble = r.nextDouble(1, 10);
        System.out.println("Numero aleatorio (double): " + aleatorioDouble);

    }
}
