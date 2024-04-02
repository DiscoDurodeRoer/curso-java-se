package com.mycompany._metodos;

public class App {

    public static void main(String[] args) {
        
        // Instancio un objeto de la clase persona
        Persona persona = new Persona("Fernando", "Ureña Gomez", 34);

        // Muestro el nombre completo de la persona
        System.out.println(persona.nombreCompleto());
        
        // Indico si la persona es mayor de edad
        if (persona.mayorEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

    }
}
