package com.mycompany.instance_of;

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

        int numGerentes = 0, numEmpleados = 0;
        // Recorremos las personas
        for (Persona persona : personas) {

            // si es instancia de Empleado, subimos el contador
            if (persona instanceof Empleado) {
                numEmpleados++;
                // si es instancia de Gerente, subimos el contador
            } else if (persona instanceof Gerente) {
                numGerentes++;
            }
        }

        // Mostramos el numero de personas de cada tipo
        System.out.println("Empleados: " + numEmpleados);
        System.out.println("Gerentes: " + numGerentes);

    }
}
