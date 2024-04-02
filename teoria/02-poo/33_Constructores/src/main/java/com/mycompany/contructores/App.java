package com.mycompany.contructores;

public class App {

    public static void main(String[] args) {

        try {
            // Si la edad es negativa, capturamos la excepcion
            Persona p = new Persona("Fernando", "Ureña Gomez", 34);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
