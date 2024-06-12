package com.mycompany._try_resources;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        // try resources, todo lo declarado se cerrar automaticamente
        try (FileWriter fw = new FileWriter("example.txt"); 
                FileReader fr = new FileReader("example.txt")) {

            // Escribimos en el fichero
            fw.write("Linea 1 \r\n");
            fw.write("Linea 2 \r\n");

            // Recargamos el contenido
            fw.flush();

            // leemos el fichero
            int valor;
            while ((valor = fr.read()) != -1) {
                System.out.print((char) valor);
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
