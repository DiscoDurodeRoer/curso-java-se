package com.mycompany.herencia_concatenada;

public class Vehiculo {

    // Atributos
    private String marca;
    private String modelo;

    // Constructores
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", modelo=" + modelo;
    }

}
