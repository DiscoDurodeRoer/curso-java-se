package com.mycompany.prestable;

public class Videojuego implements Prestable {

    private String nombre;
    private double precio;
    private boolean prestado;
    private int vecesPrestado;

    public Videojuego(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.prestado = false;
        this.vecesPrestado = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void prestar() {
        if (this.prestado) {
            System.out.println("El videojuego ya esta prestado");
        } else {
            this.prestado = true;
            this.vecesPrestado++;
            System.out.println("El videojuego se ha prestado " + this.vecesPrestado + " veces");
        }
    }

    @Override
    public void devolver() {
        if (!this.prestado) {
            System.out.println("El videojuego no esta prestado");
        } else {
            this.prestado = false;
            System.out.println("El videojuego se ha devuelto");
        }
    }

}
