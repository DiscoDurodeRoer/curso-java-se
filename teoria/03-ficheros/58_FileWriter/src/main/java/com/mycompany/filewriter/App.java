package com.mycompany.filewriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {
        
        // Declaramos el filewriter
        FileWriter fw = null;
        try {
            // Abrimos el fichero, sino existe lo crea
            fw = new FileWriter("example.txt");

            // Escribimos en el fichero
            fw.write("Linea 1 \r\n");
            fw.write("Linea 2 \r\n");
           
            System.out.println("Se ha escrito en el fichero");

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fw != null) {
                    // Cerramos el fichero
                    fw.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
