package com.mycompany.fileoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("gatito.jpg");
                FileOutputStream fos = new FileOutputStream("gatito-copia.jpg")) {

            // Bytes a leer
            byte[] bytes = new byte[1024];

            // Numero de bytes leidos
            int numBytes;
            // Leer fichero
            while ((numBytes = fis.read(bytes)) != -1) {
                // Escribir fichero
                fos.write(bytes, 0, numBytes);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
