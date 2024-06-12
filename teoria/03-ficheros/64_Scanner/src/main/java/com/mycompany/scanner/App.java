package com.mycompany.scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        Path path = Paths.get("example.txt");

        // Creamos una instancia de PrintWriter y de Scanner
        try (PrintWriter pw = new PrintWriter(new FileWriter(path.toString())); Scanner sn = new Scanner(path)) {

            // Escribimos un texto sin salto de linea
            pw.print("Linea 1");
            // Escribimos un salto de linea
            pw.println();
            // Escribimos un texto con salto de linea
            pw.println("Linea 2");
            // Escribimos un texto al final del fichero, es combinabinable
            pw.append("Linea 3").append("Linea 4").println();
            // Escribimos un texto formato
            pw.printf("Numero %d Real %.2f", 10, 50.5);

            // Recargo el contenido
            pw.flush();

            // Leemos mientras haya lineas
            while (sn.hasNext()) {
                System.out.println(sn.nextLine());
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
