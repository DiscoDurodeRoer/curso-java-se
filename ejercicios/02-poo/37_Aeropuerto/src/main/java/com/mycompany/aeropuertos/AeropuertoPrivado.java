package com.mycompany.aeropuertos;

// Hereda de Aeropuerto
public class AeropuertoPrivado extends Aeropuerto {

    // Atributos
    private int numeroSocios;

    // Constructores
    public AeropuertoPrivado() {
        this(0, "", 0, 0);
    }

    public AeropuertoPrivado(int numeroSocios, String nombre, int anioInauguracion, int capacidad) {
        super(nombre, anioInauguracion, capacidad);
        this.numeroSocios = numeroSocios;
    }

    // Getters y setters
    public int getNumeroSocios() {
        return numeroSocios;
    }

    public void setNumeroSocios(int numeroSocios) {
        this.numeroSocios = numeroSocios;
    }

    @Override
    public void gananciasTotales(int cantidad) {
        // Obtengo las ganancias
        double gananciaSocio = cantidad / this.numeroSocios;
        
        // Muestro las ganancias
        System.out.println("Cada socio ha ganado: " + gananciaSocio);
    }

    @Override
    public String toString() {
        // Llamamos al padre para la informacion base
        return super.toString() + ", numeroSocios=" + numeroSocios;
    }

}
