package com.mycompany.gestion_personas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Vamos a gestionar una serie de personas.
    
    Cada registro tiene el siguiente formato:

    - Nombre: String de 10 caracteres 
    - Edad: int
    - Altura: float
    - Peso: float

    Pide una persona al iniciar el programa y guardalo al final del fichero.

    Antes de acabar debes mostrar:

    - El numero de personas que hay en el fichero
    - Media de edad
    - Nombre de la persona mas alta
    - Suma de todos los pesos

 */
public class App {

    public static void main(String[] args) {

        // Creamos un scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        sn.useLocale(Locale.US);

        // Creo una instancia de DataOutputStream y DataInputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("example.dat", true)); DataInputStream dis = new DataInputStream(new FileInputStream("example.dat"))) {

            // Pedimos los datos de la persona
            System.out.println("Introduce el nombre de la persona");
            String nombre = sn.next();

            System.out.println("Introduce la edad de la persona");
            int edad = sn.nextInt();

            System.out.println("Introduce la altura de la persona");
            float altura = sn.nextFloat();

            System.out.println("Introduce el peso de la persona");
            float peso = sn.nextFloat();

            // Escribimos la persona en el fichero
            dos.writeUTF(String.format("%-20.20s", nombre));
            dos.writeInt(edad);
            dos.writeFloat(altura);
            dos.writeFloat(peso);

            // Refrescamos el fichero
            dos.flush();

            // Variables necesarias
            int numPersonas = 0;
            float mediaEdad;
            int sumaEdades = 0;
            String personaMasAlta = "";
            float mayorAltura = 0;
            float sumaPesos = 0;

            // Recorremos el fichero
            while (dis.available() > 0) {

                nombre = dis.readUTF();

                edad = dis.readInt();

                // Suma de las edades
                sumaEdades += edad;

                altura = dis.readFloat();

                // Comprobamos si la nueva altura es mayor a la actual
                if (altura > mayorAltura) {
                    mayorAltura = altura;
                    personaMasAlta = nombre;
                }

                peso = dis.readFloat();

                sumaPesos += peso;

                // 1 persona mas
                numPersonas++;

            }

            // Calculamos la media de las edades
            mediaEdad = (float) sumaEdades / numPersonas;

            // Mostramos los datos
            System.out.println("Numero de personas: " + numPersonas);
            System.out.println("Media de edad: " + mediaEdad);
            System.out.println("Nombre de la persona mas alta (" + mayorAltura + "): " + personaMasAlta);
            System.out.println("Suma de los pesos: " + sumaPesos);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
