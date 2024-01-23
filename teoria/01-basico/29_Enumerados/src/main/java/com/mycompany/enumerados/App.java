package com.mycompany.enumerados;

public class App {

    public static void main(String[] args) {

        try {

            String colorBuscado = "rojo";

            // Comprobamos si existe un color
            Colores color = Colores.valueOf(colorBuscado);

            System.out.println("El color " + color + " existe");

        } catch (IllegalArgumentException e) {
            System.out.println("El color no existe");
        }

        // Mostramos todos los colores
        for (Colores value : Colores.values()) {
            System.out.println(value);
        }

    }
}
