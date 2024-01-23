package com.mycompany.password;

import java.util.Random;
import java.util.Scanner;

/*
    Crea una funcion que genere un password de una longitud con numeros, 
    letras mayusculas y letras minusculas combinadas
 */
public class App {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        // Pido la longitud
        System.out.println("Introduce la longitud");
        int longitud = sn.nextInt();

        // Genero el password
        String password = generaPassword(longitud);

        // lo muestro
        System.out.println("El password generado es " + password);

    }

    public static int generaAleatorio(int min, int max) {
        // Creo un random
        Random random = new Random();
        // Genero y devuelvo un numero aleatorio entre los numeros pedidos
        return random.nextInt(min, max + 1);
    }

    public static String generaPassword(int longitud) {

        String password = "";
        char caracter = 0;
        for (int i = 0; i < longitud; i++) {
            // genero un numero entre 1 y 3
            // 1 -> entre A y Z
            // 2 -> entre a y z
            // 3 -> entre 0 y 9
            int tipo = generaAleatorio(1, 3);
            switch (tipo) {
                case 1 ->
                    caracter = (char) generaAleatorio('A', 'Z');
                case 2 ->
                    caracter = (char) generaAleatorio('a', 'z');
                case 3 ->
                    caracter = (char) generaAleatorio('0', '9');
            }
            // Lo añadimos al password
            password += caracter;

        }
        return password;
    }

}
