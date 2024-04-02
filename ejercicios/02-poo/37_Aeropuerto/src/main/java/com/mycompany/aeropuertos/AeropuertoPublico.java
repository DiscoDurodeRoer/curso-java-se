package com.mycompany.aeropuertos;

// Hereda de Aeropuerto
public class AeropuertoPublico extends Aeropuerto {

    // Atributos
    private int financiacion;
    private int numeroTrabajadoresDiscapacitados;

    // Constructores
    public AeropuertoPublico() {
        this(0, 0, "", 0, 0);
    }

    public AeropuertoPublico(int financiacion, int numeroTrabajadoresDiscapacitados, String nombre, int anioInauguracion, int capacidad) {
        super(nombre, anioInauguracion, capacidad);
        this.financiacion = financiacion;
        this.numeroTrabajadoresDiscapacitados = numeroTrabajadoresDiscapacitados;
    }

    // Getters y setters
    public int getFinanciacion() {
        return financiacion;
    }

    public void setFinanciacion(int financiacion) {
        this.financiacion = financiacion;
    }

    public int getNumeroTrabajadoresDiscapacitados() {
        return numeroTrabajadoresDiscapacitados;
    }

    public void setNumeroTrabajadoresDiscapacitados(int numeroTrabajadoresDiscapacitados) {
        this.numeroTrabajadoresDiscapacitados = numeroTrabajadoresDiscapacitados;
    }

    @Override
    public void gananciasTotales(int cantidad) {
        // Obtengo las ganancias
        double ganancias = cantidad + this.financiacion + (this.numeroTrabajadoresDiscapacitados * 1000);

        // Muestro las ganancias
        System.out.println("Las ganancias han sido de " + ganancias);
    }

    @Override
    public String toString() {
        // Llamamos al padre para la informacion base
        return super.toString() + ", financiacion=" + financiacion + ", numeroTrabajadoresDiscapacitados=" + numeroTrabajadoresDiscapacitados;
    }

}
