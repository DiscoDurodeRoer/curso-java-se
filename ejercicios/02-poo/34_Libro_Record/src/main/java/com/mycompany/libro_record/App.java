package com.mycompany.libro_record;

import java.util.Objects;

/**
 * Realiza el ejercicio 31 usando Record
 */
public class App {

    public static void main(String[] args) {

        // Creamos un record de Libro
        record Libro(String ISBN, String titulo, int numeroPaginas, String autor, boolean prestado) {

            // Constructores
            public Libro() {
                this("", "", 0, "", false);
            }

            // Metodos
            // Los atributos no se pueden modificar, por lo que devolvemos una nueva instancia
            public Libro prestar() {
                if (this.prestado) {
                    System.out.println("Este libro ya esta prestado");
                    return this;
                } else {
                    System.out.println("El libro se ha prestado");
                    return new Libro(ISBN, titulo, numeroPaginas, autor, true);
                }

            }

            // Los atributos no se pueden modificar, por lo que devolvemos una nueva instancia
            public Libro devolver() {
                if (!this.prestado) {
                    System.out.println("Este libro no esta prestado");
                    return this;
                } else {
                    System.out.println("El libro se ha devuelto");
                    return new Libro(ISBN, titulo, numeroPaginas, autor, false);
                }
            }

            public double imprimir(double coste) {
                return coste * this.numeroPaginas;
            }

            @Override
            public int hashCode() {
                int hash = 7;
                hash = 89 * hash + Objects.hashCode(this.ISBN);
                return hash;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                if (getClass() != obj.getClass()) {
                    return false;
                }
                final Libro other = (Libro) obj;
                return Objects.equals(this.ISBN, other.ISBN);
            }

            @Override
            public String toString() {

                String mensaje = "El libro " + this.ISBN + " con titulo " + this.titulo + " y autor " + this.autor + " tiene " + this.numeroPaginas + " paginas y ";

                if (!this.prestado) {
                    mensaje += " no ";
                }

                mensaje += "esta prestado";

                return mensaje;
            }

        }

        // Creo una instancia de Libro
        Libro libro1 = new Libro("123456789", "Cien años de soledad", 500, "Gabriel Garcia Marquez", false);

        // Muestro la informacion del libro
        System.out.println(libro1);

        // Presto el libro
        libro1 = libro1.prestar();

        // Muestro la informacion del libro
        System.out.println(libro1);

        // Devolvemos el libro
        libro1 = libro1.devolver();

        // Devolvemos el libro de nuevo, no nos deja
        libro1 = libro1.devolver();

        // Muestro la informacion del libro
        System.out.println(libro1);

        // Obtengo el coste de la impresión
        double costeImpresion = libro1.imprimir(0.05);

        System.out.println("El coste ha sido de " + costeImpresion + "€");
        
        // Creo una instancia de Libro
        Libro libro2 = new Libro("123456789", "Cinco años de soledad", 500, "Gabriel Garcia Marquez", false);

        // Indico si los libros son iguales
        if (libro1.equals(libro2)) {
            System.out.println("Los libros son iguales");
        } else {
            System.out.println("Los libros no son iguales");
        }

    }
}
