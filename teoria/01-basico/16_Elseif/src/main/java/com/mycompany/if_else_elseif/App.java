/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.if_else_elseif;

/**
 *
 * @author fernando
 */
public class App {

    public static void main(String[] args) {

        // Numero a comprobar
        int numero = -5;

        if (numero < 0) { // Compruebo si es menor que 0
            System.out.println("El numero es negativo");
        } else if (numero > 0 && numero <= 10) { // Compruebo si esta entre 1 y 10
            System.out.println("El numero esta entre 1 y 10");
        } else if (numero > 10 && numero <= 50) { // Compruebo si esta entre 11 y 50
            System.out.println("El numero esta entre 11 y 50");
        } else { // Compruebo si es mayor que 50
            System.out.println("Es mayor que 50");
        }

    }
}
