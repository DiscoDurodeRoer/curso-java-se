package com.mycompany.objetos_atributos;

public class App {

    public static void main(String[] args) {

        // Crea una instancias de direccion
        Direccion direccion = new Direccion("Calle falsa", 123, "Ciudad Real", "Ciudad Real");

        // Creo una instancia de Persona que necesita direccion
        Persona persona = new Persona("Fernando", "Ureña Gomez", 34, direccion);
        
        // Muestro la informacion de la person
        System.out.println(persona);
        
    }
}
