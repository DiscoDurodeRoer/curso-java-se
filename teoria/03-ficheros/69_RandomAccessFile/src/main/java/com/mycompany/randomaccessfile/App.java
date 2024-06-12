package com.mycompany.randomaccessfile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        // Creo una instancia de RandomAccessFile en modo lectura/escritura
        try (RandomAccessFile raf = new RandomAccessFile("example.dat", "rw")) {

            // Si queremos agregar datos al final del fichero
            // raf.seek(raf.length());

            // Escribo los registros
            raf.writeUTF(String.format("%-10.10s", "Fernando"));
            raf.writeInt(10);
            raf.writeDouble(10.5);
            raf.writeBoolean(true);

            raf.writeUTF(String.format("%-10.10s", "Manuel"));
            raf.writeInt(20);
            raf.writeDouble(30.5);
            raf.writeBoolean(false);

            raf.writeUTF(String.format("%-10.10s", "Alberto"));
            raf.writeInt(30);
            raf.writeDouble(20.5);
            raf.writeBoolean(true);

            raf.writeUTF(String.format("%-10.10s", "Ricardo"));
            raf.writeInt(40);
            raf.writeDouble(50.5);
            raf.writeBoolean(false);

            // Numero de bytes de cada registro
            long salto = (2 + 10) + Integer.BYTES + Double.BYTES + 1;

            int registro = 3;
            System.out.println("Solo el registro: " + registro);
            // Nos posicionamos al principio de un registro
            raf.seek(salto * (registro - 1));

            // Leemos ese registro
            System.out.println(raf.readUTF());
            System.out.println(raf.readInt() + "");
            System.out.println(raf.readDouble());
            System.out.println(raf.readBoolean());

            // Leemos todos los registros
            System.out.println("Todos los registros");
            // Nos posicionamos al principio
            raf.seek(0);
            // getFilePointer nos indica en que byte esta posicionado
            while (raf.getFilePointer() < raf.length()) {
                System.out.println(raf.readUTF());
                System.out.println(raf.readInt() + "");
                System.out.println(raf.readDouble());
                System.out.println(raf.readBoolean());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
