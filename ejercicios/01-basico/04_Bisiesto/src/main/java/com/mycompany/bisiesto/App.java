package com.mycompany.bisiesto;

import java.util.Scanner;

/*
    Pide un año por teclado e indica si es bisiesto o no.

    Un año es bisiesto cuando es divisible entre 4 y no divisible por 100 
    o es divisible por 400
 */
public class App {

    public static void main(String[] args) {

        // Crea Scanner para pedir datos
        Scanner sn = new Scanner(System.in);

        // Introduzco el año
        System.out.println("Introduce el año");
        int anio = sn.nextInt();

        // Comrpuebo si es bisiesto
        // Recuerda, && tiene mas prioridad que ||
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("El año " + anio + " es bisiesto");
        }else{
            System.out.println("El año " + anio + " no es bisiesto");
        }

    }
}
