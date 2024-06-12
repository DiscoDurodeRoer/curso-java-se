package com.mycompany.filereader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        // Declaramos las variables necesarias
        FileWriter fw = null;
        FileReader fr = null;
        try {
           // Abrimos el fichero, sino existe lo crea
            fw = new FileWriter("example.txt");
            // Abrimos el fichero, debe existir para poder leerlo
            fr = new FileReader("example.txt");

            // escribimos en el fichero
            fw.write("Linea 1 \r\n");
            fw.write("Linea 2 \r\n");

            // Recargamos el contenido
            fw.flush();

            // Leemos el fichero
            int valor;
            while ((valor = fr.read()) != -1) {
                System.out.print((char) valor);
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                // Cerramos
                if (fw != null) {
                    fw.close();
                }
                 if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
