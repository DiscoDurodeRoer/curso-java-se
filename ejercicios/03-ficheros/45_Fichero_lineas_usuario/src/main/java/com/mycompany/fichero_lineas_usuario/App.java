package com.mycompany.fichero_lineas_usuario;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Usa un Scanner para pedir lineas de texto al usuario y
    guardalas con un PrintWriter.

    Si ya tiene contenido, se lo añadiremos al final.

    Lee el fichero resultante con otro Scanner
 */
public class App {

    public static void main(String[] args) {

        // Scanner para pedir datos al usuario
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        Path path = Paths.get("lineas-usuario.txt");

        // Creo una instancia de PrintWriter para escribir y Scanner para leer
        try (PrintWriter pw = new PrintWriter(new FileWriter(path.toString(), true)); Scanner snFichero = new Scanner(path)) {

            boolean continuar;
            String linea;
            do {

                // Pedimos una linea
                System.out.println("Introduce una linea");
                linea = sn.next();

                // Escribimos la linea
                pw.println(linea);

                // Preguntamos si queremos continuar
                System.out.println("¿quieres continuar? Y/N");
                continuar = sn.next().toUpperCase().charAt(0) == 'Y';

            } while (continuar);

            // Recargamos el contenido
            pw.flush();

            // Leemos el fichero
            while (snFichero.hasNext()) {
                System.out.println(snFichero.nextLine());
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
