package com.mycompany.compare_to;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        // Instanciamos dos objetos que heredan de Persona
        Persona persona1 = new Persona("Fernando", "Ureña Gomez", 34);
        Persona persona2 = new Persona("Manuel", "Ureña Gomez", 34);

        // Comparo las personas
        if (persona1.compareTo(persona2) > 0) {
            System.out.println(persona1.nombreCompleto() + " es mayor que " + persona2.nombreCompleto());
        } else if (persona1.compareTo(persona2) < 0) {
            System.out.println(persona2.nombreCompleto() + " es mayor que " + persona1.nombreCompleto());
        } else {
            System.out.println("Tienen la misma edad");
        }
        
        // Creo un array de personasF
        Persona[] personas = {
            persona1,
            persona2,
            new Persona("Manuel", "Ureña Garcia", 40),
            new Persona("Alberto", "Gomez Ureña", 60),
            new Persona("Ricardo", "Caballero Gomez", 20)
        };

        // Ordeno el array
        Arrays.sort(personas);

        // Muestro las personas ordenadas
        for (Persona persona : personas) {
            System.out.println(persona);
        }

    }

}
