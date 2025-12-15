package com.mycompany.cola_cine_v2;

public class Persona implements Comparable<Persona> {
 
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean mayorEdad(){
        return this.edad >= 18;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.getEdad(), o.getEdad());
    }
    
}
