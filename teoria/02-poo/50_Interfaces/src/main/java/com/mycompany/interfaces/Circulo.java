package com.mycompany.interfaces;

// Indicamos que implementa la interfaz
public class Circulo implements Calculable {

    // Atributos
    private double radio;

    // Constructores
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Implementacion de los metodos
    @Override
    public double calculaArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calculaPerimetro() {
        return Math.PI * 2 * radio;
    }

}
