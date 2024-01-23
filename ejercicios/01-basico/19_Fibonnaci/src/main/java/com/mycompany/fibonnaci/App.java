package com.mycompany.fibonnaci;

import java.util.Scanner;

/*
    Crea una funcion dado un parametro obtenga el numero de la serie fibonacci.

    La serie fibonacci, empieza en 1 1 y el siguiente se obtiene sumando los dos anteriores.

    Por ejemplo, 1 1 2 3 5 8 13 21 34 55 ...

    Valida que la posicion es mayor o igual que 1.
 */
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        
        int posicion;
        do {
            
            // Pido la posicion
            System.out.println("Introduce una posicion mayor o igual que 1");
            posicion = sn.nextInt();
            
            // En caso de que no sea valido, lo indicamos
            if(posicion < 1){
                System.out.println("Debes introducir un valor mayor o igual que 1");
            }
            
            // Valido la posicion
        } while (posicion < 1);
        
        // Llamamos a la función
        int fibonacci = serieFibonacci(posicion);
        
        // Mostramos el valor de la serie fibonacci
        System.out.println("En la posicion " + posicion + " esta el numero " + fibonacci);
        
        
    }
    
    public static int serieFibonacci(int posicion){
        
        // Variables necesarias
        int num1 = 0;
        int num2 = 1;
        int suma = 1;
        
        for (int i = 1; i < posicion; i++) {
            
            // Actualizamos suma
            suma = num1 + num2;
            // Ahora num1 tiene el valor de num2 
            num1 = num2;
            // Ahora num2 tiene el valor de suma
            num2 = suma;
            
        }
        
        return suma;
        
    }
    

}
