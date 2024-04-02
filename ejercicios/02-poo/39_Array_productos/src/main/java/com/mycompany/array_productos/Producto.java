package com.mycompany.array_productos;

public class Producto {

    // Atributos
    private int id;
    private String nombre;
    private double precio;

    // Atributo estatico
    private static int idAutoincrementado = 1;

    // Constructores
    public Producto() {
        this("", 0);
    }

    public Producto(String nombre, double precio) {

        // Validamos el preco
        if (precio < 0) {
            throw new IllegalArgumentException("El precio debe ser positivo");
        }

        this.nombre = nombre;
        this.precio = precio;
        // Obtenemos el id y lo aumentamos
        this.id = Producto.idAutoincrementado++;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        // Validamos el preco
        if (precio < 0) {
            throw new IllegalArgumentException("El precio debe ser positivo");
        }
        this.precio = precio;
    }

    public static int getIdAutoincrementado() {
        return idAutoincrementado;
    }

    public static void setIdAutoincrementado(int idAutoincrementado) {
        Producto.idAutoincrementado = idAutoincrementado;
    }

    public double comprar(int cantidad) throws IllegalArgumentException {

        // Validamos la cantidad
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }

        return this.precio * cantidad;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ' ';
    }

}
