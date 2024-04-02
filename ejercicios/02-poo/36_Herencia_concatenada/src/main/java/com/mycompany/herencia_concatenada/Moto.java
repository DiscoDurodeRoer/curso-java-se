package com.mycompany.herencia_concatenada;

// Hereda de Vehiculo
public class Moto extends Vehiculo {

    // Atributos
    private boolean sidecar;

    // Constructores
    public Moto(boolean sidecar, String marca, String modelo) {
        super(marca, modelo);
        this.sidecar = sidecar;
    }

    // Getters y setters
    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {
        // Llamamos al padre para la informacion base
        return super.toString() + ", sidecar=" + sidecar;
    }

}
