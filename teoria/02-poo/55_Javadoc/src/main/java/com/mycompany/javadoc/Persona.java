package com.mycompany.javadoc;

import java.util.Objects;

/**
 * La clase Persona representa a una persona con nombre, apellidos y edad. Es
 * una clase abstracta que proporciona funcionalidades básicas comunes para
 * todas las personas.
 *
 * @author DDR
 */
public abstract class Persona {

    // Atributo estático
    private static int personasCreadas = 0;

    // Atributos
    private String nombre;
    private String apellidos;
    private int edad;

    /**
     * Constructor vacío que crea una Persona sin nombre, apellidos ni edad.
     */
    public Persona() {
        this("", "", 0); // llamamos al constructor por defecto
    }

    /**
     * Constructor que crea una Persona con un nombre especificado.
     *
     * @param nombre el nombre de la persona
     */
    public Persona(String nombre) {
        this(nombre, "", 0); // llamamos al constructor por defecto
    }

    /**
     * Constructor que crea una Persona con un nombre, apellidos y edad
     * especificados.
     *
     * @param nombre el nombre de la persona
     * @param apellidos los apellidos de la persona
     * @param edad la edad de la persona
     * @throws IllegalArgumentException si la edad es negativa
     */
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

    /**
     * Obtiene el nombre de la persona.
     *
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre el nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos de la persona.
     *
     * @return los apellidos de la persona
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos de la persona.
     *
     * @param apellidos los apellidos de la persona
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return la edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param edad la edad de la persona
     * @throws IllegalArgumentException si la edad es negativa
     */
    public void setEdad(int edad) {
        // valida la edad
        if (edad < 0) {
            throw new IllegalArgumentException("La edad debe ser positiva");
        }
        this.edad = edad;
    }

    /**
     * Obtiene el número total de personas creadas.
     *
     * @return el número total de personas creadas
     */
    public static int getPersonasCreadas() {
        return personasCreadas;
    }

    /**
     * Obtiene el nombre completo de la persona (nombre y apellidos).
     *
     * @return el nombre completo de la persona
     */
    public String nombreCompleto() {
        return this.nombre + " " + this.apellidos;
    }

    /**
     * Obtiene el nombre completo de la persona con un título especificado.
     *
     * @param titulo el título a agregar al nombre completo
     * @return el nombre completo de la persona con el título especificado
     */
    public String nombreCompleto(String titulo) {
        return titulo + " " + this.nombre + " " + this.apellidos;
    }

    /**
     * Comprueba si la persona es mayor de edad (18 años o más).
     *
     * @return true si la persona es mayor de edad, false en caso contrario
     */
    public boolean mayorEdad() {
        return this.edad >= 18;
    }

    /**
     * Calcula el sueldo de la persona.
     *
     * @return el sueldo de la persona
     */
    public abstract double sueldo();

    /**
     * Devuelve una representación de cadena de la persona.
     *
     * @return una cadena que representa la persona
     */
    @Override
    public String toString() {
        return this.nombreCompleto() + " de " + edad + " años";
    }

    /**
     * Calcula un código hash para la persona.
     *
     * @return un código hash para la persona
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.apellidos);
        return hash;
    }

    /**
     * Compara esta persona con el objeto especificado para igualdad.
     *
     * @param obj el objeto a comparar
     * @return true si los objetos son iguales, false en caso contrario
     */
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
