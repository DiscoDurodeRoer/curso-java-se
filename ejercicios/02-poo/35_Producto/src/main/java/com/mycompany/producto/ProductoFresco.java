package com.mycompany.producto;

// Hereda de Producto
public class ProductoFresco extends Producto {

    // Atributos
    private int diasCaducidad;

    // Constructores
    public ProductoFresco() {
        this(0, "", 0);
    }

    public ProductoFresco(int diasCaducidad, String nombre, double precio) {
        super(nombre, precio);
        this.diasCaducidad = diasCaducidad;
    }

    // Getters y setters
    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }

    // Metodos
    @Override
    public double comprar(int cantidad) throws IllegalArgumentException {

        // Obtenemos el total, llamando desde el padre
        double precioFinal = super.comprar(cantidad);

        // Si los dias de caducidad estan entre 3 y 5, reducimos el precio un 40%
        if (this.diasCaducidad >= 3 && this.diasCaducidad <= 5) {
            precioFinal *= 0.6;
            // Si los dias de caducidad son menos de 3, reducimos el precio un 70%
        } else if (this.diasCaducidad < 3) {
            precioFinal *= 0.3;
        }

        return precioFinal;

    }

    @Override
    public String toString() {
        // Llamamos al padre para la informacion base
        return super.toString() + ", diasCaducidad=" + diasCaducidad;
    }

}
