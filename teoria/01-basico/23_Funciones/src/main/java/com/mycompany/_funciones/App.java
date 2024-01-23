package com.mycompany._funciones;

public class App {

    public static void main(String[] args) {

        // Método saludar, no devuelve nada
        saludar("Fer");

        // Funcion sumar, le damos dos parametros y nos devuelve el resultado
        int operando1 = 5;
        int operando2 = 20;

        int resultado = suma(operando1, operando2);
        System.out.println("El resultado es " + resultado);

        // Funcion esPar, le damos un numero y nos devuelve un booleano
        // Se puede usar como condición
        
        int numero = 9;

        if (esPar(numero)) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }

    }

    /*
        Las funciones tienen el siguiente formato:
    
        public static <tipo_devuelto> <nombre_funcion>(parametro1, parametro2, ...)
    
        A tener en cuenta:
           - Puede no tener parametros
           - No es necesario que devuelva nada a no ser que se le indique
           - Se recomienda usar camelCase en el nombre de las funciones
    */
    
    
    public static void saludar(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }

    public static int suma(int operando1, int operando2) {
        return operando1 + operando2;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
