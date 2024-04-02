package com.mycompany.interfaces;

// Indicamos que implementa la interfaz
public class Cuadrado implements Calculable {

    // Atributos
    private double lado;

    // Constructores
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Getters y setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Implementacion de los metodos
    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public double calculaPerimetro() {
        return lado * 4;
    }

}
