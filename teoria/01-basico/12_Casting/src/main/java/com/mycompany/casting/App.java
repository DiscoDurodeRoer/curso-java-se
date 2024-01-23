package com.mycompany.casting;

public class App {

    public static void main(String[] args) {

        int valor1 = 10;
        int valor2 = 6;

        double division = (double) valor1 / valor2;

        System.out.println("La division es: " + division);

        int valor3 = (int) 'A';

        System.out.println("El valor del caracter A en numero es: " + valor3);

        float valor4 = (float) 1.5;
        
        System.out.println("El valor (float) es: " + valor4);
        
    }
}
