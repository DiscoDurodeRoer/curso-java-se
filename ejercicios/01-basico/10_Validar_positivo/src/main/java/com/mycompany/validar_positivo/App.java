package com.mycompany.validar_positivo;

import java.util.Scanner;

/*
    Pide un numero por teclado y valida que sea positivo
*/
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        
        int numero;
        do {
           
            // Pido el numero
            System.out.println("Introduce un numero positivo");
            numero = sn.nextInt();
            
            // Si es negativo, aviso que tiene que hacer el usuario
            if(numero < 0){
                System.out.println("Error, el numero debe ser positivo");
            }
            
            // Mientras sea negativo, vuelvo al do
        } while (numero < 0);
        
        // Muestro el numero validado
        System.out.println("El numero es " + numero);

    }
}
