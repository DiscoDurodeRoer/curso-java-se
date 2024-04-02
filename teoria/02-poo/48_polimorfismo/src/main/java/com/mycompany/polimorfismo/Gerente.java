package com.mycompany.polimorfismo;

// Hereda de persona
public class Gerente extends Persona {

    // Atributos propio
    private String departamento;

    public Gerente(String departamento, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.departamento = departamento;
    }

    // Getter y setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Implementacion de sueldo en Empleado tiene una implementacion distinta
    @Override
    public double sueldo() {
        switch (this.departamento) {
            case "informatica":
                return 1500;
            case "contabilidad":
                return 1600;
            case "rrhh":
                return 1400;
            default:
                return 1200;
        }
    }

    // Mostramos la informacion, llamando al padre para los atributos que hereda
    @Override
    public String toString() {
        return super.toString() + " en el departamento " + departamento;
    }

}
