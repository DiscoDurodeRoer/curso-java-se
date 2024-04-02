package com.mycompany.metodos_estaticos;

public class PersonaValidacion {

    // Valida la edad pasada
    public static boolean validarEdad(int edad) {
        return edad > 0 && edad <= 99;
    }

}
