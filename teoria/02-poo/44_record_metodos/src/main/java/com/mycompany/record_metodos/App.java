package com.mycompany.record_metodos;

public class App {

    public static void main(String[] args) {

        // Creo un record
        record Persona(String nombre, String apellidos, int edad) {

            // Devolvemos el nombre completo
            public String nombreCompleto() {
                return this.nombre + " " + this.apellidos;
            }

            // Indicamos si es mayor de edad
            public boolean mayorEdad() {
                return this.edad >= 18;
            }

        }

         // Instancio un objeto con el record que acabamos de crear
        Persona persona = new Persona("Fernando", "Ureña Gomez", 5);
        
        // Llamo a los nuevos metodos
        System.out.println(persona.nombreCompleto());
        if(persona.mayorEdad()){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }

    }
}
