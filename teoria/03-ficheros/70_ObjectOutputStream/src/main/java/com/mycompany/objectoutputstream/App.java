package com.mycompany.objectoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        // Creamos una instancia de ObjectOutputStream
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.ser"))) {

            // Instanciamos objetos de Usuario
            Usuario us1 = new Usuario(1, "test@gmail.com", "123456");
            Usuario us2 = new Usuario(2, "test2@gmail.com", "1234567");
            Usuario us3 = new Usuario(3, "test3@gmail.com", "12345678");

            // Escribimos en el fichero
            oos.writeObject(us1);
            oos.writeObject(us2);
            oos.writeObject(us3);
            
            System.out.println("Se ha escrito en el fichero");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
