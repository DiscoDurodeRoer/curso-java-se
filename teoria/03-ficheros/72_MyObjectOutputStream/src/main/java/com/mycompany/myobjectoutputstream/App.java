package com.mycompany.myobjectoutputstream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        // Creo una instancia de ObjectOutputStream
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.ser"))) {

            // Instancio algunos objetos de la clase Usuario
            Usuario us1 = new Usuario(1, "test@gmail.com", "123456");
            Usuario us2 = new Usuario(2, "test2@gmail.com", "1234567");
            Usuario us3 = new Usuario(3, "test3@gmail.com", "12345678");

            // escribo los objetos
            oos.writeObject(us1);
            oos.writeObject(us2);
            oos.writeObject(us3);

        } catch (EOFException ex) {
            System.out.println("Se ha terminado de leer");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Creo una instancia de MyObjectOutputStream y ObjectInputStream
        // Con MyObjectOutputStream no creo cabeceras
        try (MyObjectOutputStream moos = new MyObjectOutputStream(new FileOutputStream("users.ser", true)); ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.ser"))) {

            // Instancio algunos objetos de la clase Usuario
            Usuario us4 = new Usuario(4, "test4@gmail.com", "123456");
            Usuario us5 = new Usuario(5, "test5@gmail.com", "1234567");
            Usuario us6 = new Usuario(6, "test6@gmail.com", "12345678");

            // escribo los objetos, sin cabecera
            moos.writeObject(us4);
            moos.writeObject(us5);
            moos.writeObject(us6);

            moos.flush();

            // Leemos los objetos
            while (true) {
                Usuario u = (Usuario) ois.readObject();
                System.out.println(u);
            }

        } catch (EOFException ex) {
            System.out.println("Se ha terminado de leer");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
