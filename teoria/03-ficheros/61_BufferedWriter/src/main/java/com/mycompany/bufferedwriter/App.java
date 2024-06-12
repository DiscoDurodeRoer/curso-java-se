package com.mycompany.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        // Creamos un bufferedwriter, necesita un filewriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
           
            // escribe una linea
            bw.write("Linea 1");
            // Salto de linea
            bw.newLine();
            // escribe una linea
            bw.write("Linea 2");
            // Salto de linea
            bw.newLine();
            
            System.out.println("Se ha escrito en el fichero");
            
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
