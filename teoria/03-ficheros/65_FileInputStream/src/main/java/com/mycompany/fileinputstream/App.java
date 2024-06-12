package com.mycompany.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        // Creamos una instancia de FileInputStream
        try (FileInputStream fis = new FileInputStream("gatito.jpg")) {

            byte[] bytes = new byte[1024];
            
            // Total de bytes disponibles
            System.out.println("Cantidad de bytes: " + fis.available());
            
            // Leemos el fichero
            int numBytes;
            while( (numBytes = fis.read(bytes)) != -1 ){
             
                // Mostramos el contenido
                System.out.println(new String(bytes));
                
                // Numero de bytes que se han leido
                System.out.println("Cantidad de bytes leidos " + numBytes);
                
                // Total de bytes restantes
                System.out.println("Cantidad de bytes restantes " + fis.available());
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
