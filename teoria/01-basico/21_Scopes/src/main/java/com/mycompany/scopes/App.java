package com.mycompany.scopes;

public class App {

    public static void main(String[] args) {

        int valor1 = 15;

        if (valor1 > 10) {
            // Creo variables dentro del if, cuando salgamos no existiran
            int valor2 = 10;
            System.out.println("El valor (dentro del if) es " + valor2);
            // Esta variable no se ve fuera del if
            int valor3 = 20;
        }

        int valor2 = 100;
        // El valor es 100, si lo pones entre la variable y el if
        // dara error de compilacion
        System.out.println("El valor (fuera del if) es " + valor2);

    }
}
