package com.mycompany.record;

public class App {

    public static void main(String[] args) {

        // Creo un record
        record Persona(String nombre, String apellidos, int edad) {

        }

        // Instancio un objeto con el record que acabamos de crear
        Persona persona = new Persona("Fernando", "Ureña Gomez", 34);

        // Mostramos la informacion del objeto
        System.out.println(persona.toString());

    }
}
