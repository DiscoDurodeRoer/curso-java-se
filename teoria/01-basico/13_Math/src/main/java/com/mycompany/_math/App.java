package com.mycompany._math;

public class App {

    public static void main(String[] args) {

        // Variables
        int valor1 = -5;
        double valor2 = 5.3;
        int valor3 = 25;
        int valor4 = 2;
        int valor5 = -80;

        // Usando Math
        int abs = Math.abs(valor1);
        double floor = Math.floor(valor2);
        double ceil = Math.ceil(valor2);
        double round = Math.round(valor2);
        double pow = Math.pow(valor3, valor4); // potencia
        double sqrt = Math.sqrt(valor3); // Raiz cuadrad
        int clamp = Math.clamp(valor5, 1, 100);

        // Resultados
        System.out.println("Resultado Math.abs(" + valor1 + ") es " + abs);
        System.out.println("Resultado Math.floor(" + valor2 + ") es " + floor);
        System.out.println("Resultado Math.ceil(" + valor2 + ") es " + ceil);
        System.out.println("Resultado Math.round(" + valor2 + ") es " + round);
        System.out.println("Resultado Math.pow(" + valor3 + "," + valor4 + ") es " + pow);
        System.out.println("Resultado Math.sqrt(" + valor3 + ") es " + sqrt);
        System.out.println("Resultado Math.clamp(" + valor5 + ", 1, 100) es " + clamp);

    }
}
