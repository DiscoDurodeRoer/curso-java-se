package com.mycompany.lista_contactos;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Vamos a manejar una serie de contactos que contienen nombre y telefono.
 *
 * No pueden haber dos contactos repetidos.
 *
 * Un contacto es igual a otro cuando tienen el mismo nombre.
 *
 * Las acciones que se van a realizar son:
 *
 * Añadir contacto: Añade un contacto, indica si se añadido o no.
 *
 * Mostrar contactos: Muestra los contactos
 *
 * Mostrar contactos ordenados: Muestra los contactos ordenados por nombre sin
 * modificar el original
 *
 * Eliminar contacto: Pedimos un nombre y eliminamos un contacto
 *
 */
public class App {

    public static void main(String[] args) {

        // Creo una lista de contactos
        HashSet<Contacto> contactos = new HashSet<>();

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        boolean salir = false;
        int opcion;

        // menu
        while (!salir) {

            try {
                // opciones
                System.out.println("1. Añadir contacto");
                System.out.println("2. Mostrar contactos");
                System.out.println("3. Mostrar contactos ordenados");
                System.out.println("4. Eliminar contacto");
                System.out.println("5. Salir");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1 -> {

                        // Creo un contacto
                        System.out.println("Introduce un nombre");
                        String nombre = sn.next();

                        System.out.println("Introduce un telefono");
                        int telefono = sn.nextInt();

                        Contacto contacto = new Contacto(nombre, telefono);

                        // Sino existe, se añade
                        if (contactos.add(contacto)) {
                            System.out.println("Se ha añadido el contacto");
                        } else {
                            System.out.println("El contacto ya existe");
                        }

                    }
                    case 2 -> {
                        if (contactos.isEmpty()) {
                            System.out.println("No hay contactos");
                        } else {
                            // Recorremos los contactos
                            System.out.println("Lista de contactos:");
                            for (Contacto contacto : contactos) {
                                System.out.println(contacto);
                            }
                        }
                    }
                    case 3 -> {
                        if (contactos.isEmpty()) {
                            System.out.println("No hay contactos");
                        } else {
                            // Creamos un treeSet con la informacion que tenemos en el hashSet
                            TreeSet<Contacto> contactosOrdenados = new TreeSet<>(contactos);

                            // Recorremos los contactos ordenados
                            System.out.println("Lista de contactos ordenados:");
                            for (Contacto contacto : contactosOrdenados) {
                                System.out.println(contacto);
                            }
                        }
                    }
                    case 4 -> {

                        // Nombre del contacto a eliminar
                        System.out.println("Introduce el nombre del contacto a eliminar");
                        String nombre = sn.next();

                        // Creamos un contacto con ese nombre para que lo pueda buscar (gracias al equals de contacto)
                        Contacto contactoEliminar = new Contacto(nombre, 0);

                        // Elimina el contacto
                        if (contactos.remove(contactoEliminar)) {
                            System.out.println("El contacto ha sido eliminado");
                        } else {
                            System.out.println("El contacto no existe");
                        }

                    }
                    case 5 ->
                        salir = true;
                    default ->
                        System.out.println("Debes elegir una opcion entre 1 y 5");
                }

            } catch (InputMismatchException e) {
                sn.next();
                System.out.println("Solo valores numericos");
            }

        }

    }
}
