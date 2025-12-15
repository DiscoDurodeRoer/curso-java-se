package com.mycompany.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        // Creamos un hashSet de numerps
        HashSet<Integer> hashSet = new HashSet<>();

        // Añade los elementos
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(15);
        hashSet.add(10); // No lo añade al ya existir
        hashSet.add(15); // No lo añade al ya existir

        // Muestro el hashSet
        System.out.println("Elementos: " + hashSet);

        // Muestra si esta vacio o no
        System.out.println("¿Esta vacio? " + hashSet.isEmpty());

        // Muestra el numero de elementos
        System.out.println("Numero de elementos: " + hashSet.size());

        // Elimina un elemento del hashSet
        hashSet.remove(15);
        System.out.println("Elementos despues de eliminar el elemento 15: " + hashSet);

        // Busca si existe el elemento 30
        System.out.println("¿Existe el elemento 30? " + hashSet.contains(30));

        // Recorre el hashSet con un foreach
        System.out.println("Mostrar con foreach");
        for (Integer elemento : hashSet) {
            System.out.println(elemento);
        }

        // Recorre el hashSet con un iterator
        System.out.println("Mostrar con iterator");
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Elimina los elementos del hashSet
        hashSet.clear();
        System.out.println("Elementos: " + hashSet);

    }
}
