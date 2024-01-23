package com.mycompany.operadores_logicos;

public class App {

    public static void main(String[] args) {

        int operando1 = 5;

        // operando1++; es lo mismo que operando1 = operando + 1; o operando+=1;
        // operando1--; es lo mismo que operando1 = operando - 1; o operando-=1;
        
        // El valor no se actualiza hasta la siguiente linea
        System.out.println("Sufijo ++: " + (operando1++));
        System.out.println("Valor: " + operando1);

        // El valor no se actualiza hasta la siguiente linea
        System.out.println("Sufijo --: " + (operando1--));
        System.out.println("Valor: " + operando1);

        // El valor nose actualiza antes de la siguiente linea
        System.out.println("Prefijo ++: " + (++operando1));
        System.out.println("Valor: " + operando1);

        // El valor nose actualiza antes de la siguiente linea
        System.out.println("Prefijo --: " + (--operando1));
        System.out.println("Valor: " + operando1);

    }
}
