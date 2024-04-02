package com.mycompany.prestable;

/**
 * Crea una interfaz que se llame Prestable:
 *
 * Tendrá los siguientes métodos:
 *
 * - prestar
 *
 * - devolver
 *
 * Crea la clase VideoJuego que implemente esta interfaz.
 *
 * Se define por:
 *
 * - nombre
 *
 * - precio
 *
 * - prestado
 *
 * - vecesPrestado
 *
 * Encapsula los atributos nombre y precio
 *
 * Crea un constructor que pida nombre y precio
 *
 * Las operaciones que debe realizar son:
 *
 * - prestar: pone prestado a true, solo se puede prestar si esta disponible. El
 * atributo vecesPrestado aumentará en uno.
 *
 * - devolver: pone prestado a false, solo se puede devolver si esta prestado.
 *
 * Crea la clase Prestamo que implemente la interfaz Prestable.
 *
 * Se define por los siguientes atributos:
 *
 * - cantidad
 *
 * - adeudo
 *
 * - titular
 *
 * Encapsula los atributos cantidad y titular
 *
 * Crea un constructor que pida la cantidad y el titular
 *
 * Las operaciones que debe realizar son:
 *
 * - prestar: presta el valor del atributo cantidad al titular, mostrará un
 * mensaje indicándolo. Incrementa el adeudo con un 5% de interés.
 *
 * - devolver: devuelve el valor del atributo cantidad al titular, mostrará un
 * mensaje indicándolo. El adeudo se reducirá, el adeudo no puede ser negativo,
 * por lo que se quedara en cero en ese caso.
 */
public class App {

    public static void main(String[] args) {

        Videojuego v = new Videojuego("Super mario", 60);

        v.prestar();
        v.devolver();
        v.prestar();
        v.devolver();
        v.prestar();
        v.devolver();

        Prestamo p = new Prestamo(500, "Fernando");
        
        p.prestar();
        p.prestar();
        p.prestar();
        
        p.devolver();
        p.devolver();
        p.prestar();
        p.devolver();
        p.devolver();
        p.devolver();

    }
}
