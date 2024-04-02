package com.mycompany.abstraccion;

public class App {

    public static void main(String[] args) {

        // Creo una instancia de Empleado
        Empleado empleado = new Empleado(2000, "Fernando", "Ureña Gomez", 34);

        // Creo una instancia de Gerente
        Gerente gerente = new Gerente("Informatica", "Manuel", "Ureña Gomez", 34);

        // No podemos instanciar objetos de Persona
        // Persona persona = new Persona("Manuel", "Ureña Gomez", 34);

    }
}
