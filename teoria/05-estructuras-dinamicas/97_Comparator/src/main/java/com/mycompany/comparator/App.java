package com.mycompany.comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {

        // Creo un arrayList de personas
        ArrayList<Persona> personas = new ArrayList<>();
        
        // Añado diferentes personas
        personas.add(new Persona("Fernando", 35));
        personas.add(new Persona("Manuel", 40));
        personas.add(new Persona("Alberto", 21));
        personas.add(new Persona("Zacarias", 27));

        // Ordeno el arrayList de menor a mayor
        personas.sort(Comparator.naturalOrder());
        System.out.println("Ordenado de forma natural (menor a mayor): " + personas);

        // Ordeno el arrayList de mayor a menor
        personas.sort(Comparator.reverseOrder());
        System.out.println("Ordenado al reves (mayor a menor): " + personas);

        // Ordeno el arrayList por nombre alfabeticamente
        personas.sort(new NombreAlfabeticoComparator());
        System.out.println("Ordenado por nombre alfabeticamente: " + personas);

    }
}
