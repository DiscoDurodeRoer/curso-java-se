package com.mycompany.enumerados_avanzados;

public enum Meses {

    // Indicamos de forma constante el numero de dias de cada mes
    ENERO(31),
    FEBRERO(28),
    MARZO(31),
    ABRIL(30),
    MAYO(31),
    JUNIO(30),
    JULIO(31),
    AGOSTO(31),
    SEPTIEMBRE(30),
    OCTUBRE(31),
    NOVIEMBRE(30),
    DICIEMBRE(31);

    // atributo dias
    private int dias;

    // constructor (siempre es privado)
    private Meses(int dias) {
        this.dias = dias;
    }

    // Obtenemos el numero de dias
    public int getDias() {
        return dias;
    }

}
