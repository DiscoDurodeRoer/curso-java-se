package com.mycompany.arrays_objetos;

import java.util.Objects;

// Clase abstracta, no puedo crear instancias de esta clase pero si las hijas
public abstract class Persona {

    // Atributo estatico
    private static int personasCreadas = 0;

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

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        // Aumento en uno las personas creadas
        Persona.personasCreadas++;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
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
        // valida la edad
        if (edad < 0) {
            throw new IllegalArgumentException("La edad debe ser positiva");
        }
        this.edad = edad;
    }

    // Obtiene el numero de personas creadas
    public static int getPersonasCreadas() {
        return personasCreadas;
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

    // Implementacion de sueldo en Persona
    public abstract double sueldo();

    // Muestra la informacion de la persona formateada a nuestro gusto
    @Override
    public String toString() {
        return this.nombreCompleto() + " de " + edad + " años";
    }

    // Generar un codigo hash
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
