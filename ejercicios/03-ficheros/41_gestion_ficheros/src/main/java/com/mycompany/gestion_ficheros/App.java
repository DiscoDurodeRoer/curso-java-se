package com.mycompany.gestion_ficheros;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Crea un directorio llamado pruebas.

    Crea 10 ficheros dentro del directorio pruebas con el siguiente formato:

    file-<numero>.txt donde <numero> se sustituira por el numero del fichero

    Lista los fichero dentro de la carpeta pruebas.

    Si el directorio pruebas existe, lo borraremos antes de empezar a crear.

    Puedes hacerlo con File o Path.
 */
public class App {

    public static void main(String[] args) {

        try {
            // Creo el path del directorio
            Path directorio = Paths.get("pruebas");

            // Si el fichero existe, lo borro
            if (Files.exists(directorio)) {

                // Borrado recursivo
                Files.walkFileTree(directorio, new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        Files.delete(file);
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                        Files.delete(dir);
                        return FileVisitResult.CONTINUE;
                    }
                });
                System.out.println("Directorio borrado");
            }

            //Creo el directorio en el sistema de archivos
            Files.createDirectory(directorio);
            System.out.println("Directorio creado");

            // Creo los ficheros dentro del directorio
            for (int i = 1; i <= 10; i++) {
                Path fichero = Paths.get(directorio.toString(), "file-" + i + ".txt");
                Files.createFile(fichero);
            }
            System.out.println("Ficheros creados");

            // Listamos los ficheros
            System.out.println("Listar ficheros");
            for (Path path : Files.newDirectoryStream(directorio)) {
                System.out.println(path.getFileName().toString());
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
