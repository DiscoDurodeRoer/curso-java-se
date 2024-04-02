package com.mycompany.atributos;

public class App {

    public static void main(String[] args) {
      
        // Instancio un objeto de la clase persona
        Persona p = new Persona();
        
        // Asigno valores a los atributos
        p.nombre = "Fernando";
        p.apellidos = "Ureña Gomez";
        p.edad = 34;
        
        // Muestro el valor de cada atributo
        System.out.println(p.nombre);
        System.out.println(p.apellidos);
        System.out.println(p.edad);
        
    }
}
