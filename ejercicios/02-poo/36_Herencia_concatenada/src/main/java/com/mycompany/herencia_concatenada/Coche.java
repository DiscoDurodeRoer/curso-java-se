package com.mycompany.herencia_concatenada;

// Hereda de Vehiculo
public class Coche extends Vehiculo {

    // Atributos
    private int numeroPuertas;

    // Constructores
    public Coche(int numeroPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    // Getters y setters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        // Llamamos al padre para la informacion base
        return super.toString() + ", numeroPuertas=" + numeroPuertas;
    }

}
