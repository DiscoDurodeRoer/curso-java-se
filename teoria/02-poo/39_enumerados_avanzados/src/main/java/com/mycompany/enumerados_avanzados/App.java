package com.mycompany.enumerados_avanzados;

public class App {

    public static void main(String[] args) {

        // Mostramos la info de los meses
        for (Meses mes : Meses.values()) {
            System.out.println("El mes " + mes.name() + " tiene " + mes.getDias() + " dias");
        }

    }
}
