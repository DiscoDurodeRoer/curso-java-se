package com.mycompany.meses;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Crea un enumerado con todos los meses del año.

    Dado un mes, indica el numero de dias que tiene.

    Los meses que tienen 31 dias son:
        - Enero
        - Marzo
        - Mayo
        - Julio
        - Agosto
        - Octubre
        - Diciembre

    Los meses que tienen 30 dias son:
        - Abril
        - Junio
        - Septiembre
        - Noviembre

    En el caso de febrero, pediremos el año, ya que si el año es bisiesto tendra
    29 dias sino tendra 28 dias.

    Debes validar si se inserta un mes valido o si se inserta los datos correctos.
 */
public class App {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        try {
            System.out.println("Introduce el mes que quieras comprobar");
            for (Meses mes : Meses.values()) {
                System.out.println(mes.name().toLowerCase());
            }

            Meses mes = Meses.valueOf(sn.next().toUpperCase());

            int numeroDias = 0;

            switch (mes) {
                case ENERO, MARZO, MAYO, JULIO, AGOSTO, OCTUBRE, DICIEMBRE ->
                    numeroDias = 31;
                case ABRIL, JUNIO, SEPTIEMBRE, NOVIEMBRE ->
                    numeroDias = 30;
                case FEBRERO -> {

                    System.out.println("Introduce el año");
                    int anio = sn.nextInt();

                    if (esBisiesto(anio)) {
                        numeroDias = 29;
                    } else {
                        numeroDias = 28;
                    }

                }
            }

            System.out.println("El numero de dias del mes " + (mes.name().toLowerCase()) + " es de " + numeroDias + " dias");

        } catch (IllegalArgumentException e) {
            System.out.println("El mes no es valido");
        } catch (InputMismatchException e){
            sn.next();
            System.out.println("Debes insertar un numero");
        }

    }

    public static boolean esBisiesto(int anio) {
        return anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0;
    }

}
