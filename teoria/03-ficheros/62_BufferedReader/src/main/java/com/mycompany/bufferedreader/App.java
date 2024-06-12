package com.mycompany.bufferedreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        // Creamos el bufferedwriter y el bufferedreader
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt")); BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {

            // Escribimos una linea
            bw.write("Linea 1");
            // Salto de linea
            bw.newLine();
            // Escribimos una linea
            bw.write("Linea 2");
            // Salto de linea
            bw.newLine();

            // Recargamos el fichero
            bw.flush();

            // leemos el fichero linea a linea
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
