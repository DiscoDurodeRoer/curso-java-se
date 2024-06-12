package com.mycompany.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        try {
            // Creo el path oara un directorio
            Path directorio = Paths.get("ficheros");
            // Creo el path para un fichero
            Path fichero = Paths.get(directorio.toString(), "example.txt");

            // Creo el directorio en el sistema de archivos
            Files.createDirectory(directorio);
            // Creo el fichero en el sistema de archivos
            Files.createFile(fichero);

            // Indico si existe el directorio
            System.out.println("¿Existe el directorio " + directorio.toString() + " ? " + Files.exists(directorio));
            // Indico si existe el fichero
            System.out.println("¿Existe el fichero " + fichero.toString() + " ? " + Files.exists(fichero));

            // Indicamos el tamaño del fichero
            System.out.println("Bytes de un fichero " + Files.size(fichero));

            // Mostramos el contenido del directorio
            for (Path path : Files.newDirectoryStream(directorio)) {
                // Solo ficheros
                if (Files.isRegularFile(path)) {
                    System.out.println(path.getFileName().toString());
                }
            }

            // Borramos el fichero
            Files.delete(fichero);
            // Borramos el directorio
            Files.delete(directorio);

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
