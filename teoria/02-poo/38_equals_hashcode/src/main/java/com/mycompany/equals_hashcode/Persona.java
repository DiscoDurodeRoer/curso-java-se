package com.mycompany.equals_hashcode;

import java.util.Objects;

public class Persona {

    // Atributos
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructores
    // Constructor vacio
    public Persona() {
        this("", "", 0); // llamamos al constructor por defecto
    }

    public Persona(String nombre) {
        this(nombre, "", 0); // llamamos al constructor por defecto
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

    // Obtengo el nombre completo de la persona
    public String nombreCompleto() {
        return this.nombre + " " + this.apellidos;
    }

    // Obtengo el nombre completo de la persona con un titulo
    public String nombreCompleto(String titulo) {
        return titulo + " " + this.nombre + " " + this.apellidos;
    }

    // Si tiene 18 o mas años de edad, indico que es mayor de edad    
    public boolean mayorEdad() {
        return this.edad >= 18;
    }

    // Muestra la informacion de la persona formateada a nuestro gusto
    @Override
    public String toString() {
        return this.nombreCompleto() + " de " + edad + " años";
    }

    // Genrar un codigo hash
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.apellidos);
        return hash;
    }

    // Indica si dos clases son iguales
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellidos, other.apellidos);
    }

}
