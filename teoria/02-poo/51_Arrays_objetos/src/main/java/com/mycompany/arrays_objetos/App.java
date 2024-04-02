package com.mycompany.arrays_objetos;

public class App {

    public static void main(String[] args) {

        // Creo un array de personas
        Persona[] personas = {
            new Empleado(3000, "Juan", "Gomez", 30),
            new Gerente("Ventas", "Maria", "Lopez", 40),
            new Empleado(2500, "Carlos", "Perez", 35),
            new Gerente("Marketing", "Ana", "Martinez", 45),
            new Empleado(2800, "Luis", "Gonzalez", 28)
        };

        // Mostrar todas las personas
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Casteamos el primer elemento (ahora puedes acceder a sus metodos)
        Empleado e = (Empleado) personas[0];
        System.out.println(e);
        
    }
}
