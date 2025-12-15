package com.mycompany.baraja;

import java.util.Collections;
import java.util.Stack;

/**
 * Crea una baraja de cartas y muestra cada una de las cartas
 */
public class App {

    public static void main(String[] args) {

        // Creamos una pila de Cartas
        Stack<Carta> baraja = new Stack<>();

        // Recorremos los palos
        for (Palo palo : Palo.values()) {
            // Recorremos del 1 al 12
            for (int i = 1; i <= 12; i++) {
                // Evitamos los numeros 8 y 9
                if(i != 8 && i != 9){
                    // añadmimos la carta a la pila
                    baraja.push(new Carta(i, palo));
                }
            }
        }
        
        // Barajeamos la baraja
        Collections.shuffle(baraja);
        
        // Mostramos la baraja
        while(!baraja.isEmpty()){
            Carta carta = baraja.pop();
            System.out.println(carta);
        }

    }
}
