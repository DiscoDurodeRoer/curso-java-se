package com.mycompany.polimorfismo;

public class App {

    public static void main(String[] args) {
        
        // Creo una instancia de Empleado
        Empleado empleado = new Empleado(2000, "Fernando", "Ureña Gomez", 34);
        
        // Creo una instancia de Gerente
        Gerente gerente = new Gerente("informatica", "Manuel", "Ureña Gomez", 34);

        // Muestro el sueldo de cada empleado
        System.out.println(empleado.sueldo());
        System.out.println(gerente.sueldo());
        
    }
}
