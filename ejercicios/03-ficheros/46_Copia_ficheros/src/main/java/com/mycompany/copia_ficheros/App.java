package com.mycompany.copia_ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Pide una ruta de origen de un fichero.

    Debe cumplir los siguientes requisitos:

        - Debe existir
        - Debe ser un fichero
        - Debe tener alguna de las siguientes extensiones:
            - jpg
            - png
            - mp3
            - mp4

    Tambien debes pedir la ruta donde almacenarlo.

    Debe cumplir los siguientes requisitos:

        - Debe existir
        - Debe ser un directorio

    Copia el fichero de origen al destino.

    Muestra un porcentaje del progreso de la copia.

 */
public class App {

    public static void main(String[] args) {

        try {
            // Definimos las extensiones
            String[] extensiones = {"jpg", "png", "mp3", "mp4"};
            // Pedimos el fichero de origen
            Path origen = pedirFicheroOrigen(extensiones);

            // Pedimos el directorio de destino
            Path destino = pedirDirectorioDestino();

            // Copiamos el fichero
            copiarFichero(origen, destino);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Path pedirFicheroOrigen(String[] extensiones) throws FileNotFoundException, IOException {

        // Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        // Pedimos una ruta al usuario
        System.out.println("Introduce la ruta del fichero");
        String ruta = sn.next();

        // obtenemos la ruta
        Path path = Paths.get(ruta);

        // Comprobamos si existe
        if (!Files.exists(path)) {
            throw new FileNotFoundException("No existe el fichero");
        }

        // Comprobamos si es un fichero
        if (!Files.isRegularFile(path)) {
            throw new IOException("No es un fichero");
        }

        // Comprobamos las extensiones (si hay)
        if (extensiones != null && extensiones.length > 0) {

            boolean extensionEncontrada = false;
            for (int i = 0; i < extensiones.length && !extensionEncontrada; i++) {
                if (path.toString().endsWith(extensiones[i])) {
                    extensionEncontrada = true;
                }
            }

            if (!extensionEncontrada) {
                throw new IOException("La extension no es correcta");
            }

        }

        return path;

    }

    public static Path pedirDirectorioDestino() throws FileNotFoundException, IOException {

        // Scanner para pedir datos
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        // Pedimos una ruta al usuario
        System.out.println("Introduce la ruta del directorio");
        String ruta = sn.next();

        // obtenemos la ruta
        Path path = Paths.get(ruta);

        // Comprobamos si existe
        if (!Files.exists(path)) {
            throw new FileNotFoundException("No existe el directorio");
        }

        // Comprobamos si es un directorio
        if (!Files.isDirectory(path)) {
            throw new IOException("No es un directorio");
        }

        return path;

    }

    public static void copiarFichero(Path origen, Path destino) throws FileNotFoundException, IOException {

        // Formamos el path final
        Path destinoFinal = Paths.get(destino.toString(), origen.getFileName().toString());

        // Creamos una instancia de FileInputStream y FileOutputStream
        try (FileInputStream fis = new FileInputStream(origen.toString()); FileOutputStream fos = new FileOutputStream(destinoFinal.toString())) {

            // Bytes a copiar
            byte[] bytes = new byte[4096];
            // numero de bytes copiados
            int numBytes;
            // total de bytes iniciales
            int totalBytes = fis.available();
            // Progreso de la copia
            double progreso;
            // Bytes que llevamos leidos
            int byteLeidos = 0;
            while ((numBytes = fis.read(bytes)) != -1) {
                // Escribo en el fichero destino
                fos.write(bytes, 0, numBytes);
                // Acumulo los bytes leidos
                byteLeidos += numBytes;
                // Calculo el progreso actual
                progreso = (double) (byteLeidos * 100) / totalBytes;
                // Muestro el progreso
                System.out.printf("Progreso: %.2f / 100%% \n", progreso);
            }

            System.out.println("Se ha copiado el fichero");

        }

    }

}
