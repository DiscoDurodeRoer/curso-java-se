package com.mycompany.gestion_productos_v1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Vamos a gestionar una serie de productos serializados.

    Crea la clase Producto con los siguientes atributos:

    - id (int)
    - nombre (String)
    - precio (float)

    Dentro del fichero, vamos a tener un array de productos de 10 elementos.

    Crea un menu con las siguientes opciones:

    - Guardar producto: guarda un producto en el fichero si hay espacio en el array
    - Mostrar productos: muestra todos los prodcutos del fichero
    - Borrar fichero: borra el fichero de los productos
    - Salir: sale de la aplicación
 */
public class App {

    public static void main(String[] args) {

        // Creo un scanner para pedir datos al usuario
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        sn.useLocale(Locale.US);

        boolean salir = false;
        int opcion;

        // Creo un path
        Path path = Paths.get("productos.ser");

        while (!salir) {

            try {
                System.out.println("1. Guardar producto");
                System.out.println("2. Mostrar productos");
                System.out.println("3. Borrar el fichero");
                System.out.println("4. Salir");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1 -> {

                        // Pido los datos de un producto
                        System.out.println("Introduce un id");
                        int id = sn.nextInt();

                        System.out.println("Introduce un nombre");
                        String nombre = sn.next();

                        System.out.println("Introduce un precio");
                        float precio = sn.nextFloat();

                        // Creo un producto
                        Producto producto = new Producto(id, nombre, precio);

                        guardarProducto(path, producto);
                    }
                    case 2 -> {
                        mostrarProductos(path);
                    }
                    case 3 -> {
                        // Borro el fichero
                        Files.delete(path);
                        System.out.println("Se ha borrado el fichero");
                    }
                    case 4 -> {
                        salir = true;
                    }
                    default -> {
                        System.out.println("Debes escribir un numero entre 1 y 4");
                    }
                }
            } catch (InputMismatchException e) {
                sn.next();
                System.out.println("Debes introducir un numero");
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public static void guardarProducto(Path path, Producto producto) throws FileNotFoundException, IOException, ClassNotFoundException {

        Producto[] productos;
        boolean sePuedeInsertar = false;
        // El fichero no existe
        if (!Files.exists(path)) {
            productos = new Producto[10];
            // Primer valor es el producto
            productos[0] = producto;
            sePuedeInsertar = true;
        } else {

            // Leo el fichero 
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.toString()))) {

                // Obtengo el array
                productos = (Producto[]) ois.readObject();

                // Busco la primera posicion libre
                for (int i = 0; i < productos.length && !sePuedeInsertar; i++) {
                    if (productos[i] == null) {
                        productos[i] = producto;
                        sePuedeInsertar = true;
                    }
                }
            }

        }

        // Si hemos insertado el producto, guardamos en el fichero
        if (sePuedeInsertar) {
            // escribimos en el fichero el array de productos
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.toString()))) {
                oos.writeObject(productos);
                System.out.println("Se ha insertado el producto");
            }
        } else {
            System.out.println("No se puede insertar");
        }

    }

    public static void mostrarProductos(Path path) throws FileNotFoundException, IOException, ClassNotFoundException {

        // Leo el fichero
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.toString()))) {

            // Obtengo el array de productos
            Producto[] productos = (Producto[]) ois.readObject();

            // Recorro el fichero de productos
            for (int i = 0; i < productos.length; i++) {
                if (productos[i] != null) {
                    System.out.println(productos[i]);
                }
            }

        }

    }

}
