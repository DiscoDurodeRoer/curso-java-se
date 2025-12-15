package com.mycompany.arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        // Creamos una cola doble de numeros
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Añadimos los elementos al final de la cola
        deque.offer(10); // 10
        deque.offer(20); // 10 20
        deque.offer(30); // 10 20 30

        // Añade al principio de la cola
        deque.offerFirst(5); // 5 10 20 30 

        // Añade al final de la cola
        deque.offerLast(40); // 5 10 20 30 40

        // Mostrar la cola
        System.out.println("Datos: " + deque);

        // Muestra el primer elemento y lo elimina
        System.out.println("Primer elemento y elimino: " + deque.pollFirst());

        // Muestra el ultimo elemento y lo elimina
        System.out.println("Ultimo elemento y elimino: " + deque.pollLast());

        // Muestra el primer elemento a salir desde el principio de la cola
        System.out.println("Primer elemento sin eliminar: " + deque.peekFirst());

        // Muestra el primer elemento a salir desde el final de la cola
        System.out.println("Ultimo elemento sin eliminar: " + deque.peekLast());

        // Mostrar la cola
        System.out.println("Datos: " + deque);

        // Mostramos la cola desde el inicio al final y la vaciamos
        System.out.println("Mostrar deque");
        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        }

        // Rellenamos la cola de nuevo
        deque.offer(10);
        deque.offer(20);
        deque.offer(30);

        // Mostrar la cola desde el final al inicio y la vaciamos
        System.out.println("Mostrar deque al reves");
        while (!deque.isEmpty()) {
            System.out.println(deque.pollLast());
        }

        // Rellenamos la cola de nuevo
        deque.offer(10);
        deque.offer(20);
        deque.offer(30);

        // Mostramos la cola desde el inicio al final sin vaciarla
        System.out.println("Mostrar deque con iterator");
        Iterator<Integer> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Mostrar la cola desde el final al inicio sin vaciarla
        System.out.println("Mostrar deque al reves con iterator");
        iterator = deque.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
