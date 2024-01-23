package com.mycompany.precio_iva;

import java.util.Locale;
import java.util.Scanner;

/*
    Pide el precio de un producto sin IVA y calcula su precio con IVA.

    El IVA es del 21%.

    Formatea el resultado para que se muestre con dos decimales.
*/
public class App {

    public static void main(String[] args) {

        // Creo Scanner para pedir valores
        Scanner sn = new Scanner(System.in);
        // Para insertar . como separador decimal
        sn.useLocale(Locale.US);
        
        // Constante IVA, he puesto 1.21 para representar el incremento de precio
        final double IVA = 1.21;
        
        // Pedimos el valor del producto
        System.out.println("Introduce el valor del producto");
        double precio= sn.nextDouble();
        
        // Calculamos el precio
        double precioFinal = precio * IVA;
        
        // Mostramos el precio final formateado
        System.out.printf("El precio final es %.2f €", precioFinal);
        
    }
}
