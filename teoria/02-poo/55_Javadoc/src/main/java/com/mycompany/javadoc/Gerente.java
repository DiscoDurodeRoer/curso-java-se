package com.mycompany.javadoc;

/**
 * La clase Gerente representa a un gerente que es una persona con un
 * departamento asignado. Hereda de la clase Persona y proporciona
 * funcionalidades específicas para los gerentes.
 *
 * @author DDR
 */
public class Gerente extends Persona {

    // Atributo propio
    private String departamento;

    /**
     * Constructor para la clase Gerente.
     *
     * @param departamento el departamento del gerente
     * @param nombre el nombre del gerente
     * @param apellidos los apellidos del gerente
     * @param edad la edad del gerente
     */
    public Gerente(String departamento, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.departamento = departamento;
    }

    /**
     * Obtiene el departamento del gerente.
     *
     * @return el departamento del gerente
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Establece el departamento del gerente.
     *
     * @param departamento el departamento del gerente
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Calcula el sueldo del gerente según el departamento asignado.
     *
     * @return el sueldo del gerente
     */
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

    /**
     * Devuelve una representación de cadena del gerente.
     *
     * @return una cadena que representa al gerente
     */
    @Override
    public String toString() {
        return super.toString() + " en el departamento " + departamento;
    }

}
