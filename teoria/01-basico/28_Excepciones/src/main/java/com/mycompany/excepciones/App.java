package com.mycompany.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        // InputMismatchException salta si ponemos un valor incorrecto en scanner
        try {
            System.out.println("Introduce un numero");
            int numero = sn.nextInt();
            System.out.println("El numero introducido es " + numero);
        } catch (InputMismatchException e) {
            sn.next();
            System.out.println("Debes introducir un numero");
        }

        // ArithmeticException salta cuando dividimos entre 0
        try {

            int operando1 = 10;
            int operando2 = 0;

            double division = operando1 / operando2;
            System.out.println("La división es " + division);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        }

        // ArrayIndexOutOfBoundsException salta cuando accedemos a un valor fuera del rango
        try {

            int[] array = {1, 2, 3, 4, 5};
            System.out.println(array[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("La posicion del array no es correcta");
        }

        // Podemos lanzar excepciones generales
        try {

            System.out.println("Introduce un numero entre 0 y 10");
            int numero = sn.nextInt();

            validarNumero(numero);

            System.out.println("Numero correcto");

        } catch (InputMismatchException e) {
            sn.next();
            System.out.println("Debes introducir un numero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // podemos indicar si la funcion puede devolver una excepción con throws
    public static void validarNumero(int numero) throws Exception {
        if (!(numero >= 0 && numero <= 10)) {
            throw new Exception("Debes introducir un numero entre 0 y 10");
        }
    }

}
