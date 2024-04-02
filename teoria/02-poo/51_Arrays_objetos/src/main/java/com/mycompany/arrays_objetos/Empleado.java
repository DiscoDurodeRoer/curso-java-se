package com.mycompany.arrays_objetos;

// Hereda de persona
public class Empleado extends Persona {

    // Atributos propio
    private double salario;

    // Constructor, llamamos al constructor padre
    public Empleado(double salario, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.salario = salario;
    }

    // Getters y setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Implementacion de sueldo en Empleado tiene una implementacion distinta
    @Override
    public double sueldo() {
        if (super.getEdad() >= 30) {
            return this.salario + 500;
        }
        return this.salario;
    }

    // Mostramos la informacion, llamando al padre para los atributos que hereda
    @Override
    public String toString() {
        return super.toString() + " con salario " + salario;
    }

}
