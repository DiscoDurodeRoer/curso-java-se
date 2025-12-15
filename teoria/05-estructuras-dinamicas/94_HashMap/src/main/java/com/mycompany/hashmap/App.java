package com.mycompany.hashmap;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        // Creo un mapa con un String de clave y un numero como valor
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Añadimos elementos a nuestro mapa
        hashMap.put("Fernando", 2000);
        hashMap.put("Manuel", 1000);
        hashMap.put("Manuel", 1200);
        hashMap.put("Alberto", 1500);

        // Mostramos nuestro mapa
        System.out.println("Elementos: " + hashMap);

        // Obtiene el valor asociada a la clave Fernando
        System.out.println("Obtener el valor de la clave Fernando: " + hashMap.get("Fernando")); // 2000

        // Modifico el valor de Fernando
        hashMap.put("Fernando", 2500);
        System.out.println("Obtener el valor de la clave Fernando despues de actualizar: " + hashMap.get("Fernando")); // 2500

        // Indica si existe la clave Carlos en el mapa
        System.out.println("¿Existe la clave Carlos? " + hashMap.containsKey("Carlos"));

        // Indica si existe el valor 1500 en el mapa
        System.out.println("¿Existe el valor 1500? " + hashMap.containsValue(1500));

        // elimina la clave Manuel, incluyendo su valor
        hashMap.remove("Manuel");

        // Mostramos nuestro mapa
        System.out.println("Elementos: " + hashMap);

        // Mostramos nuestro mapa recorriendo las claves
        System.out.println("Mostrar con keySet");
        for (String clave : hashMap.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + hashMap.get(clave));
        }

        // Mostramos nuestro mapa recorriendo clave-valor
        System.out.println("Mostrar con entrySet");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

    }
}
