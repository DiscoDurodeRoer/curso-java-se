package com.mycompany.herencia;

public class App {

    public static void main(String[] args) {

        // Instanciamos dos objetos que heredan de Persona
        Empleado empleado = new Empleado(2000, "Fernando", "Ureña Gomez", 34);
        Gerente gerente = new Gerente("Informatica", "Manuel", "Ureña Gomez", 34);

        // Mostramos su informacion
        System.out.println(empleado);
        System.out.println(gerente);

    }
}
