package com.mycompany.array_productos;

// Hereda de Producto
public class ProductoRefrigerado extends Producto {

    // Atributos
    private int cajon;

    // Constructores
    public ProductoRefrigerado() {
        this(0, "", 0);
    }

    public ProductoRefrigerado(int cajon, String nombre, double precio) {
        super(nombre, precio);
        this.cajon = cajon;
    }

    // Getters y setters
    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

    @Override
    public String toString() {
        // Llamamos al padre para la informacion base
        return super.toString() + ", cajon=" + cajon;
    }

}
