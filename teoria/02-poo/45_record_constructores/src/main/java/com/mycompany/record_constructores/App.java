package com.mycompany.record_constructores;

public class App {

    public static void main(String[] args) {

        // Creo un record
        record Persona(String nombre, String apellidos, int edad) {

            // Constructores
            public Persona() {
                this("", "", 0);
            }

            public Persona(String nombre) {
                this(nombre, "", 0);
            }

            public Persona(String nombre, String apellidos, int edad) {
                this.nombre = nombre;
                this.apellidos = apellidos;
                this.edad = edad;
            }

            // Metodos
            public String nombreCompleto() {
                return this.nombre + " " + this.apellidos;
            }

            public boolean mayorEdad() {
                return this.edad >= 18;
            }

        }

        // Instancio un objeto con el record que acabamos de crear
        Persona persona = new Persona("Fernando");

        System.out.println(persona);

    }
}
