package com.mycompany.treeset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        // Creamos un TreeSet de numeros
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Ordenar de mayor a menor
        // TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        // Añadimos numeros ordenando
        treeSet.add(10); // 10
        treeSet.add(40); // 10 40
        treeSet.add(15); // 10 15 40
        treeSet.add(5); // 5 10 15 40
        treeSet.add(30); // 5 10 15 30 40
        treeSet.add(5); // No lo añade al ya existir
        treeSet.add(10); // No lo añade al ya existir

        // Muestra el treeSet
        System.out.println("Elementos: " + treeSet);

        // Indica si esta vacio o no el treeSet
        System.out.println("¿Esta vacio? " + treeSet.isEmpty());

        // Muestra el numero de elementos
        System.out.println("Numero de elementos: " + treeSet.size());

        // Elimina el elemento 15
        treeSet.remove(15);
        System.out.println("Elementos despues de eliminar el 15: " + treeSet);  // 5 10 30 40

        // Busca si existe el elemento 30
        System.out.println("¿Si existe el elemento 30? " + treeSet.contains(30));

        // Recorre un treeSet con un foreach
        System.out.println("Mostrar con foreach");
        for (Integer elemento : treeSet) {
            System.out.println(elemento);
        }

        // Recorre un treeSet usando descendingSet
        System.out.println("Recorrer al reves");
        NavigableSet<Integer> treeSetReversed = treeSet.descendingSet();
        System.out.println(treeSetReversed);

        // Recorre un treeSet con un iterator de menor a mayor
        System.out.println("Mostrar con iterator");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Recorre un treeSet con un iterator de mayor a menor
        System.out.println("Mostrar con iterator al reves");
        iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Muestra el siguiente elemento del parametro pasado
        System.out.println("Ceiling: " + treeSet.ceiling(7));

        // Muestra el anterior elemento del parametro pasado
        System.out.println("Floor: " + treeSet.floor(7));

        // Muestro los elementos entre 5 y 30, sin incluir el 30
        System.out.println("subset: " + treeSet.subSet(5, 30)); // 5 10

        // Muestro los elementos entre 5 y 30, incluyendo 5 y 30
        // System.out.println("subset: " + treeSet.subSet(5, true, 30, true)); // 5 10 30

        // Si es de mayor a menor, tenemos que cambiar el orden
        // System.out.println("subset: " + treeSet.subSet(30, 5));

        // Muestra los elementos menores al parametro pasado
        System.out.println("headSet: " + treeSet.headSet(12)); // 5 10

        // Muestra los elementos mayores al parametro pasado
        System.out.println("tailSet: " + treeSet.tailSet(12)); // 30 40

        // Primer elemento del treeSet
        System.out.println("first: " + treeSet.first()); // 5

        // Ultimo elemento
        System.out.println("last: " + treeSet.last()); // 40

    }
}
