package com.mycompany.javadoc;

/**
 * La clase Empleado representa a un empleado que es una persona con un salario.
 * Hereda de la clase Persona y proporciona funcionalidades específicas para los empleados.
 * 
 * @author DDR
 */
public class Empleado extends Persona {

    // Atributo propio
    private double salario;

    /**
     * Constructor para la clase Empleado.
     * 
     * @param salario el salario del empleado
     * @param nombre el nombre del empleado
     * @param apellidos los apellidos del empleado
     * @param edad la edad del empleado
     */
    public Empleado(double salario, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.salario = salario;
    }

    /**
     * Obtiene el salario del empleado.
     * 
     * @return el salario del empleado
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     * 
     * @param salario el salario del empleado
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Calcula el sueldo total del empleado.
     * 
     * @return el sueldo total del empleado
     */
    @Override
    public double sueldo() {
        if (super.getEdad() >= 30) {
            return this.salario + 500;
        }
        return this.salario;
    }

    /**
     * Devuelve una representación de cadena del empleado.
     * 
     * @return una cadena que representa al empleado
     */
    @Override
    public String toString() {
        return super.toString() + " con salario " + salario;
    }

}
