package com.mycompany.dataoutputstream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        // Crea una instancia de dataoutputstream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("example.dat"))) {
            
            // Escribo una cadena de 10 caracteres
            // Si faltan caracteres, le añadira espacios
            // Si se pasan de caracteres, cortará la cadena
            dos.writeUTF(String.format("%-10.10s", "Fernando"));
            // Escribo un numero
            dos.writeInt(34);
            // Escribo un double
            dos.writeDouble(72.5);
            // Escribo un boolean
            dos.writeBoolean(true);
            
            dos.writeUTF(String.format("%-10.10s", "Manuel"));
            dos.writeInt(30);
            dos.writeDouble(60.5);
            dos.writeBoolean(false);
            
            System.out.println("Se ha escrito el fichero");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
