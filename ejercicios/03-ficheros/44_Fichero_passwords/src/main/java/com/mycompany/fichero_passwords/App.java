package com.mycompany.fichero_passwords;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Escribe un fichero de 20 lineas donde cada linea sera un password aleatorio.

    El password sera de 8 caracteres combinando letras mayusculas, minusculas
    y numeros.

    Despues, obten una fila aleatoria y obten un password.

    Si el fichero existe y es valido (tiene al menos 20 lineas) no lo
    generaremos de nuevo.
 */
public class App {

    public static void main(String[] args) {

        // Creamos el path
        Path path = Paths.get("passwords.txt");
        try {
            // Comprobamos si existe el fichero
            if (!Files.exists(path)) {
                generaFicheroPassword(path);
                // Comprobamos si el fichero es valido
            } else if (!validaFicheroLineas(path, 20)) {
                generaFicheroPassword(path);
            }

            // Generamos una fila aleatoria entre 1 y 20
            Random random = new Random();
            int filaAleatoria = random.nextInt(1, 21);

            // Obtenemos la fila aleatoria
            String password = obtenerLinea(path, filaAleatoria);

            // Mostramos el password
            System.out.println("El password (linea " + filaAleatoria + ") es " + password);

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void generaFicheroPassword(Path path) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.toString()))) {

            for (int i = 0; i < 20; i++) {
                // Genera un password
                String password = generaPassword(8);
                // Lo guardo en el fichero
                bw.write(password);
                bw.newLine();
            }

        }

    }

    public static boolean validaFicheroLineas(Path path, int numLineas) throws FileNotFoundException, IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(path.toString()))) {

            String linea = "";
            int contadorLineas = 0;
            // recorremos hasta el numero de lineas
            for (int i = 0; i < numLineas && linea != null; i++) {
                linea = br.readLine();
                contadorLineas++;
            }

            // Si coincide, tiene al menos ese numero de lineas
            return contadorLineas == numLineas;

        }
    }

    public static String generaPassword(int longitud) {

        String password = "";

        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            // Generamos un numero entre 1 y 3
            int tipo = random.nextInt(1, 4);
            switch (tipo) {
                case 1 -> { // Minusculas
                    password += (char) random.nextInt('a', 'z');
                }
                case 2 -> { // Mayusculas
                    password += (char) random.nextInt('A', 'Z');
                }
                case 3 -> { // Numeros
                    password += random.nextInt(0, 10);
                }
            }

        }

        return password;

    }

    public static String obtenerLinea(Path path, int numLinea) throws FileNotFoundException, IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(path.toString()))) {

            String linea = "";
            // Leemos hasta la linea buscada
            for (int i = 0; i < numLinea && linea != null; i++) {
                linea = br.readLine();
            }

            return linea;

        }

    }

}
