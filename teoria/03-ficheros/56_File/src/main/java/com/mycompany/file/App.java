package com.mycompany.file;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        try {
            // Creamos el directorio
            File directorio = new File("ficheros");
            // Creamos el fichero dentro del directorio
            File fichero = new File(directorio, "example.txt");

            // Creo el directorio
            directorio.mkdir();
            // Creo el fichero
            fichero.createNewFile();

            // Compruebo si existen el directorio y el fichero
            System.out.println("¿Existe el directorio " + directorio.getName() + " ? " + directorio.exists());
            System.out.println("¿Existe el fichero " + fichero.getName() + " ? " + fichero.exists());

            // Bytes que tiene el fichero
            System.out.println("Bytes del fichero " + fichero.length());

            // Listamos SOLO los ficheros que hay dentro del directorio
            System.out.println("Ficheros dentro de " + directorio.getName());
            for (String nombreFichero : directorio.list()) {
                File ficheroPrueba = new File(directorio, nombreFichero);
                if (ficheroPrueba.isFile()) {
                    System.out.println(nombreFichero);
                }
            }
            
            // Borramos el fichero
            fichero.delete();
            // Borramos el diretorio (solo si esta vacio)
            directorio.delete();

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
