package com.mycompany.getters_setters;

public class Persona {

    // Atributos
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructores
    // Constructor vacio
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
    }

    // Constructor por defecto
    public Persona(String nombre, String apellidos, int edad) {

        // valida la edad
        if (edad < 0) {
            throw new IllegalArgumentException("La edad debe ser positiva");
        }

        // inicio los valores de los atributos
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad debe ser positiva");
        }
        this.edad = edad;
    }

}
