package com.mycompany.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {

        // Creamos un TreeMap con un String de clave y un numero como valor 
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Añadimos elementos a nuestro mapa ordenando sus claves de menor a mayor
        treeMap.put("Fernando", 2000); // Fernando
        treeMap.put("Manuel", 1000); // Fernando Manuel
        treeMap.put("Alberto", 1500); // Alberto Fernando Manuel
        treeMap.put("Zacarias", 3000); // Alberto Fernando Manuel Zacarias
        treeMap.put("Eduardo", 2500); // Alberto Eduardo Fernando Manuel Zacarias

        // Mostramos el treeMap
        System.out.println("Elementos: " + treeMap);

        // Obtenemos el valor asociado a la clave Fernando
        System.out.println("Valor asociado a Fernando: " + treeMap.get("Fernando"));

        // Modificamos el valor de la clave Ferando
        treeMap.put("Fernando", 2200);
        System.out.println("Valor asociado a Fernando despues de actualizar: " + treeMap.get("Fernando"));

        // Obtenemos la primera clave del mapa
        System.out.println("Primera clave: " + treeMap.firstKey());

        // Obtenemos la primera clave-valor del mapa
        System.out.println("Primer clave-valor: " + treeMap.firstEntry());

        // Obtenemos el ultimo clave del mapa
        System.out.println("Ultima clave: " + treeMap.lastKey());

        // Obtenemos el ultimo clave-valor del mapa
        System.out.println("Ultima clave-valor: " + treeMap.lastEntry());

        // Indica si existe la clave Carlos en el mapa
        System.out.println("¿Existe la clave Carlos? " + treeMap.containsKey("Carlos"));
        // Indica si existe el valor 200 en el mapa
        System.out.println("¿Existe el valor 2000? " + treeMap.containsValue(2000));

        // elimina la clave Manuel del mapa
        treeMap.remove("Manuel");
        System.out.println("Elementos: " + treeMap);

        // Mostramos nuestro mapa recorriendo las claves
        System.out.println("Mostrar con keySey");
        for (String clave : treeMap.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + treeMap.get(clave));
        }

        // Mostramos nuestro mapa recorriendo las claves de forma inversa
        System.out.println("Mostrar con descendingKeySet");
        for (String clave : treeMap.descendingKeySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + treeMap.get(clave));
        }

        // Mostramos nuestro mapa recorriendo clave-valor
        System.out.println("Mostrar con entrySet");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Mostramos nuestro mapa recorriendo clave-valor de forma inversa
        System.out.println("Mostrar con descendingMap entrySet");
        for (Map.Entry<String, Integer> entry : treeMap.descendingMap().entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Muestra las claves mayores de Fernando
        System.out.println("higherKey: " + treeMap.higherKey("Fernando"));

        // Muestra las claves-valores mayores de Fernando
        System.out.println("higherEntry: " + treeMap.higherEntry("Fernando"));

        // Muestra las claves menores de Fernando
        System.out.println("lowerKey: " + treeMap.lowerKey("Fernando"));
        
        // Muestra las claves-valores menores de Fernando
        System.out.println("lowerEntry: " + treeMap.lowerEntry("Fernando"));

        // Obtiene las claves entre Federico y Tomas
        System.out.println("subMap: " + treeMap.subMap("Federico", "Tomas"));

        // Muestra las claves
        System.out.println("headMap: " + treeMap.headMap("Fernando")); // Alberto Eduardo

        // Muestra las claves
        System.out.println("tailMap: " + treeMap.tailMap("Fernando")); // Fernando Zacarias

        // Creamos un treeMap ordenado de forma inversa
        TreeMap<String, Integer> treeMapReversed = new TreeMap<>(Comparator.reverseOrder());
        treeMapReversed.putAll(treeMap);

        System.out.println("Elementos al reves: " + treeMapReversed);
    }
}
