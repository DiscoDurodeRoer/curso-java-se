package com.mycompany.suma_numeros_usuario;

import java.util.Scanner;

/*
    Mostrar la suma de los numeros hasta que el usuario introduzca un -1
*/
public class App {

    public static void main(String[] args) {

        // Creo el Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        
        // Variable donde guardo el numero del usuario
        int numero = 0;
        // Variable para almacenar la suma
        int suma = 0;
        
        // Mientras el numero sea diferente de -1, seguimos
        while(numero != -1){
            
            // Realizamos la suma
            // Es lo mismo que suma = suma + numero;
            suma += numero;
            
            // Pedimos el numero
            System.out.println("Introduce un numero, -1 para acabar");
            numero = sn.nextInt();
            
        }
        
        // Mostramos la suma
        System.out.println("La suma es " + suma);
        
    }
}
