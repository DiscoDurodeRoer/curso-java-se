package com.mycompany.lista_generica;

/**
 * Crea una clase llamada Lista.
 *
 * Se define por los atributos:
 *
 * - elementos
 *
 * - numElementos
 *
 * El atributo elementos puede ser cualquier tipo que le indiquemos.
 *
 * Tendremos un constructor donde le pasaremos el tamaño que queremos del array,
 * debe ser positivo.
 *
 * Crea una interfaz llamada Listable con las siguientes operaciones:
 *
 * - posicion: le pasamos un elemento T y devolvera un numero
 *
 * - aniadir: le pasamos un elemento T y devolvera un booleano
 *
 * - tamanio: sin parametros y devolvera un numero
 *
 * - eliminar: le pasamos un elemento T y devolvera un booleano
 *
 * - listar: sin parametros y no devuelve nada
 *
 * - vaciar: sin parametros y no devuelve nada
 *
 * Implementala en nuestra clase Lista
 *
 * Las operaciones de Lista son:
 *
 * - posicion: dado un elemento, indica en que indice esta, sino existe,
 * devolvemos un -1
 *
 * - aniadir: añade un elemento al array, siempre y cuando haya espacio. No se
 * admiten repetidos. True si lo añade y false sino lo hace
 *
 * - tamanio: devuelve el numero de elementos que hay
 *
 * - eliminar: elimina el elemento que le pasemos. True si lo elimina y false
 * sino lo hace.
 *
 * - listar: muestra los elementos que tenemos
 *
 * - vaciar: reinicia el array al tamaño original
 *
 */
public class App {

    public static void main(String[] args) {

        Lista<Integer> listaNumeros = new Lista<>(5);

        listaNumeros.aniadir(1);
        listaNumeros.aniadir(2);
        listaNumeros.aniadir(3);
        listaNumeros.aniadir(4);
        listaNumeros.aniadir(5);

        listaNumeros.listar();
        System.out.println("");

        listaNumeros.eliminar(4);

        listaNumeros.listar();
        System.out.println("");

        listaNumeros.eliminar(5);

        listaNumeros.listar();
        System.out.println("");

        System.out.println("¿Posicion del elemento 3? " + listaNumeros.posicion(3));
        System.out.println("Tamaño: " + listaNumeros.tamanio());
        
        listaNumeros.vaciar();
        
        listaNumeros.listar();

    }
}
