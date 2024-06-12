package com.mycompany.productos_raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Vamos a gestionar una serie de productos.
    
    Cada registro tiene el siguiente formato:

    - ID: int, este sera autoincrementado
    - Nombre: String de 20 caracteres
    - Precio: float
    - Descuento: boolean

    Crea un menu con las siguientes opciones:

    - Crear producto: Creamos un producto al final del fichero
    - Buscar producto: Pedimos un id y mostramos los datos de ese producto
    - Mostrar productos: Mostramos todos los productos
    - Salir: Salimos de la aplicación

 */
public class App {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        // Cada registro tiene 29 bytes
        long saltoBytes = Integer.BYTES + (2 + 20) + Float.BYTES + 1;
        // ruta del fichero
        Path path = Paths.get("productos.dat");
        
        while (!salir) {
            
            try {
                
                System.out.println("1. Crear producto");
                System.out.println("2. Buscar producto");
                System.out.println("3. Mostrar productos");
                System.out.println("4. Salir");
                opcion = sn.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        crearProducto(path, saltoBytes);
                    }
                    case 2 -> {
                        
                        // pedimos un id
                        System.out.println("Introduce el id de un producto");
                        int idProducto = sn.nextInt();
                        
                        buscarProducto(path, saltoBytes, idProducto);
                    }
                    case 3 -> {
                        mostrarProductos(path);
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
                System.out.println("Debes escribir un numero");
            } catch (IOException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public static void crearProducto(Path path, long saltoBytes) throws IOException {
        
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        sn.useLocale(Locale.US);
        
        // obtenemos el ultimo id
        int ultimoID = ultimoID(path, saltoBytes);
        
        System.out.println("Introduce el nombre del producto");
        String nombre = sn.next();
        
        System.out.println("Introduce el precio del producto");
        float precio = sn.nextFloat();
        
        System.out.println("Introduce si tiene descuento o no (true/false)");
        boolean descuento = sn.nextBoolean();
        
        try (RandomAccessFile raf = new RandomAccessFile(path.toString(), "rw")) {
            
            // Nos posicionamos al final para insertar el registro
            raf.seek(raf.length());
            
            // Escribimos el registro
            raf.writeInt(ultimoID + 1);
            raf.writeUTF(String.format("%-20.20s", nombre));
            raf.writeFloat(precio);
            raf.writeBoolean(descuento);
            
        }
        
    }
    
    public static void buscarProducto(Path path, long saltoBytes, int idProducto) throws IOException {
        
        try (RandomAccessFile raf = new RandomAccessFile(path.toString(), "rw")) {
            
            // Calculamos la posicionamos en el registro
            long posicion = saltoBytes * (idProducto - 1);
            
            // Comprobamos que la posicion es correcta
            if (posicion >= 0 && posicion < Files.size(path)) {
                
                // Nos poscionamos en el registro
                raf.seek(posicion);
                
                System.out.println("Id: " + raf.readInt());
                System.out.println("Nombre: " + raf.readUTF());
                System.out.println("Precio: " + raf.readFloat());
                System.out.println("¿Descuento?: " + raf.readBoolean());
                
            } else {
                System.out.println("El producto no existe");
            }
            
        }
        
    }
    
    public static void mostrarProductos(Path path) throws IOException {
        
        try (RandomAccessFile raf = new RandomAccessFile(path.toString(), "rw")) {
            
            // Recorremos el fichero
            while (raf.getFilePointer() < raf.length()) {
                System.out.println("Id: " + raf.readInt());
                System.out.println("Nombre: " + raf.readUTF());
                System.out.println("Precio: " + raf.readFloat());
                System.out.println("¿Descuento?: " + raf.readBoolean());
            }
            
        }
        
    }
    
    public static int ultimoID(Path path, long saltoBytes) throws IOException {
        
        try (RandomAccessFile raf = new RandomAccessFile(path.toString(), "rw")) {
            
            // Si el fichero no existe o esta vacio, no hay productos
            if (!Files.exists(path) || Files.size(path) == 0) {
                return 0;
            } else {
                // Nos posicionamos en el ultimo registro y cogemos el id
                raf.seek(Files.size(path) - saltoBytes);
                return raf.readInt();
            }
            
        }
        
    }
    
}
