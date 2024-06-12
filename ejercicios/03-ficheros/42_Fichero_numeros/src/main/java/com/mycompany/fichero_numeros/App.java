package com.mycompany.fichero_numeros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Pide un número positivo por teclado. 

    Escribe en el fichero numeros.txt los numeros del 1 al número introducido.

    Despues, lee el fichero y muestra su contenido.

 */
public class App {

    public static void main(String[] args) {

        // Scanner para pedir por teclado
        Scanner sn = new Scanner(System.in);

        // Pedimos y validamos un numero positivo
        int numero = 0;
        do {

            try {
                System.out.println("Introduce un numero positivo");
                numero = sn.nextInt();

                if (numero < 0) {
                    System.out.println("El numero debe ser positivo");
                }
            } catch (InputMismatchException e) {
                sn.next();
                System.out.println("Debes escribir un numero");
            }

        } while (numero <= 0);

        // 
        File fichero = new File("numeros.txt");

        // Abrimos el fichero para escribir y leer, se cierran automaticamente
        try (FileWriter fw = new FileWriter(fichero); FileReader fr = new FileReader(fichero)) {

            // Escribimos de 1 al numero insertado
            for (int i = 1; i <= numero; i++) {
                fw.write(i + "\r\n");
            }

            // Recargamos
            fw.flush();

            // Leemos el fichero
            int valor;
            while ((valor = fr.read()) != -1) {
                System.out.print((char) valor);
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
