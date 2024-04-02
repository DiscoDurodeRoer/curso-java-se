package com.mycompany.aeropuertos;

/**
 * Crea una clase que represente un aeropuerto.
 *
 * Un aeropuerto se define por:
 *
 * - Id
 *
 * - Nombre
 *
 * - Anio inauguracion
 *
 * - Capacidad
 *
 * El id sera autoincrementado.
 *
 * Encapsula todos sus atributos
 *
 * Crea dos constructores, uno vacio y otro con todos los atributos excepto el
 * id.
 *
 * No se pueden crear instancias de aeropuertos.
 *
 * Las operaciones que se deben implementar todas sus clases hijas son:
 *
 * - gananciasTotales: se le pasa una cantidad y no devuelve nada.
 *
 * Crea una clase que represente a un aeropuerto publico.
 *
 * Además de los atributos de un aeropuerto, se define por:
 *
 * - financiacion
 *
 * - numero de trabajadores discapacitados
 *
 * Encapsula todos sus atributos
 *
 * Crea dos constructores, uno vacio y por defecto
 *
 * Las operaciones que se deben implementar:
 *
 * - gananciasTotales: Dada una cantidad, se le sumara la financiacion y 1000€
 * por cada trabajador discapacitado
 *
 * Crea una clase que represente a un aeropuerto privado.
 *
 * Además de los atributos de un aeropuerto, se define por:
 *
 * - numero de socios
 *
 * Encapsula todos sus atributos
 *
 * Crea dos constructores, uno vacio y otro por defecto
 *
 * Las operaciones que se deben implementar:
 *
 * - gananciasTotales: dada una cantidad, se dividira entre el numero de socios.
 *
 */
public class App {

    public static void main(String[] args) {

        // Creo instancias de Aeropuerto
        // De la clase Aeropuerto no puedo crear instancias
        AeropuertoPublico ap = new AeropuertoPublico(100000, 10, "adolfo suarez", 1980, 20000);
        AeropuertoPrivado apr = new AeropuertoPrivado(10, "quijote airport", 2000, 20000);
        
        // Muestro su informacion
        System.out.println(ap);
        System.out.println(apr);
        
        // Muestro las ganancias de los aeropuertos
        ap.gananciasTotales(20000);
        apr.gananciasTotales(20000);
        
        
    }
}
