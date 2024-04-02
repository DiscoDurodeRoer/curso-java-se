package com.mycompany.producto;

/**
 * Crea una clase que represente un Producto.
 *
 * Un producto se define por:
 *
 * - Id
 *
 * - Nombre
 *
 * - Precio
 *
 * El id sera autoincrementado.
 *
 * El precio debe ser positivo.
 *
 * Encapsula los atributos.
 *
 * Dos constructores: vacio y otro pidiendo el nombre y el precio
 *
 * Las operaciones que podrá realizar son:
 *
 * - comprar: dada una cantidad, indicar el precio total
 *
 * Crea una clase que represente un producto fresco.
 *
 * Tiene los mismos atributos que producto, ademas se define por tener días de
 * caducidad.
 *
 * Encapsula los atributos.
 *
 * Dos constructores: vacio y por defecto.
 *
 * Las operaciones que podrá realizar son:
 *
 * - comprar: dada una cantidad, indicar el precio total. Según los dias de
 * caducidad el precio que le queden, el precio se reducirá:
 *
 * Si le quedan entre 3 y 5 dias, se reduce un 40%
 *
 * Si le quedan menos de 3 dias, se reduce un 70%
 *
 * Crea una clase que represente un producto refrigerado.
 *
 * Tiene los mismos atributos que producto, ademas se define por tener el cajon
 * donde se encuentra.
 *
 * Encapsula los atributos.
 *
 * Dos constructores: vacio y por defecto.
 *
 * Las operaciones que podrá realizar son:
 *
 * - comprar: dada una cantidad, indicar el precio total
 *
 */
public class App {

    public static void main(String[] args) {

        // Creo varias instancia de productos
        Producto p1 = new Producto("Producto 1", 10);
        ProductoFresco p2 = new ProductoFresco(1, "Producto 2", 20);
        ProductoRefrigerado p3 = new ProductoRefrigerado(1, "Producto 3", 30);

        // Muestro la informacion
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Compro 10 unidades de cada uno
        System.out.println("Compro 10 unidades del producto 1: " + p1.comprar(10));
        System.out.println("Compro 10 unidades del producto 2: " + p2.comprar(10));
        System.out.println("Compro 10 unidades del producto 3: " + p3.comprar(10));

    }
}
