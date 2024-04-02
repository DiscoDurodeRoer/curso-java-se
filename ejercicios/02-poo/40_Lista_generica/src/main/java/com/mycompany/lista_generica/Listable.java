package com.mycompany.lista_generica;

public interface Listable<T> {

    public int posicion(T elemento);

    public boolean aniadir(T elemento);

    public int tamanio();

    public boolean eliminar(T elemento);

    public void listar();

    public void vaciar();

}
