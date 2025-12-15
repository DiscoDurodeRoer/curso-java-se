package com.mycompany.categorias_productos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Vamos a gestionar una serie de productos por categorias
 *
 * Tenemos 3 categorias: ropa, electrodomesticos y alimentos
 *
 * Las acciones que se pueden realizar son:
 *
 * 1. Agregar producto a una categoría: Pedimos una categoria, pedimos los datos
 * de un producto y añadimos
 *
 * 2. Mostrar productos por categoría: Pedimos una categoria y mostramos los
 * productos de esa categoria
 *
 * 3. Eliminar producto de una categoría: Pedimos una categoria, elegimos uno de
 * los productos y lo eliminamos
 *
 * 4. Mostrar categorias
 *
 * 5. Mostrar el numero de productos por categorias
 *
 */
public class App {

    public static void main(String[] args) {

        // Creamos el mapa de las categorias de productos
        HashMap<String, ArrayList<Producto>> categorias = new HashMap<>();

        // Creamos las categorias vacias
        categorias.put("ropa", new ArrayList<>());
        categorias.put("electrodomesticos", new ArrayList<>());
        categorias.put("alimentos", new ArrayList<>());

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        boolean salir = false;
        int opcion;

        // menu
        while (!salir) {

            try {
                // opciones
                System.out.println("1. Agregar producto a una categoría");
                System.out.println("2. Mostrar productos por categoría");
                System.out.println("3. Eliminar producto de una categoría");
                System.out.println("4. Mostrar categorias");
                System.out.println("5. Mostrar el numero de productos por categorias");
                System.out.println("6. Salir");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1 -> {

                        // Pedimos una categoria
                        System.out.println("Escribe una categoria");
                        String categoria = sn.next();

                        // Comprobamos si existe
                        if (categorias.containsKey(categoria)) {

                            // Creamos un producto
                            System.out.println("Nombre del producto");
                            String nombre = sn.next();

                            System.out.println("Precio del producto");
                            double precio = sn.nextDouble();

                            Producto producto = new Producto(nombre, precio);

                            // añadimos el producto a la lista de la categoria
                            categorias.get(categoria).add(producto);
                            System.out.println("se ha añadido el producto a la categoria");
                        } else {
                            System.out.println("La categoria no existe");
                        }

                    }
                    case 2 -> {

                        // Pedimos una categoria
                        System.out.println("Escribe una categoria");
                        String categoria = sn.next();

                        // Comprobamos si existe
                        if (categorias.containsKey(categoria)) {

                            if (categorias.get(categoria).isEmpty()) {
                                System.out.println("No hay productos en la categoria");
                            } else {
                                // Recorremos los productos de esa categoria
                                for (Producto producto : categorias.get(categoria)) {
                                    System.out.println(producto);
                                }
                            }

                        } else {
                            System.out.println("La categoria no existe");
                        }

                    }
                    case 3 -> {

                        // Pedimos una categoria
                        System.out.println("Escribe una categoria");
                        String categoria = sn.next();

                        // Comprobamos si existe
                        if (categorias.containsKey(categoria)) {
                            if (categorias.get(categoria).isEmpty()) {
                                System.out.println("No hay productos en la categoria");
                            } else {
                                // Mostramos los productos de la categoria para elegir cual eliminar
                                System.out.println("Productos disponibles:");
                                ArrayList<Producto> productos = categorias.get(categoria);
                                for (int i = 0; i < productos.size(); i++) {
                                    Producto producto = productos.get(i);
                                    System.out.println((i + 1) + ". " + producto.getNombre());
                                }
                                System.out.println("Elige el producto a eliminar: ");
                                int productoEliminar = sn.nextInt();

                                // Si el indice es correcto, lo eliminamos 
                                if (productoEliminar >= 1 && productoEliminar <= productos.size()) {
                                    Producto productoEliminado = productos.remove(productoEliminar - 1);
                                    System.out.println("Se ha eliminado el producto " + productoEliminado.getNombre());
                                } else {
                                    System.out.println("Indice fuera de rango");
                                }

                            }

                        } else {
                            System.out.println("La categoria no existe");
                        }

                    }

                    case 4 -> {

                        if (categorias.isEmpty()) {
                            System.out.println("No hay categorias");
                        } else {
                            // Mostramos las categorias usando keySet
                            for (String categoria : categorias.keySet()) {
                                System.out.println(categoria);
                            }
                        }

                    }
                    case 5 -> {
                        if (categorias.isEmpty()) {
                            System.out.println("No hay categorias");
                        } else {
                            // Mostramos las categorias y la cantidad de productos usando entry
                            for (Entry<String, ArrayList<Producto>> entry : categorias.entrySet()) {
                                System.out.println("La categoria " + entry.getKey() + " tiene " + entry.getValue().size() + " producto/s");
                            }
                        }
                    }
                    case 6 ->
                        salir = true;
                    default ->
                        System.out.println("Solo numeros entre 1 y 6");

                }

            } catch (InputMismatchException e) {
                sn.next();
                System.out.println("Solo valores numericos");
            }

        }

    }
}
