package com.mycompany.interfaces;

public class App {

    public static void main(String[] args) {

        // Creo una instancia de Circulo
        Circulo circulo = new Circulo(5);
        
        // Creo una instancia de Cuadrado
        Cuadrado cuadrado = new Cuadrado(5);
        
        // Muestro el area y perimetro de un circulo
        System.out.println("Circulo");
        System.out.println("Area: " + circulo.calculaArea());
        System.out.println("Perimetro: " + circulo.calculaPerimetro());
        
        // Muestro el area y perimetro de un cuadrado
        System.out.println("Cuadrado");
        System.out.println("Area: " + cuadrado.calculaArea());
        System.out.println("Perimetro: " + cuadrado.calculaPerimetro());
        
    }
}
