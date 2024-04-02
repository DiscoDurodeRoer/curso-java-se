package com.mycompany.ordenador;

/**
 *
 * Crea una clase que represente a un ordenador.
 *
 * Un ordenador se define por:
 *
 * - Marca
 *
 * - Modelo
 *
 * - GB de RAM (Por defecto, 4GB)
 *
 * - Capacidad disco Duro en GB (Por defecto, 50GB)
 *
 * - Espacio utilizado en el disco duro
 *
 * - Estar o no encendido (por defecto esta apagado)
 *
 * La RAM debe ser potencia de 2, de lo contrario lanzaremos una excepcion
 *
 * Encapsula todos los atributos
 *
 * Tendra los siguientes constructores:
 *
 * - Vacio
 *
 * - Solo pidiendo la RAM
 *
 * - Solo pidiendo la RAM y la capacidad del disco duro
 *
 * - Pidiendo todos los atributos excepto el espacio utilizado y encendido
 *
 * Las operaciones que podra realizar son:
 *
 * - encender: Enciende el ordenador, haciendo que el atributo encendido este a
 * true
 *
 * - apagar: Enciende el ordenador, haciendo que el atributo encendido este a
 * false
 *
 * - transferir archivos: dado un numero de GB, se aumenta el espacio utilizado.
 * Si no cabe, se debera indicar. Solo se podra hacer si el ordenador esta
 * encendido.
 *
 * - eliminar archivos: dado un numero de GB, se elimina el espacio indicado, si
 * supera al espacio utilizado se quedara en 0. Solo se podra hacer si el
 * ordenador esta encendido.
 *
 * Un ordenador es igual a otro cuando tienen la misma marca y modelo.
 *
 * Muestra la informacion con toString
 *
 */
public class App {

    public static void main(String[] args) {

        // Creo una instancia de Ordenador
        Ordenador ordenador1 = new Ordenador("DELL", "XPS", 6, 50);

        // Muestro la informacion del ordenador
        System.out.println(ordenador1);

        // Encendemos el ordenador
        ordenador1.encender();

        // Encendemos el ordenador de nuevo, no nos deja
        ordenador1.encender();

        // Muestro la informacion del ordenador
        System.out.println(ordenador1);

        // Apagamos el ordenador
        ordenador1.apagar();

        // Encendemos el ordenador
        ordenador1.encender();

        // Muestro la informacion del ordenador
        System.out.println(ordenador1);

        // Transferimos 30GB
        ordenador1.transferirArchivos(30);

        // Transferimos 30GB, no nos deja, seguimos teniendo 30GB
        ordenador1.transferirArchivos(30);

        // eliminamos 20GB
        ordenador1.eliminarArchivos(20);

        // eliminamos 20GB, se queda en 0
        ordenador1.eliminarArchivos(20);

        // Creo una instancia de Ordenador
        Ordenador ordenador2 = new Ordenador("DELL", "XPSV2", 64, 50);

        // Indico si los ordenadores son iguales
        if (ordenador1.equals(ordenador2)) {
            System.out.println("Los ordenadores son iguales");
        } else {
            System.out.println("Los ordenadores no son iguales");
        }

    }
}
