package com.mycompany.operadores_logicos;

public class App {

    public static void main(String[] args) {

        // Declaro las variables necesarias
        int valor1 = 10;
        int valor2 = 10;

        // Operadores logicos
        boolean mayor = valor1 > valor2;
        boolean mayorIgual = valor1 >= valor2;
        boolean menor = valor1 < valor2;
        boolean menorIgual = valor1 <= valor2;
        boolean igual = valor1 == valor2;
        boolean distinto = valor1 != valor2;
        boolean inverso = !distinto;

        // Mostrar valores
        System.out.println("¿Es " + valor1 + " mayor que " + valor2 + " ? " + mayor);
        System.out.println("¿Es " + valor1 + " mayor o igual que " + valor2 + " ? " + mayorIgual);
        System.out.println("¿Es " + valor1 + " menor que " + valor2 + " ? " + menor);
        System.out.println("¿Es " + valor1 + " menor o igual que " + valor2 + " ? " + menorIgual);
        System.out.println("¿Es " + valor1 + " igual a " + valor2 + " ? " + igual);
        System.out.println("¿Es " + valor1 + " distinto que " + valor2 + " ? " + distinto);
        System.out.println("¿Cual es el inverso de distinto? " + inverso);

    }
}
