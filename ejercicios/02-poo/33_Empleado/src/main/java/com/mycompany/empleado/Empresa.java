package com.mycompany.empleado;

public class Empresa {

    private String CIF;
    private String nombre;

    public Empresa(String CIF, String nombre) {
        this.CIF = CIF;
        this.nombre = nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" + "CIF=" + CIF + ", nombre=" + nombre + '}';
    }

}
