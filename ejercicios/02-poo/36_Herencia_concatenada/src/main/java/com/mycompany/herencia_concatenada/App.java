package com.mycompany.herencia_concatenada;

/**
 * Crea una clase que represente a un vehiculo
 *
 * Un vehiculo se define por:
 *
 * - Marca
 *
 * - Modelo
 *
 * Crea un constructor por defecto
 *
 * Encapsula sus atributos
 *
 * Crea una función toString para mostrar su informacion.
 *
 * Crea una clase que represente a un coche
 *
 * Ademas de los atributos que tiene un vehiculo, se define por:
 *
 * - Numero de puertas
 *
 * Crea una función toString para mostrar su informacion.
 *
 * Crea una clase que represente a una moto
 *
 * Ademas de los atributos que tiene un vehiculo, se define por:
 *
 * - Si tiene o no un sidecar
 *
 * Crea una función toString para mostrar su informacion.
 *
 * Crea una clase que represente a un coche deportivo
 *
 * Ademas de los atributos que tiene un coche, se define por:
 *
 * - Si es o no descapotable
 *
 * Crea una función toString para mostrar su informacion.
 *
 */
public class App {

    public static void main(String[] args) {
        
        // Creo varias instancias de vehiculos
        Vehiculo v1 = new Vehiculo("Seat", "Ibiza");
        Coche c1 = new Coche(4, "Toyota", "auris");
        Moto m1 = new Moto(true, "Honda", "Superior");
        CocheDeportivo cd1 = new CocheDeportivo(true, 2, "ferrari", "maximus");
        
        // Muestro su informacion
        System.out.println(v1);
        System.out.println(c1);
        System.out.println(m1);
        System.out.println(cd1);
        
        
        
        
    }
}
