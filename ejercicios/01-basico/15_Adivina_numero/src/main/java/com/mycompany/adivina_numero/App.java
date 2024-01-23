package com.mycompany.adivina_numero;

import java.util.Random;
import java.util.Scanner;

/*
    Dado un numero aleatorio entre 1 y 100 (incluidos) pide al usuario
    por teclado que lo adivine dandole pistas diciendole si es mayor o menor.

    El usuario solo tiene 5 intentos.

    Si se acaban los intentos o se acierta el numero, el juego se acaba.
 */
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);

        // Genero un numero entre 1 y 100
        Random random = new Random();
        int numeroAcertar = random.nextInt(1, 101);

        // Numero que el usuario inserta
        int numeroUsuario;
        // Numero de intentos
        int intentos = 5;

        // Variable para saber si acertamos el numero o no
        boolean acertado = false;

        // Mientras no acertemos y tengamos intentos, seguimos
        while (!acertado && intentos > 0) {

            // Pedimos el numero
            System.out.println("Introduce un numero entre 1 y 100");
            numeroUsuario = sn.nextInt();

            // Si el numero es igual al que buscamos, hemos acertado
            if (numeroUsuario == numeroAcertar) {
                acertado = true;
            } else if (numeroUsuario > numeroAcertar) {
                System.out.println("El numero es menor");
                // Un intento menos y mostramos los que quedan
                intentos--;
                System.out.println("Quedan " + intentos + " intentos");
            } else {
                System.out.println("El numero es mayor");
                // Un intento menos y mostramos los que quedan
                intentos--;
                System.out.println("Quedan " + intentos + " intentos");
            }

        }
        
        // Mostramos mensaje final del juego
        if(acertado){
            System.out.println("Has ganado");
        }else{
            System.out.println("Has perdido");
        }

    }
}
