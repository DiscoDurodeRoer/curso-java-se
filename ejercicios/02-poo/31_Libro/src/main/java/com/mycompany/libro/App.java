package com.mycompany.libro;

/**
 * Realiza una clase que represente a un libro.
 *
 * Un libro se define por:
 *
 * - ISBN
 *
 * - titulo
 *
 * - numero de paginas
 *
 * - autor
 *
 * - prestado
 *
 * Debe tener un constructor vacio y otro por defecto.
 *
 * Encapsula todos sus atributos.
 *
 * Un libro puede realizar lo siguiente:
 *
 * - prestar: comprueba si esta o no prestado y pone el atributo prestado a
 * true.
 *
 * - devolver: comprueba si esta o no prestado y pone el atributo prestado a
 * false.
 *
 * - imprimir: dado un coste, calcularemos el coste de imprimir todas las
 * paginas del libro.
 *
 * Muestra la información de la siguiente manera:
 *
 * Cuando este prestado:
 *
 * El libro (<ISBN>) con titulo <titulo> y autor <autor> tiene <numero paginas>
 * paginas y esta prestado
 *
 * Cuando no este prestado:
 *
 * El libro (<ISBN>) con titulo <titulo> y autor <autor> tiene <numero paginas>
 * paginas y no esta prestado
 *
 * Un libro es igual a otro cuando sus ISBN son iguales
 *
 */
public class App {

    public static void main(String[] args) {

        // Creo una instancia de Libro
        Libro libro1 = new Libro("123456789", "Cien años de soledad", 500, "Gabriel Garcia Marquez", false);

        System.out.println(libro1);

        // Presto el libro
        libro1.prestar();

        // Muestro la informacion del libro
        System.out.println(libro1);

        // Devolvemos el libro
        libro1.devolver();

        // Devolvemos el libro de nuevo, no nos deja
        libro1.devolver();

        // Muestro la informacion del libro
        System.out.println(libro1);

        // Obtengo el coste de la impresión
        double costeImpresion = libro1.imprimir(0.05);

        System.out.println("El coste ha sido de " + costeImpresion + "€");

        // Creo una instancia de Libro
        Libro libro2 = new Libro("12345678", "Cinco años de soledad", 500, "Gabriel Garcia Marquez", false);

        // Indico si los libros son iguales
        if (libro1.equals(libro2)) {
            System.out.println("Los libros son iguales");
        } else {
            System.out.println("Los libros no son iguales");
        }

    }
}
