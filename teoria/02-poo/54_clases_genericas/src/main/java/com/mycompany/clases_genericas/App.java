package com.mycompany.clases_genericas;

public class App {

    public static void main(String[] args) {

        // Caja de un numero
        Caja<Integer> caja1 = new Caja<>(5);
        
        // Caja de un String
        Caja<String> caja2 = new Caja<>("Hola");

        // mostramos su contenido
        System.out.println(caja1);
        System.out.println(caja2);

    }
}
