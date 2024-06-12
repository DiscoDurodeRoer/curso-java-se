package com.mycompany.gestion_productos_v2;

import java.io.EOFException;
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

    Puedes insertar tantos productos como quieras. Los productos debe ser 
    independientes dentro del fichero (sin arrays)

    Crea un menu con las siguientes opciones:

    - Guardar producto: guarda un producto en el fichero
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
            } catch (EOFException ex) {
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public static void guardarProducto(Path path, Producto producto) throws FileNotFoundException, IOException, ClassNotFoundException {

        // Si el fichero no existe, creamos el fichero con ObjectOutputStream para que cree la cabecera
        if (!Files.exists(path)) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.toString()))) {
                oos.writeObject(producto);
            }
        } else {
            // Si el fichero existe, creamos el fichero con MyObjectOutputStream  para que no cree la cabecera
            try (MyObjectOutputStream oos = new MyObjectOutputStream(new FileOutputStream(path.toString(), true))) {
                oos.writeObject(producto);
            }
        }

    }

    public static void mostrarProductos(Path path) throws FileNotFoundException, IOException, ClassNotFoundException {

        // Leo el fichero
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.toString()))) {

            // Recorro hasta que salte la excepcion EOFException
            while (true) {
                Producto producto = (Producto) ois.readObject();
                System.out.println(producto);
            }

        }

    }

}
