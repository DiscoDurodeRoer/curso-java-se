package com.mycompany.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        // Listas
        // Creamos un arrayList
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(10, 5, 3, 20, 15, 12));

        System.out.println("Lista desordenada: " + lista);
        // Ordenamos el arrayList
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);

        // Ordenamos el arrayList de forma inversa
        Collections.reverse(lista);
        System.out.println("Lista invertida: " + lista);

        // Obtenemos el valor minimo del arrayList
        System.out.println("Minimo de la lista: " + Collections.min(lista));

        // Obtenemos el valor maximo del arrayList
        System.out.println("Maximo de la lista: " + Collections.max(lista));

        // Reordenamos los elementos de forma aleatoria
        Collections.shuffle(lista);
        System.out.println("Lista de forma aleatoria: " + lista);

        // Hace la lista no modificable
        List<Integer> listaNoModificable = Collections.unmodifiableList(lista);

        System.out.println("Lista no modificable: " + listaNoModificable);

        try {
            listaNoModificable.add(50);
        } catch (UnsupportedOperationException e) {
            System.out.println("No se puede modificar la lista");
        }

        // Conjuntos
        // Creamos un hashSet
        HashSet<Integer> hashSet = new HashSet<>();

        // Mostramos una serie de elementos
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(5);
        hashSet.add(20);

        System.out.println("Elementos conjunto: " + hashSet);

        // Hace el hashSet no modificable
        Set<Integer> hashSetNoModificable = Collections.unmodifiableSet(hashSet);

        try {
            hashSetNoModificable.add(50);
        } catch (UnsupportedOperationException e) {
            System.out.println("No se puede modificar el conjunto");
        }

        // Obtenemos el valor minimo del hashSet
        System.out.println("Minimo del conjunto: " + Collections.min(hashSet));

        // Obtenemos el valor maximo del hashSet
        System.out.println("Maximo del conjunto: " + Collections.max(hashSet));

        // Mapas
        // Creamos un mapa
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Añadimos elementos al mapa
        hashMap.put("Fernando", 2000);
        hashMap.put("Manuel", 3000);
        hashMap.put("Alberto", 1000);

        System.out.println("Elementos mapa: " + hashMap);

        // Hace el hashMap no modificable
        Map<String, Integer> hashMapNoModificable = Collections.unmodifiableMap(hashMap);

        try {
            hashMapNoModificable.put("Zacarias", 500);
        } catch (UnsupportedOperationException e) {
            System.out.println("No se puede modificar el mapa");
        }

        // Obtenemos el valor minimo del hashMap
        System.out.println("Minimo del mapa: " + Collections.min(hashMap.values()));

        // Obtenemos el valor maximo del hashMap
        System.out.println("Maximo del mapa: " + Collections.max(hashMap.values()));

    }
}
