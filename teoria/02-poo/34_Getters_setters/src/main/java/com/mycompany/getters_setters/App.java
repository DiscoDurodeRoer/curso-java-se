package com.mycompany.getters_setters;

public class App {
    
    public static void main(String[] args) {
        Persona p = new Persona("Fernando", "Ureña Gomez", 34);
        
        System.out.println(p.getNombre());
        System.out.println(p.getApellidos());
        System.out.println(p.getEdad());
        
        p.setNombre("Manuel");
        
        System.out.println(p.getNombre());
        System.out.println(p.getApellidos());
        System.out.println(p.getEdad());
        
    }
}
