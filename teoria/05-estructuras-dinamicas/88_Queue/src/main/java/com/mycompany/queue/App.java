package com.mycompany.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {

        // Creamos una cola de numeros
        Queue<Integer> queue = new LinkedList<>();
        
        // Añadimos elementos a la cola al final
        queue.offer(5); // 5
        queue.offer(10); // 5 10
        queue.offer(15); // 5 10 15
        
        // Mostramos el siguiente elemento a salir
        System.out.println("Primer elemento: " + queue.peek());
        
        // Muestra si la cola esta vacia o no
        System.out.println("¿La cola esta vacia? " + queue.isEmpty());
        
        // Mostramos el numero de elementos de la cola
        System.out.println("Numero de elementos: " + queue.size());
        
        // Recorremos la cola, vaciandola
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        
        // Indicamos si ahora esta la cola esta vacia
        System.out.println("¿La cola esta vacia? " + queue.isEmpty());
        
        // Rellenamos de nuevo la cola
        queue.offer(5);
        queue.offer(10);
        queue.offer(15);
        
        // Recorremos la cola sin eliminar elementos
        Iterator<Integer> it = queue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        // Numero de elementos de la cola
        System.out.println("Numero de elementos: " + queue.size());
        
    }
}
