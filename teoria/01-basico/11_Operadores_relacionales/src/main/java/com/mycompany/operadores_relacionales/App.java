package com.mycompany.operadores_relacionales;

public class App {

    public static void main(String[] args) {

        int valor1 = 20;
        int valor2 = 10;

        /*
            false || false = false
            true || false = true
            false || true = true
            true || true = true
         */
        boolean or = valor1 == 10 || valor2 == 10;

        /*
            false && false = false
            true && false = false
            false && true = false
            true && true = true
         */
        boolean and = valor1 > 0 && valor2 <= 10;

        // IMPORTANTE: el operador && tiene mas prioridad que el ||
        boolean combinacion = valor1 < 0 && valor2 >= 10 || valor1 != 20;

        // resultado
        System.out.println("OR: " + or);
        System.out.println("AND: " + and);
        System.out.println("Combinacion AND Y OR: " + combinacion);

    }
}
