package com.mycompany.cola_cine_v2;

public enum ClasificacionPelicula {

    A(0),
    MAYOR_7(7),
    MAYOR_12(12),
    MAYOR_16(16),
    MAYOR_18(18),;
    
    private int edadMinima;

    private ClasificacionPelicula(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

}
