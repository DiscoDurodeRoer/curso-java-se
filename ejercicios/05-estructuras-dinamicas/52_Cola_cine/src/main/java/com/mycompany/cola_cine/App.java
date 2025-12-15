package com.mycompany.cola_cine;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Teniendo una cola de personas de un cine.
 *
 * Calcula la entrada de cada uno de ellos, siendo los precios los siguientes:
 *
 * Adultos (+18): 7.5€
 *
 * Niños (-18): 4.5€
 *
 * La pelicula tendra una clasificacion por edades son las siguientes:
 *
 * A: Todas las edades
 *
 * 7: mayores de 7 años
 *
 * 12: mayores de 12 años
 *
 * 16: mayores de 16 años
 *
 * 18: mayores de 18 años
 *
 * Si una persona no cumple con los requisitos de edad no podrá ver la pelicula.
 *
 */
public class App {

    public static void main(String[] args) {

        // Creamos una cola de personas
        Queue<Persona> colaCine = new LinkedList<>();

        // Añadimos las personas a la cola
        colaCine.offer(new Persona("Fernando", 35));
        colaCine.offer(new Persona("Manuel", 21));
        colaCine.offer(new Persona("Marta", 12));
        colaCine.offer(new Persona("Federico", 5));
        colaCine.offer(new Persona("Alberto", 18));
        colaCine.offer(new Persona("Zacarias", 40));

        // Clasificacion de la pelicula
        ClasificacionPelicula clasificacion = ClasificacionPelicula.MAYOR_18;

        double totalEntradas = 0;
        int totalEntradasVendidas = 0;

        final double PRECIO_ADULTO = 7.5;
        final double PRECIO_NINIO = 4.5;

        // Procesamos las personas de la cola
        while (!colaCine.isEmpty()) {
            // Obtenemos la siguiente persona de la cola
            Persona persona = colaCine.poll();
            System.out.println("Atendiendo a " + persona.getNombre() + " de " + persona.getEdad() + " años");

            // Si la persona tiene edad para ver la pelicula, le cobramos la entrada y sumamos
            if (persona.getEdad() >= clasificacion.getEdadMinima()) {

                double precio;
                if (persona.mayorEdad()) {
                    precio = PRECIO_ADULTO;
                } else {
                    precio = PRECIO_NINIO;
                }
                
                System.out.println("Se ha cobrado " + precio + "€ por la entrada");
                
                totalEntradas += precio;
                totalEntradasVendidas++;

            } else {
                System.out.println("No puede entrar a ver la pelicula, la edad minima es de " + clasificacion.getEdadMinima() + " años");
            }

        }
        
        // Total de las entradas
        System.out.println("El total de las entradas son " + totalEntradas + "€");
        System.out.println("El total de las entradas vendidas son " + totalEntradasVendidas);
        
    }
}
