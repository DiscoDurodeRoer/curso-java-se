package com.mycompany.herencia_concatenada;

// Hereda de Coche que a su vez hereda de Vehiculo
public class CocheDeportivo extends Coche {

    // Atributos
    private boolean descapotable;

    // Constructores
    public CocheDeportivo(boolean descapotable, int numeroPuertas, String marca, String modelo) {
        super(numeroPuertas, marca, modelo);
        this.descapotable = descapotable;
    }

    // Getters y setters
    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    @Override
    public String toString() {
        // Llamamos al padre para la informacion base
        return super.toString() + ", descapotable=" + descapotable;
    }

}
