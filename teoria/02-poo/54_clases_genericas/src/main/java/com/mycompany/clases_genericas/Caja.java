
package com.mycompany.clases_genericas;

// T es un tipo dinamico que le indicamos al crear el objeto
public class Caja<T> {
    
    // Atributos
    private T elemento;

    // Constructores
    public Caja(T elemento) {
        this.elemento = elemento;
    }

    // Getters y setters
    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Caja{" + "elemento=" + elemento + '}';
    }
    
    
    
}
