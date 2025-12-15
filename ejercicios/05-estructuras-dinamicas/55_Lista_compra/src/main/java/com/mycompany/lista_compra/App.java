package com.mycompany.lista_compra;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Gestionar una lista de productos en un sistema de compras.
 *
 * Se podra hacer lo siguiente:
 *
 * 1. Añadir producto: El sistema debe permitir al usuario elegir entre tres
 * productos predefinidos:
 *
 * Camiseta (20.5€)
 *
 * Pantalón (30€)
 *
 * Zapatos (50€)
 *
 * 2. Mostrar productos: El sistema debe mostrar todos los productos añadidos
 * hasta el momento, mostrando su nombre y precio. Muestra el total
 *
 * 3. Eliminar producto: El sistema debe permitir al usuario elegir un producto
 * de la lista para eliminarlo, solicitando al usuario que ingrese el número del
 * producto que desea eliminar.
 *
 * 4. Eliminar todos los productos: El sistema debe permitir limpiar la lista de
 * productos, eliminando todos los productos almacenados.
 *
 * 5. Salir: El sistema debe permitir al usuario salir del programa.
 *
 *
 */
public class App {

    public static void main(String[] args) {

        // Creamos una lista de productos
        ArrayList<Producto> productos = new ArrayList<>();

        Scanner sn = new Scanner(System.in);

        boolean salir = false;
        int opcion;

        // Menu
        while (!salir) {

            try {
                // opciones
                System.out.println("1. Añadir producto");
                System.out.println("2. Mostrar productos");
                System.out.println("3. Eliminar producto");
                System.out.println("4. Eliminar todos los productos");
                System.out.println("5. Salir");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1 -> {
                        // submenu
                        System.out.println("1. Camiseta (20.5€)");
                        System.out.println("2. Pantalón (30€)");
                        System.out.println("3. Zapatos (50€)");
                        opcion = sn.nextInt();

                        Producto producto = null;

                        switch (opcion) {
                            case 1 -> {
                                producto = new Producto("Camiseta", 20.5);
                            }
                            case 2 -> {
                                producto = new Producto("Pantalón", 30);
                            }
                            case 3 -> {
                                producto = new Producto("Zapatos", 50);
                            }
                        }

                        // Si se ha elegido correctamente un producto, lo añadimos
                        if (producto != null) {
                            productos.add(producto);
                            System.out.println("Se ha añadido un producto: " + producto.getNombre());
                        } else {
                            System.out.println("No se ha seleccionado un producto");
                        }

                    }
                    case 2 -> {
                        if (productos.isEmpty()) {
                            System.out.println("No hay productos");
                        } else {
                            double total = 0;
                            // recorremos los productos
                            for (Producto producto : productos) {
                                System.out.println(producto);
                                total += producto.getPrecio();
                            }
                            // mostramos el total
                            System.out.println("Total: " + total);
                        }
                    }
                    case 3 -> {
                        if (productos.isEmpty()) {
                            System.out.println("No hay productos");
                        } else {
                            // Mostramos los productos que tenemos para elegir cual eliminar
                            for (int i = 0; i < productos.size(); i++) {
                                Producto producto = productos.get(i);
                                System.out.println((i + 1) + ". " + producto.getNombre());
                            }
                            int productoEliminar = sn.nextInt();

                            // Si el indice es correcto, lo eliminamos
                            if (productoEliminar >= 1 && productoEliminar <= productos.size()) {
                                Producto productoEliminado = productos.remove(productoEliminar - 1);
                                System.out.println("Producto eliminado: " + productoEliminado.getNombre());
                            } else {
                                System.out.println("Producto fuera de indice");
                            }

                        }
                    }
                    case 4 -> {
                        if (productos.isEmpty()) {
                            System.out.println("No hay productos");
                        } else {
                            // reseteamos la lista
                            productos.clear();
                            System.out.println("Lista de productos vaciada");
                        }
                    }
                    case 5 -> salir = true;
                    default -> System.out.println("Debes elegir una opción entre 1 y 5");
                }

            } catch (InputMismatchException e) {
                sn.next();
                System.out.println("Solo se pueden introducir números");
            }

        }

    }
}
