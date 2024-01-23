package com.mycompany._calculadora;

import java.util.Locale;
import java.util.Scanner;

/*
    Pide 2 operandos, un operador (+ - * /) y realiza la operacion correspondiente.

    Si el operador es invalido o el 2º operando es 0 en el caso de la division, 
    debes indicar que no se puede realizar la operacion.

 */
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        // Para insertar . como separador decimal
        sn.useLocale(Locale.US);
        // Para los problemas de espacio
        sn.useDelimiter("\n");

        // Pido los datos
        System.out.println("Introduce el operando 1");
        double operando1 = sn.nextDouble();

        System.out.println("Introduce el operador (+ - * /)");
        String operador = sn.next();

        System.out.println("Introduce el operando 2");
        double operando2 = sn.nextDouble();

        // Resultado
        double resultado = 0;
        boolean correcto = true;

        // Segun el operador, hacemos una operacion u otra
        switch (operador) {
            case "+" ->
                resultado = operando1 + operando2;
            case "-" ->
                resultado = operando1 - operando2;
            case "*" ->
                resultado = operando1 * operando2;
            case "/" -> {
                // Si el operando es diferente de 0, hacemos la division
                if(operando2 != 0){
                    resultado = operando1 / operando2;
                }else{
                    System.out.println("No se puede dividir entre 0");
                    correcto = false;
                }
            }
            default -> {
                // Operador no valido
                System.out.println("El operador no es correcto");
                correcto = false;
            }
        }
        
        // Si es correcto, mostramos el resultado
        if(correcto){
            System.out.println("El resultado es: " + resultado);
        }

    }
}
