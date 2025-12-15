package com.mycompany.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class App {

    public static void main(String[] args) {

        // Creamos una cola de prioridad de numeros
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Añadimos elementos a nuestra cola de prioridad, ordenando de menor a mayor
        priorityQueue.offer(10); // 10
        priorityQueue.offer(60); // 10 60
        priorityQueue.offer(30); // 10 30 60
        priorityQueue.offer(5); // 5 10 30 60

        // Obtenemos el primer elemento a salir
        System.out.println("Primer elemento: " + priorityQueue.peek());

        // Obtenemos el numero de elementos de la cola
        System.out.println("Numero de elementos: " + priorityQueue.size());

        // Mostramos si la cola esta o no vacia
        System.out.println("¿La cola esta vacia? " + priorityQueue.isEmpty());

        // Como con Iterator no funciona bien, creamos una cola de copia
        PriorityQueue<Integer> priorityQueueCopia = new PriorityQueue<>(priorityQueue);

        while (!priorityQueueCopia.isEmpty()) {
            System.out.println(priorityQueueCopia.poll());
        }

        // Numero de elementos de la cola original y la copia
        System.out.println("Numero de elementos: " + priorityQueue.size());
        System.out.println("Numero de elementos en la copia: " + priorityQueueCopia.size());

        // Creamos una cola de prioridad ordenando de forma inversa
        PriorityQueue<Integer> priorityQueueReverse = new PriorityQueue<>(Collections.reverseOrder());

        // Añadimos elementos a la cola, ordenando de mayor a menor
        priorityQueueReverse.offer(10); // 10
        priorityQueueReverse.offer(60); // 60 10
        priorityQueueReverse.offer(30); // 60 30 10
        priorityQueueReverse.offer(5); // 60 30 10 5

        // Mostramos la cola
        System.out.println("Cola revertida");
        while (!priorityQueueReverse.isEmpty()) {
            System.out.println(priorityQueueReverse.poll());
        }

    }
}
