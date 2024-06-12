package com.mycompany.datainputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        // Crea una instancia de dataoutputstream y datainputstream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("example.dat")); DataInputStream dis = new DataInputStream(new FileInputStream("example.dat"))) {

            // Escribo una cadena de 10 caracteres
            // Si faltan caracteres, le añadira espacios
            // Si se pasan de caracteres, cortará la cadena
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

            // Refresco los datos del fichero
            dos.flush();

            /*
            // numero de bytes de para cada registro
            // String, 2 bytes + 1 byte por cada caracter
            // Integer, 4 bytes
            // Double, 8 bytes
            // Boolean, 1 byte
            long salto = (2 + 10) + Integer.BYTES + Double.BYTES + 1;

            // Salto hasta el segundo registro
            dis.skip(salto);

            // Leo el registro
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            */
            
            // Leemos el fichero
            while (dis.available() > 0) {
                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
                System.out.println(dis.readDouble());
                System.out.println(dis.readBoolean());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
