package com.mycompany.html;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Genera un fichero index.html que contenga una etiqueta h1 con un hola mundo.

    Debe estar tabulado como un html.
 */
public class App {

    public static void main(String[] args) {

        // Obtenemos el path de index.html
        Path path = Paths.get("index.html");

        // Creamos le bufferedwriter para escribir
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.toString()))) {

            // Inicio HTML
            bw.write("<html>");
            bw.newLine();

            // Head
            bw.write("\t<head>");
            bw.newLine();
            bw.write("\t\t<title>Ejercicio 3</title>");
            bw.newLine();
            bw.write("\t</head>");
            bw.newLine();

            // Body
            bw.write("\t<body>");
            bw.newLine();
            bw.write("\t\t<h1>Hola mundo</h1>");
            bw.newLine();
            bw.write("\t</body>");
            bw.newLine();

            // Fin HTML
            bw.write("</html>");

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
