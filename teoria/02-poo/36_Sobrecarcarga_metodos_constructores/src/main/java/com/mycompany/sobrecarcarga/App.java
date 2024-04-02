package com.mycompany.sobrecarcarga;

public class App {

    public static void main(String[] args) {
        // Instancio un objeto de la clase persona
        Persona persona = new Persona("Fernando", "Ureña Gomez", 34);

        // Llamo al metodo sobrecargado nombreCompleto
        System.out.println(persona.nombreCompleto("Señor"));
        // Llamo al metodo nombreCompleto
        System.out.println(persona.nombreCompleto());

        // Instancio un objeto de la clase persona usando el constructor sobrecargado
        Persona persona2 = new Persona("Manuel");

        // Llamo al metodo sobrecargado nombreCompleto
        System.out.println(persona2.nombreCompleto("Señor"));
        // Llamo al metodo nombreCompleto
        System.out.println(persona2.nombreCompleto());

    }
}
