package com.mycompany.metodos_estaticos;

public class App {

    public static void main(String[] args) {
        // Indicamos cuantas personas se han creado has ahora (0)
        System.out.println("Personas creadas: " + Persona.getPersonasCreadas());
        Persona persona1 = new Persona("Fernando", "Ureña Gomez", 34);
        
        // Indicamos cuantas personas se han creado has ahora (1)
        System.out.println("Personas creadas: " + Persona.getPersonasCreadas());
        Persona persona2 = new Persona("Fernando", "Ureña Gomez", 34);
        
        // Indicamos cuantas personas se han creado has ahora (2)
        System.out.println("Personas creadas: " + Persona.getPersonasCreadas());
    }
}
