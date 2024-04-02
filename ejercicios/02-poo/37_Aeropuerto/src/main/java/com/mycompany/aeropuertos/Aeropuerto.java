package com.mycompany.aeropuertos;

// Clase abstracta, no podemos crear instancias
public abstract class Aeropuerto {

    // Atributos
    private int id;
    private String nombre;
    private int anioInauguracion;
    private int capacidad;

    // Atributo estatico
    private static int idAutonumerado = 1;

    // Constructores
    public Aeropuerto() {
        this("", 0, 0);
    }

    public Aeropuerto(String nombre, int anioInauguracion, int capacidad) {
        this.nombre = nombre;
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
        // Obtenemos el id y lo aumentamos
        this.id = Aeropuerto.idAutonumerado++;
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

    public int getAnioInauguracion() {
        return anioInauguracion;
    }

    public void setAnioInauguracion(int anioInauguracion) {
        this.anioInauguracion = anioInauguracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public static int getIdAutonumerado() {
        return idAutonumerado;
    }

    public static void setIdAutonumerado(int idAutonumerado) {
        Aeropuerto.idAutonumerado = idAutonumerado;
    }

    // Metodo abstracto, no se implementa, las clases hijas deben implementarlo OBLIGATORIAMENTE
    public abstract void gananciasTotales(int cantidad);

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", anioInauguracion=" + anioInauguracion + ", capacidad=" + capacidad;
    }

}
