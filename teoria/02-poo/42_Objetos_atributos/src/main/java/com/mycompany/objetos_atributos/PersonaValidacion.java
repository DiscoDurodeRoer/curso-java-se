package com.mycompany.objetos_atributos;
public class PersonaValidacion {

    // Valida la edad pasada
    public static boolean validarEdad(int edad) {
        return edad > 0 && edad <= 99;
    }

}
