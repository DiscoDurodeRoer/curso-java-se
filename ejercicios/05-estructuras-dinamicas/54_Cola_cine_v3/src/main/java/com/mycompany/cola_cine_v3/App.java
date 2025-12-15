package com.mycompany.cola_cine_v3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Teniendo una cola de personas de un cine.
 *
 * Hay un 50% de posibilidades de que al atender a una persona llegue otra a la
 * cola.
 *
 * Hay otro 50% de posibilidades de que esa persona sea VIP y se ponga al
 * principio de la cola.
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
        // Ahora podemos añadir personas al final y al principio
        ArrayDeque<Persona> colaCine = new ArrayDeque<>();

        // Añadimos las personas a la cola
        colaCine.offer(new Persona("Fernando", 35));
        colaCine.offer(new Persona("Manuel", 21));
        colaCine.offer(new Persona("Marta", 12));
        colaCine.offer(new Persona("Federico", 5));
        colaCine.offer(new Persona("Alberto", 18));
        colaCine.offer(new Persona("Zacarias", 40));

        // Lista de nombres
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Carlos", "Andres", "Sofia", "Maria", "Pepe"));

        // Clasificacion de la pelicula
        ClasificacionPelicula clasificacion = ClasificacionPelicula.MAYOR_18;

        double totalEntradas = 0;
        int totalEntradasVendidas = 0;

        final double PRECIO_ADULTO = 7.5;
        final double PRECIO_NINIO = 4.5;

        Random random = new Random();

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

            // 50% de que venga una nueva persona
            boolean vieneNuevaPersona = random.nextBoolean();

            if (vieneNuevaPersona) {
                // Creamos una persona aleatoriamente
                Persona nuevaPersona = new Persona(nombres.get(random.nextInt(0, nombres.size())), random.nextInt(5, 30));
                System.out.println("Ha llegado una nueva persona a la cola llamada " + nuevaPersona.getNombre() + " de " + nuevaPersona.getEdad() + " años");
                // 50% de que sea VIP
                boolean esVip = random.nextBoolean();
                if (esVip) {
                    System.out.println("Es VIP y se pone al principio de la cola");
                    colaCine.offerFirst(nuevaPersona); // Colamos a la persona al principio
                } else {
                    System.out.println("No es VIP y se pone al final de la cola");
                    colaCine.offerLast(nuevaPersona);
                }

            }

        }

        // Total de las entradas
        System.out.println("El total de las entradas son " + totalEntradas + "€");
        System.out.println("El total de las entradas vendidas son " + totalEntradasVendidas);

    }
}
