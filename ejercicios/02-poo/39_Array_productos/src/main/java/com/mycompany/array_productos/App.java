package com.mycompany.array_productos;

import java.util.Arrays;

/**
 * Recuperamos la clase Producto y sus clases hijas.
 *
 * Crea un array de productos de diferentes tipos y muestralos ordenados por
 * precio del mas barato al mas caro.
 *
 * Al final debes mostrar:
 *
 * - numero de cada producto
 *
 * - total de importe comprando 5 unidades de cada producto
 *
 * - el producto refrigerado tiene el cajon mas alejado
 *
 * - el producto fresco mas proximo a caducar
 */
public class App {

    public static void main(String[] args) {

        Producto[] productos = {
            new Producto("Producto Genérico", 10),
            new ProductoFresco(2, "Manzanas", 2),
            new ProductoRefrigerado(2, "Leche", 3),
            new ProductoRefrigerado(1, "Yogur", 2.5),
            new ProductoFresco(4, "Manzanas", 2)
        };

        Arrays.sort(productos);

        int numProductos = 0;
        int numProductosFrescos = 0;
        int numProductosRefrigerados = 0;
        double totalImporte = 0;

        ProductoRefrigerado productoMasAlejado = null;
        ProductoFresco productoProximoCaducar = null;

        for (Producto producto : productos) {
            System.out.println(producto);

            totalImporte += producto.comprar(5);

            if (producto instanceof ProductoRefrigerado) {
                numProductosRefrigerados++;
                ProductoRefrigerado productoRefrigerado = (ProductoRefrigerado) producto;
                if (productoMasAlejado == null || productoRefrigerado.getCajon() > productoMasAlejado.getCajon()) {
                    productoMasAlejado = productoRefrigerado;
                }
            } else if (producto instanceof ProductoFresco) {
                numProductosFrescos++;
                ProductoFresco productoFresco = (ProductoFresco) producto;
                if (productoProximoCaducar == null || productoFresco.getDiasCaducidad() < productoProximoCaducar.getDiasCaducidad()) {
                    productoProximoCaducar = productoFresco;
                }
            } else {
                numProductos++;
            }

        }

        System.out.println("El total de la compra es: " + totalImporte);
        System.out.println("El numero de productos genericos es de: " + numProductos);
        System.out.println("El numero de productos frescos es de: " + numProductosFrescos);
        System.out.println("El numero de productos refrigerados es de: " + numProductosRefrigerados);

        System.out.println("El producto refrigerado mas alejado es: " + productoMasAlejado);
        System.out.println("El producto fresco mas proximo a caducar es: " + productoProximoCaducar);

    }
}
