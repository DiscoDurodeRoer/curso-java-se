package com.mycompany.empleado;

public enum Departamento {
    CONTABILIDAD(50),
    INFORMATICA(80),
    DIRECCION(100);

    private double plus;

    private Departamento(double plus) {
        this.plus = plus;
    }

    public double getPlus() {
        return plus;
    }

}
