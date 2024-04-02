package com.mycompany.libro;

import java.util.Objects;

public class Libro {

    // Atributos
    private String ISBN;
    private String titulo;
    private int numeroPaginas;
    private String autor;
    private boolean prestado;

    // Constructores
    public Libro() {
        this("", "", 0, "", false);
    }

    public Libro(String ISBN, String titulo, int numeroPaginas, String autor, boolean prestado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.prestado = prestado;
    }

    // Getters y setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    // Métodos
    public void prestar() {
        // Compruebo si esta prestado o no
        if (this.prestado) {
            System.out.println("Este libro ya esta prestado");
        } else {
            // Indico que el libro esta prestado
            this.prestado = true;
            System.out.println("El libro se ha prestado");
        }

    }

    public void devolver() {
        if (!this.prestado) {
            System.out.println("Este libro no esta prestado");
        } else {
            // Indico que el libro no esta prestado
            this.prestado = false;
            System.out.println("El libro se ha devuelto");
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

        // Mensaje base
        String mensaje = "El libro " + this.ISBN + " con titulo " + this.titulo + " y autor " + this.autor + " tiene " + this.numeroPaginas + " paginas y ";

        // Sino esta prestado, añadimos un "no"
        if (!this.prestado) {
            mensaje += " no ";
        }

        mensaje += "esta prestado";

        return mensaje;
    }

}
