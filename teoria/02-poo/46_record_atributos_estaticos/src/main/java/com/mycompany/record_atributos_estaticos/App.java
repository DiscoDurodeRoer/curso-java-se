package com.mycompany.record_atributos_estaticos;

public class App {

    public static void main(String[] args) {

        // Creo un record
        record Persona(String nombre, String apellidos, int edad) {

            // Atributo estatico
            private static int personasCreadas = 0;

            // Constructores
            public Persona() {
                this("", "", 0);
            }

            public Persona(String nombre) {
                this(nombre, "", 0);
            }

            public Persona(String nombre, String apellidos) {
                this(nombre, apellidos, 0);
            }

            public Persona(String nombre, String apellidos, int edad) {
                this.nombre = nombre;
                this.apellidos = apellidos;
                this.edad = edad;
                Persona.personasCreadas++;
            }

            // Metodos
            public String nombreCompleto() {
                return this.nombre + " " + this.apellidos;
            }

            public boolean mayorEdad() {
                return this.edad >= 18;
            }

            // Metodo estatico
            public static int getPersonasCreadas() {
                return personasCreadas;
            }

        }

        // Creo dos instancias de persona
        Persona persona1 = new Persona("Fernando", "Ureña Gomez", 34);
        Persona persona2 = new Persona("Fernando", "Ureña Gomez", 34);

        System.out.println(Persona.getPersonasCreadas());

    }
}
