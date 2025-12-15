package com.mycompany.stack;

import java.util.Stack;

public class App {

    public static void main(String[] args) {

        // Creamos una pila de numeros
        Stack<Integer> pila = new Stack<>();

        // Indicamos si esta la pila vacia o no
        System.out.println("¿La pila esta vacia? " + pila.isEmpty());

        // Añadimos elementos a la pila
        pila.push(5); // 5
        pila.push(10); // 10 5
        pila.push(15); // 15 10 5

        // Compruebo de nuevo si la pila esta vacia
        System.out.println("¿La pila esta vacia? " + pila.isEmpty());
        
        // Mostramos el numero de elementos de la pila
        System.out.println("Numero de elementos: " + pila.size());
        
        // Obtiene el primer elemento a salir
        System.out.println("Obtener el peek:" + pila.peek());
        
        // Recorrer la pila vaciandola
        while(!pila.isEmpty()){
            System.out.println("Elemento extraido: " + pila.pop());
        }

    }
}
