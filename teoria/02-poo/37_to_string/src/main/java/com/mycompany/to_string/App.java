package com.mycompany.to_string;

public class App {

    public static void main(String[] args) {
        // Instancio un objeto de la clase persona
        Persona persona = new Persona("Fernando", "Ureña Gomez", 34);
        System.out.println(persona); // es lo mismo que System.out.println(persona.toString());
    }
}
