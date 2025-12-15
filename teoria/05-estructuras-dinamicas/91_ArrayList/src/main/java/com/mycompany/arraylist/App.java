package com.mycompany.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        // Creamos un array dinamico de numeros
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Añade los elementos
        arrayList.add(10); // 10
        arrayList.add(20); // 10 20
        arrayList.add(30); // 10 20 30

        // Añade un elemento al principio
        arrayList.addFirst(5); // 5 10 20 30

        // Añade un elemento al final
        arrayList.addLast(40); // 5 10 20 30 40

        // Mostramos el arrayList
        System.out.println("Elementos: " + arrayList);

        // Mostramos el valor en la posicion 1s
        System.out.println("Elemento en la posicion 1: " + arrayList.get(1));

        // Muestra si la cola esta vacia o no
        System.out.println("¿Lista vacia? " + arrayList.isEmpty());

        // Modifica el valor del indice 1
        arrayList.set(1, 100);

        // Mostramos el arrayList
        System.out.println("Elementos: " + arrayList);

        // Elimina el indice 2
        arrayList.remove(2);

        // Mostramos el arrayList
        System.out.println("Elementos: " + arrayList);

        // Busca si existe el elemento 30
        System.out.println("¿Existe el elemento 30? " + arrayList.contains(30));

        // Busca el indice del elemento 40
        System.out.println("Indice del elemento 40: " + arrayList.indexOf(40));
        
        // Busca el indice del elemento 50
        System.out.println("Indice del elemento 50: " + arrayList.indexOf(50));

        // Mostrar el numero de elementos
        System.out.println("Numero de elementos: " + arrayList.size());

        // Recorre el arrayList usando un foreach
        System.out.println("Recorrer por foreach");
        for (Integer elemento : arrayList) {
            System.out.println(elemento);
        }

        // Recorre el arrayList usando un iterator
        System.out.println("Recorrer por iterator");
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Ordena el arrayList
        Collections.sort(arrayList);

        System.out.println("Elementos ordenados: " + arrayList);

        // Ordena el arrayList de forma inversa
        Collections.sort(arrayList, Comparator.reverseOrder());

        System.out.println("Elementos ordenados al reves: " + arrayList);

        // Elimina todos los elementos
        arrayList.clear();

        System.out.println("Elementos despues del clear: " + arrayList);

    }
}
