package com.mycompany.divisible_entre;

import java.util.Scanner;

/*
    Pide dos numeros por teclado e indica si el segundo es divisble por el primero

    Por ejemplo, si numero1 = 10 y numero2 = 5 deberia mostrar:

    "El numero 5 es divisible de 10"
*/
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        
        // Pedimos ambos numeros
        System.out.println("Introduce el numero 1");
        int numero1 = sn.nextInt();
        
        System.out.println("Introduce el numero 2");
        int numero2 = sn.nextInt();
        
        // Si el resto es 0, significa que es divisible
        if(numero1 % numero2 == 0){
            System.out.println("El numero " + numero2 + " es divisible de " + numero1);
        }else{
            System.out.println("El numero " + numero2 + " no es divisible de " + numero1);
        }
        
        
        
        
        
    }
}
